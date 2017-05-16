CREATE DATABASE  IF NOT EXISTS `parcial3` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `parcial3`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: parcial3
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
-- Temporary view structure for view `actividadesdocente`
--

DROP TABLE IF EXISTS `actividadesdocente`;
/*!50001 DROP VIEW IF EXISTS `actividadesdocente`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `actividadesdocente` AS SELECT 
 1 AS `IdVisita`,
 1 AS `IdDocente`,
 1 AS `Fecha`,
 1 AS `Institucion`,
 1 AS `Usuario`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `directores`
--

DROP TABLE IF EXISTS `directores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `directores` (
  `IdDirector` int(11) NOT NULL AUTO_INCREMENT,
  `PrimerNombre` varchar(45) NOT NULL,
  `SegundoNombre` varchar(45) NOT NULL,
  `PrimerApellido` varchar(45) NOT NULL,
  `SegundoApellido` varchar(45) NOT NULL,
  `Usuario` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`IdDirector`),
  UNIQUE KEY `Usuario_UNIQUE` (`Usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `directores`
--

LOCK TABLES `directores` WRITE;
/*!40000 ALTER TABLE `directores` DISABLE KEYS */;
INSERT INTO `directores` VALUES (1,'Eduardo','Antonio','González ','Valencia','eduardo.gonzalez','14832002d9589c57763b8e50d5d2dfd2'),(2,'Victoria','Isabel','Zapata','Zelaya','victoria.zapata','f3b9cc4d4f7f75558a03243c76ecbe05'),(3,'Luis','Enrique','Martínez','Sandoval','luis.martinez','4e136d282165d401f23ebc20cc9c440a'),(4,'Ana','Gladis','Zaragoza','Sosa','ana.zaragoza','93f3a087289055d6a671cb3e0df870c9'),(5,'Miguel','Andrés','Canales','Cruz','miguel.canales','2bd776bb84ce8c6f21551ce3c7248507');
/*!40000 ALTER TABLE `directores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `docenteescuela`
--

DROP TABLE IF EXISTS `docenteescuela`;
/*!50001 DROP VIEW IF EXISTS `docenteescuela`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `docenteescuela` AS SELECT 
 1 AS `IdDocente`,
 1 AS `PrimerNombre`,
 1 AS `SegundoNombre`,
 1 AS `PrimerApellido`,
 1 AS `SegundoApellido`,
 1 AS `Usuario`,
 1 AS `Password`,
 1 AS `IdEscuela`,
 1 AS `Nombre`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `docentes`
--

DROP TABLE IF EXISTS `docentes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `docentes` (
  `IdDocente` int(11) NOT NULL AUTO_INCREMENT,
  `PrimerNombre` varchar(45) NOT NULL,
  `SegundoNombre` varchar(45) DEFAULT NULL,
  `PrimerApellido` varchar(45) NOT NULL,
  `SegundoApellido` varchar(45) NOT NULL,
  `Usuario` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `IdEscuela` int(11) NOT NULL,
  PRIMARY KEY (`IdDocente`),
  UNIQUE KEY `Usuario_UNIQUE` (`Usuario`),
  KEY `IdEscuela_idx` (`IdEscuela`),
  CONSTRAINT `IdEscuela` FOREIGN KEY (`IdEscuela`) REFERENCES `escuelas` (`IdEscuela`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docentes`
--

LOCK TABLES `docentes` WRITE;
/*!40000 ALTER TABLE `docentes` DISABLE KEYS */;
INSERT INTO `docentes` VALUES (1,'José','Daniel','Perez','Hernández','Daniel.Perez','51e2aa333a0f69b94b2e7b16fcd038a9',1),(2,'Jose','Miguel','Perez','Pereira','jose.perez','f3478dba7d7c2eff0a69fde90a7d9ad5',1),(3,'Gerardo','Ernesto','Gonzalez','Reyes','gerardo.gonzalez','9e07afd95f6012d167789083dfd6cdc5',5),(5,'Isaac','Alfonso','Canales','Vásquez','isaac.canales','7d90b6dc49c18a6798c1ec870c478939',1);
/*!40000 ALTER TABLE `docentes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `docentesescuela`
--

DROP TABLE IF EXISTS `docentesescuela`;
/*!50001 DROP VIEW IF EXISTS `docentesescuela`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `docentesescuela` AS SELECT 
 1 AS `IdDocente`,
 1 AS `PrimerNombre`,
 1 AS `SegundoNombre`,
 1 AS `PrimerApellido`,
 1 AS `SegundoApellido`,
 1 AS `Usuario`,
 1 AS `Password`,
 1 AS `IdEscuela`,
 1 AS `UsuarioDirector`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `escueladirector`
--

DROP TABLE IF EXISTS `escueladirector`;
/*!50001 DROP VIEW IF EXISTS `escueladirector`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `escueladirector` AS SELECT 
 1 AS `IdEscuela`,
 1 AS `Nombre`,
 1 AS `IdDirector`,
 1 AS `Usuario`,
 1 AS `Password`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `escuelas`
--

DROP TABLE IF EXISTS `escuelas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `escuelas` (
  `IdEscuela` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(150) NOT NULL,
  `IdDirector` int(11) DEFAULT NULL,
  PRIMARY KEY (`IdEscuela`),
  KEY `IdDirector_idx` (`IdDirector`),
  CONSTRAINT `IdDirector` FOREIGN KEY (`IdDirector`) REFERENCES `directores` (`IdDirector`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `escuelas`
--

LOCK TABLES `escuelas` WRITE;
/*!40000 ALTER TABLE `escuelas` DISABLE KEYS */;
INSERT INTO `escuelas` VALUES (1,'Electrónica',1),(2,'Computación',2),(3,'Letras',3),(4,'Biología',4),(5,'Comunicaciones',5);
/*!40000 ALTER TABLE `escuelas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visitas`
--

DROP TABLE IF EXISTS `visitas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `visitas` (
  `IdVisita` int(11) NOT NULL AUTO_INCREMENT,
  `IdDocente` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `Institucion` varchar(100) NOT NULL,
  PRIMARY KEY (`IdVisita`),
  KEY `IdDocente_idx` (`IdDocente`),
  CONSTRAINT `IdDocente` FOREIGN KEY (`IdDocente`) REFERENCES `docentes` (`IdDocente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visitas`
--

LOCK TABLES `visitas` WRITE;
/*!40000 ALTER TABLE `visitas` DISABLE KEYS */;
INSERT INTO `visitas` VALUES (1,3,'2017-05-15','Centro Escolar San Salvador'),(2,3,'2017-05-15','Centro Escolar San Salvador'),(3,3,'2017-05-25','Centro Escolar San Miguel'),(4,3,'2017-05-20','Centro Escolar Santa Ana'),(5,5,'2017-05-15','Instituto tÃ©cnico Ricaldone'),(6,1,'2017-05-16','Instituto tecnico EXSAL');
/*!40000 ALTER TABLE `visitas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `actividadesdocente`
--

/*!50001 DROP VIEW IF EXISTS `actividadesdocente`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `actividadesdocente` AS select `v`.`IdVisita` AS `IdVisita`,`v`.`IdDocente` AS `IdDocente`,date_format(`v`.`Fecha`,'%d/%m/%Y') AS `Fecha`,`v`.`Institucion` AS `Institucion`,`d`.`Usuario` AS `Usuario` from (`visitas` `v` join `docentes` `d` on((`v`.`IdDocente` = `d`.`IdDocente`))) order by `v`.`Fecha` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `docenteescuela`
--

/*!50001 DROP VIEW IF EXISTS `docenteescuela`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `docenteescuela` AS select `d`.`IdDocente` AS `IdDocente`,`d`.`PrimerNombre` AS `PrimerNombre`,`d`.`SegundoNombre` AS `SegundoNombre`,`d`.`PrimerApellido` AS `PrimerApellido`,`d`.`SegundoApellido` AS `SegundoApellido`,`d`.`Usuario` AS `Usuario`,`d`.`Password` AS `Password`,`d`.`IdEscuela` AS `IdEscuela`,`e`.`Nombre` AS `Nombre` from (`docentes` `d` join `escuelas` `e` on((`d`.`IdEscuela` = `e`.`IdEscuela`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `docentesescuela`
--

/*!50001 DROP VIEW IF EXISTS `docentesescuela`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `docentesescuela` AS select `d`.`IdDocente` AS `IdDocente`,`d`.`PrimerNombre` AS `PrimerNombre`,`d`.`SegundoNombre` AS `SegundoNombre`,`d`.`PrimerApellido` AS `PrimerApellido`,`d`.`SegundoApellido` AS `SegundoApellido`,`d`.`Usuario` AS `Usuario`,`d`.`Password` AS `Password`,`d`.`IdEscuela` AS `IdEscuela`,`dr`.`Usuario` AS `UsuarioDirector` from ((`docentes` `d` join `escuelas` `e` on((`d`.`IdEscuela` = `e`.`IdEscuela`))) join `directores` `dr` on((`e`.`IdDirector` = `dr`.`IdDirector`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `escueladirector`
--

/*!50001 DROP VIEW IF EXISTS `escueladirector`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `escueladirector` AS select `e`.`IdEscuela` AS `IdEscuela`,`e`.`Nombre` AS `Nombre`,`e`.`IdDirector` AS `IdDirector`,`d`.`Usuario` AS `Usuario`,`d`.`Password` AS `Password` from (`escuelas` `e` join `directores` `d` on((`e`.`IdDirector` = `d`.`IdDirector`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-14 21:09:05
