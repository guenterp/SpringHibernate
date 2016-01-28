
CREATE DATABASE IF NOT EXISTS MYTEST
DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;

CREATE TABLE IF NOT EXISTS MYTEST.CONTACT (
  ID INT NOT NULL AUTO_INCREMENT,
  NAME varchar(100) NOT NULL,
  COUNTRY varchar(100),
  PRIMARY KEY (ID)
) ENGINE=InnoDB;
