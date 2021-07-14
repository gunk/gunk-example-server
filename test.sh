#!/bin/bash

# run both gunk-example-server and gunk-example-server-gw to test this

MSG="hello $USER"

set -e

(set -x;
  grpcurl \
    -plaintext \
    -d "{\"msg\": \"$MSG\"}" \
    localhost:9090 utilpb.Util/Echo
)|jq '.'

(set -x;
  curl \
    -s \
    -X POST \
    -d "{\"msg\": \"$MSG\"}" \
    http://localhost:9091/v1/echo
)|jq '.'

QUERY=$(echo -n "$MSG"|jq -sRr @uri)
(set -x;
  curl \
    -s \
    "http://localhost:9091/v1/echo?msg=$QUERY"
)|jq '.'

(set -x;
  curl \
    -s \
    http://localhost:9091/v1/countries/us,cn
)|jq '.'
