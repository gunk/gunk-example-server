# About gunk-example-server

Demonstrates building example gRPC servers with OpenAPI (Swagger) annotations
in Go using [Gunk definitions][gunk].

| File                                                                     | Description                    |
|--------------------------------------------------------------------------|--------------------------------|
| [.gunkconfig](.gunkconfig)                                               | Gunk project configuration     |
| [main.go](main.go)                                                       | gRPC server implementation     |
| [cmd/gunk-example-server-gw/main.go](cmd/gunk-example-server-gw/main.go) | REST gateway and Swagger docs  |
| [api/v1/util.gunk](api/v1/util.gunk)                                     | Gunk echo service example      |
| [api/v1/countries.gunk](api/v1/util.gunk)                                | Gunk countries service example |

## Using

```sh
# clone
$ git clone https://github.com/gunk/gunk-example-server.git && cd gunk-example-server

# install protobuf tools / generator dependencies
$ ./install.sh

# build and run gRPC server
$ go build && ./gunk-example-server

# build and run REST gateway and Swagger doc site
$ go build ./cmd/gunk-example-server-gw && ./gunk-example-server-gw

# test
$ ./test.sh
```

[gunk]: https://github.com/gunk/gunk
