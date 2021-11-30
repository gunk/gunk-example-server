#!/bin/bash

SRC=$(realpath $(cd -P "$(dirname "${BASH_SOURCE[0]}")" && pwd))

set -e

pushd $SRC &> /dev/null
FILES=$(find api/v1 -mindepth 2 -type f -iname \*.go -or -iname \*.ts -or -iname \*.js -or -iname \*.py -or -iname \*.java)
(set -x;
  rm -f $FILES
)
popd &> /dev/null
