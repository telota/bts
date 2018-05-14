#!/bin/sh
set -e

destdir="latest"
mkdir -p $destdir

netrc=/etc/btsrender/couchdb_netrc
export COUCHDB_USER="$(cut -d' ' -f4 $netrc)" COUCHDB_PASS="$(cut -d' ' -f4 $netrc)"

rm -f "$destdir"/*.json
dbnames=$(curl --netrc-file "$netrc" http://aaew64.bbaw.de:9589/_all_dbs|jq -r '.[]')
for n in $dbnames; do
    $(dirname "$0")/couchdb-backup.sh -b -H aaew64.bbaw.de -P 9589 -d "$n" -f "$destdir/$n.json"
done

