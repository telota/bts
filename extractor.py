#!/usr/bin/env python3
import json
import hashlib
import re

def svg_filename(mdc):
    return '{:.12}-{:.32}.svg'.format(
            hashlib.sha256(mdc.encode('ASCII')).hexdigest(),
            re.sub('[^a-zA-Z0-9]+', '-', mdc))

def minify_svg(svg):
    from cleanSVG import CleanSVG
    cleaner = CleanSVG(svgstring=svg)
    w, h = cleaner.root.attrib.pop('width'), cleaner.root.attrib.pop('height')
    cleaner.root.attrib['viewBox'] = '0 0 {} {}'.format(w, h)
    #cleaner.removeAttribute('style')
    cleaner.setDecimalPlaces(4)
    return str(cleaner).replace('fill:#000000', 'fill:#254048')

def get_svg(mdc):
    import sqlite3
    db = sqlite3.connect('.mdc_cache.sqlite3')
    with db as conn:
        conn.execute('CREATE TABLE IF NOT EXISTS mdc_cache (mdc TEXT, svg TEXT)')

        results = conn.execute('SELECT svg FROM mdc_cache WHERE mdc == ?', (mdc,)).fetchall()
        if results:
            return minify_svg(results[0][0])

        import subprocess
        proc = subprocess.Popen(['qrexec-client-vm', 'bts', 'MDCConvert'], stdin=subprocess.PIPE, stdout=subprocess.PIPE)
        out, _err = proc.communicate(mdc)
        out = out.strip()
        conn.execute('INSERT INTO mdc_cache VALUES (?,?)', (mdc, out))
        return minify_svg(out)

def get_mdc(item):
    return ''.join(graph['code'] for graph in item.get('graphics', ()))

def get_tl(item):
    foo = item.get('translation')
    bar = foo.get('translations') if foo is not None else []
    tls = { tl['lang']: tl['value'] for tl in bar }
    return tls.get('de')

def extract(data):
    for sentence in data['textContent']['textItems']:
        yield {'translation': get_tl(sentence),
                'items': list(extract_sentence(sentence))}

def extract_sentence(sentence):
    for item in sentence['sentenceItems']:
        if 'BTSWord' in item['eClass']:
            mdc = get_mdc(item)
            yield {'type': 'word',
                    'lemma': item.get('lKey'),
                    'transliteration': item.get('wChar'),
                    'translation': get_tl(item),
                    'mdc': mdc,
                    'svg': get_svg(mdc),
                    'render_filename': svg_filename(mdc)}

if __name__ == '__main__':
    from os import path
    import argparse
    parser = argparse.ArgumentParser()
    parser.add_argument('json_file')
    parser.add_argument('svg_dir', nargs='?')
    args = parser.parse_args()

    with open(args.json_file) as f:
        data = json.load(f)
        for i, sentence in enumerate(extract(data)):
            print('Sentence', i, sentence['translation'])
            for j, word in enumerate(sentence['items']):
                print('Word', j, { k: v for k, v in word.items() if not k == 'svg' })
                if args.svg_dir:
                    with open(path.join(args.svg_dir, word['render_filename']), 'w') as f:
                        f.write(word['svg'])

