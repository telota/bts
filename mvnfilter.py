#!/usr/bin/python3

import sys
import re
import threading
import time

from tqdm import tqdm
import subprocess

def capture(stream, pbar):
    last_time = int(time.time()*10)
    redir_files = []
    colors_mangled = []
    for line in stream:
        line = line.decode(errors='ignore').rstrip() # strip newline

        this_time = int(time.time()*10)
        pbar.update(this_time - last_time)
        last_time = this_time

        if not line:
            continue

        if line.startswith('[INFO]'):
            continue

        if line.startswith('[ERROR]'):
            if 'problem' in line and 'error' in line:
                break
            if line.startswith('[ERROR] /'):
                pbar.write('')
            pbar.write('\033[91m'+line)
        else:
            if line.startswith('Installing') or line.startswith('Operation completed in'):
                continue;
            pbar.write(line)
        pbar.refresh()


if __name__ == '__main__':
    start_time = time.time()
    proc = subprocess.Popen(['mvn', *sys.argv[1:]], stdout=subprocess.PIPE, stderr=subprocess.PIPE)

    try:
        with open('.mvnfilter_last_run') as f:
            pbar = tqdm(total=int(f.read())*10, unit_scale=10)
    except:
        pbar = tqdm(total=3000)

    thr_out = threading.Thread(target=capture, args=(proc.stdout, pbar), daemon=True)
    thr_out.start()
    proc.wait()
    end_time = time.time()
    duration = round(end_time - start_time)
    pbar.close()

    if proc.returncode == 0:
        with open('.mvnfilter_last_run', 'w') as f:
            print(int(duration), file=f)
        print('\033[92mBuggered around successfully for {}:{:02}'.format(duration//60, duration%60))
    else:
        print('\033[93mBuggered around unsuccessfully for {}:{:02}'.format(duration//60, duration%60))

    sys.exit(proc.returncode)
