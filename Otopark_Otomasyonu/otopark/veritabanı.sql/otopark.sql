-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Anamakine: localhost
-- Üretim Zamanı: 02 Haziran 2016 saat 08:05:29
-- Sunucu sürümü: 5.5.8
-- PHP Sürümü: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Veritabanı: `otopark`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `araclar`
--

CREATE TABLE IF NOT EXISTS `araclar` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ad_soyad` varchar(90) COLLATE utf8_turkish_ci DEFAULT NULL,
  `plaka` varchar(30) COLLATE utf8_turkish_ci DEFAULT NULL,
  `marka` varchar(30) COLLATE utf8_turkish_ci DEFAULT NULL,
  `renk` varchar(30) COLLATE utf8_turkish_ci DEFAULT NULL,
  `cep_no` varchar(15) COLLATE utf8_turkish_ci DEFAULT NULL,
  `giris_cikis` tinyint(1) DEFAULT NULL,
  `tarihi` varchar(30) COLLATE utf8_turkish_ci DEFAULT NULL,
  `saati` varchar(30) COLLATE utf8_turkish_ci DEFAULT NULL,
  `tipi` varchar(30) COLLATE utf8_turkish_ci DEFAULT NULL,
  `ucret` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `toplam_ucret` int(11) DEFAULT NULL,
  `yeri` varchar(30) COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci AUTO_INCREMENT=12 ;

--
-- Tablo döküm verisi `araclar`
--

INSERT INTO `araclar` (`id`, `ad_soyad`, `plaka`, `marka`, `renk`, `cep_no`, `giris_cikis`, `tarihi`, `saati`, `tipi`, `ucret`, `toplam_ucret`, `yeri`) VALUES
(1, 'Alper ÇAM', '71 BA 197', 'opel', 'beyaz', '0545 555 50 50', 0, '29.05.2016', '20.00', 'Otomobil', '5', 44, 'A2'),
(2, 'Mahmut YÜRÜR', '06 EV 512', 'fiat', 'Kırmızı', '0545 785 42 56', 0, '25.05.2016', '10.00', 'Otomobil', '5', 25, 'A5'),
(3, 'Zeynep SOYDAN', '22 AA 022', 'Opel', 'Pembe', '0532 333 33 33', 0, '29 Mayıs 2016', '18.57', 'Otomobil', '5', 50, 'A1'),
(4, 'Nazlı KOÇ', '25 FA 542', 'audi', 'Gri', '0535 485 41 52', 0, '30 Mayıs 2016', '19.09', 'Otomobil', '5', 50, 'A10'),
(5, 'Ali AKÇA', '45 ACB 14', 'Volvo', 'siyah', '0542 452 45 12', 0, '30 Mayıs 2016', '22.08', 'Kamyon', '5', 0, 'A12'),
(6, 'Ahmet KORKMAZ', '62 AY 192', 'Fiat', 'Turuncu', '0535 851 45 63', 0, '30 Mayıs 2016', '22.11', 'Otomobil', '5', 100, 'A9'),
(7, 'Enes ŞAHİNER', '66 KL 438', 'Opel', 'Gri', '0545 553 5615', 0, '31 Mayıs 2016', '10.00', 'Otomobil', '5', 1, 'A3'),
(8, 'mehmet KURT', '35 AA 035', 'MERCEDES', 'Siyah', '0535 55 55 55', 0, '31 Mayıs 2016', '10.41', 'Kamyon', '5', 0, 'A12'),
(9, 'Ali KARA', '06 AA 066', 'Renault', 'Mavi', '0535 555 55 55', 0, '31 Mayıs 2016', '10.46', 'Otomobil', '5', 0, 'A12'),
(10, 'Mustafa Özcan', '74 BA 125', 'Opel', 'beyaz', '0545 885 74 52', 1, '31 Mayıs 2016', '11.20', 'Otomobil', '5', 0, 'A3'),
(11, 'Ahmet ÖZBEK', '66 AS 066', 'Fiat', 'Siyah', '05455535615', 0, '31 Mayıs 2016', '11.23', 'Otomobil', '5', 0, 'A2');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `arac_hesabi`
--

CREATE TABLE IF NOT EXISTS `arac_hesabi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `plaka` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `tutar` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci AUTO_INCREMENT=1 ;

--
-- Tablo döküm verisi `arac_hesabi`
--


-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uyeler`
--

CREATE TABLE IF NOT EXISTS `uyeler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kadi` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `parola` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `email` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `unvan` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci AUTO_INCREMENT=6 ;

--
-- Tablo döküm verisi `uyeler`
--

INSERT INTO `uyeler` (`id`, `kadi`, `parola`, `email`, `unvan`) VALUES
(1, 'Mustafa71', '1', 'mustafa@gmail.com', 'Müdür'),
(2, 'enes66', '1', 'eness@hotmail.com', 'Çalışan'),
(3, 'ali', '1', 'ali@hotmail.com', NULL),
(4, 'omer', '1', 'omer@gmail.com', ''),
(5, 'emre', '1', 'emre@hotmail.com', 'Çalışan');
