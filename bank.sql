CREATE DATABASE BANK;
USE BANK;
--
-- Table structure for table `Account`
--

CREATE TABLE IF NOT EXISTS `Account` (
  `Acc` smallint(6) DEFAULT NULL,
  `Name` varchar(18) DEFAULT NULL,
  `DOB` varchar(12) DEFAULT NULL,
  `Pin` mediumint(9) DEFAULT NULL,
  `Acc_Type` varchar(8) DEFAULT NULL,
  `Ethnicity` varchar(20) DEFAULT NULL,
  `MICR_No` smallint(6) DEFAULT NULL,
  `Gender` varchar(6) DEFAULT NULL,
  `Mob` bigint(20) DEFAULT NULL,
  `Address` varchar(16) DEFAULT NULL,
  `Sec_Q` varchar(42) DEFAULT NULL,
  `Sec_A` varchar(60) DEFAULT NULL,
  `Balance` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Account`
--

LOCK TABLES `Account` WRITE;
/*!40000 ALTER TABLE `Account` DISABLE KEYS */;
INSERT INTO `Account` VALUES (2602,'admin','26/02/2000',100,'Admin','ADmin',2602,'Male',2111223344,'123 happy street','What is the name of your favouite teacher?','',100),(5353,'testing','1/05/1977',12345,'Savings','Pacific/Maori',116,'Other',2122222222,'123 happy street','What is the name of your mother?','haha',1),(6038,'yugesh kumar verma','13 Nov, 1996',983,'Savings','Indian/Asian',197,'Male',575129149,'bhilai','What is the name of your first pet?','dogy',1000),(7674,'mick','7/05/2018',341,'Savings','New Zealand European',418,'Male',9765865,'93409 mmmm','What is the name of your first pet?','po',1000);
/*!40000 ALTER TABLE `Account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Balances`
--


CREATE TABLE IF NOT EXISTS `Balances` (
  `Name` varchar(18) DEFAULT NULL,
  `Acc` smallint(6) DEFAULT NULL,
  `MICR_No` smallint(6) DEFAULT NULL,
  `Balance` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Balances`
--

LOCK TABLES `Balances` WRITE;
/*!40000 ALTER TABLE `Balances` DISABLE KEYS */;
INSERT INTO `Balances` VALUES ('mick',7674,418,''),('testing',5353,116,'250'),('Henare',2828,678,'150'),('',5906,300,''),('',6482,207,''),('',9930,941,''),('',2208,254,''),('',2648,65,''),('',2990,134,''),('',8221,26,''),('yugesh kumar verma',6038,197,'1000');
/*!40000 ALTER TABLE `Balances` ENABLE KEYS */;
UNLOCK TABLES;



