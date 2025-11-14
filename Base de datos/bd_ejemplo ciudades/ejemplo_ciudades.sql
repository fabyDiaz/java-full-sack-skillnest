CREATE DATABASE  IF NOT EXISTS `ejemplociudades` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ejemplociudades`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: ejemplociudades
-- ------------------------------------------------------
-- Server version	8.4.7

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ciudades`
--

DROP TABLE IF EXISTS `ciudades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ciudades` (
  `id_ciudad` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  PRIMARY KEY (`id_ciudad`),
  UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciudades`
--

LOCK TABLES `ciudades` WRITE;
/*!40000 ALTER TABLE `ciudades` DISABLE KEYS */;
INSERT INTO `ciudades` VALUES (5,'Bogotá'),(2,'Buenos Aires'),(4,'Caracas'),(3,'New York'),(7,'Santa Cruz'),(6,'Santiago'),(1,'Tucumán');
/*!40000 ALTER TABLE `ciudades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personas`
--

DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personas` (
  `id_persona` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(15) NOT NULL,
  `apellido` varchar(15) NOT NULL,
  `edad` int DEFAULT NULL,
  `altura` float DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `ciudad` int DEFAULT NULL,
  PRIMARY KEY (`id_persona`),
  KEY `ciudad` (`ciudad`),
  CONSTRAINT `personas_ibfk_1` FOREIGN KEY (`ciudad`) REFERENCES `ciudades` (`id_ciudad`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personas`
--

LOCK TABLES `personas` WRITE;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` VALUES (1,'Lucas','Álvarez',35,1.72,'1985-03-29',1),(2,'Leo','Sierras',24,1.89,'1996-01-10',4),(3,'Romina','Moyano',56,1.8,'1972-03-23',1),(4,'Antonio','López',47,1.65,'1981-09-15',2),(5,'Cecilia','Gutiérrez',44,1.67,'1983-12-08',4),(6,'Luis','Pinki',22,1.58,'1999-08-05',5),(7,'Antonio','López',38,1.64,'1989-10-31',1),(8,'Luis','Barboza',53,1.72,'1973-11-09',3),(9,'Carmen','Solano',75,1.56,'1945-09-02',1),(10,'Diego','Palacios',35,1.76,'1990-01-26',2);
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-11-13 20:06:07
