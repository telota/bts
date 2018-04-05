#!/usr/bin/python3

import sys
import re
import threading
import datetime
import sqlite3
import hashlib

import subprocess

TS_RE = r'[A-Z][a-z]?[a-z] [0-9]{1,2}, [0-9]{4} [0-9][0-9]?:[0-9][0-9]?:[0-9][0-9]? [AP]M'



STDOUT_REDIR = [
    ('^!ENTRY ', None),
    ('^!MESSAGE ', 'eclipse'),
    'stdout'
]

STDOUT_COLORS = [
    ('^!MESSAGE', None),
    ('http://[^ ]*', 93),
    ('\w+:', 37),
    ('\w+\.\w+\.[\w.]+', 93),
    ('@[0-9a-z]{8}', 96),
    ('^   *at .*$', 91),
    ('{.*}', 96)
]

STDERR_REDIR = [
    ('^'+TS_RE, None),
    ('^(INFORMATION|SCHWERWIEGEND|WARNUNG):', 'couch'),
    'stderr'
]

STDERR_COLORS = [
    ('^INFORMATION: .*$', 37),
    ('^WARNUNG: .*$', 93),
    ('^SCHWERWIEGEND: .*$', 91),
    ('^.*$', 91)
]

def capture(stream, redir, colors, dbname, run_id):
    with sqlite3.connect(dbname) as db:

        with db as conn:
            db.execute('CREATE TABLE IF NOT EXISTS messages (runid INTEGER, hash TEXT, line TEXT)')
            db.execute('DELETE FROM messages WHERE runid < ?', (run_id-1,))

        def is_old_msg(conn, msg):
            this_hash = hashlib.sha1(msg.encode()).hexdigest()
            count, = conn.execute(
                'SELECT COUNT(*) FROM messages WHERE runid<=? AND hash=?', (run_id, this_hash)).fetchone()
            conn.execute('INSERT INTO messages VALUES (?, ?, ?)', (run_id, this_hash, msg))
            return count > 0

        redir_files = []
        colors_mangled = []
        try:
            for rx, name in redir[:-1]:
                if rx is not None:
                    redir_files.append((re.compile(rx), open(name, 'w') if name is not None else None))
            default_file = open(redir[-1], 'w')

            for rx, f in redir_files + [(None, default_file)]:
                if f is None:
                    continue
                f.write('\033[1;91m'+'='*80+'\n')
                f.write('Log rollover on {}\n'.format(str(datetime.datetime.now())))
                f.write('\033[1;91m'+'='*80+'\n')
                f.write('\033[0m')
                f.flush()

            for rx, color in colors:
                colors_mangled.append((re.compile(rx), '\033[{}m\\g<0>\033[0m'.format(color) if color is not None else ''))

            with db as conn:
                for line in stream:
                    line = line.decode(errors='ignore').rstrip() # strip newline
                    if not line:
                        continue

                    for rx, f in redir_files:
                        if rx.match(line):
                            outf = f
                            break
                    else:
                        outf = default_file

                    print('\033[37m{:>12}\033[0m'.format('<none>' if outf is None else outf.name), line, flush=True)
                    if outf is None:
                        continue

                    highlight = not is_old_msg(conn, line)
                    for rx, color in colors_mangled:
                        line = rx.sub(color, line)
                    if highlight:
                        line = '\033[7m{}\033[0m'.format(line)
                    outf.write(line)
                    outf.write('\n')
                    outf.flush()
        finally:
            for rx, f in redir_files:
                if f is not None:
                    f.close()


if __name__ == '__main__':
    try:
        with open('.colorize_run_id') as f:
            last_run_id = int(f.read())
    except:
        last_run_id = 0
    run_id = last_run_id + 1
    with open('.colorize_run_id', 'w') as f:
        print(run_id, file=f)

    proc = subprocess.Popen(sys.argv[1:], stdout=subprocess.PIPE, stderr=subprocess.PIPE)

    thr_out = threading.Thread(target=capture,
            args=(proc.stdout, STDOUT_REDIR, STDOUT_COLORS, '.colorize_stdout.sqlite3', run_id), daemon=True)
    thr_err = threading.Thread(target=capture,
            args=(proc.stderr, STDERR_REDIR, STDERR_COLORS, '.colorize_stderr.sqlite3', run_id), daemon=True)
    thr_out.start()
    thr_err.start()
    proc.wait()
