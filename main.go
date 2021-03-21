// Command util is a simple gRPC server for the Gunk services and methods
// defined in utilpb/echo.gunk.
package main

//go:generate gunk generate ./...

import (
	"bytes"
	"context"
	"encoding/csv"
	"flag"
	"fmt"
	"io"
	"net"
	"os"
	"strings"

	"github.com/gunk/gunk-example-server/assets"
	"github.com/gunk/gunk-example-server/utilpb"
	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/reflection"
	"google.golang.org/protobuf/types/known/emptypb"
)

func main() {
	addr := flag.String("l", ":9090", "listen address")
	flag.Parse()
	if err := run(context.Background(), *addr); err != nil {
		fmt.Fprintf(os.Stderr, "error: %v\n", err)
		os.Exit(1)
	}
}

// run creates and runs the util server.
func run(ctx context.Context, addr string) error {
	l, err := (&net.ListenConfig{}).Listen(ctx, "tcp", addr)
	if err != nil {
		return err
	}
	s := grpc.NewServer()
	reflection.Register(s)
	utilpb.RegisterUtilServer(s, &Server{})
	return s.Serve(l)
}

// Server is a util server.
type Server struct {
	utilpb.UnimplementedUtilServer
}

// CheckStatus checks the status of the util server.
func (s *Server) CheckStatus(ctx context.Context, req *emptypb.Empty) (*utilpb.CheckStatusResponse, error) {
	return &utilpb.CheckStatusResponse{
		Status: utilpb.Status_OK,
	}, nil
}

// Echo echoes the passed message.
func (s *Server) Echo(ctx context.Context, msg *utilpb.Message) (*utilpb.Message, error) {
	return msg, nil
}

// GetCountries returns a list of countries.
func (s *Server) GetCountries(ctx context.Context, req *utilpb.GetCountriesRequest) (*utilpb.GetCountriesResponse, error) {
	var filter map[string]bool
	if len(req.Countries) != 0 {
		filter = make(map[string]bool)
		for _, code := range req.Countries {
			filter[strings.TrimSpace(strings.ToUpper(code))] = true
		}
	}
	countries := make(map[string]*utilpb.Country)
	r := csv.NewReader(bytes.NewReader(assets.Countries))
loop:
	for {
		line, err := r.Read()
		switch {
		case err != nil && err == io.EOF:
			break loop
		case err != nil:
			return nil, grpc.Errorf(codes.Internal, "unable to read country data")
		}
		if filter != nil && !filter[line[1]] {
			continue
		}
		countries[line[1]] = &utilpb.Country{
			Name: line[0],
			Code: line[1],
		}
	}
	return &utilpb.GetCountriesResponse{
		Countries: countries,
	}, nil
}
