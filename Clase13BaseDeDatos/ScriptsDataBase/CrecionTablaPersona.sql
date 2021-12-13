DROP TABLE IF EXISTS  `persona`;

USE `personas`

CREATE TABLE `personas`.`persona` 
( 
    `id` INT(10) NOT NULL AUTO_INCREMENT ,
    `nombre` VARCHAR(30) NOT NULL ,
    `edad` INT(3) NOT NULL , 
    `profesion` VARCHAR(30) NOT NULL ,
    `telefono` DECIMAL(10,0) NOT NULL ,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB;