#!/usr/bin/env bash

docker run -d --name redis-container \
  -p 6379:6379 \
  redis:latest
#  redis-server /usr/local/etc/redis/redis.conf
#  -v $(pwd)/init/redis.conf:/usr/local/etc/redis/redis.conf \

