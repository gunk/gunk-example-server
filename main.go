// Command util is an example gRPC server for Gunk services and methods defined
// in api/v1.
package main

//go:generate gunk generate ./...

import (
	"bytes"
	"context"
	_ "embed"
	"encoding/csv"
	"flag"
	"fmt"
	"io"
	"net"
	"os"
	"strings"

	examplepb "github.com/gunk/gunk-example-server/api/v1"
	"google.golang.org/grpc"
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
	// build server
	srv := grpc.NewServer()
	reflection.Register(srv)
	_, err := NewServer(srv)
	if err != nil {
		return err
	}
	// listen and serve
	l, err := (&net.ListenConfig{}).Listen(ctx, "tcp", addr)
	if err != nil {
		return err
	}
	defer l.Close()
	return srv.Serve(l)
}

// Server is a util server.
type Server struct {
	examplepb.UnimplementedCountriesServiceServer
	examplepb.UnimplementedUtilServiceServer
	countries map[string]*examplepb.Country
}

// NewServer creates a new server.
func NewServer(srv *grpc.Server) (*Server, error) {
	countries := make(map[string]*examplepb.Country)
	r := csv.NewReader(bytes.NewReader(countriesCsv))
loop:
	for {
		line, err := r.Read()
		switch {
		case err != nil && err == io.EOF:
			break loop
		case err != nil:
			return nil, fmt.Errorf("unable to read country data: %w", err)
		}
		countries[line[1]] = &examplepb.Country{
			Name: line[0],
			Code: line[1],
		}
	}
	s := &Server{
		countries: countries,
	}
	examplepb.RegisterCountriesServiceServer(srv, s)
	examplepb.RegisterUtilServiceServer(srv, s)
	return s, nil
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
	var countries map[string]*examplepb.Country
	if len(req.Countries) == 0 {
		countries = s.countries
	} else {
		countries = make(map[string]*examplepb.Country)
		for _, id := range req.Countries {
			id = strings.ToUpper(id)
			if c, ok := s.countries[id]; ok {
				countries[id] = c
			}
		}
	}
	return &examplepb.GetCountriesResponse{
		Countries: countries,
	}, nil
}

//go:embed countries.csv
var countriesCsv []byte
