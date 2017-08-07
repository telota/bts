#!/usr/bin/env python3

import requests
from lxml import etree
import binascii
import base64
import itertools

maven_base_url = 'https://repo1.maven.org/maven2'

def format_wget_cert_arg(sha256='06:2B:A6:41:B6:12:2C:45:89:1A:BF:5D:B4:59:B2:D6:21:E7:07:D7:E8:8C:4A:CB:54:63:9B:49:76:79:D3:69'):
    return 'sha256//'+base64.b64encode(binascii.unhexlify(sha256.replace(':', ''))).decode('ASCII')

def fetch_latest_version(group, name):
    meta_url = '{}/{}/{}/maven-metadata.xml'.format(maven_base_url, group.replace('.', '/'), name)
    meta = requests.get(meta_url)
    tree = etree.fromstring(meta.content)
    return tree.find('versioning/latest').text

def get_deps(poms):
    for pom in poms:
        tree = etree.fromstring(pom.read())
        for dep in tree.findall('{*}dependencies/{*}dependency'):
            group = dep.find('{*}groupId').text.strip()
            artifact = dep.find('{*}artifactId').text.strip()
            version = dep.find('{*}version')
            if version is None:
                print('Warning: No version given for {}/{}. Ignoring.'.format(group, artifact))
                continue
            version = version.text.strip()
            yield (group, artifact, version)

def duplicate_versions(deps):
    for key, group in itertools.groupby(sorted(deps), lambda dep: (dep[0], dep[1])):
        versions  = { ver for gp,art,ver in group }
        if len(versions) > 1:
            yield (*key, sorted(versions))

def _make_table(data):
    data = list(data)
    widths = [ max(len(e[i]) for e in data) for i in range(len(data[0])) ]
    formats = [ '{{:<{}}}'.format(w) for w in widths ]
    return '\n'.join(''.join(fmt.format(field) for fmt,field in zip(formats, row)) for row in data)

if __name__ == '__main__':
    import dependencies

    import os
    import argparse
    parser = argparse.ArgumentParser()
    sub = parser.add_subparsers()

    def subcmd(func):
        subparser = sub.add_parser(func.__name__.lstrip('_'))
        subparser.set_defaults(func=func)
        func.parser = subparser
        return func

    @subcmd
    def check_versions(args, **_):
        for group, name, version in dependencies.MAVEN_DEPS:
            latest = fetch_latest_version(group, name)
            if latest != version:
                print('{}/{}: New version {} replaces {}'.format(group, name, latest, version))

    @subcmd
    def dep_makefile(args, **_):
        for group, name, version in dependencies.MAVEN_DEPS:
            filename = '{}-{}.jar'.format(name, version)
            package_url = '/'.join((maven_base_url, *group.split('.'), name, version, filename))
            print('sync_deps: {}'.format(filename))
            print('{}:'.format(filename))
            print('\t$(WGET) {}'.format(package_url))
            print()

    @subcmd
    def extract_deps(args, **_):
        deps = sorted(get_deps(args.pom))
        for group, artifact, versions in duplicate_versions(deps):
            print('WARNING: Several different versions for {}/{}: {}'.format(group, artifact, ','.join(versions)))
        deps = sorted(set(deps))
        print(_make_table(
            ("('{}', ".format(group), "'{}', ".format(artifact), "'{}'),".format(version))
            for group, artifact, version in deps))
    extract_deps.parser.add_argument('pom', type=argparse.FileType('rb'), nargs='+')

    sub.help = 'Available commands:\n* {}'.format('\n* '.join(sub.choices.keys()))
    args = parser.parse_args()
    if args.func:
        args.func(args=args)
    else:
        print('Unknown sub-command.')
        os.exit(2)
