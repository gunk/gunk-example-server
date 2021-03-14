#!/bin/bash

# run both gunk-example-server and gunk-example-server-gw to test this

MSG=$1
if [ -z "$MSG" ]; then
  echo "usage: $0 <MSG>"
  exit 1
fi

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
