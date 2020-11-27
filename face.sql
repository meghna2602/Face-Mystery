-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 23, 2020 at 02:20 PM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `game`
--

-- --------------------------------------------------------

--
-- Table structure for table `celibrity`
--

CREATE TABLE IF NOT EXISTS `celibrity` (
  `username` varchar(100) NOT NULL,
  `page1` varchar(100) NOT NULL,
  `page2` varchar(100) NOT NULL,
  `page3` varchar(100) NOT NULL,
  `page4` varchar(100) NOT NULL,
  `page5` varchar(100) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `celibrity`
--

INSERT INTO `celibrity` (`username`, `page1`, `page2`, `page3`, `page4`, `page5`, `total`) VALUES
('yuvika', '20', '20', '20', '20', '20', 100),
('meghna', '20', '20', '20', '20', '20', 100);

-- --------------------------------------------------------

--
-- Table structure for table `it`
--

CREATE TABLE IF NOT EXISTS `it` (
  `username` varchar(100) NOT NULL,
  `page1` int(11) NOT NULL,
  `page2` int(11) NOT NULL,
  `page3` int(11) NOT NULL,
  `page4` int(11) NOT NULL,
  `page5` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `it`
--

INSERT INTO `it` (`username`, `page1`, `page2`, `page3`, `page4`, `page5`, `total`) VALUES
('meghna', 20, 20, 20, 0, 20, 80);

-- --------------------------------------------------------

--
-- Table structure for table `politician`
--

CREATE TABLE IF NOT EXISTS `politician` (
  `username` varchar(100) NOT NULL,
  `page1` int(11) NOT NULL,
  `page2` int(11) NOT NULL,
  `page3` int(11) NOT NULL,
  `page4` int(11) NOT NULL,
  `page5` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `politician`
--

INSERT INTO `politician` (`username`, `page1`, `page2`, `page3`, `page4`, `page5`, `total`) VALUES
('meghna', 20, 20, 20, 20, 20, 100);

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE IF NOT EXISTS `signup` (
  `Fullname` varchar(100) NOT NULL,
  `playername` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `DOB` varchar(100) NOT NULL,
  `Gender` varchar(100) NOT NULL,
  `State` varchar(100) NOT NULL,
  `CurrentDate` varchar(100) NOT NULL,
  `CurrentTime` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`Fullname`, `playername`, `Password`, `DOB`, `Gender`, `State`, `CurrentDate`, `CurrentTime`) VALUES
('meghna', 'meghna', '123456789', 'Mar 3 2012', 'Female', 'punjab', '2018-07-11', '2018-07-11 12:50:59.381'),
('Yuvika', 'yuvika', 'prince123', 'Apr 4 2012', 'Female', 'delhi', '2018-07-12', '2018-07-12 21:08:08.834');

-- --------------------------------------------------------

--
-- Table structure for table `singer`
--

CREATE TABLE IF NOT EXISTS `singer` (
  `username` varchar(11) NOT NULL,
  `page1` int(11) NOT NULL,
  `page2` int(11) NOT NULL,
  `page3` int(11) NOT NULL,
  `page4` int(11) NOT NULL,
  `page5` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `singer`
--

INSERT INTO `singer` (`username`, `page1`, `page2`, `page3`, `page4`, `page5`, `total`) VALUES
('meghna', 20, 20, 20, 20, 20, 100);

-- --------------------------------------------------------

--
-- Table structure for table `sports`
--

CREATE TABLE IF NOT EXISTS `sports` (
  `username` varchar(100) NOT NULL,
  `page1` int(11) NOT NULL,
  `page2` int(11) NOT NULL,
  `page3` int(11) NOT NULL,
  `page4` int(11) NOT NULL,
  `page5` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sports`
--

INSERT INTO `sports` (`username`, `page1`, `page2`, `page3`, `page4`, `page5`, `total`) VALUES
('meghna', 20, 20, 20, 20, 20, 100);
