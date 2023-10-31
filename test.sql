CREATE DATABASE test
USE test;

CREATE TABLE tasks
(
id int(10) PRIMARY KEY AUTO_INCREMENT,
priority VARCHAR(10) NOT NULL,
description VARCHAR(100) NOT NULL,
isDone BIT DEFAULT false NOT NULL
)
COLLATE='utf8_general_ci';

INSERT INTO `tasks` (`priority`,`description`,`isDone`)
VALUES
(10, "play the guitar", 0),
(5, "buy tickets to cinema", 0),
(8, "fid the cat", 0),
(5, "go to the gym", 0);
