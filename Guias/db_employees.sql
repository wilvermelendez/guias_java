CREATE DATABASE  IF NOT EXISTS `db_employees` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `db_employees`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: db_employees
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `lname_txt` char(50) NOT NULL,
  `fname_txt` char(50) DEFAULT NULL,
  `employee_num` int(11) NOT NULL AUTO_INCREMENT,
  `address1` char(120) DEFAULT NULL,
  `address2` char(120) DEFAULT NULL,
  `city` char(50) DEFAULT NULL,
  `state` char(2) DEFAULT NULL,
  `zip` char(10) DEFAULT NULL,
  `phone` char(14) DEFAULT NULL,
  PRIMARY KEY (`employee_num`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES ('Jones','Bob',1,'27 Mockingbird Lane',NULL,'Springfield','MA','11223-4321','1-617-555-1212'),('Smith 2','John 2',2,'55 Boring Street Name 2','Apt 12','Rosswell 2','SS','65444-4555','12345'),('Melendez','Wilver',10,'San Salvador','San salvador','San salvador','SS','123456','75274777'),('perez 2','juan 2',11,'San Salvador','San salvador','San salvador','SS','123654','7527-4777'),('Canales','Sherri',19,'San Salvador','San salvador','San salvador','sv','123465','789654'),('wilver','melendez',20,'san salvador','San Salvador','San Salvador','sv','12345','75895665');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `employee_num` int(11) NOT NULL,
  `user` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`employee_num`,`user`),
  CONSTRAINT `employee_num` FOREIGN KEY (`employee_num`) REFERENCES `employees` (`employee_num`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'bob','81dc9bdb52d04dc20036dbd8313ed055'),(10,'Wilver','81dc9bdb52d04dc20036dbd8313ed055');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-15 19:30:47
