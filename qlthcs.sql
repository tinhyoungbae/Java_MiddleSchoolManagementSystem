-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 04, 2022 at 08:24 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlthcs`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `adminusername` varchar(20) NOT NULL,
  `adminpassword` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adminusername`, `adminpassword`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `bangdiem`
--

CREATE TABLE `bangdiem` (
  `id_mh` varchar(10) DEFAULT NULL,
  `id_hs` varchar(10) DEFAULT NULL,
  `id_nv` varchar(10) DEFAULT NULL,
  `id_hk` varchar(10) DEFAULT NULL,
  `id_nh` varchar(10) DEFAULT NULL,
  `diemmieng` float DEFAULT NULL,
  `diem151` float DEFAULT NULL,
  `diem152` float DEFAULT NULL,
  `diem153` float DEFAULT NULL,
  `diem1t1` float DEFAULT NULL,
  `diem1t2` float DEFAULT NULL,
  `diemthi` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bangdiem`
--

INSERT INTO `bangdiem` (`id_mh`, `id_hs`, `id_nv`, `id_hk`, `id_nh`, `diemmieng`, `diem151`, `diem152`, `diem153`, `diem1t1`, `diem1t2`, `diemthi`) VALUES
('toan', '6a1t1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 8, 7, 9),
('nguvan', '6a1t1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('vatli', '6a1t1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('hoahoc', '6a1t1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('sinhhoc', '6a1t1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('tienganh', '6a1t1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('lichsu', '6a1t1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('diali', '6a1t1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('tinhoc', '6a1t1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('congnghe', '6a1t1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('toan', '7a1b1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 8, 7, 9),
('nguvan', '7a1b1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('vatli', '7a1b1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('hoahoc', '7a1b1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('sinhhoc', '7a1b1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('tienganh', '7a1b1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('lichsu', '7a1b1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('diali', '7a1b1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('tinhoc', '7a1b1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('congnghe', '7a1b1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('toan', '8a1v1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 8, 7, 9),
('nguvan', '8a1v1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('vatli', '8a1v1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('hoahoc', '8a1v1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('sinhhoc', '8a1v1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('tienganh', '8a1v1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('lichsu', '8a1v1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('diali', '8a1v1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('tinhoc', '8a1v1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('congnghe', '8a1v1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('toan', '9a1x1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 8, 7, 9),
('nguvan', '9a1x1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('vatli', '9a1x1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('hoahoc', '9a1x1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('sinhhoc', '9a1x1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('tienganh', '9a1x1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('lichsu', '9a1x1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('diali', '9a1x1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('tinhoc', '9a1x1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('congnghe', '9a1x1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 10, 10, 10),
('toan', '6a1t1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 8, 7, 9),
('toan', '6a1t1001', 'nv001', 'hk1', '2018-2019', 10, 10, 10, 10, 8, 7, 9);

-- --------------------------------------------------------

--
-- Table structure for table `chucvu`
--

CREATE TABLE `chucvu` (
  `id_cv` varchar(5) NOT NULL,
  `ten_cv` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chucvu`
--

INSERT INTO `chucvu` (`id_cv`, `ten_cv`) VALUES
('bv', 'Bảo vệ'),
('gv', 'Giáo viên'),
('hp', 'Hiệu phó'),
('ht', 'Hiệu trưởng');

-- --------------------------------------------------------

--
-- Table structure for table `chunhiem`
--

CREATE TABLE `chunhiem` (
  `id_cn` varchar(5) NOT NULL,
  `id_nv` varchar(10) DEFAULT NULL,
  `id_lop` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `giangday`
--

CREATE TABLE `giangday` (
  `id_gd` varchar(10) NOT NULL,
  `id_nv` varchar(10) DEFAULT NULL,
  `id_mh` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `giaovien`
--

CREATE TABLE `giaovien` (
  `id_nv` varchar(15) NOT NULL,
  `hoten_nv` varchar(50) DEFAULT NULL,
  `namsinh_nv` date DEFAULT NULL,
  `gioitinh_nv` tinyint(1) DEFAULT NULL,
  `id_cv` varchar(15) DEFAULT NULL,
  `sdt_nv` varchar(10) DEFAULT NULL,
  `email_nv` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `giaovien`
--

INSERT INTO `giaovien` (`id_nv`, `hoten_nv`, `namsinh_nv`, `gioitinh_nv`, `id_cv`, `sdt_nv`, `email_nv`) VALUES
('nv001', 'Nguyễn Văn Tình', '2000-06-08', 1, 'gv', '0332124138', 'tinhharu@gmail.com'),
('nv002', 'Nguyễn Văn An', '2000-10-10', 1, 'gv', '0332124138', 'abc@email.com'),
('nv003', 'Nguyễn Văn Bình', '2000-01-01', 1, 'gv', '0332124138', 'abc@email.com'),
('nv004', 'Nguyễn Văn Khải', '2000-03-05', 1, 'gv', '0332124138', 'abc@email.com'),
('nv005', 'Nguyễn Văn Tân', '2000-04-09', 1, 'gv', '0332124138', 'abc@email.com'),
('nv006', 'Nguyễn Tân Tiến', '1980-11-02', 1, 'ht', '0332124138', 'abc@email.com'),
('nv007', 'Nguyễn Lê Khánh', '1980-12-02', 1, 'hp', '0332124138', 'abc@email.com'),
('nv008', 'Nguyễn Văn Linh', '1990-06-06', 1, 'bv', '0332124138', 'abc@email.com'),
('nv009', 'Nguyễn Văn Hồng', '1989-10-10', 1, 'bv', '0332124138', 'abc@email.com'),
('nv011', 'Nguyễn Văn Tính', '2000-03-05', 1, 'gv', '0332124138', 'abc@email.com'),
('nv012', 'Trần Thị Hồng', '2000-04-09', 0, 'gv', '0332124138', 'abc@email.com'),
('nv013', 'Cao Phương Dung', '2000-03-05', 0, 'gv', '0332124138', 'abc@email.com'),
('nv014', 'Trần Văn Nhân', '2000-04-09', 1, 'gv', '0332124138', 'abc@email.com');

-- --------------------------------------------------------

--
-- Table structure for table `hocky`
--

CREATE TABLE `hocky` (
  `id_hk` varchar(5) NOT NULL,
  `ten_hk` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hocky`
--

INSERT INTO `hocky` (`id_hk`, `ten_hk`) VALUES
('hk1', 'Học kỳ 1'),
('hk2', 'Học kỳ 2'),
('hkh', 'Học kỳ hè');

-- --------------------------------------------------------

--
-- Table structure for table `hocsinh`
--

CREATE TABLE `hocsinh` (
  `id_hs` varchar(15) NOT NULL,
  `hoten_hs` varchar(50) DEFAULT NULL,
  `namsinh_hs` date DEFAULT NULL,
  `gioitinh_hs` tinyint(1) DEFAULT NULL,
  `sdt_hs` varchar(10) DEFAULT NULL,
  `email_hs` varchar(40) DEFAULT NULL,
  `id_lop` varchar(10) DEFAULT NULL,
  `id_hk` varchar(5) DEFAULT NULL,
  `id_nh` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hocsinh`
--

INSERT INTO `hocsinh` (`id_hs`, `hoten_hs`, `namsinh_hs`, `gioitinh_hs`, `sdt_hs`, `email_hs`, `id_lop`, `id_hk`, `id_nh`) VALUES
('6a1t1001', 'Nguyễn Văn Tình', '2000-06-08', 1, '0332124138', 'tinhharu@gmail.com', '6a1', 'hk1', '2022-2023'),
('6a1t1002', 'Nguyễn Văn Tình', '2008-06-08', 1, '0332124138', 'tinhharu@gmail.com', '6a2', 'hk1', '2022-2023'),
('6a1t1003', 'Nguyễn Tấn Tài', '2008-06-08', 1, '0332124138', 'nttai@gmail.com', '6a1', 'hk1', '2022-2023'),
('6a1t1004', 'Cao Tấn Tài', '2008-06-08', 1, '0332124138', 'cttai@gmail.com', '6a1', 'hk1', '2022-2023'),
('6a1t1005', 'Nguyễn Văn An', '2008-06-08', 1, '0332124138', 'nvan@gmail.com', '6a1', 'hk1', '2022-2023'),
('6a1t1006', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1007', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1008', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1009', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1010', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1011', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1012', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1013', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1014', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1015', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1016', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1017', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1018', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1019', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1020', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1021', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1022', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1023', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1024', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1025', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1026', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1027', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1028', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1029', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1030', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1031', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1032', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a1t1033', NULL, NULL, NULL, NULL, NULL, '6a1', NULL, NULL),
('6a2t1001', 'Nguyễn Văn Tình', '2008-06-08', 1, '0332124138', 'tinhharu@gmail.com', '6a2', 'hk1', '2022-2023'),
('6a2t1002', 'Nguyễn Thị Hương', '2008-06-08', 1, '0332124138', 'nthuong@gmail.com', '6a2', 'hk1', '2022-2023'),
('6a2t1003', 'Nguyễn Thị Hương Ly', '2008-06-08', 1, '0332124138', 'nthly@gmail.com', '6a2', 'hk1', '2022-2023'),
('6a2t1004', 'Nguyễn Thị Hương Thảo', '2008-06-08', 1, '0332124138', 'nththao@gmail.com', '6a2', 'hk1', '2022-2023'),
('6a2t1005', 'Lê Văn Đạt', '2008-06-08', 1, '0332124138', 'lvdat@gmail.com', '6a2', 'hk1', '2022-2023'),
('6a2t1006', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1007', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1008', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1009', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1010', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1011', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1012', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1013', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1014', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1015', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1016', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1017', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1018', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1019', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1020', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1021', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1022', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1023', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1024', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1025', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1026', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1027', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1028', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1029', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1030', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1031', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1032', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1033', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a2t1034', NULL, NULL, NULL, NULL, NULL, '6a2', NULL, NULL),
('6a3t1001', 'Nguyễn Văn Tình', '2008-06-08', 1, '0332124138', 'tinhharu@gmail.com', '6a3', 'hk1', '2018-2019'),
('6a3t1002', 'Trần Hoàng Phú', '2008-06-08', 1, '0332124138', 'thphu@gmail.com', '6a3', 'hk1', '2022-2023'),
('6a3t1003', 'Trần Nguyễn Hoàng Phú', '2008-06-08', 1, '0332124138', 'tnhphu@gmail.com', '6a3', 'hk1', '2022-2023'),
('6a3t1004', 'Trần Nguyễn Hoàng Phú Lê', '2008-06-08', 1, '0332124138', 'tnhple@gmail.com', '6a3', 'hk1', '2022-2023'),
('6a3t1005', 'Lê Thị Khánh Ngọc', '2008-06-08', 1, '0332124138', 'ltkngoc@gmail.com', '6a3', 'hk1', '2022-2023'),
('6a3t1006', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1007', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1008', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1009', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1010', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1011', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1012', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1013', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1014', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1015', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1016', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1017', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1018', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1019', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1020', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1021', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1022', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1023', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1024', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1025', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1026', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1027', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1028', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1029', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1030', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1031', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1032', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1033', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1034', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('6a3t1035', NULL, NULL, NULL, NULL, NULL, '6a3', NULL, NULL),
('7a1b1001', 'Nguyễn Văn Tình', '2007-06-08', 1, '0332124138', 'tinhharu@gmail.com', '7a1', 'hk1', '2018-2019'),
('7a1b1002', 'Nguyễn Văn Khải', '2007-06-08', 1, '0332124138', 'khai@gmail.com', '7a1', 'hk1', '2022-2023'),
('7a1b1003', 'Nguyễn Văn Khải Duy', '2007-06-08', 1, '0332124138', 'nvkduy@gmail.com', '7a1', 'hk1', '2022-2023'),
('7a1b1004', 'Trần Văn Khải Duy', '2007-06-08', 1, '0332124138', 'tvkduy@gmail.com', '7a1', 'hk1', '2022-2023'),
('7a1b1005', 'Trần Thị Hòa', '2007-06-08', 1, '0332124138', 'tthoa@gmail.com', '7a1', 'hk1', '2022-2023'),
('7a1b1006', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1007', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1008', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1009', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1010', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1011', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1012', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1013', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1014', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1015', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1016', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1017', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1018', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1019', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1020', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1021', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1022', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1023', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1024', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1025', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1026', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1027', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1028', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1029', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1030', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1031', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1032', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1033', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1034', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1b1035', NULL, NULL, NULL, NULL, NULL, '7a1', NULL, NULL),
('7a1t1006', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1007', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1008', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1009', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1010', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1011', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1012', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1013', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1014', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1015', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1016', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1018', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1019', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1020', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1021', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1022', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1023', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1024', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1025', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1026', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1027', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1028', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1029', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1030', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1031', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1032', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1033', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1034', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a1t1035', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2b1001', 'Nguyễn Văn Tình', '2007-06-08', 1, '0332124138', 'tinhharu@gmail.com', '7a2', 'hk1', '2018-2019'),
('7a2b1002', 'Trần Thị Lê', '2007-06-08', 1, '0332124138', 'ttle@gmail.com', '7a2', 'hk1', '2022-2023'),
('7a2b1003', 'Trần Thị Hồng Đào', '2007-06-08', 1, '0332124138', 'tthdao@gmail.com', '7a2', 'hk1', '2022-2023'),
('7a2b1004', 'Nguyễn Hồng Đào', '2007-06-08', 1, '0332124138', 'nhdao@gmail.com', '7a2', 'hk1', '2022-2023'),
('7a2b1005', 'Lê Văn Bảo', '2007-06-08', 1, '0332124138', 'lvbao@gmail.com', '7a2', 'hk1', '2022-2023'),
('7a2b1006', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1007', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1008', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1009', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1010', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1011', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1012', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1013', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1014', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1015', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1016', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1017', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1018', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1019', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1020', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1021', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1022', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1023', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1024', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1025', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1026', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1027', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1028', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1029', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1030', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1031', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1032', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1033', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1034', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2b1035', NULL, NULL, NULL, NULL, NULL, '7a2', NULL, NULL),
('7a2t1006', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1007', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1008', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1009', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1010', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1011', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1012', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1013', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1014', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1015', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1016', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1017', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1018', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1019', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1020', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1021', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1022', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1023', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1024', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1025', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1026', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1027', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1028', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1029', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1030', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1031', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1032', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1033', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1034', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a2t1035', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3b1001', 'Nguyễn Văn Tình', '2007-06-08', 1, '0332124138', 'tinhharu@gmail.com', '7a3', 'hk1', '2018-2019'),
('7a3b1002', 'Trần Thị Hương Lê', '2007-06-08', 1, '0332124138', 'tthle@gmail.com', '7a3', 'hk1', '2022-2023'),
('7a3b1003', 'Cao Thị Hương Lê', '2007-06-08', 1, '0332124138', 'cthle@gmail.com', '7a3', 'hk1', '2022-2023'),
('7a3b1004', 'Dương Văn Thiện', '2007-06-08', 1, '0332124138', 'dvthien@gmail.com', '7a3', 'hk1', '2022-2023'),
('7a3b1005', 'Dương Văn Tình', '2007-06-08', 1, '0332124138', 'dvtinh@gmail.com', '7a3', 'hk1', '2022-2023'),
('7a3b1006', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1007', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1008', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1009', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1010', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1011', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1012', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1013', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1014', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1015', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1016', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1017', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1018', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1019', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1020', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1021', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1022', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1023', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1024', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1025', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1026', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1027', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1028', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1029', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1030', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1031', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1032', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1033', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1034', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3b1035', NULL, NULL, NULL, NULL, NULL, '7a3', NULL, NULL),
('7a3t1006', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1007', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1008', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1009', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1010', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1011', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1012', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1013', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1014', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1015', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1016', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1017', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1018', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1019', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1020', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1021', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1022', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1023', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1024', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1025', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1026', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1027', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1028', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1029', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1030', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1031', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1032', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1033', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1034', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7a3t1035', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1006', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1007', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1008', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1009', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1010', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1011', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1012', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1013', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1014', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1015', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1016', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1017', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1018', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1019', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1020', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1021', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1022', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1023', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1024', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1025', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1026', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1027', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1028', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1029', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1030', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1031', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1032', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1033', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1034', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1t1035', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a1v1001', '1', '2000-01-01', 1, '1', '1', '8a1', 'hk1', '2018-2019'),
('8a1v1002', 'Nguyễn Văn Tình', '2006-06-08', 1, '0332124138', 'tinhharu@gmail.com', '8a2', 'hk1', '2018-2019'),
('8a1v1003', 'Trần Thiện', '2006-06-08', 1, '0332124138', 'tthien@gmail.com', '8a1', 'hk1', '2022-2023'),
('8a1v1004', 'Trần Thiện Khiêm', '2006-06-08', 1, '0332124138', 'ttkhiem@gmail.com', '8a1', 'hk1', '2022-2023'),
('8a1v1005', 'Cao Văn Tấn', '2006-06-08', 1, '0332124138', 'cttai@gmail.com', '8a1', 'hk1', '2022-2023'),
('8a1v1006', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1007', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1008', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1009', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1010', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1011', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1012', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1013', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1014', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1015', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1016', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1017', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1018', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1019', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1020', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1021', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1022', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1023', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1024', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1025', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1026', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1027', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1028', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1029', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1030', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1031', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1032', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1033', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1034', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a1v1035', NULL, NULL, NULL, NULL, NULL, '8a1', NULL, NULL),
('8a2t1006', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1007', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1008', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1009', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1010', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1011', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1012', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1013', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1014', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1015', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1016', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1017', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1018', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1019', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1020', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1021', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1022', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1023', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1024', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1025', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1026', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1027', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1028', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1029', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1030', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1031', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1032', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1033', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1034', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2t1035', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('8a2v1001', 'Nguyễn Văn Tình', '2006-06-08', 1, '0332124138', 'tinhharu@gmail.com', '8a2', 'hk1', '2018-2019'),
('8a2v1002', 'Dương Thị Như', '2006-06-08', 1, '0332124138', 'dtnhu@gmail.com', '8a2', 'hk1', '2022-2023'),
('8a2v1003', 'Dương Thị Như Thủy', '2006-06-08', 1, '0332124138', 'dtnthuy@gmail.com', '8a2', 'hk1', '2022-2023'),
('8a2v1004', 'Trần Thị Như', '2006-06-08', 1, '0332124138', 'ttnhu@gmail.com', '8a2', 'hk1', '2022-2023'),
('8a2v1005', 'Lê Huỳnh Bích Như', '2006-06-08', 1, '0332124138', 'lhbn@gmail.com', '8a2', 'hk1', '2022-2023'),
('8a2v1006', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1007', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1008', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1009', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1010', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1011', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1012', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1013', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1014', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1015', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1016', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1017', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1018', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1019', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1020', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1021', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1022', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1023', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1024', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1025', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1026', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1027', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1028', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1029', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1030', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1031', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1032', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1033', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1034', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a2v1035', NULL, NULL, NULL, NULL, NULL, '8a2', NULL, NULL),
('8a3v1001', 'Nguyễn Văn Tình', '2006-06-08', 1, '0332124138', 'tinhharu@gmail.com', '8a3', 'hk1', '2018-2019'),
('8a3v1002', 'Trần Văn Tân', '2006-06-08', 1, '0332124138', 'tvtan@gmail.com', '8a3', 'hk1', '2022-2023'),
('8a3v1003', 'Cao Văn Tân', '2006-06-08', 1, '0332124138', 'cvtan@gmail.com', '8a3', 'hk1', '2022-2023'),
('8a3v1004', 'Trần Thị Hòa', '2006-06-08', 1, '0332124138', 'tthoa@gmail.com', '8a3', 'hk1', '2022-2023'),
('8a3v1005', 'Trần Thị Hòa Ninh', '2006-06-08', 1, '0332124138', 'tthninh@gmail.com', '8a3', 'hk1', '2022-2023'),
('9a1t1006', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1007', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1008', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1009', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1010', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1011', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1012', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1013', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1014', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1015', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1016', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1017', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1018', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1019', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1020', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1021', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1022', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1023', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1024', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1025', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1026', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1027', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1028', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1029', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1030', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1031', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1032', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1033', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1034', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1t1035', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a1x1001', 'Nguyễn Văn Tình', '2005-06-08', 1, '0332124138', 'tinhharu@gmail.com', '9a1', 'hk1', '2018-2019'),
('9a1x1002', 'Nguyễn Văn Tình', '2005-06-08', 1, '0332124138', 'tinhharu@gmail.com', '9a2', 'hk1', '2018-2019'),
('9a1x1003', 'Nguyễn Văn Tâm', '2005-06-08', 1, '0332124138', 'nvtan@gmail.com', '9a1', 'hk1', '2022-2023'),
('9a1x1004', 'Nguyễn Văn Tâm Lý', '2005-06-08', 1, '0332124138', 'nvtly@gmail.com', '9a1', 'hk1', '2022-2023'),
('9a1x1005', 'Trần Hương Thảo', '2005-06-08', 1, '0332124138', 'ththao@gmail.com', '9a1', 'hk1', '2022-2023'),
('9a1x1006', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1007', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1008', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1009', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1010', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1011', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1012', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1013', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1014', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1015', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1016', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1017', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1018', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1019', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1020', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1021', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1022', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1023', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1024', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1025', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1026', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1027', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1028', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1029', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1030', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1031', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1032', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1033', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1034', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a1x1035', NULL, NULL, NULL, NULL, NULL, '9a1', NULL, NULL),
('9a2t1006', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1007', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1008', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1009', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1010', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1011', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1012', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1013', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1014', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1015', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1016', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1017', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1018', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1019', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1020', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1021', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1022', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1023', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1024', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1025', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1026', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1027', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1028', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1029', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1030', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1031', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1032', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1033', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1034', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2t1035', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('9a2x1001', 'Nguyễn Văn Tình', '2005-06-08', 1, '0332124138', 'tinhharu@gmail.com', '9a2', 'hk1', '2018-2019'),
('9a2x1002', 'Nguyễn Hoàng Phúc', '2005-06-08', 1, '0332124138', 'nhphuc@gmail.com', '9a2', 'hk1', '2022-2023'),
('9a2x1003', 'Nguyễn Trần Hoàng Phúc', '2005-06-08', 1, '0332124138', 'nthphuc@gmail.com', '9a2', 'hk1', '2022-2023'),
('9a2x1004', 'Lê Hoàng Phúc', '2005-06-08', 1, '0332124138', 'lhphuc@gmail.com', '9a2', 'hk1', '2022-2023'),
('9a2x1005', 'Lý Cao', '2005-06-08', 1, '0332124138', 'lycaoc@gmail.com', '9a2', 'hk1', '2022-2023'),
('9a2x1006', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1007', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1008', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1009', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1010', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1011', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1012', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1013', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1014', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1015', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1016', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1017', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1018', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1019', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1020', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1021', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1022', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1023', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1024', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1025', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1026', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1027', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1028', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1029', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1030', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1031', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1032', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1033', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1034', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('9a2x1035', NULL, NULL, NULL, NULL, NULL, '9a2', NULL, NULL),
('a83t1006', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1007', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1008', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1009', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1010', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1011', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1012', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1013', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1014', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1015', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1016', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1017', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1018', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1019', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1020', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1021', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1022', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1023', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1024', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1025', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1026', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1027', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1028', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1029', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1030', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1031', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1032', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1033', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1034', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83t1035', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('a83v1006', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1007', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1008', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1009', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1010', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1011', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1012', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1013', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1014', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1015', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1016', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1017', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1018', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1019', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1020', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1021', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1022', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1023', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1024', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1025', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1026', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1027', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1028', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1029', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1030', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1031', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1032', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1033', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1034', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL),
('a83v1035', NULL, NULL, NULL, NULL, NULL, '8a3', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `lop`
--

CREATE TABLE `lop` (
  `id_lop` varchar(5) NOT NULL,
  `malop` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lop`
--

INSERT INTO `lop` (`id_lop`, `malop`) VALUES
('6a1', '6'),
('6a2', '6'),
('6a3', '6'),
('7a1', '7'),
('7a2', '7'),
('7a3', '7'),
('8a1', '8'),
('8a2', '8'),
('8a3', '8'),
('9a1', '9'),
('9a2', '9');

-- --------------------------------------------------------

--
-- Table structure for table `luong`
--

CREATE TABLE `luong` (
  `id_nv` varchar(10) DEFAULT NULL,
  `thang` int(11) DEFAULT NULL,
  `luongcoban` float DEFAULT NULL,
  `chisothuong` float DEFAULT NULL,
  `tongluong` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `luong`
--

INSERT INTO `luong` (`id_nv`, `thang`, `luongcoban`, `chisothuong`, `tongluong`) VALUES
('nv001', 1, 3900000, 1.8, 6000000),
('nv002', 1, 3900000, 1.8, 702000),
('nv006', 1, 4900000, 2.6, 12740000),
('nv007', 1, 4900000, 2.3, 11270000),
('nv008', 1, 2200000, 1.3, 2860000),
('nv009', 1, 2200000, 1.3, 2860000),
('nv003', 1, 3900000, 1.8, 7020000),
('nv004', 1, 3900000, 1.8, 7020000),
('nv005', 1, 3900000, 1.8, 7020000),
('nv011', 1, 3900000, 1.8, 7020000),
('nv012', 1, 3900000, 1.8, 7020000),
('nv013', 1, 3900000, 1.8, 7020000),
('nv014', 1, 3900000, 1.8, 7020000);

-- --------------------------------------------------------

--
-- Table structure for table `monhoc`
--

CREATE TABLE `monhoc` (
  `id_mh` varchar(30) NOT NULL,
  `ten_mh` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `monhoc`
--

INSERT INTO `monhoc` (`id_mh`, `ten_mh`) VALUES
('amnhac', 'Âm nhạc'),
('congnghe', 'Công nghệ'),
('diali', 'Địa lí'),
('gdcd', 'Giáo dục công dân'),
('hoahoc', 'Hóa học'),
('lichsu', 'Lịch sử'),
('mithuat', 'Mĩ thuật'),
('nguvan', 'Ngữ văn'),
('quocphong', 'Quốc phòng'),
('sinhhoc', 'Sinh học'),
('tienganh', 'Tiếng anh'),
('tinhoc', 'Tin học'),
('toan', 'Toán'),
('vatli', 'Vật lí');

-- --------------------------------------------------------

--
-- Table structure for table `namhoc`
--

CREATE TABLE `namhoc` (
  `id_nh` varchar(20) NOT NULL,
  `ten_nh` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `namhoc`
--

INSERT INTO `namhoc` (`id_nh`, `ten_nh`) VALUES
('2018-2019', '2018-2019'),
('2019-2020', '2019-2020'),
('2020-2021', '2020-2021'),
('2021-2022', '2021-2022'),
('2022-2023', '2022-2023');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `id_nv` varchar(15) NOT NULL,
  `hoten_nv` varchar(50) DEFAULT NULL,
  `namsinh_nv` date DEFAULT NULL,
  `gioitinh_nv` tinyint(1) DEFAULT NULL,
  `id_cv` varchar(15) DEFAULT NULL,
  `sdt_nv` varchar(10) DEFAULT NULL,
  `email_nv` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`id_nv`, `hoten_nv`, `namsinh_nv`, `gioitinh_nv`, `id_cv`, `sdt_nv`, `email_nv`) VALUES
('nv001', 'Nguyễn Văn Tình', '2000-08-06', 1, 'gv', NULL, NULL),
('nv002', 'Nguyễn Văn An', '2000-10-10', 1, 'gv', NULL, NULL),
('nv003', 'Nguyễn Văn Bình', '2000-01-01', 1, 'gv', NULL, NULL),
('nv004', 'Nguyễn Văn Khải', '2000-03-05', 1, 'gv', NULL, NULL),
('nv005', 'Nguyễn Văn Tân', '2000-04-09', 1, 'gv', NULL, NULL),
('nv006', 'Nguyễn Tân Tiến', '1980-11-02', 1, 'ht', NULL, NULL),
('nv007', 'Nguyễn Lê Khánh', '1980-12-02', 1, 'hp', NULL, NULL),
('nv008', 'Nguyễn Văn Linh', '1990-06-06', 1, 'bv', NULL, NULL),
('nv009', 'Nguyễn Văn Hồng', '1989-10-10', 1, 'bv', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `phanconggd`
--

CREATE TABLE `phanconggd` (
  `id_pcgd` varchar(10) NOT NULL,
  `id_nv` varchar(10) DEFAULT NULL,
  `id_mh` varchar(10) DEFAULT NULL,
  `id_lop` varchar(10) DEFAULT NULL,
  `id_hk` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `phonghoc`
--

CREATE TABLE `phonghoc` (
  `id_ph` varchar(5) NOT NULL,
  `ten_ph` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phonghoc`
--

INSERT INTO `phonghoc` (`id_ph`, `ten_ph`) VALUES
('a101', 'Khu A - Lầu 1'),
('a102', 'Khu A - Lầu 1'),
('a103', 'Khu A - Lầu 1'),
('a104', 'Khu A - Lầu 1'),
('a201', 'Khu A - Lầu 2'),
('a202', 'Khu A - Lầu 2'),
('a203', 'Khu A - Lầu 2'),
('b101', 'Khu B - Lầu 1'),
('b102', 'Khu B - Lầu 1'),
('b201', 'Khu B - Lầu 2'),
('b202', 'Khu B - Lầu 2'),
('c101', 'Khu C - Lầu 1'),
('c102', 'Khu C - Lầu 1'),
('d101', 'Khu D - Lầu 1'),
('d102', 'Khu D - Lầu 1'),
('d103', 'Khu D - Lầu 1'),
('d104', 'Khu D - Lầu 1'),
('d105', 'Khu D - Lầu 1'),
('d106', 'Khu D - Lầu 1'),
('d107', 'Khu D - Lầu 1'),
('d108', 'Khu D - Lầu 1'),
('d109', 'Khu D - Lầu 1'),
('d201', 'Khu D - Lầu 2'),
('d202', 'Khu D - Lầu 2'),
('d203', 'Khu D - Lầu 2'),
('d204', 'Khu D - Lầu 2'),
('d205', 'Khu D - Lầu 2'),
('d206', 'Khu D - Lầu 2'),
('d207', 'Khu D - Lầu 2'),
('d208', 'Khu D - Lầu 2'),
('d209', 'Khu D - Lầu 2');

-- --------------------------------------------------------

--
-- Table structure for table `studentaccount`
--

CREATE TABLE `studentaccount` (
  `id_hs` varchar(10) DEFAULT NULL,
  `studentusername` varchar(10) NOT NULL,
  `studentpassword` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentaccount`
--

INSERT INTO `studentaccount` (`id_hs`, `studentusername`, `studentpassword`) VALUES
('6a1t1001', '6a1t1001', '1'),
('6a1t1002', '6a1t1002', '1'),
('6a2t1001', '6a2t1001', ''),
('6a3t1001', '6a3t1001', '111'),
('7a1b1001', '7a1t1001', '111'),
('7a2b1001', '7a2b1001', '111'),
('7a3b1001', '7a3b1001', '111'),
('8a1v1001', '8a1t1001', '111'),
('8a2v1001', '8a2v1001', '111'),
('8a3v1001', '8a3v1001', '111'),
('9a1x1001', '9a1t1001', '111'),
('9a2x1001', '9a2x1001', '111');

-- --------------------------------------------------------

--
-- Table structure for table `teacheraccount`
--

CREATE TABLE `teacheraccount` (
  `id_nv` varchar(10) DEFAULT NULL,
  `teacherusername` varchar(10) NOT NULL,
  `teacherpassword` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacheraccount`
--

INSERT INTO `teacheraccount` (`id_nv`, `teacherusername`, `teacherpassword`) VALUES
('nv001', 'nv001', '111'),
('nv002', 'nv002', '111'),
('nv003', 'nv003', '111'),
('nv004', 'nv004', '111'),
('nv005', 'nv005', '111'),
('nv006', 'nv006', '111'),
('nv007', 'nv007', '1'),
('nv008', 'nv008', ''),
('nv009', 'nv009', '111'),
('nv011', 'nv011', '111'),
('nv012', 'nv012', '111'),
('nv013', 'nv013', '111'),
('nv014', 'nv014', '111');

-- --------------------------------------------------------

--
-- Table structure for table `thoikhoabieu`
--

CREATE TABLE `thoikhoabieu` (
  `id_lop` varchar(10) DEFAULT NULL,
  `id_nv` varchar(10) DEFAULT NULL,
  `id_mh` varchar(10) DEFAULT NULL,
  `thu` int(11) DEFAULT NULL,
  `tiet` varchar(10) DEFAULT NULL,
  `id_ph` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `thoikhoabieu`
--

INSERT INTO `thoikhoabieu` (`id_lop`, `id_nv`, `id_mh`, `thu`, `tiet`, `id_ph`) VALUES
('6a1', 'nv001', 'toan', 2, '1-2-3', 'a101'),
('6a1', 'nv001', 'toan', 2, '4-5', 'a101'),
('6a1', 'nv001', 'toan', 3, '3-4-5', 'a102'),
('6a1', 'nv003', 'tienganh', 4, '1-2-3', 'b101'),
('6a1', 'nv002', 'nguvan', 4, '4-5', 'c101'),
('6a1', 'nv005', 'hoahoc', 5, '1-2', 'b101'),
('6a1', 'nv004', 'sinhhoc', 5, '3', 'a102'),
('6a1', 'nv004', 'tinhoc', 5, '4-5', 'a103'),
('6a1', 'nv005', 'lichsu', 6, '1-2', 'b101'),
('6a1', 'nv004', 'diali', 6, '3', 'a102'),
('6a1', 'nv004', 'vatli', 6, '4-5', 'a103'),
('6a2', 'nv001', 'toan', 2, '1-2-3', 'a101'),
('6a2', 'nv008', 'vatli', 2, '4-5', 'a101'),
('6a2', 'nv004', 'toan', 3, '3-4-5', 'a102'),
('6a2', 'nv009', 'tienganh', 4, '1-2-3', 'b101'),
('6a2', 'nv003', 'nguvan', 4, '4-5', 'c101'),
('6a2', 'nv009', 'tienganh', 5, '1-2', 'b101'),
('6a2', 'nv006', 'sinhhoc', 5, '3', 'a102'),
('6a2', 'nv001', 'toan', 5, '4-5', 'a103'),
('6a2', 'nv007', 'lichsu', 6, '1-2', 'b101'),
('6a2', 'nv005', 'diali', 6, '3', 'a102'),
('6a2', 'nv003', 'nguvan', 6, '4-5', 'a103'),
('6a3', 'nv006', 'sinhhoc', 2, '1-2-3', 'a101'),
('6a3', 'nv005', 'diali', 2, '4-5', 'a101'),
('6a3', 'nv002', 'tinhoc', 3, '3-4-5', 'a102'),
('6a3', 'nv008', 'vatli', 4, '1-2-3', 'b101'),
('6a3', 'nv007', 'lichsu', 4, '4-5', 'c101'),
('6a3', 'nv005', 'diali', 5, '1-2', 'b101'),
('6a3', 'nv001', 'toan', 5, '3', 'a102'),
('6a3', 'nv007', 'lichsu', 5, '4-5', 'a103'),
('6a3', 'nv001', 'toan', 6, '1-2', 'b101'),
('6a3', 'nv009', 'tienganh', 6, '3', 'a102'),
('6a3', 'nv009', 'tienganh', 6, '4-5', 'a103'),
('7a1', 'nv006', 'nguvan', 2, '1-2-3', 'a101'),
('7a1', 'nv009', 'toan', 2, '4-5', 'a101'),
('7a1', 'nv003', 'lichsu', 3, '3-4-5', 'a102'),
('7a1', 'nv001', 'tienganh', 4, '1-2-3', 'b101'),
('7a1', 'nv003', 'tinhoc', 4, '4-5', 'c101'),
('7a1', 'nv007', 'hoahoc', 5, '1-2', 'b101'),
('7a1', 'nv005', 'sinhhoc', 5, '3', 'a102'),
('7a1', 'nv008', 'gdcd', 5, '4-5', 'a103'),
('7a1', 'nv006', 'nguvan', 6, '1-2', 'b101'),
('7a1', 'nv002', 'diali', 6, '3', 'a102'),
('7a1', 'nv004', 'vatli', 6, '4-5', 'a103'),
('7a2', 'nv005', 'sinhhoc', 2, '1-2-3', 'a101'),
('7a2', 'nv003', 'tinhoc', 2, '4-5', 'a101'),
('7a2', 'nv004', 'vatli', 3, '3-4-5', 'a102'),
('7a2', 'nv008', 'gdcd', 4, '1-2-3', 'b101'),
('7a2', 'nv006', 'nguvan', 4, '4-5', 'c101'),
('7a2', 'nv009', 'toan', 5, '1-2', 'b101'),
('7a2', 'nv002', 'diali', 5, '3', 'a102'),
('7a2', 'nv003', 'lichsu', 5, '4-5', 'a103'),
('7a2', 'nv004', 'vatli', 6, '1-2', 'b101'),
('7a2', 'nv005', 'sinhhoc', 6, '3', 'a102'),
('7a2', 'nv008', 'gdcd', 6, '4-5', 'a103'),
('7a3', 'nv006', 'nguvan', 2, '1-2-3', 'a101'),
('7a3', 'nv003', 'tinhoc', 2, '4-5', 'a101'),
('7a3', 'nv002', 'diali', 3, '3-4-5', 'a102'),
('7a3', 'nv004', 'vatli', 4, '1-2-3', 'b101'),
('7a3', 'nv007', 'hoahoc', 4, '4-5', 'c101'),
('7a3', 'nv008', 'gdcd', 5, '1-2', 'b101'),
('7a3', 'nv004', 'vatli', 5, '3', 'a102'),
('7a3', 'nv006', 'nguvan', 5, '4-5', 'a103'),
('7a3', 'nv009', 'toan', 6, '1-2', 'b101'),
('7a3', 'nv002', 'diali', 6, '3', 'a102'),
('7a3', 'nv003', 'lichsu', 6, '4-5', 'a103'),
('8a1', 'nv005', 'hoahoc', 2, '1-2-3', 'a101'),
('8a1', 'nv002', 'nguvan', 2, '4-5', 'a101'),
('8a1', 'nv001', 'toan', 3, '3-4-5', 'a102'),
('8a1', 'nv009', 'tienganh', 4, '1-2-3', 'b101'),
('8a1', 'nv002', 'nguvan', 4, '4-5', 'c101'),
('8a1', 'nv006', 'sinhhoc', 5, '1-2', 'b101'),
('8a1', 'nv006', 'sinhhoc', 5, '3', 'a102'),
('8a1', 'nv004', 'tinhoc', 5, '4-5', 'a103'),
('8a1', 'nv007', 'lichsu', 6, '1-2', 'b101'),
('8a1', 'nv008', 'diali', 6, '3', 'a102'),
('8a1', 'nv003', 'vatli', 6, '4-5', 'a103'),
('8a2', 'nv006', 'sinhhoc', 2, '1-2-3', 'a101'),
('8a2', 'nv003', 'vatli', 2, '4-5', 'a101'),
('8a2', 'nv005', 'hoahoc', 3, '3-4-5', 'a102'),
('8a2', 'nv002', 'nguvan', 4, '1-2-3', 'b101'),
('8a2', 'nv001', 'toan', 4, '4-5', 'c101'),
('8a2', 'nv008', 'diali', 5, '1-2', 'b101'),
('8a2', 'nv007', 'lichsu', 5, '3', 'a102'),
('8a2', 'nv009', 'tienganh', 5, '4-5', 'a103'),
('8a2', 'nv006', 'sinhhoc', 6, '1-2', 'b101'),
('8a2', 'nv006', 'sinhhoc', 6, '3', 'a102'),
('8a2', 'nv004', 'tinhoc', 6, '4-5', 'a103'),
('8a3', 'nv006', 'sinhhoc', 2, '1-2-3', 'a101'),
('8a3', 'nv002', 'nguvan', 2, '4-5', 'a101'),
('8a3', 'nv001', 'toan', 3, '3-4-5', 'a102'),
('8a3', 'nv003', 'vatli', 4, '1-2-3', 'b101'),
('8a3', 'nv004', 'tinhoc', 4, '4-5', 'c101'),
('8a3', 'nv009', 'tienganh', 5, '1-2', 'b101'),
('8a3', 'nv008', 'diali', 5, '3', 'a102'),
('8a3', 'nv009', 'tienganh', 5, '4-5', 'a103'),
('8a3', 'nv003', 'vatli', 6, '1-2', 'b101'),
('8a3', 'nv005', 'hoahoc', 6, '3', 'a102'),
('8a3', 'nv007', 'lichsu', 6, '4-5', 'a103'),
('9a1', 'nv001', 'nguvan', 2, '1-2-3', 'a101'),
('9a1', 'nv001', 'nguvan', 2, '4-5', 'a101'),
('9a1', 'nv001', 'nguvan', 3, '3-4-5', 'a102'),
('9a1', 'nv003', 'tienganh', 4, '1-2-3', 'b101'),
('9a1', 'nv002', 'toan', 4, '4-5', 'c101'),
('9a1', 'nv005', 'hoahoc', 5, '1-2', 'b101'),
('9a1', 'nv004', 'sinhhoc', 5, '3', 'a102'),
('9a1', 'nv007', 'tinhoc', 5, '4-5', 'a103'),
('9a1', 'nv008', 'lichsu', 6, '1-2', 'b101'),
('9a1', 'nv006', 'diali', 6, '3', 'a102'),
('9a1', 'nv009', 'vatli', 6, '4-5', 'a103'),
('9a2', 'nv007', 'tinhoc', 2, '1-2-3', 'a101'),
('9a2', 'nv003', 'tienganh', 2, '4-5', 'a101'),
('9a2', 'nv002', 'toan', 3, '3-4-5', 'a102'),
('9a2', 'nv009', 'vatli', 4, '1-2-3', 'b101'),
('9a2', 'nv001', 'nguvan', 4, '4-5', 'c101'),
('9a2', 'nv004', 'sinhhoc', 5, '1-2', 'b101'),
('9a2', 'nv006', 'diali', 5, '3', 'a102'),
('9a2', 'nv005', 'hoahoc', 5, '4-5', 'a103'),
('9a2', 'nv008', 'lichsu', 6, '1-2', 'b101'),
('9a2', 'nv004', 'sinhhoc', 6, '3', 'a102'),
('9a2', 'nv002', 'toan', 6, '4-5', 'a103');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminusername`);

--
-- Indexes for table `bangdiem`
--
ALTER TABLE `bangdiem`
  ADD KEY `fk_bd_mh` (`id_mh`),
  ADD KEY `fk_bd_hs` (`id_hs`),
  ADD KEY `fk_bd_nv` (`id_nv`),
  ADD KEY `fk_bd_hk` (`id_hk`),
  ADD KEY `fk_bd_nh` (`id_nh`);

--
-- Indexes for table `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`id_cv`);

--
-- Indexes for table `chunhiem`
--
ALTER TABLE `chunhiem`
  ADD PRIMARY KEY (`id_cn`),
  ADD KEY `fk_cn_nv` (`id_nv`),
  ADD KEY `fk_cn_lop` (`id_lop`);

--
-- Indexes for table `giangday`
--
ALTER TABLE `giangday`
  ADD PRIMARY KEY (`id_gd`),
  ADD KEY `fk_gd_nv` (`id_nv`),
  ADD KEY `fk_gd_mh` (`id_mh`);

--
-- Indexes for table `giaovien`
--
ALTER TABLE `giaovien`
  ADD PRIMARY KEY (`id_nv`),
  ADD KEY `fk_gv_cv` (`id_cv`);

--
-- Indexes for table `hocky`
--
ALTER TABLE `hocky`
  ADD PRIMARY KEY (`id_hk`);

--
-- Indexes for table `hocsinh`
--
ALTER TABLE `hocsinh`
  ADD PRIMARY KEY (`id_hs`),
  ADD KEY `fk_hs_hk` (`id_hk`),
  ADD KEY `fk_hs_lop` (`id_lop`),
  ADD KEY `fk_hs_nh` (`id_nh`);

--
-- Indexes for table `lop`
--
ALTER TABLE `lop`
  ADD PRIMARY KEY (`id_lop`);

--
-- Indexes for table `luong`
--
ALTER TABLE `luong`
  ADD KEY `fk_luong_nv` (`id_nv`);

--
-- Indexes for table `monhoc`
--
ALTER TABLE `monhoc`
  ADD PRIMARY KEY (`id_mh`);

--
-- Indexes for table `namhoc`
--
ALTER TABLE `namhoc`
  ADD PRIMARY KEY (`id_nh`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`id_nv`),
  ADD KEY `fk_nv_cv` (`id_cv`);

--
-- Indexes for table `phanconggd`
--
ALTER TABLE `phanconggd`
  ADD PRIMARY KEY (`id_pcgd`),
  ADD KEY `fk_pcgd_nv` (`id_nv`),
  ADD KEY `fk_pcgd_mh` (`id_mh`),
  ADD KEY `fk_pcgd_lop` (`id_lop`),
  ADD KEY `fk_pcgd_hk` (`id_hk`);

--
-- Indexes for table `phonghoc`
--
ALTER TABLE `phonghoc`
  ADD PRIMARY KEY (`id_ph`);

--
-- Indexes for table `studentaccount`
--
ALTER TABLE `studentaccount`
  ADD PRIMARY KEY (`studentusername`),
  ADD KEY `fk_hs_account` (`id_hs`);

--
-- Indexes for table `teacheraccount`
--
ALTER TABLE `teacheraccount`
  ADD PRIMARY KEY (`teacherusername`),
  ADD KEY `fk_nv_account` (`id_nv`);

--
-- Indexes for table `thoikhoabieu`
--
ALTER TABLE `thoikhoabieu`
  ADD KEY `fk1` (`id_nv`),
  ADD KEY `fk2` (`id_mh`),
  ADD KEY `fk3` (`id_lop`),
  ADD KEY `fk4` (`id_ph`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bangdiem`
--
ALTER TABLE `bangdiem`
  ADD CONSTRAINT `fk_bd_hk` FOREIGN KEY (`id_hk`) REFERENCES `hocky` (`id_hk`),
  ADD CONSTRAINT `fk_bd_hs` FOREIGN KEY (`id_hs`) REFERENCES `hocsinh` (`id_hs`),
  ADD CONSTRAINT `fk_bd_mh` FOREIGN KEY (`id_mh`) REFERENCES `monhoc` (`id_mh`),
  ADD CONSTRAINT `fk_bd_nh` FOREIGN KEY (`id_nh`) REFERENCES `namhoc` (`id_nh`),
  ADD CONSTRAINT `fk_bd_nv` FOREIGN KEY (`id_nv`) REFERENCES `giaovien` (`id_nv`);

--
-- Constraints for table `chunhiem`
--
ALTER TABLE `chunhiem`
  ADD CONSTRAINT `fk_cn_lop` FOREIGN KEY (`id_lop`) REFERENCES `lop` (`id_lop`),
  ADD CONSTRAINT `fk_cn_nv` FOREIGN KEY (`id_nv`) REFERENCES `giaovien` (`id_nv`);

--
-- Constraints for table `giangday`
--
ALTER TABLE `giangday`
  ADD CONSTRAINT `fk_gd_mh` FOREIGN KEY (`id_mh`) REFERENCES `monhoc` (`id_mh`),
  ADD CONSTRAINT `fk_gd_nv` FOREIGN KEY (`id_nv`) REFERENCES `giaovien` (`id_nv`);

--
-- Constraints for table `giaovien`
--
ALTER TABLE `giaovien`
  ADD CONSTRAINT `fk_gv_cv` FOREIGN KEY (`id_cv`) REFERENCES `chucvu` (`id_cv`);

--
-- Constraints for table `hocsinh`
--
ALTER TABLE `hocsinh`
  ADD CONSTRAINT `fk_hs_hk` FOREIGN KEY (`id_hk`) REFERENCES `hocky` (`id_hk`),
  ADD CONSTRAINT `fk_hs_lop` FOREIGN KEY (`id_lop`) REFERENCES `lop` (`id_lop`),
  ADD CONSTRAINT `fk_hs_nh` FOREIGN KEY (`id_nh`) REFERENCES `namhoc` (`id_nh`);

--
-- Constraints for table `luong`
--
ALTER TABLE `luong`
  ADD CONSTRAINT `fk_luong_nv` FOREIGN KEY (`id_nv`) REFERENCES `giaovien` (`id_nv`);

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `fk_nv_cv` FOREIGN KEY (`id_cv`) REFERENCES `chucvu` (`id_cv`);

--
-- Constraints for table `phanconggd`
--
ALTER TABLE `phanconggd`
  ADD CONSTRAINT `fk_pcgd_hk` FOREIGN KEY (`id_hk`) REFERENCES `hocky` (`id_hk`),
  ADD CONSTRAINT `fk_pcgd_lop` FOREIGN KEY (`id_lop`) REFERENCES `lop` (`id_lop`),
  ADD CONSTRAINT `fk_pcgd_mh` FOREIGN KEY (`id_mh`) REFERENCES `monhoc` (`id_mh`),
  ADD CONSTRAINT `fk_pcgd_nv` FOREIGN KEY (`id_nv`) REFERENCES `giaovien` (`id_nv`);

--
-- Constraints for table `studentaccount`
--
ALTER TABLE `studentaccount`
  ADD CONSTRAINT `fk_hs_account` FOREIGN KEY (`id_hs`) REFERENCES `hocsinh` (`id_hs`);

--
-- Constraints for table `teacheraccount`
--
ALTER TABLE `teacheraccount`
  ADD CONSTRAINT `fk_nv_account` FOREIGN KEY (`id_nv`) REFERENCES `giaovien` (`id_nv`);

--
-- Constraints for table `thoikhoabieu`
--
ALTER TABLE `thoikhoabieu`
  ADD CONSTRAINT `fk1` FOREIGN KEY (`id_nv`) REFERENCES `giaovien` (`id_nv`),
  ADD CONSTRAINT `fk2` FOREIGN KEY (`id_mh`) REFERENCES `monhoc` (`id_mh`),
  ADD CONSTRAINT `fk3` FOREIGN KEY (`id_lop`) REFERENCES `lop` (`id_lop`),
  ADD CONSTRAINT `fk4` FOREIGN KEY (`id_ph`) REFERENCES `phonghoc` (`id_ph`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
