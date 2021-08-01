-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 14, 2018 at 06:06 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dbsurat`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_jabatan`
--

CREATE TABLE IF NOT EXISTS `data_jabatan` (
  `Kode_Jabatan` varchar(10) NOT NULL,
  `Jabatan` varchar(30) NOT NULL,
  PRIMARY KEY (`Kode_Jabatan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_jabatan`
--

INSERT INTO `data_jabatan` (`Kode_Jabatan`, `Jabatan`) VALUES
('JN-0001', 'Lurah'),
('JN-0002', 'Sekretaris Lurah'),
('JN-0003', 'Pegawai');

-- --------------------------------------------------------

--
-- Table structure for table `data_karyawan`
--

CREATE TABLE IF NOT EXISTS `data_karyawan` (
  `NIK` varchar(15) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Tempat_lahir` varchar(30) NOT NULL,
  `Tgl_lahir` varchar(12) NOT NULL,
  `Jenkel` varchar(10) NOT NULL,
  `Agama` varchar(10) NOT NULL,
  `Pendidikan` varchar(6) NOT NULL,
  `Jabatan` varchar(20) NOT NULL,
  `Status` varchar(15) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `No_Telp` varchar(13) NOT NULL,
  `Tgl_masuk` varchar(12) NOT NULL,
  `St_kerja` varchar(15) NOT NULL,
  PRIMARY KEY (`NIK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_karyawan`
--

INSERT INTO `data_karyawan` (`NIK`, `Nama`, `Tempat_lahir`, `Tgl_lahir`, `Jenkel`, `Agama`, `Pendidikan`, `Jabatan`, `Status`, `Alamat`, `No_Telp`, `Tgl_masuk`, `St_kerja`) VALUES
('0309000001', 'Agus Letahid', 'Jakarta', '05-08-1968', 'Laki-Laki', 'Islam', 'S1', 'Lurah', 'Menikah', 'Bogor', '098765437', '10-03-2009', 'Aktif'),
('0309000002', 'Achmad Syarief', 'Jakarta', '21-08-1968', 'Laki-Laki', 'Islam', 'S1', 'Sekretaris Lurah', 'Menikah', 'Ciganjur', '089765768', '03-03-2009', 'Aktif'),
('0309000003', 'Ahmad Barry', 'Jakarta', '06-08-1992', 'Laki-Laki', 'Islam', 'D3', 'Pegawai', 'Menikah', 'Cijantung', '0987680789', '14-03-2016', 'Aktif');

-- --------------------------------------------------------

--
-- Table structure for table `data_surat_keluar`
--

CREATE TABLE IF NOT EXISTS `data_surat_keluar` (
  `No_Surat` varchar(50) NOT NULL,
  `Tgl_Surat` varchar(50) NOT NULL,
  `Jenis_Surat` varchar(50) NOT NULL,
  `Instansi_Tujuan` varchar(50) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `Perihal` varchar(100) NOT NULL,
  `Isi_Surat` varchar(200) NOT NULL,
  PRIMARY KEY (`No_Surat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_surat_keluar`
--

INSERT INTO `data_surat_keluar` (`No_Surat`, `Tgl_Surat`, `Jenis_Surat`, `Instansi_Tujuan`, `Alamat`, `Perihal`, `Isi_Surat`) VALUES
('12345', '05-07-2018', 'Penting', 'Kecamatan', 'Pasar Minggu', 'Undangan Apel', 'Upacara Bendera 17 Agustus');

-- --------------------------------------------------------

--
-- Table structure for table `data_surat_masuk`
--

CREATE TABLE IF NOT EXISTS `data_surat_masuk` (
  `No_Surat` varchar(50) NOT NULL,
  `Tgl_Surat` varchar(50) NOT NULL,
  `Jenis_Surat` varchar(50) NOT NULL,
  `Dari_Instansi` varchar(50) NOT NULL,
  `Disposisi_Surat` varchar(50) NOT NULL,
  `Perihal` varchar(100) NOT NULL,
  PRIMARY KEY (`No_Surat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_surat_masuk`
--

INSERT INTO `data_surat_masuk` (`No_Surat`, `Tgl_Surat`, `Jenis_Surat`, `Dari_Instansi`, `Disposisi_Surat`, `Perihal`) VALUES
('12345', '01-07-2018', 'Penting', 'Kominfo', 'Lurah', 'Undangan Rapat');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  `hak_akses` varchar(20) NOT NULL,
  PRIMARY KEY (`hak_akses`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`, `hak_akses`) VALUES
('Lurah', '123', 'Lurah'),
('admin', 'admin', 'Master'),
('Pegawai', '123', 'Pegawai'),
('Sekretaris', '123', 'Sekretaris');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
