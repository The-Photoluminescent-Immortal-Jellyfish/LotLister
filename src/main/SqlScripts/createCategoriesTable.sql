USE lots_db;

CREATE TABLE `CATEGORIES`
(
    `id`          int unsigned NOT NULL ,
    `real_estate` binary NOT NULL ,
    `artwork`     binary NOT NULL ,
    `auto`        binary NOT NULL ,

    PRIMARY KEY (`id`),
    KEY `FK_71` (`id`),
    CONSTRAINT `FK_69` FOREIGN KEY `FK_71` (`id`) REFERENCES `LOTS` (`id`)
);