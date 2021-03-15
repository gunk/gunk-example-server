// Command gunk-example-server-gw is a grpc-gateway example implementation for
// the gunk-example-server.
package main

import (
	"context"
	"flag"
	"fmt"
	"net/http"
	"os"

	"github.com/grpc-ecosystem/grpc-gateway/v2/runtime"
	"github.com/gunk/gunk-example-server/utilpb"
	csv "github.com/matoubidou/grpc-gateway-csv"
	"google.golang.org/grpc"
)

func main() {
	addr := flag.String("l", ":9091", "listen address")
	endpoint := flag.String("endpoint", "localhost:9090", "grpc endpoint")
	flag.Parse()
	if err := run(context.Background(), *addr, *endpoint); err != nil {
		fmt.Fprintf(os.Stderr, "error: %v\n", err)
		os.Exit(1)
	}
}

// run creates and runs the grpc-gateway instance for the util service.
func run(ctx context.Context, addr, endpoint string) error {
	ctx, cancel := context.WithCancel(ctx)
	defer cancel()
	mux := runtime.NewServeMux(runtime.WithMarshalerOption("text/csv", &csv.Marshaler{}))
	opts := []grpc.DialOption{grpc.WithInsecure()}
	if err := utilpb.RegisterUtilHandlerFromEndpoint(ctx, mux, endpoint, opts); err != nil {
		return err
	}
	return http.ListenAndServe(addr, mux)
}
