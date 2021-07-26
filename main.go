// Command util is a simple gRPC server for Gunk services and methods defined
// in api/v1.
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

	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/reflection"
	"google.golang.org/protobuf/types/known/emptypb"

	examplepb "github.com/gunk/gunk-example-server/api/v1"
	"github.com/gunk/gunk-example-server/assets"
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
	// build server
	srv := grpc.NewServer()
	reflection.Register(srv)
	_ = NewServer(srv)
	// listen and serve
	l, err := (&net.ListenConfig{}).Listen(ctx, "tcp", addr)
	if err != nil {
		return err
	}
	return srv.Serve(l)
}

// Server is a util server.
type Server struct {
	examplepb.UnimplementedCountriesServiceServer
	examplepb.UnimplementedUtilServiceServer
}

// NewServer creates a new server.
func NewServer(srv *grpc.Server) *Server {
	s := &Server{}
	examplepb.RegisterCountriesServiceServer(srv, s)
	examplepb.RegisterUtilServiceServer(srv, s)
	return s
}

// CheckStatus checks the status of the util server.
func (s *Server) CheckStatus(ctx context.Context, req *emptypb.Empty) (*examplepb.CheckStatusResponse, error) {
	return &examplepb.CheckStatusResponse{
		Status: examplepb.Status_OK,
	}, nil
}

// Echo echoes the passed message.
func (s *Server) Echo(ctx context.Context, msg *examplepb.Message) (*examplepb.Message, error) {
	return msg, nil
}

// GetCountries returns a list of countries.
func (s *Server) GetCountries(ctx context.Context, req *examplepb.GetCountriesRequest) (*examplepb.GetCountriesResponse, error) {
	var filter map[string]bool
	if len(req.Countries) != 0 {
		filter = make(map[string]bool)
		for _, code := range req.Countries {
			filter[strings.TrimSpace(strings.ToUpper(code))] = true
		}
	}
	countries := make(map[string]*examplepb.Country)
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
		countries[line[1]] = &examplepb.Country{
			Name: line[0],
			Code: line[1],
		}
	}
	return &examplepb.GetCountriesResponse{
		Countries: countries,
	}, nil
}
