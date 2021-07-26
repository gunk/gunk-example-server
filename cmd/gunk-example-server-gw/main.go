// Command gunk-example-server-gw is a grpc-gateway example implementation for
// the gunk-example-server.
package main

import (
	"context"
	"flag"
	"fmt"
	"net"
	"net/http"
	"os"

	"github.com/grpc-ecosystem/grpc-gateway/v2/runtime"
	"github.com/kenshaw/redoc"
	"google.golang.org/grpc"

	examplepb "github.com/gunk/gunk-example-server/api/v1"
)

func main() {
	addr := flag.String("l", ":9091", "listen address")
	endpoint := flag.String("endpoint", "localhost:9090", "grpc endpoint")
	spec := flag.String("spec", "/v1/swagger.json", "spec url")
	flag.Parse()
	if err := run(context.Background(), *addr, *endpoint, *spec); err != nil {
		fmt.Fprintf(os.Stderr, "error: %v\n", err)
		os.Exit(1)
	}
}

// run creates and runs the gateway instance.
func run(ctx context.Context, addr, endpoint, spec string) error {
	// build gateway mux
	gw, opts := runtime.NewServeMux(), []grpc.DialOption{grpc.WithInsecure()}
	for _, f := range []func(context.Context, *runtime.ServeMux, string, []grpc.DialOption) error{
		examplepb.RegisterUtilServiceHandlerFromEndpoint,
		examplepb.RegisterCountriesServiceHandlerFromEndpoint,
	} {
		if err := f(ctx, gw, endpoint, opts); err != nil {
			return err
		}
	}
	// build mux
	mux := http.NewServeMux()
	// handle swagger
	mux.HandleFunc(spec, func(res http.ResponseWriter, req *http.Request) {
		res.Header().Set("Content-Type", "application/json")
		_, _ = res.Write(examplepb.Swagger)
	})
	// handle gateway
	mux.Handle("/v1/", gw)
	// add redoc
	if err := redoc.New(spec, "/", redoc.WithServeMux(mux)).Build(ctx, nil); err != nil {
		return err
	}
	// listen and serve
	l, err := (&net.ListenConfig{}).Listen(ctx, "tcp", addr)
	if err != nil {
		return err
	}
	return http.Serve(l, mux)
}
