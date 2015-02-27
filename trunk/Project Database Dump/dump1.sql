-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.1.73-community - MySQL Community Server (GPL)
-- Server OS:                    Win32
-- HeidiSQL Version:             8.2.0.4675
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for vinod
CREATE DATABASE IF NOT EXISTS `vinod` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `vinod`;


-- Dumping structure for table vinod.address
CREATE TABLE IF NOT EXISTS `address` (
  `address_Id` bigint(20) NOT NULL AUTO_INCREMENT,
  `door_No` varchar(100) DEFAULT NULL,
  `villeage_Name` varchar(100) DEFAULT NULL,
  `district` varchar(100) DEFAULT NULL,
  `state` varchar(100) DEFAULT NULL,
  `pincode` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`address_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table vinod.address: ~3 rows (approximately)
DELETE FROM `address`;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` (`address_Id`, `door_No`, `villeage_Name`, `district`, `state`, `pincode`) VALUES
	(1, '11-4-32', 'IPM', 'SKLM', 'AP', 532312),
	(2, '26-569', 'Hyd', 'Hyderabad', 'Hyderabad', 563245),
	(3, '15-98-79', 'SKLM', 'SKLM', 'SKLM', 532312);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;


-- Dumping structure for table vinod.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `customer_Id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address_Id` bigint(20) NOT NULL,
  `customer_Name` varchar(100) DEFAULT NULL,
  `customer_Phone` bigint(20) DEFAULT NULL,
  `customer_Joindate` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`customer_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table vinod.customer: ~3 rows (approximately)
DELETE FROM `customer`;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`customer_Id`, `address_Id`, `customer_Name`, `customer_Phone`, `customer_Joindate`) VALUES
	(1, 1, 'Vinod', 7207360408, '2015-02-23 13:14:50'),
	(2, 2, 'Kiran', 8688992555, '2015-02-24 19:45:51'),
	(3, 3, 'VinodKumar', 9908744980, '2015-02-24 19:46:56');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


-- Dumping structure for table vinod.inventory
CREATE TABLE IF NOT EXISTS `inventory` (
  `inventory_Id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_Id` bigint(20) DEFAULT NULL,
  `address_Id` bigint(20) DEFAULT NULL,
  `bill_Id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`inventory_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table vinod.inventory: ~3 rows (approximately)
DELETE FROM `inventory`;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` (`inventory_Id`, `customer_Id`, `address_Id`, `bill_Id`) VALUES
	(1, 1, 1, 2),
	(2, 2, 2, NULL),
	(3, 3, 3, NULL);
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;


-- Dumping structure for table vinod.purchase
CREATE TABLE IF NOT EXISTS `purchase` (
  `bill_Id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_Id` bigint(20) DEFAULT NULL,
  `date` timestamp NULL DEFAULT NULL,
  `total_Sum` double DEFAULT NULL,
  PRIMARY KEY (`bill_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table vinod.purchase: ~2 rows (approximately)
DELETE FROM `purchase`;
/*!40000 ALTER TABLE `purchase` DISABLE KEYS */;
INSERT INTO `purchase` (`bill_Id`, `customer_Id`, `date`, `total_Sum`) VALUES
	(1, 1, '2015-02-23 13:15:18', 3771),
	(2, 1, '2015-02-24 21:49:52', 9);
/*!40000 ALTER TABLE `purchase` ENABLE KEYS */;


-- Dumping structure for table vinod.solditemsdescription
CREATE TABLE IF NOT EXISTS `solditemsdescription` (
  `bill_Id` bigint(20) DEFAULT NULL,
  `item_Id` varchar(100) DEFAULT NULL,
  `quantity` bigint(20) DEFAULT NULL,
  `unitPrice` double DEFAULT NULL,
  `totalPrice` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table vinod.solditemsdescription: ~0 rows (approximately)
DELETE FROM `solditemsdescription`;
/*!40000 ALTER TABLE `solditemsdescription` DISABLE KEYS */;
/*!40000 ALTER TABLE `solditemsdescription` ENABLE KEYS */;


-- Dumping structure for table vinod.store
CREATE TABLE IF NOT EXISTS `store` (
  `item_Id` varchar(100) NOT NULL,
  `item_name` varchar(100) DEFAULT NULL,
  `total_Items` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `date` timestamp NULL DEFAULT NULL,
  `soldItems` int(11) DEFAULT NULL,
  `remainItems` int(11) DEFAULT NULL,
  `factoryName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`item_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table vinod.store: ~1 rows (approximately)
DELETE FROM `store`;
/*!40000 ALTER TABLE `store` DISABLE KEYS */;
INSERT INTO `store` (`item_Id`, `item_name`, `total_Items`, `price`, `date`, `soldItems`, `remainItems`, `factoryName`) VALUES
	('Salt', 'Salt', 35, 1000, '2015-02-24 22:49:05', 10, 25, 'Ravi Factory');
/*!40000 ALTER TABLE `store` ENABLE KEYS */;


-- Dumping structure for table vinod.transactions
CREATE TABLE IF NOT EXISTS `transactions` (
  `customer_Id` bigint(20) DEFAULT NULL,
  `bill_Id` bigint(20) DEFAULT NULL,
  `credit` varchar(100) DEFAULT NULL,
  `debit` varchar(100) DEFAULT NULL,
  `purchase` double DEFAULT NULL,
  `payment` double DEFAULT NULL,
  `balance` double DEFAULT NULL,
  `date` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table vinod.transactions: ~0 rows (approximately)
DELETE FROM `transactions`;
/*!40000 ALTER TABLE `transactions` DISABLE KEYS */;
/*!40000 ALTER TABLE `transactions` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
