#!/bin/bash

ps=$(</home/mdriv/mdriv_api/mdriv_api.pid)
echo "$ps"
kill -9 $ps
