#!/bin/sh

set -e
PROJECTDIR=$(dirname $0)
{
    find "$PROJECTDIR" -name '*.java' -and -not -wholename './org\\.bbaw*' -and -not -wholename '*src-gen*' -and -not -wholename '*target*' | sed "s,$PROJECTDIR/,,"
    egrep -v '^#' reviewed_files.txt|egrep -v '^[[:space:]]*$'|cut -d' ' -f1
}|sort|uniq -u
