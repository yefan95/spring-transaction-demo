CREATE TABLE  `account`(
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `name` VARCHAR(11) NOT NULL,
   `money` DOUBLE DEFAULT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `account` VALUES ('1','aaa','1000');
INSERT INTO `account` VALUES ('2','bbb','1000');
INSERT INTO `account` VALUES ('3','ccc','1000');