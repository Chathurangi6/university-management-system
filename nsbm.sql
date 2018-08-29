-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 23, 2018 at 07:32 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nsbm`
--

-- --------------------------------------------------------

--
-- Table structure for table `febresults`
--

CREATE TABLE `febresults` (
  `no` int(3) NOT NULL,
  `name` varchar(30) NOT NULL,
  `E-Bussiness` varchar(3) NOT NULL,
  `database1` varchar(3) NOT NULL,
  `Economics` varchar(3) NOT NULL,
  `Statics` varchar(3) NOT NULL,
  `sub1` varchar(3) NOT NULL,
  `sub2` varchar(3) NOT NULL,
  `sub3` varchar(3) NOT NULL,
  `sub4` varchar(3) NOT NULL,
  `sub5` varchar(3) NOT NULL,
  `sub6` varchar(3) NOT NULL,
  `sub7` varchar(3) NOT NULL,
  `sub8` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `febresults`
--

INSERT INTO `febresults` (`no`, `name`, `E-Bussiness`, `database1`, `Economics`, `Statics`, `sub1`, `sub2`, `sub3`, `sub4`, `sub5`, `sub6`, `sub7`, `sub8`) VALUES
(1, 'Nethu', 'B', 'C+', 'B-', 'C+', 'A-', 'A', 'B-', 'B', 'C+', 'C', 'B+', 'B'),
(2, 'Nimesh', 'A-', 'B+', 'C+', 'B', 'C+', 'C', 'A', 'B-', 'B+', 'A-', 'A', 'B-');

-- --------------------------------------------------------

--
-- Table structure for table `february_subjects`
--

CREATE TABLE `february_subjects` (
  `id` varchar(3) NOT NULL,
  `name` varchar(20) NOT NULL,
  `subject1` varchar(40) NOT NULL,
  `subject2` varchar(40) NOT NULL,
  `subject3` varchar(40) NOT NULL,
  `subject4` varchar(40) NOT NULL,
  `subject5` varchar(40) NOT NULL,
  `subject6` varchar(40) NOT NULL,
  `subject7` varchar(40) NOT NULL,
  `subject8` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `february_subjects`
--

INSERT INTO `february_subjects` (`id`, `name`, `subject1`, `subject2`, `subject3`, `subject4`, `subject5`, `subject6`, `subject7`, `subject8`) VALUES
('2', 'Nethu', 'Business Communication', 'Economics', 'Management Process', 'Quality Management', 'Management IS', 'Econ', 'Maths 2', 'Marketing 2'),
('2', 'Tharuli', 'Business English', 'Financial Accounting', 'Logistics Management', 'Quality Management', 'Management IS', 'Econ', 'Econ 2', 'Marketing 2'),
('4', 'saduni', 'Business English', 'Financial Accounting', 'Logistics Management', 'strategic management', 'Marketing', 'Enhancement', 'Econ 2', 'Marketing 2'),
('5', 'Dulip', 'Business English', 'Economics', 'Logistics Management', 'Quality Management', 'Management IS', 'Enhancement', 'Econ 2', 'Marketing 2'),
('6', 'Nimesh', 'Business English', 'Financial Accounting', 'Logistics Management', 'Quality Management', 'Marketing', 'Econ', 'Maths 2', 'Marketing 2'),
('1', 'Gayani', 'Business Communication', 'Economics', 'Management Process', 'Quality Management', 'Marketing', 'Enhancement', 'Maths 2', 'Marketing 2');

-- --------------------------------------------------------

--
-- Table structure for table `instructor`
--

CREATE TABLE `instructor` (
  `id` int(5) NOT NULL,
  `name` varchar(20) NOT NULL,
  `email` varchar(45) NOT NULL,
  `contact No` varchar(10) NOT NULL,
  `subjects` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `instructor`
--

INSERT INTO `instructor` (`id`, `name`, `email`, `contact No`, `subjects`) VALUES
(1, 'Sarala Perera', 'sarala@gmail.com', '0776655444', 'Bussiness Communication'),
(2, 'Shehan Zoisa', 'shehan@gmail.com', '0712345666', 'Bussiness English'),
(3, 'Ruwan Tharaka', 'ruwan@gmail.com', '0776655444', 'Financial Accounting');

-- --------------------------------------------------------

--
-- Table structure for table `jresults`
--

CREATE TABLE `jresults` (
  `no` int(3) NOT NULL,
  `name` varchar(30) NOT NULL,
  `Economics` varchar(3) NOT NULL,
  `Statics` varchar(3) NOT NULL,
  `sub1` varchar(3) NOT NULL,
  `sub2` varchar(3) NOT NULL,
  `sub3` varchar(3) NOT NULL,
  `sub4` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jresults`
--

INSERT INTO `jresults` (`no`, `name`, `Economics`, `Statics`, `sub1`, `sub2`, `sub3`, `sub4`) VALUES
(1, 'Nadeesha', 'A', 'B+', 'C+', 'A-', 'C+', 'B+'),
(2, 'Saduni', 'B+', 'A-', 'C+', 'B-', 'A', 'A+');

-- --------------------------------------------------------

--
-- Table structure for table `july_subjects`
--

CREATE TABLE `july_subjects` (
  `id` int(3) NOT NULL,
  `name` varchar(20) NOT NULL,
  `subject1` varchar(15) NOT NULL,
  `subject2` varchar(15) NOT NULL,
  `subject3` varchar(15) NOT NULL,
  `subject4` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `july_subjects`
--

INSERT INTO `july_subjects` (`id`, `name`, `subject1`, `subject2`, `subject3`, `subject4`) VALUES
(3, 'Nadeesha', 'Management IS', 'Econ', 'Econ 2', 'Marketing 2'),
(4, 'Saduni', 'Marketing', 'Enhancement', 'Econ 2', 'Marketing 2'),
(2, 'Kalasi', 'Marketing', 'Econ', 'Maths 2', 'Marketing 2');

-- --------------------------------------------------------

--
-- Table structure for table `lecturer`
--

CREATE TABLE `lecturer` (
  `id` int(5) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(45) NOT NULL,
  `contactNo` varchar(10) NOT NULL,
  `subjects` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecturer`
--

INSERT INTO `lecturer` (`id`, `name`, `email`, `contactNo`, `subjects`) VALUES
(1, 'Danuka Silva', 'danuka@gmail.com', '0765544333', 'Bussiness Communication'),
(2, 'Damith Udara', 'damith@gmail.com', '0778899666', 'Economics');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `name` varchar(40) NOT NULL,
  `email` varchar(25) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`name`, `email`, `username`, `password`) VALUES
('Sachini Chathurangi', 'chathurangi666@gmail.com', 'chathurangi', 'bakeera123');

-- --------------------------------------------------------

--
-- Table structure for table `postgraduate`
--

CREATE TABLE `postgraduate` (
  `id` int(5) NOT NULL,
  `name` varchar(20) NOT NULL,
  `sex` varchar(6) NOT NULL,
  `contactNo` varchar(10) NOT NULL,
  `email` varchar(45) NOT NULL,
  `Year` varchar(1) NOT NULL,
  `qualificationType` varchar(10) NOT NULL,
  `institute` varchar(15) NOT NULL,
  `endYear` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `postgraduate`
--

INSERT INTO `postgraduate` (`id`, `name`, `sex`, `contactNo`, `email`, `Year`, `qualificationType`, `institute`, `endYear`) VALUES
(1, 'Gayani', 'Female', '0709765444', 'gayani@gmail.com', '2', 'BSC', 'UCSC', '2015'),
(2, 'kalasi', 'Female', '0724567888', 'kalasi@gmail.com', '2', 'BSC', 'Moratuwa', '2012'),
(3, 'Thilina', 'Male', '0711234555', 'thilina@gmail.com', '1', 'BA', 'Peradeniya', '2016'),
(4, 'Nalaka', 'Male', '0765566777', 'nalaka@gmail.com', '2', 'BA', 'SLIIT', '');

-- --------------------------------------------------------

--
-- Table structure for table `postgraduate_computing`
--

CREATE TABLE `postgraduate_computing` (
  `id` int(4) NOT NULL,
  `name` varchar(40) NOT NULL,
  `sex` varchar(6) NOT NULL,
  `contact No` varchar(10) NOT NULL,
  `email` varchar(45) NOT NULL,
  `year` varchar(1) NOT NULL,
  `qualification` varchar(20) NOT NULL,
  `institute` varchar(40) NOT NULL,
  `complete year` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `postgraduate_computing`
--

INSERT INTO `postgraduate_computing` (`id`, `name`, `sex`, `contact No`, `email`, `year`, `qualification`, `institute`, `complete year`) VALUES
(1, 'Amila', 'Female', '0721234555', 'amila@gmail.com', '4', 'BSc', 'IIT', '2016'),
(2, 'Kaligu', 'Male', '0708999986', 'kaligu@gmail.com', '1', 'BMc', 'HNDE', '2014'),
(3, 'wr', 'Male', 'sard', 'aQE', '1', 'ET', 'ETR', 'ry');

-- --------------------------------------------------------

--
-- Table structure for table `postgraduate_engineering`
--

CREATE TABLE `postgraduate_engineering` (
  `id` int(4) NOT NULL,
  `name` varchar(30) NOT NULL,
  `sex` varchar(6) NOT NULL,
  `contact No` varchar(10) NOT NULL,
  `email` varchar(20) NOT NULL,
  `year` varchar(1) NOT NULL,
  `qualification` varchar(20) NOT NULL,
  `institute` varchar(30) NOT NULL,
  `complete year` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `postgraduate_engineering`
--

INSERT INTO `postgraduate_engineering` (`id`, `name`, `sex`, `contact No`, `email`, `year`, `qualification`, `institute`, `complete year`) VALUES
(1, 'Sadun', 'Male', '0765412344', 'sadun@gmail.com', '1', 'BSc', 'Sliit', '2015'),
(2, '4', 'Male', '4', '4', '1', '4', '4', '4');

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `no` int(3) NOT NULL,
  `subjCode` varchar(3) NOT NULL,
  `subjectName` varchar(35) NOT NULL,
  `Fees` int(5) NOT NULL,
  `Credit` int(1) NOT NULL,
  `lecturer` varchar(20) NOT NULL,
  `Instructors` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`no`, `subjCode`, `subjectName`, `Fees`, `Credit`, `lecturer`, `Instructors`) VALUES
(1, 'B1', 'Business Communication', 2500, 2, 'Danuka Silva', 'Sarala Perera'),
(2, 'B1', 'Business English', 2500, 2, 'Dasuni Dias', 'Shehan Zoisa'),
(3, 'B2', 'Financial Accounting', 3000, 2, 'Vishwa Gamage', 'Ruwan Tharaka'),
(4, 'B2', 'Economics', 3000, 2, 'Damith Udara', 'Disna Nishu'),
(5, 'B3', 'Management Process', 3500, 3, 'Rajitha Prabath', 'Chathu Silva'),
(6, 'B3', 'Logistics Management', 3500, 3, 'Dasuni Dias', 'Disna Nishu'),
(7, 'B4', 'Quality Management', 4000, 3, 'Rajitha Prabath', 'Sarala Perera'),
(8, 'B4', 'strategic management', 4000, 3, 'Vishwa Gamage', 'Shehan Zoisa'),
(9, 'B5', 'Management IS', 2500, 2, 'Damith Udara', 'Chathu Silva'),
(10, 'B5', 'Marketing', 2500, 2, 'Danuka Silva', 'Disna Nishu'),
(11, 'B6', 'Econ', 3000, 2, 'Damith Udara', 'Ruwan Tharaka'),
(12, 'B6', 'Enhancement', 3000, 2, 'Deeptha Baduge', 'Charu Kavishka'),
(13, 'B7', 'Maths 2', 3500, 3, 'Danuka Silva', 'Disna Nishu'),
(14, 'B7', 'Econ 2', 3500, 3, 'Damith Udara', 'Sarala Perera'),
(15, 'B8', 'Marketing 2', 4000, 3, 'Deeptha Baduge', 'Disna Nishu'),
(16, 'B8', 'Bussiness', 4000, 3, 'Anu Silva', 'Amanda de Zoisa');

-- --------------------------------------------------------

--
-- Table structure for table `undergraduate`
--

CREATE TABLE `undergraduate` (
  `id` int(3) NOT NULL,
  `name` varchar(25) NOT NULL,
  `sex` varchar(6) NOT NULL,
  `contactNo` varchar(10) NOT NULL,
  `email` varchar(20) NOT NULL,
  `year` varchar(1) NOT NULL,
  `zscore` varchar(8) NOT NULL,
  `rank` varchar(4) NOT NULL,
  `subject1` varchar(20) NOT NULL,
  `subject2` varchar(20) NOT NULL,
  `subject3` varchar(20) NOT NULL,
  `grade1` varchar(1) NOT NULL,
  `grade2` varchar(1) NOT NULL,
  `grade3` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergraduate`
--

INSERT INTO `undergraduate` (`id`, `name`, `sex`, `contactNo`, `email`, `year`, `zscore`, `rank`, `subject1`, `subject2`, `subject3`, `grade1`, `grade2`, `grade3`) VALUES
(2, 'Nethu', 'Female', '0786555433', 'nethu@gmail.com', '2', '2.0001', '29', 'Chemistry', 'Physics', 'Combined Maths', 'A', 'A', 'A'),
(3, 'Nadeesha', 'Female', '0721345666', 'nadeesha@gmail.com', '3', '1.7864', '123', 'Econ', 'Accounting', 'Combined Maths', 'A', 'B', 'C'),
(4, 'Saduni', 'Male', '0712345777', 'saduni@gmail.com', '2', '1.9999', '123', 'Econ', 'Accounting', 'Combined Maths', 'A', 'B', 'A'),
(5, 'Dulip', 'Male', '0778899666', 'dulip@gmail.com', '2', '1.7866', '211', 'Econ', 'Accounting', 'Business', 'B', 'A', 'C');

-- --------------------------------------------------------

--
-- Table structure for table `undergraduate_computing`
--

CREATE TABLE `undergraduate_computing` (
  `id` int(5) NOT NULL,
  `name` varchar(25) NOT NULL,
  `sex` varchar(6) NOT NULL,
  `contact No` varchar(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `year` varchar(5) NOT NULL,
  `z-score` varchar(6) NOT NULL,
  `rank` varchar(5) NOT NULL,
  `subject1` varchar(25) NOT NULL,
  `subject2` varchar(25) NOT NULL,
  `subject3` varchar(25) NOT NULL,
  `grade1` varchar(1) NOT NULL,
  `grade2` varchar(1) NOT NULL,
  `grade3` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergraduate_computing`
--

INSERT INTO `undergraduate_computing` (`id`, `name`, `sex`, `contact No`, `email`, `year`, `z-score`, `rank`, `subject1`, `subject2`, `subject3`, `grade1`, `grade2`, `grade3`) VALUES
(1, 'Sakuni', 'Female', '0712345666', 'sakuni@gmail.com', '3', '1.2345', '45', 'Chemistry', 'Physics', 'Combined Maths', 'A', 'A', 'A'),
(2, 'Tharuli', 'Female', '0721232444', 'tharuli@gmail.com', '3', '1.7865', '233', 'Econ', 'Accounting', 'Business', 'A', 'B', 'C');

-- --------------------------------------------------------

--
-- Table structure for table `undergraduate_engineering`
--

CREATE TABLE `undergraduate_engineering` (
  `id` int(5) NOT NULL,
  `name` varchar(25) NOT NULL,
  `sex` varchar(6) NOT NULL,
  `contact No` varchar(10) NOT NULL,
  `email` varchar(25) NOT NULL,
  `year` varchar(6) NOT NULL,
  `z-score` varchar(6) NOT NULL,
  `rank` varchar(4) NOT NULL,
  `subject1` varchar(30) NOT NULL,
  `subject2` varchar(30) NOT NULL,
  `subject3` varchar(30) NOT NULL,
  `grade1` varchar(1) NOT NULL,
  `grade2` varchar(1) NOT NULL,
  `grade3` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergraduate_engineering`
--

INSERT INTO `undergraduate_engineering` (`id`, `name`, `sex`, `contact No`, `email`, `year`, `z-score`, `rank`, `subject1`, `subject2`, `subject3`, `grade1`, `grade2`, `grade3`) VALUES
(1, 'maneesha', 'Female', '0778965444', 'maneesha@gmail.com', '2', '1.2345', '123', 'Chemistry', 'Physics', 'Combined Maths', 'B', 'A', 'A'),
(2, 'Vishwa', 'Male', '0712345666', 'vishwa@gmail.com', '2', '1.2345', '321', 'Chemistry', 'Physics', 'Combined Maths', 'A', 'B', 'A');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `febresults`
--
ALTER TABLE `febresults`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `instructor`
--
ALTER TABLE `instructor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `jresults`
--
ALTER TABLE `jresults`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `lecturer`
--
ALTER TABLE `lecturer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `postgraduate`
--
ALTER TABLE `postgraduate`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `postgraduate_computing`
--
ALTER TABLE `postgraduate_computing`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `postgraduate_engineering`
--
ALTER TABLE `postgraduate_engineering`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `undergraduate`
--
ALTER TABLE `undergraduate`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `undergraduate_computing`
--
ALTER TABLE `undergraduate_computing`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `undergraduate_engineering`
--
ALTER TABLE `undergraduate_engineering`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `febresults`
--
ALTER TABLE `febresults`
  MODIFY `no` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `instructor`
--
ALTER TABLE `instructor`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `jresults`
--
ALTER TABLE `jresults`
  MODIFY `no` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `lecturer`
--
ALTER TABLE `lecturer`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `postgraduate`
--
ALTER TABLE `postgraduate`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `postgraduate_computing`
--
ALTER TABLE `postgraduate_computing`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `postgraduate_engineering`
--
ALTER TABLE `postgraduate_engineering`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `subjects`
--
ALTER TABLE `subjects`
  MODIFY `no` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `undergraduate`
--
ALTER TABLE `undergraduate`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `undergraduate_computing`
--
ALTER TABLE `undergraduate_computing`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `undergraduate_engineering`
--
ALTER TABLE `undergraduate_engineering`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
