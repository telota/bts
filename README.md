BTS Render Hack
===============

This repo contains a small python script that renders hieroglyph texts from the
BTS database in a human-friendly web interface. The system consists of three
major parts:
 * sqlitize.py reads a JSON CouchDB backup of the upstream BTS database and
   writes it into an sqlite database for easier access.
 * render.py provides a minimalist web interface to view texts.
 * The small piece of java code is used by render.py to render hieroglyphs from
   MDC.

Deployment
----------

The repo can be deployed on any Ubuntu box using the enclosed ansible playbook:

* First, get a copy of JSesh and put it into the bin/ folder. This is needed for
  both compiling the java code and deployment. On deployment, this JSesh
  installation will be copied to the target server.

* Second, run `make` in the `flask` directory to compile the java code. You will
  need a Java compiler for this.

* Third, run the ansible playbook in the `ansible` folder: `ansible-playbook
  deploy.yml`

The playbook will install four systemd units on the target system.

1. bts-backup.service is triggered daily by bts-render-export.service and
   produces a JSON dump of the upstream BTS database into
   /var/cache/btsrender/backup
2. bts-render-export.service, triggered from bts-render-export.timer reads this
   backup and updates the sqlite database file in /var/cache/btsrender/db.
3. btsrender.service runs the python flask application inside a gunicorn wsgi
   runner.
4. mdc-render.service runs the tiny JSesh SVG MDC renderer the flask app talks
   to on localhost:5001

