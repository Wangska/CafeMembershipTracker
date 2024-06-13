-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2024 at 05:02 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cafemembershiptracker`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `ID` int(150) NOT NULL,
  `firstname` varchar(150) NOT NULL,
  `lastname` varchar(150) NOT NULL,
  `Age` varchar(150) NOT NULL,
  `Gender` varchar(150) NOT NULL,
  `Address` varchar(150) NOT NULL,
  `Contactnumber` varchar(150) NOT NULL,
  `Email` varchar(150) NOT NULL,
  `DateRegistered` varchar(150) NOT NULL,
  `DateExpiration` varchar(150) NOT NULL,
  `Status` varchar(150) NOT NULL,
  `archive` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`ID`, `firstname`, `lastname`, `Age`, `Gender`, `Address`, `Contactnumber`, `Email`, `DateRegistered`, `DateExpiration`, `Status`, `archive`) VALUES
(1, 'test', 'test', '25', 'Male', 'Naga', '09151620773', 'test@gmail.com', '2024-06-05', '2024-06-06', 'EXPIRED CUSTOMER', 'No'),
(2, 'test2', 'test2', '25', 'Male', 'naga', '09151620773', 'test2@gmail.com', '2024-06-05', '2024-06-07', 'EXPIRED CUSTOMER', 'No'),
(3, 'test3', 'test3', '25', 'Male', 'naga', '09151620773', 'test3@gmail.com', '2024-06-05', '2024-06-07', 'REGISTERED CUSTOMER', 'Yes'),
(4, 'test4', 'test4', '26', 'Female', 'Naga', '09151620773', 'test4@gmail.com', '2024-06-03', '2024-06-04', 'EXPIRED CUSTOMER', 'No');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_pass` varchar(50) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `stat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `email`, `u_username`, `u_pass`, `u_type`, `stat`) VALUES
(1002, 'Rohanna', 'Villagracia', 'villagraciarohanna@gmail.com', 'hanna', '123456789', 'Customer', 'Active'),
(1004, 'admin', 'admin', 'admin@gmail.com', 'admin', 'f865b53623b121fd34ee5426c792e5c33af8c227', 'Manager', 'Active'),
(1005, 'user', 'user', 'user@gmail.com', 'user', 'd7316a3074d562269cf4302e4eed46369b523687', 'Cashier', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `ID` int(150) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1006;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
