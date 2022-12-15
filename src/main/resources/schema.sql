DROP table if exists users;

CREATE TABLE IF NOT EXISTS users
(
    id        bigint       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name      varchar(255) NOT NULL
);
