-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2020 at 02:08 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.0.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mart`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill_table`
--

CREATE TABLE `bill_table` (
  `bill_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `bill_amount` int(11) NOT NULL,
  `item_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill_table`
--

INSERT INTO `bill_table` (`bill_id`, `customer_id`, `bill_amount`, `item_id`) VALUES
(301, 101, 200, 201),
(302, 102, 170, 202);

-- --------------------------------------------------------

--
-- Table structure for table `customer_table`
--

CREATE TABLE `customer_table` (
  `customer_id` int(11) NOT NULL,
  `customer_username` varchar(20) NOT NULL,
  `customer_password` varchar(20) NOT NULL,
  `customer_rewards` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer_table`
--

INSERT INTO `customer_table` (`customer_id`, `customer_username`, `customer_password`, `customer_rewards`) VALUES
(101, 'deep', '1234', 10),
(102, 'd', 'd', 10);

-- --------------------------------------------------------

--
-- Table structure for table `item_table`
--

CREATE TABLE `item_table` (
  `item_id` int(11) NOT NULL,
  `item_name` varchar(20) NOT NULL,
  `item_image` varchar(300) NOT NULL,
  `item_price` int(11) NOT NULL,
  `item_stock` int(11) NOT NULL,
  `item_description` varchar(200) NOT NULL,
  `item_remarks` varchar(150) NOT NULL,
  `item_USD` int(11) NOT NULL,
  `item_euro` int(11) NOT NULL,
  `item_yen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item_table`
--

INSERT INTO `item_table` (`item_id`, `item_name`, `item_image`, `item_price`, `item_stock`, `item_description`, `item_remarks`, `item_USD`, `item_euro`, `item_yen`) VALUES
(201, 'kurthi', 'https://images.unsplash.com/photo-1583391733981-8b530b760347?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=401&q=80', 1500, 10, 'white salwar suit', 'good', 0, 0, 0),
(202, 'heels', 'https://images.unsplash.com/photo-1524553879936-2ff074ae5816?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=755&q=80', 250, 2, 'pointed heels', 'average', 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `rates_table`
--

CREATE TABLE `rates_table` (
  `currency_id` int(11) NOT NULL,
  `currency_name` varchar(20) NOT NULL,
  `currency_value` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rates_table`
--

INSERT INTO `rates_table` (`currency_id`, `currency_name`, `currency_value`) VALUES
(1, 'USD', 80),
(2, 'euro', 60),
(3, 'yen', 40);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill_table`
--
ALTER TABLE `bill_table`
  ADD PRIMARY KEY (`bill_id`),
  ADD KEY `item_id` (`item_id`),
  ADD KEY `customer_id` (`customer_id`);

--
-- Indexes for table `customer_table`
--
ALTER TABLE `customer_table`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `item_table`
--
ALTER TABLE `item_table`
  ADD PRIMARY KEY (`item_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer_table`
--
ALTER TABLE `customer_table`
  MODIFY `customer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bill_table`
--
ALTER TABLE `bill_table`
  ADD CONSTRAINT `bill_table_ibfk_2` FOREIGN KEY (`item_id`) REFERENCES `item_table` (`item_id`),
  ADD CONSTRAINT `bill_table_ibfk_3` FOREIGN KEY (`customer_id`) REFERENCES `customer_table` (`customer_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
