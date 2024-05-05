#!/usr/bin/env bash
docker run --name db \
  -e MYSQL_ROOT_PASSWORD=root_pass \
  -e MYSQL_DATABASE=app \
  -e MYSQL_USER=app_user \
  -e MYSQL_PASSWORD=app_user_password \
  -p 3306:3306 \
  -v mysql_data:/var/lib/mysql \
  -v $(pwd)/init/init.sql:/docker-entrypoint-initdb.d/init.sql \
  -v $(pwd)/init/my.conf:/etc/mysql/my.cnf \
  -d mysql:8.0 \
  --character-set-server=utf8mb4 \
  --collation-server=utf8mb4_unicode_ci \
  --default-authentication-plugin=mysql_native_password