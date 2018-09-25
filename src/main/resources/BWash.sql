CREATE DATABASE  IF NOT EXISTS `db_bwash_app` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `db_bwash_app`;
-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: db_bwash_app
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `booking` (
  `booking_id` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `service_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `booking_lat` double DEFAULT NULL,
  `booking_lng` double DEFAULT NULL,
  `booking_status` bit(1) DEFAULT NULL,
  `booking_time` time DEFAULT NULL,
  `booking_request` longblob,
  PRIMARY KEY (`booking_id`),
  KEY `fk_tb_booking_tb_center_idx` (`service_id`),
  KEY `fk_tb_booking_tb_user1_idx` (`user_id`),
  CONSTRAINT `fk_tb_booking_tb_center` FOREIGN KEY (`service_id`) REFERENCES `service_center` (`service_id`),
  CONSTRAINT `fk_tb_booking_tb_user1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_center`
--

DROP TABLE IF EXISTS `service_center`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `service_center` (
  `service_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `service_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `service_phone` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `service_picture` blob,
  `service_open_time` time DEFAULT NULL,
  `service_lat` double DEFAULT NULL,
  `service_lng` double DEFAULT NULL,
  `service_prices` double DEFAULT NULL,
  `service_description` longblob,
  `service_rating` int(11) DEFAULT NULL,
  PRIMARY KEY (`service_id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_center`
--

LOCK TABLES `service_center` WRITE;
/*!40000 ALTER TABLE `service_center` DISABLE KEYS */;
INSERT INTO `service_center` VALUES (1,'ToCo','012345684','https://www.google.com.vn/search?q=background&tbm=isch&source=iu&ictx=1&fir=i-9lQ2nbX9_ZqM%253A%252CmM5dTYYyzCWOlM%252C_&usg=AFrqEzchRZ6Npyc0Nb1juZhmHEehumvEYA&sa=X&ved=2ahUKEwikko-MisTdAhXHqY8KHWJFBzcQ9QEwBXoECAUQDg#imgrc=i-9lQ2nbX9_ZqM:','15:24:18',NULL,NULL,15000,'Flash',5),(2,'Son',NULL,NULL,'09:53:21',NULL,NULL,NULL,NULL,NULL),(3,'Thach ML',NULL,NULL,'09:57:14',NULL,NULL,NULL,NULL,NULL),(4,'abc','0925236355',NULL,'10:03:51',NULL,NULL,NULL,NULL,NULL),(5,'abc','0925236355','ic_photo','07:24:30',NULL,NULL,10000,'lgwlahgpwoagiownvwi hqiwhgio hwigh giqh g',5),(32,'Happy','0926542547','ic_photo_girl','10:34:47',NULL,NULL,11000,'Rửa xe cấp tốc',5),(33,'Happy','0926542547','ic_photo_girl','12:43:58',NULL,NULL,11000,'Rửa xe cấp tốc',5),(34,'Castrol','097947474','ic_photo_bike','14:55:32',NULL,NULL,20000,'Rửa xe cấp tốc, phục vụ tận tình',5);
/*!40000 ALTER TABLE `service_center` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_password` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_phone` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_lat` double DEFAULT NULL,
  `user_lng` double DEFAULT NULL,
  `user_authority` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Thao khung',NULL,'123456789',NULL,NULL,NULL),(2,'Thao ca tung',NULL,'123456789',NULL,NULL,NULL),(3,'Thao ca tung',NULL,'0123456789',NULL,NULL,NULL);
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

-- Dump completed on 2018-09-25 15:02:51
