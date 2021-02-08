-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 03, 2013 at 05:25 AM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_bookstore`
--

-- --------------------------------------------------------

--
-- Table structure for table `books_data`
--

CREATE TABLE IF NOT EXISTS `books_data` (
  `ID` int(50) NOT NULL AUTO_INCREMENT,
  `Code` int(50) NOT NULL,
  `Title` varchar(100) NOT NULL,
  `Author` varchar(100) NOT NULL,
  `Publisher` varchar(100) NOT NULL,
  `Price` int(100) NOT NULL,
  `Discount` int(100) NOT NULL,
  `Stock` int(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `books_data`
--

INSERT INTO `books_data` (`ID`, `Code`, `Title`, `Author`, `Publisher`, `Price`, `Discount`, `Stock`) VALUES
(1, 240101, 'Jancukers', 'Sujiwo Tejo', 'Elex Media', 50000, 10, 173),
(8, 250101, 'Habibie & Ainun', 'B.J. Habibie', 'The Habibie Center Mandiri', 80000, 10, 199),
(9, 250102, 'Surat Dahlan', 'Khrisna Pabhicara', 'Noura Book Publishing', 65000, 10, 7),
(10, 250203, '5 cm', 'Donny Dhirgantoro', 'Grasindo', 65000, 10, 92),
(11, 250204, 'THE JACATRA SECRET', 'Rizki Ridyasmara', 'Indie', 79000, 10, 194),
(13, 250205, 'Life Of Pi', 'Yann Martel', 'Gramedia', 55000, 10, 297),
(14, 250206, 'Rectoverso', 'Dewi Lestari', 'Bentang Pustaka', 69999, 10, 50),
(15, 250207, 'Tak Sempurna', 'Fahd Djibran, Bodan Prakoso', 'Kurniaesa', 46000, 10, 39);

-- --------------------------------------------------------

--
-- Table structure for table `chart`
--

CREATE TABLE IF NOT EXISTS `chart` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `Invoice` int(50) NOT NULL,
  `Code` int(50) NOT NULL,
  `Title` varchar(100) NOT NULL,
  `Cost` int(100) NOT NULL,
  `Amount` int(100) NOT NULL,
  `Subtotal` int(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=64 ;

--
-- Dumping data for table `chart`
--

INSERT INTO `chart` (`ID`, `Invoice`, `Code`, `Title`, `Cost`, `Amount`, `Subtotal`) VALUES
(60, 1111, 250203, '5 cm', 58500, 2, 117000),
(61, 1111, 250102, 'Surat Dahlan', 58500, 1, 58500);

-- --------------------------------------------------------

--
-- Table structure for table `users_data`
--

CREATE TABLE IF NOT EXISTS `users_data` (
  `ID` int(50) NOT NULL AUTO_INCREMENT,
  `UserID` int(50) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Type` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `users_data`
--

INSERT INTO `users_data` (`ID`, `UserID`, `Username`, `Password`, `Type`) VALUES
(1, 120201, 'Admin', 'Admin', 'Admin'),
(5, 120202, 'Kasir', 'Kasir', 'Cashier');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
