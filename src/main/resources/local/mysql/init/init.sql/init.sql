GRANT RELOAD, FLUSH_TABLES ON *.* TO 'app_user'@'%';
FLUSH PRIVILEGES;

GRANT SUPER, REPLICATION CLIENT ON *.* TO 'app_user'@'%';
FLUSH PRIVILEGES;

GRANT REPLICATION SLAVE ON *.* TO 'app_user'@'%';
FLUSH PRIVILEGES;

USE app;