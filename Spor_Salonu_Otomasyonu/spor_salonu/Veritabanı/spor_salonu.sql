-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 02 Haz 2016, 17:15:36
-- Sunucu sürümü: 5.7.9
-- PHP Sürümü: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `spor.salonu`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personel`
--

DROP TABLE IF EXISTS `personel`;
CREATE TABLE IF NOT EXISTS `personel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kadi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `sifre` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `adi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `soyadi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `tc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `tel` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `cinsiyet` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `pozisyon` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `egitim_durumu` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `bolum` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `b_tarihi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `personel`
--

INSERT INTO `personel` (`id`, `kadi`, `sifre`, `adi`, `soyadi`, `tc`, `tel`, `cinsiyet`, `pozisyon`, `egitim_durumu`, `bolum`, `b_tarihi`) VALUES
(3, 'Ali', '123456', 'Ali', 'Taş', '12345678911', '05335117869', 'Bay', 'Müdür', 'Lisans', '...', '...');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uyeler`
--

DROP TABLE IF EXISTS `uyeler`;
CREATE TABLE IF NOT EXISTS `uyeler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adi` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `soyadi` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `dtarihi` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `tc` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `hastalik` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `tel` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `adres` text COLLATE utf8mb4_turkish_ci,
  `aranacak_adi` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `aranacak_soyadi` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `aranacak_tel` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `aranacak_adres` text COLLATE utf8mb4_turkish_ci,
  `cinsiyet` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `boy` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `kilo` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `yas` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `kayit_tarihi` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `programi` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `kayit_suresi` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `uyeler`
--

INSERT INTO `uyeler` (`id`, `adi`, `soyadi`, `dtarihi`, `tc`, `hastalik`, `tel`, `adres`, `aranacak_adi`, `aranacak_soyadi`, `aranacak_tel`, `aranacak_adres`, `cinsiyet`, `boy`, `kilo`, `yas`, `kayit_tarihi`, `programi`, `kayit_suresi`) VALUES
(11, 'ömer', 'kılıç', '17.08.1996', '14143150963', '...', '...', '...', '..', '...', '...', '.', 'Bay', '185', '75', '20', '15.05.2015', 'Program 3', '3 Aylık');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
