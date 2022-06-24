USE lots_db;

CREATE TABLE `USERS`
(
    `username` varchar(45) NOT NULL ,
    `email`    varchar(45) NOT NULL ,
    `password` varchar(45) NOT NULL ,

    PRIMARY KEY (`username`, `email`)
);