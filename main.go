// Command util is a simple gRPC server for the Gunk services and methods
// defined in v1/util/echo.gunk.
package main

//go:generate gunk generate ./...

import (
	"context"
	"log"
	"net"

	goog "github.com/golang/protobuf/ptypes/empty"
	"google.golang.org/grpc"
	"google.golang.org/grpc/reflection"

	pb "github.com/gunk/gunk-example-server/v1/util"
)

// Server is a util server.
type Server struct {
}

// CheckStatus returns the status of the util server.
func (s *Server) CheckStatus(ctxt context.Context, req *goog.Empty) (*pb.CheckStatusResponse, error) {
	return &pb.CheckStatusResponse{
		Status: pb.Status_OK,
	}, nil
}

// Echo returns the passed message.
func (s *Server) Echo(ctxt context.Context, msg *pb.Message) (*pb.Message, error) {
	return msg, nil
}

func main() {
	l, err := net.Listen("tcp", ":9090")
	if err != nil {
		log.Fatal(err)
	}
	s := grpc.NewServer()
	reflection.Register(s)
	pb.RegisterUtilServer(s, &Server{})
	log.Fatal(s.Serve(l))
}
