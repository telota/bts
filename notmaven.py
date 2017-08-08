#!/usr/bin/env python3

import requests
from lxml import etree
import binascii
import base64
import itertools
import warnings
import lzma

maven_base_url = 'https://repo1.maven.org/maven2'
eclipse_site_url = 'http://download.eclipse.org/releases/neon/201703141400'

def format_wget_cert_arg(sha256='06:2B:A6:41:B6:12:2C:45:89:1A:BF:5D:B4:59:B2:D6:21:E7:07:D7:E8:8C:4A:CB:54:63:9B:49:76:79:D3:69'):
    return 'sha256//'+base64.b64encode(binascii.unhexlify(sha256.replace(':', ''))).decode('ASCII')

def fetch_latest_version_mvn(group, name):
    meta_url = '{}/{}/{}/maven-metadata.xml'.format(maven_base_url, group.replace('.', '/'), name)
    meta = requests.get(meta_url)
    meta.raise_for_status()
    tree = etree.fromstring(meta.content)
    return tree.find('versioning/release').text

def get_maven_deps(poms):
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

def fetch_osgi_meta(strip_buildid=True, include_requires=False):
    res = requests.get('{}/content.xml.xz'.format(eclipse_site_url))
    tree = etree.fromstring(lzma.decompress(res.content))
    units = tree.findall('units/unit')
    for unit in units:
        name = unit.get('id')
        version = unit.get('version')
        if strip_buildid:
            version = '.'.join(version.split('.')[:-1])
        if not include_requires:
            yield (name, version)
        else:
            reqs = []
            for req in unit.findall('requires/required'):
                if req.get('namespace') == 'osgi.bundle':
                    reqs.append(req.get('name'))
            yield (name, (version, reqs))

def get_osgi_deps(manifests):
    for lines in manifests:
        for l in lines:
            if l.startswith('Require-Bundle:'):
                break

        reqs = [l.partition(':')[2].strip()]
        for l in lines:
            if l[0] not in (' ', '\t'):
                break
            reqs.append(l.strip())

        reqs = ''.join(reqs).split(',')
        for req in reqs:
            name, _, classifier = req.partition(';')
            if classifier:
                if not classifier.startswith('bundle-version='):
                    warnings.warn('Cannot parse classifier {}'.format(classifier))
                    continue
                _1, _2, version = classifier.partition('=')
                version = version.strip('"')
            else:
                version = '0.0.0' # OSGi is actually using that one when it wants to say "unspecified"...

            yield name, version

def duplicate_versions(deps):
    for key, group in itertools.groupby(sorted(deps), lambda dep: dep[:-1]):
        versions  = { ver for *foo,ver in group }
        if len(versions) > 1:
            yield (*key, sorted(versions))

def _make_table(data):
    data = list(data)
    widths = [ max(len(e[i]) for e in data) for i in range(len(data[0])) ]
    formats = [ '{{:<{}}}'.format(w) for w in widths[:-1] ] + ['{}']
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
    def check_mvn_versions(args, **_):
        for group, name, version in dependencies.MAVEN_DEPS:
            try:
                latest = fetch_latest_version_mvn(group, name)
                if latest != version:
                    print('{}/{}: New version {} replaces {}'.format(group, name, latest, version))
            except requests.exceptions.HTTPError:
                print('{}/{} either does not exist or maven central is inconsistent (which happens)'.format(group, name))

    @subcmd
    def check_osgi_versions(args, **_):
        osgi_meta = dict(fetch_osgi_meta())
        for name, version in dependencies.OSGI_DEPS:
            if version is None:
                continue
            if name not in osgi_meta:
                print('WARNING: Bundle {} not found'.format(name))
                continue
            latest = osgi_meta[name]
            if latest != version:
                print('{}: New version {} replaces {}'.format(name, latest, version))

    @subcmd
    def dep_makefile(args, **_):
        print('# Maven dependencies')
        for group, name, version in dependencies.MAVEN_DEPS:
            filename = '{}-{}.jar'.format(name, version)
            package_url = '/'.join((maven_base_url, *group.split('.'), name, version, filename))
            print('sync_deps: {}'.format(filename))
            print('{}:'.format(filename))
            print('\t$(WGET) {}'.format(package_url))
            print()

        print('# Eclipse/OSGi dependencies')
        osgi_meta = dict(fetch_osgi_meta(strip_buildid=False, include_requires=True))
        included = set()
        transitive_reqs = set()
        for name, _version in dependencies.OSGI_DEPS:
            version, reqs = osgi_meta[name]
            transitive_reqs |= set(reqs)
            filename = '{}_{}.jar'.format(name, version)
            package_url = '{}/plugins/{}'.format(eclipse_site_url, filename)
            included.add(name)
            print('sync_deps: {}'.format(filename))
            print('{}:'.format(filename))
            print('\t$(WGET) {}'.format(package_url))
            print()
        transitive_reqs -= included

        print('# Transitive Eclipse/OSGi dependencies')
        while transitive_reqs:
            new_transitive_reqs = set()
            for name in transitive_reqs:
                if not name in osgi_meta:
                    warnings.warn('Transitive dependency {} not found'.format(name))
                    continue
                version, reqs = osgi_meta[name]
                new_transitive_reqs |= set(reqs)
                filename = '{}_{}.jar'.format(name, version)
                package_url = '{}/plugins/{}'.format(eclipse_site_url, filename)
                included.add(name)
                print('sync_deps: {}'.format(filename))
                print('{}:'.format(filename))
                print('\t$(WGET) {}'.format(package_url))
                print()
            transitive_reqs = new_transitive_reqs - included

    @subcmd
    def extract_mvn_deps(args, **_):
        deps = sorted(get_maven_deps(args.pom))
        for group, artifact, versions in duplicate_versions(deps):
            print('WARNING: Several different versions for {}/{}: {}'.format(group, artifact, ', '.join(versions)))
        deps = sorted(set(deps))
        print(_make_table(
            ("('{}', ".format(group), "'{}', ".format(artifact), "'{}'),".format(version))
            for group, artifact, version in deps))
    extract_mvn_deps.parser.add_argument('pom', type=argparse.FileType('rb'), nargs='+')

    @subcmd
    def extract_osgi_deps(args, **_):
        deps = sorted(get_osgi_deps(args.manifest))
        for name, versions in duplicate_versions(deps):
            print('WARNING: Several different versions for {}: {}'.format(name, ', '.join(versions)))
        deps = sorted(set(deps))
        print(_make_table(
            ("('{}', ".format(name), "'{}'),".format(version))
            for name, version in deps))
    extract_osgi_deps.parser.add_argument('manifest', type=argparse.FileType('r'), nargs='+')

    sub.help = 'Available commands:\n* {}'.format('\n* '.join(sub.choices.keys()))
    args = parser.parse_args()
    if args.func:
        args.func(args=args)
    else:
        print('Unknown sub-command.')
        os.exit(2)
