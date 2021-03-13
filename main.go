// Command util is a simple gRPC server for the Gunk services and methods
// defined in utilpb/echo.gunk.
package main

//go:generate gunk generate ./...

import (
	"context"
	"log"
	"net"

	"github.com/gunk/gunk-example-server/utilpb"
	"google.golang.org/grpc"
	"google.golang.org/grpc/reflection"
	"google.golang.org/protobuf/types/known/emptypb"
)

// Server is a util server.
type Server struct {
	utilpb.UnimplementedUtilServer
}

// CheckStatus returns the status of the util server.
func (s *Server) CheckStatus(ctx context.Context, req *emptypb.Empty) (*utilpb.CheckStatusResponse, error) {
	return &utilpb.CheckStatusResponse{
		Status: utilpb.Status_OK,
	}, nil
}

// Echo returns the passed message.
func (s *Server) Echo(ctx context.Context, msg *utilpb.Message) (*utilpb.Message, error) {
	return msg, nil
}

func main() {
	l, err := net.Listen("tcp", ":9090")
	if err != nil {
		log.Fatal(err)
	}
	s := grpc.NewServer()
	reflection.Register(s)
	utilpb.RegisterUtilServer(s, &Server{})
	log.Fatal(s.Serve(l))
}
