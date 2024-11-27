-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 06, 2023 at 07:51 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `add_fee`
--

CREATE TABLE `add_fee` (
  `studentid` int(5) NOT NULL,
  `name` varchar(25) NOT NULL,
  `fname` varchar(25) NOT NULL,
  `course` varchar(10) NOT NULL,
  `courseid` int(5) NOT NULL,
  `duration` varchar(7) NOT NULL,
  `discount` int(2) NOT NULL,
  `coursefee` int(5) NOT NULL,
  `payment` int(7) DEFAULT NULL,
  `payment_remain` int(5) DEFAULT NULL,
  `rcptno` int(5) DEFAULT NULL,
  `issued_date` varchar(25) DEFAULT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `add_fee`
--

INSERT INTO `add_fee` (`studentid`, `name`, `fname`, `course`, `courseid`, `duration`, `discount`, `coursefee`, `payment`, `payment_remain`, `rcptno`, `issued_date`, `status`) VALUES
(49896, 'ISha', 'ravi', 'Java', 2041, '3 MONTH', 0, 10000, 5000, 5000, 86420, '02/02/2023 12:40:58', 'pending'),
(70771, 'Palak', 'Sandeep', 'BCA', 4601, '3 YEARS', 10, 40000, 6000, 0, 88077, '02/02/2023 12:44:57', 'completed'),
(72361, 'shshank', 'jv', 'O level', 5354, '1 YEAR', 5, 10000, 4500, 0, 71169, '02/02/2023 12:36:41', 'completed'),
(88886, 'Sujeet yadav', 'raj', 'Python', 6668, '4 MONTH', 5, 50000, 12500, 0, 79635, '06/02/2023 11:33:56', 'completed'),
(94564, 'Gaurav yadav', 'Shriman yadav', 'MCA', 6758, '2 YEARS', 5, 50000, 17500, 0, 10849, '02/02/2023 12:33:43', 'completed');

-- --------------------------------------------------------

--
-- Table structure for table `courserecord`
--

CREATE TABLE `courserecord` (
  `courseid` int(11) NOT NULL,
  `course` varchar(20) NOT NULL,
  `duration` varchar(10) NOT NULL,
  `fee` varchar(5) NOT NULL,
  `discount` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `courserecord`
--

INSERT INTO `courserecord` (`courseid`, `course`, `duration`, `fee`, `discount`) VALUES
(2041, 'JAVA', '3 MONTH', '10000', '0'),
(2941, 'BTECH', '2 YEARS', '50000', '5'),
(4601, 'BCA', '3 YEARS', '40000', '10'),
(5354, 'O LEVEL', '1 YEAR', '10000', '5'),
(6668, 'PYTHON', '4 MONTH', '50000', '5'),
(6758, 'MCA', '2 YEARS', '50000', '5'),
(9122, 'MTECH', '1 YEAR', '30000', '15');

-- --------------------------------------------------------

--
-- Table structure for table `feebook`
--

CREATE TABLE `feebook` (
  `rcptno` int(5) NOT NULL,
  `studentid` int(5) NOT NULL,
  `course` varchar(20) NOT NULL,
  `courseid` int(5) NOT NULL,
  `duration` varchar(7) NOT NULL,
  `discount` int(3) NOT NULL,
  `coursefee` int(5) NOT NULL,
  `payment` int(5) NOT NULL,
  `payment_remain` int(11) NOT NULL,
  `issued_date` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `feebook`
--

INSERT INTO `feebook` (`rcptno`, `studentid`, `course`, `courseid`, `duration`, `discount`, `coursefee`, `payment`, `payment_remain`, `issued_date`) VALUES
(10849, 94564, 'MCA', 6758, '2 YEARS', 5, 50000, 17500, 0, '02/02/2023 12:33:43'),
(20071, 72361, 'O level', 5354, '1 YEAR', 5, 10000, 5000, 4500, '02/02/2023 12:36:24'),
(45436, 70771, 'BCA', 4601, '3 YEARS', 10, 40000, 30000, 6000, '02/02/2023 12:44:46'),
(56540, 88886, 'Python', 6668, '4 MONTH', 5, 50000, 35000, 12500, '06/02/2023 11:33:37'),
(71169, 72361, 'O level', 5354, '1 YEAR', 5, 10000, 4500, 0, '02/02/2023 12:36:41'),
(79635, 88886, 'Python', 6668, '4 MONTH', 5, 50000, 12500, 0, '06/02/2023 11:33:56'),
(86420, 49896, 'Java', 2041, '3 MONTH', 0, 10000, 5000, 5000, '02/02/2023 12:40:58'),
(86431, 49896, 'Java', 2041, '3 MONTH', 0, 10000, 5000, 5000, '02/02/2023 12:40:58'),
(88077, 70771, 'BCA', 4601, '3 YEARS', 10, 40000, 6000, 0, '02/02/2023 12:44:57'),
(88289, 94564, 'MCA', 6758, '2 YEARS', 5, 50000, 30000, 17500, '02/02/2023 12:33:28');

-- --------------------------------------------------------

--
-- Table structure for table `student_regis`
--

CREATE TABLE `student_regis` (
  `studentid` int(5) NOT NULL,
  `name` varchar(30) NOT NULL,
  `fname` varchar(30) NOT NULL,
  `dob` varchar(10) NOT NULL,
  `email` varchar(20) NOT NULL,
  `password` varchar(10) NOT NULL,
  `adharno` varchar(12) NOT NULL,
  `quali` varchar(20) NOT NULL,
  `cat` varchar(7) NOT NULL,
  `gender` varchar(7) NOT NULL,
  `course` varchar(20) NOT NULL,
  `mobile` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_regis`
--

INSERT INTO `student_regis` (`studentid`, `name`, `fname`, `dob`, `email`, `password`, `adharno`, `quali`, `cat`, `gender`, `course`, `mobile`) VALUES
(49896, 'ISha', 'ravi', '12-03-1980', 'isha@gmail.com', '12345', '123456789963', 'ba', 'GENERAL', 'male', 'Java', '1234569631'),
(70771, 'Palak', 'Sandeep', '19-07-2007', 'palak@gmail.com', '12345', '654321654321', '12th', 'GENERAL', 'male', 'BCA', '7317002876'),
(72361, 'shshank', 'jv', '20-04-2000', 'shashank@gmail.com', '54321', '123123123123', 'bcom', 'OBC', 'male', 'O level', '8808086087'),
(88886, 'Sujeet yadav', 'raj', '12-03-2001', 'surya@gmail.com', '63063', '852852852852', 'bsc', 'OBC', 'male', 'Python', '6306355193'),
(94564, 'Gaurav yadav', 'Shriman yadav', '05-01-2003', 'gaurav@gmail.com', '12345', '653364591625', 'ba', 'OBC', 'male', 'MCA', '7317430872');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `add_fee`
--
ALTER TABLE `add_fee`
  ADD PRIMARY KEY (`studentid`);

--
-- Indexes for table `courserecord`
--
ALTER TABLE `courserecord`
  ADD PRIMARY KEY (`courseid`);

--
-- Indexes for table `feebook`
--
ALTER TABLE `feebook`
  ADD PRIMARY KEY (`rcptno`);

--
-- Indexes for table `student_regis`
--
ALTER TABLE `student_regis`
  ADD PRIMARY KEY (`studentid`),
  ADD UNIQUE KEY `adharno` (`adharno`),
  ADD UNIQUE KEY `email` (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
