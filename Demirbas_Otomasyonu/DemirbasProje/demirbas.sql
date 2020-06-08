-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Anamakine: localhost
-- Üretim Zamanı: 01 Haz 2016, 20:21:28
-- Sunucu sürümü: 5.7.12-log
-- PHP Sürümü: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Veritabanı: `demirbas`
--
CREATE DATABASE IF NOT EXISTS `demirbas` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `demirbas`;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `bolumezimmetler`
--

CREATE TABLE IF NOT EXISTS `bolumezimmetler` (
  `BolumZimmetID` int(11) NOT NULL AUTO_INCREMENT,
  `DemirbasID` int(11) DEFAULT NULL,
  `BolumAdi` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`BolumZimmetID`),
  UNIQUE KEY `BolumZimmetID_UNIQUE` (`BolumZimmetID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=12 ;

--
-- Tablo döküm verisi `bolumezimmetler`
--

INSERT INTO `bolumezimmetler` (`BolumZimmetID`, `DemirbasID`, `BolumAdi`) VALUES
(1, 6, '1. Kat'),
(3, 4, '1. Kat'),
(4, 6, '4.Kat Yemekhane'),
(5, 2, '2.Kat'),
(8, 6, '2.Kat'),
(9, 13, '5.Kat İnsan Kaynakları'),
(10, 10, '5.Kat İnsan Kaynakları'),
(11, 6, '3. Müdüriyet');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `bolumtanimlari`
--

CREATE TABLE IF NOT EXISTS `bolumtanimlari` (
  `BolumID` int(11) NOT NULL AUTO_INCREMENT,
  `BolumAdi` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`BolumID`),
  UNIQUE KEY `BolumID_UNIQUE` (`BolumID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=12 ;

--
-- Tablo döküm verisi `bolumtanimlari`
--

INSERT INTO `bolumtanimlari` (`BolumID`, `BolumAdi`) VALUES
(1, '1. Kat'),
(2, '2.Kat'),
(4, '3. Müdüriyet'),
(5, '4.Kat Yemekhane'),
(6, '5.Kat İnsan Kaynakları'),
(7, 'Zemin Kat Stok Birimi'),
(8, '-1. Kat Depo'),
(11, '6.kat Teras');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `calisanlar`
--

CREATE TABLE IF NOT EXISTS `calisanlar` (
  `CalisanID` int(11) NOT NULL AUTO_INCREMENT,
  `Adi` varchar(50) DEFAULT NULL,
  `Soyadi` varchar(100) DEFAULT NULL,
  `Gorevi` varchar(150) DEFAULT NULL,
  `Bolum` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CalisanID`),
  UNIQUE KEY `CalisanID_UNIQUE` (`CalisanID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=21 ;

--
-- Tablo döküm verisi `calisanlar`
--

INSERT INTO `calisanlar` (`CalisanID`, `Adi`, `Soyadi`, `Gorevi`, `Bolum`) VALUES
(6, 'Nihal', 'ÜÇKAN', 'Müdür', '3. Müdüriyet'),
(7, 'Süreyya ', 'YÜKSEL', 'Müdür', '5.Kat İnsan Kaynakları'),
(11, 'veli', 'demir', 'aşçı', '4.Kat Yemekhane'),
(14, 'Yıldız ', 'Tilbe', 'Yamak', '4.Kat Yemekhane'),
(15, 'Sezen', 'Aksu', 'Yardımcı', '5.Kat İnsan Kaynakları'),
(16, 'Demir', 'Demirkan', 'Mühendis', '1. Kat'),
(17, 'Serhat', 'ALTIOK', 'Asistan', '3. Müdüriyet'),
(18, 'Helen', 'DALİ', 'Baş Asistan', '3. Müdüriyet'),
(19, 'Salih', 'Altun', 'Ambar Memuru', '2.Kat'),
(20, 'ayşe', 'jhufyj', 'vjj', '1. Kat');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `demirbastanimlari`
--

CREATE TABLE IF NOT EXISTS `demirbastanimlari` (
  `demirbasID` int(11) NOT NULL AUTO_INCREMENT,
  `DemirbasAdi` varchar(150) DEFAULT NULL,
  `GrupAdi` varchar(100) DEFAULT NULL,
  `SeriNo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`demirbasID`),
  UNIQUE KEY `demirbasID_UNIQUE` (`demirbasID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=14 ;

--
-- Tablo döküm verisi `demirbastanimlari`
--

INSERT INTO `demirbastanimlari` (`demirbasID`, `DemirbasAdi`, `GrupAdi`, `SeriNo`) VALUES
(1, 'Asus L', 'Elektronik Cihazlar', '12345678'),
(2, 'HP PC', 'Elektronik Cihazlar', '1245788'),
(4, 'A Markası PC masası', 'Sarf Malzeme', '26598469'),
(6, 'Logitech mause', 'Elektronik Cihazlar', '123456'),
(9, 'lsdnkljsdhfk', 'Elektronik Cihazlar', '122'),
(10, 'Kinect', 'Elektronik Cihazlar', 'v09'),
(13, 'lenova', 'Elektronik Cihazlar', '78888457');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `gruptanimlari`
--

CREATE TABLE IF NOT EXISTS `gruptanimlari` (
  `GrupID` int(11) NOT NULL AUTO_INCREMENT,
  `GrupAdi` varchar(150) DEFAULT NULL,
  `GrupTipi` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`GrupID`),
  UNIQUE KEY `GrupID_UNIQUE` (`GrupID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

--
-- Tablo döküm verisi `gruptanimlari`
--

INSERT INTO `gruptanimlari` (`GrupID`, `GrupAdi`, `GrupTipi`) VALUES
(1, 'Admin', 'Kullanıcı'),
(2, 'User', 'Kullanıcı'),
(3, 'Elektronik Cihazlar', 'Demirbaş'),
(4, 'Sarf Malzeme', 'Demirbaş'),
(8, 'Demirbaş Malzemeler', 'Demirbaş'),
(9, 'Sensör', 'Demirbaş'),
(10, 'Harici Cihazlar', 'Demirbaş');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kisiyezimmetler`
--

CREATE TABLE IF NOT EXISTS `kisiyezimmetler` (
  `KisiZimmetID` int(11) NOT NULL AUTO_INCREMENT,
  `DemirbasID` int(11) DEFAULT NULL,
  `KisiAdi` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`KisiZimmetID`),
  UNIQUE KEY `KisiZimmetID_UNIQUE` (`KisiZimmetID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=15 ;

--
-- Tablo döküm verisi `kisiyezimmetler`
--

INSERT INTO `kisiyezimmetler` (`KisiZimmetID`, `DemirbasID`, `KisiAdi`) VALUES
(1, 2, 'Süreyya  YÜKSEL'),
(3, 1, 'Nihal ÜÇKAN'),
(4, 4, 'Sezen Aksu'),
(6, 6, 'Yıldız  Tilbe'),
(7, 2, 'Yıldız  Tilbe'),
(8, 9, 'veli demir'),
(9, 9, 'veli demir'),
(10, 10, 'Serha ALTIOK'),
(11, 1, 'Serha ALTIOK'),
(12, 10, 'Serha ALTIOK'),
(13, 6, 'Serha ALTIOK'),
(14, 4, 'Serha ALTIOK');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanicitanimlari`
--

CREATE TABLE IF NOT EXISTS `kullanicitanimlari` (
  `KullaniciID` int(11) NOT NULL AUTO_INCREMENT,
  `Adi` varchar(50) DEFAULT NULL,
  `Soyadi` varchar(100) DEFAULT NULL,
  `KullaniciAdi` varchar(50) DEFAULT NULL,
  `Gorevi` varchar(100) DEFAULT NULL,
  `Grup` varchar(150) DEFAULT NULL,
  `Sifre` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`KullaniciID`),
  UNIQUE KEY `KullaniciID_UNIQUE` (`KullaniciID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=15 ;

--
-- Tablo döküm verisi `kullanicitanimlari`
--

INSERT INTO `kullanicitanimlari` (`KullaniciID`, `Adi`, `Soyadi`, `KullaniciAdi`, `Gorevi`, `Grup`, `Sifre`) VALUES
(1, 'Nihal', 'Üçkan', 'n', 'Yazılım Uzmanı', 'Admin', '1'),
(3, 'Süreyya', 'Yüksel', 's', 'Yazılım Destek Uzmanı', 'Admin', '1'),
(4, 'ayşe', 'yılmaz', 'a', 'ambar memuru', 'User', '2'),
(5, 'elif', 'ARAS', 'e', 'Mal alım personeli', 'User', '2'),
(7, 'Ali', 'Yanar', 'ay', 'Muhasebe', 'Admin', '1'),
(8, 'Sezen', 'AKSU', 's', 'Sekreter', 'User', '2'),
(9, 'Serhat', 'Altıok', 's', 'Asistan', 'User', '2'),
(14, 'Gökhan', 'TÜRKMEN', 'g', 'Tamirci', 'Admin', '1');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
