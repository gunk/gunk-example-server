// Command util is a simple gRPC server for the Gunk services and methods
// defined in utilpb/echo.gunk.
package main

//go:generate gunk generate ./...

import (
	"context"
	"flag"
	"fmt"
	"net"
	"os"

	"github.com/gunk/gunk-example-server/utilpb"
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
