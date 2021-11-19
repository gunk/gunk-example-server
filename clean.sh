#!/bin/bash

SRC=$(realpath $(cd -P "$(dirname "${BASH_SOURCE[0]}")" && pwd))

set -e

pushd $SRC &> /dev/null
(set -x;
  rm -f api/v1/*_pb2.py
  rm -f api/v1/*_pb.d.ts
  rm -f api/v1/*.pb.go
  rm -f api/v1/*.pb.gw.go
  rm -f api/v1/*.js
  rm -f api/v1/*.swift
  rm -f api/v1/*.java
  rm -rf api/v1/example
  touch api/v1/all.swagger.json
)
popd &> /dev/null
