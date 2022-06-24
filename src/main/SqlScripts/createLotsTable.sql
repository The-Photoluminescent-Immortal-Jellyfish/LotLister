USE lots_db;

CREATE TABLE `LOTS`
(
    `id`            int unsigned NOT NULL AUTO_INCREMENT ,
    `street_number` int NOT NULL ,
    `username`      varchar(45) NOT NULL ,
    `street_name`   varchar(45) NOT NULL ,
    `email`         varchar(45) NOT NULL ,
    `appraisal`     decimal(10, 2) NULL ,
    `sale_price`    decimal(10, 2) NULL ,
    `listing_name`  varchar(45) NOT NULL ,
    `city`          varchar(45) NOT NULL ,
    `state`         varchar(45) NOT NULL ,
    `gov_org`       varchar(45) NOT NULL ,

    PRIMARY KEY (`id`),
    KEY `FK_18` (`username`, `email`),
    CONSTRAINT `FK_15` FOREIGN KEY `FK_18` (`username`, `email`) REFERENCES `USERS` (`username`, `email`)
);