#!/usr/bin/env python3

import json
from flask import Flask, render_template
import extractor

app = Flask(__name__)

@app.route('/')
def test():
    with open('test.json') as f:
        data = json.load(f)
        return render_template('test.html', sentences=list(extractor.extract(data)))

