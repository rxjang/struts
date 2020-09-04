CREATE TABLE `xe`.`dept` (
  `deptno` INT NOT NULL AUTO_INCREMENT,
  `dname` VARCHAR(10) NULL,
  `loc` VARCHAR(10) NULL,
  PRIMARY KEY (`deptno`));

INSERT INTO `xe`.`dept` (`deptno`, `dname`, `loc`) VALUES ('1', '영업', '서울');
INSERT INTO `xe`.`dept` (`deptno`, `dname`, `loc`) VALUES ('2', '회계', '부산');
INSERT INTO `xe`.`dept` (`deptno`, `dname`, `loc`) VALUES ('3', '총무', '대전');
INSERT INTO `xe`.`dept` (`deptno`, `dname`, `loc`) VALUES ('4', '생산', '구미');
  
 select * from dept;
 
 delete from dept where deptno=7