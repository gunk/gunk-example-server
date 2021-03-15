#!/bin/bash

# run both gunk-example-server and gunk-example-server-gw to test this

MSG="hello $USER"

set -e

grpcurl \
  -plaintext \
  -d "{\"msg\": \"$MSG\"}" \
  localhost:9090 utilpb.Util/Echo|jq '.'

curl \
  -s \
  -X POST \
  -d "{\"msg\": \"$MSG\"}" \
  http://localhost:9091/v1/echo|jq '.'

curl \
  -s \
  "http://localhost:9091/v1/echo?msg=$(echo -n "$MSG"|jq -sRr @uri)"|jq '.'

curl \
  -s \
  http://localhost:9091/v1/countries/us,cn|jq '.'
