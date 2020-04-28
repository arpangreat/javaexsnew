#!/usr/bin/env bash
set -euo pipefail

git add .
git init
git commit -m "Your Commit message goes here"
git push -u origin master
