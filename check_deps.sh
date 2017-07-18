#!/bin/sh
# Check third-party dependencies without coordinated release to some maven repository for recency

set -e

opal_release="$(curl -s https://api.github.com/repos/lcaron/opal/tags|egrep -o '"name":[[:space:]]*"[vV][0-9.]*"'|egrep -o '[0-9.]*'|sort -n|tail -n 1)"
opal_current=1.0.6
if [ "$opal_release" != "$opal_current" ]; then
    echo "New release of opal available."
    echo "See https://github.com/lcaron/opal"
fi
