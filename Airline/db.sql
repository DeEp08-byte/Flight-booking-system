CREATE DATABASE  IF NOT EXISTS `airline` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `airline`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: airline
-- ------------------------------------------------------
-- Server version	5.1.43-community

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `username` varchar(25) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('admin','1234');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `charges`
--

DROP TABLE IF EXISTS `charges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `charges` (
  `fid` int(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `ffrom` varchar(30) DEFAULT NULL,
  `fto` varchar(30) DEFAULT NULL,
  `charges` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `charges`
--

LOCK TABLES `charges` WRITE;
/*!40000 ALTER TABLE `charges` DISABLE KEYS */;
INSERT INTO `charges` VALUES (33,'a','a','a','3000'),(301,'kingfisher','chd','chd','3000'),(301,'kingfisher','chd','chd','100'),(301,'kingfisher','chd','chd','111'),(503,'Air','chd','delhi','300'),(500,'Airindia','chd','delhi','2000');
/*!40000 ALTER TABLE `charges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empreg`
--

DROP TABLE IF EXISTS `empreg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empreg` (
  `empid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `contact` varchar(13) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=InnoDB AUTO_INCREMENT=208 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empreg`
--

LOCK TABLES `empreg` WRITE;
/*!40000 ALTER TABLE `empreg` DISABLE KEYS */;
INSERT INTO `empreg` VALUES (202,'a','b','5/5/113','	a		','a','a'),(203,'Anu','anu','4/5/113','una','9876543456','anu@gmail.com'),(204,'s','s','5/5/113','s		','s','s'),(205,'Rajat','rajat','4/6/113','karnal','9898786756','rajat@gmail.com'),(206,'ambika','1234','4/6/113','pkl','9087654567','amb@gmail.com'),(207,'sandeep','sandeep','5/6/113','pkl','987654567','ranote9466@gmail.com');
/*!40000 ALTER TABLE `empreg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight`
--

DROP TABLE IF EXISTS `flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flight` (
  `fid` int(11) NOT NULL,
  `fname` varchar(10) DEFAULT NULL,
  `ffrom` varchar(30) DEFAULT NULL,
  `fto` varchar(30) DEFAULT NULL,
  `tseats` varchar(10) DEFAULT NULL,
  `aseats` varchar(10) DEFAULT NULL,
  `ftupe` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight`
--

LOCK TABLES `flight` WRITE;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
INSERT INTO `flight` VALUES (33,'a','a','a','a','a','a'),(301,'kingfisher','chd','chd','20','37','one way'),(502,'Air India','chd','chd','40','40','one way');
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `res`
--

DROP TABLE IF EXISTS `res`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `res` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(30) DEFAULT NULL,
  `ffrom` varchar(30) DEFAULT NULL,
  `fto` varchar(30) DEFAULT NULL,
  `aseats` varchar(5) DEFAULT NULL,
  `icharges` varchar(10) DEFAULT NULL,
  `class` varchar(20) DEFAULT NULL,
  `nop` varchar(12) DEFAULT NULL,
  `tamount` varchar(20) DEFAULT NULL,
  `pname` varchar(30) DEFAULT NULL,
  `pcontact` varchar(20) DEFAULT NULL,
  `pemail` varchar(40) DEFAULT NULL,
  `paddress` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `res`
--

LOCK TABLES `res` WRITE;
/*!40000 ALTER TABLE `res` DISABLE KEYS */;
INSERT INTO `res` VALUES (1,'kingfisher','chd','chd','20','111','select a class','4','444','kp','9876543234567','dfsg@gmail.com','qyhgdfg'),(2,'kingfisher','chd','chd','20','111','select a class','4','444','uytredfg','dfghj','sdfghjm','sdfghm,'),(3,'kingfisher','chd','chd','20','111','select a class','5','555','g','h','gh','gh	j'),(4,'kingfisher','chd','chd','20','111','Business','4','444','xcghjk','xcfvghjk','cvghjk','vb');
/*!40000 ALTER TABLE `res` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-07-06  9:31:10
