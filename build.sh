#!/bin/sh

set -e

mvn install | tee err
./run.sh
