#!/bin/bash

SRC=$(realpath $(cd -P "$(dirname "${BASH_SOURCE[0]}")" && pwd))

set -e

pushd $SRC &> /dev/null
TOOLS=$(go list -tags tools -f '{{ join .Imports "\n" }}' tools.go)
(set -x;
  go install $TOOLS
)
popd &> /dev/null
