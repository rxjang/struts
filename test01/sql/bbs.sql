CREATE TABLE `xe`.`bbs` (
  `bbsID` INT NOT NULL,
  `bbsTitle` VARCHAR(50) NULL,
  `num` INT NULL,
  `bbsDate` DATETIME NULL,
  `bbsContent` VARCHAR(2048) NULL,
  `bbsAvailable` INT NULL,
  PRIMARY KEY (`bbsID`),
  INDEX `num_idx` (`num` ASC) VISIBLE,
  CONSTRAINT `bbsnum`
    FOREIGN KEY (`num`)
    REFERENCES `xe`.`member` (`num`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);