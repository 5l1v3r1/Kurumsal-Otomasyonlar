-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Anamakine: localhost
-- Üretim Zamanı: 30 May 2016, 12:44:34
-- Sunucu sürümü: 5.6.12-log
-- PHP Sürümü: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Veritabanı: `apart`
--
CREATE DATABASE IF NOT EXISTS `apart` DEFAULT CHARACTER SET utf8 COLLATE utf8_turkish_ci;
USE `apart`;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanicilar`
--

CREATE TABLE IF NOT EXISTS `kullanicilar` (
  `id` int(11) NOT NULL,
  `kadi` text COLLATE utf8_turkish_ci NOT NULL,
  `sifre` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `kullanicilar`
--

INSERT INTO `kullanicilar` (`id`, `kadi`, `sifre`) VALUES
(1, 'personel', 'personel123'),
(2, 'muhasebe', 'muhasebe123'),
(3, 'ogrenci', 'ogrenci123');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `mesajlar`
--

CREATE TABLE IF NOT EXISTS `mesajlar` (
  `msj_odano` text COLLATE utf8_turkish_ci NOT NULL,
  `msj_adisoyadi` text COLLATE utf8_turkish_ci NOT NULL,
  `mesaj` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `mesajlar`
--

INSERT INTO `mesajlar` (`msj_odano`, `msj_adisoyadi`, `mesaj`) VALUES
('122', 'SSeçill', 'dvsdvdf'),
('1520', 'özlem', 'oda temizlenmiyor'),
('25', 'ayse', 'scfsrfsrf');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `muhasebe`
--

CREATE TABLE IF NOT EXISTS `muhasebe` (
  `ay` text COLLATE utf8_turkish_ci NOT NULL,
  `islem_tarihi` text COLLATE utf8_turkish_ci NOT NULL,
  `tutar` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ogrenci`
--

CREATE TABLE IF NOT EXISTS `ogrenci` (
  `ogr_id` int(11) NOT NULL AUTO_INCREMENT,
  `ogr_tc` text COLLATE utf8_turkish_ci NOT NULL,
  `ogr_ad` text COLLATE utf8_turkish_ci NOT NULL,
  `ogr_soyad` text COLLATE utf8_turkish_ci NOT NULL,
  `ogr_okul` text COLLATE utf8_turkish_ci NOT NULL,
  `ogr_bolum` text COLLATE utf8_turkish_ci NOT NULL,
  `ogr_tel` text COLLATE utf8_turkish_ci NOT NULL,
  `ogr_dno` text COLLATE utf8_turkish_ci NOT NULL,
  `ogr_yno` text COLLATE utf8_turkish_ci NOT NULL,
  `ogr_borc` text COLLATE utf8_turkish_ci NOT NULL,
  `ogr_odeme` text COLLATE utf8_turkish_ci NOT NULL,
  `ogr_taksit` text COLLATE utf8_turkish_ci NOT NULL,
  `ogr_depozito` text COLLATE utf8_turkish_ci NOT NULL,
  `ogr_aciklama` text COLLATE utf8_turkish_ci NOT NULL,
  `odenmis_taksit_sayisi` text COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`ogr_id`),
  KEY `ogr_id` (`ogr_id`),
  KEY `ogr_id_2` (`ogr_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci AUTO_INCREMENT=17 ;

--
-- Tablo döküm verisi `ogrenci`
--

INSERT INTO `ogrenci` (`ogr_id`, `ogr_tc`, `ogr_ad`, `ogr_soyad`, `ogr_okul`, `ogr_bolum`, `ogr_tel`, `ogr_dno`, `ogr_yno`, `ogr_borc`, `ogr_odeme`, `ogr_taksit`, `ogr_depozito`, `ogr_aciklama`, `odenmis_taksit_sayisi`) VALUES
(11, '12345678901', 'ozlem', 'kuscu', 'kkü', 'böte', '05334445577', '1', '1', '1200', 'kredi', '5', '100', 'asajksjka', ''),
(13, '141111', 'Seçil ', 'ekici', 'kkü', 'böte', '5455', '2', '1', '125', 'nakit', '3', '150', 'fsdf', ''),
(16, '12345', 'gamze', 'kuscu', 'kkü', 'böte', '5546395825', '6', '2', '1200', 'nakit', '5', '150', 'asas', '0');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
