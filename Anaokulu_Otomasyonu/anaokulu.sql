-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 02 Haz 2016, 14:39:49
-- Sunucu sürümü: 5.7.9
-- PHP Sürümü: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `anaokulu`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanici`
--

DROP TABLE IF EXISTS `kullanici`;
CREATE TABLE IF NOT EXISTS `kullanici` (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `Kadi` varchar(45) COLLATE utf8mb4_turkish_ci NOT NULL,
  `parola` varchar(45) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Ad` varchar(45) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Soyad` varchar(45) COLLATE utf8mb4_turkish_ci NOT NULL,
  `tc` varchar(45) CHARACTER SET utf8 NOT NULL,
  `telefon` varchar(45) CHARACTER SET utf8 NOT NULL,
  `adres` varchar(45) COLLATE utf8mb4_turkish_ci NOT NULL,
  `yetki` varchar(45) COLLATE utf8mb4_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `kullanici`
--

INSERT INTO `kullanici` (`id`, `Kadi`, `parola`, `Ad`, `Soyad`, `tc`, `telefon`, `adres`, `yetki`) VALUES
(17, 'yonetici', '1', 'Yonetici', 'Yonetici', '12312412214', '+90(555)555 5555', 'kirikkale', '1'),
(18, 'Ogretmen', '1234', 'Ogretmen', 'Ogretmen', '12345678912', '+90(555)555 5555', 'kirikkale', '0'),
(19, 'edasenol', '1234', 'Eda Nur', 'SENOL', '12345678912', '+90(234)234 3243', 'Ankara', '1'),
(20, 'ufuksahin', '1234', 'Ufuk', 'SAHIN', '12345678912', '+90(312)312 3213', 'Ankara', '0'),
(23, 'ufuk', '12345', 'ufuk', 'sahin', '21412421412', '+90(545)866 6589', 'k?r?kkale', '0'),
(24, 'deneme', '12345', 'deneme', 'deneme', '12345678999', '+90(123)213 2132', 'asaasda', '1');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ogrenci`
--

DROP TABLE IF EXISTS `ogrenci`;
CREATE TABLE IF NOT EXISTS `ogrenci` (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `oadi` varchar(45) NOT NULL,
  `osoyadi` varchar(45) NOT NULL,
  `otc` varchar(45) NOT NULL,
  `dyer` varchar(45) NOT NULL,
  `dtarih` varchar(45) NOT NULL,
  `ktarih` varchar(45) NOT NULL,
  `vadi` varchar(45) NOT NULL,
  `vsoyadi` varchar(45) NOT NULL,
  `telefon` varchar(45) NOT NULL,
  `adres` varchar(45) NOT NULL,
  `Cinsiyet` tinyint(3) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `ogrenci`
--

INSERT INTO `ogrenci` (`id`, `oadi`, `osoyadi`, `otc`, `dyer`, `dtarih`, `ktarih`, `vadi`, `vsoyadi`, `telefon`, `adres`, `Cinsiyet`) VALUES
(13, 'Ufuk', 'Sahin', '12345678911', 'Ankara', '31/01/1995', '30/05/2016', 'Ufuk', 'Sahin', '(554) 838 3369', 'K?r?kkale', 1),
(14, 'Eda Nur', 'Senol', '12345678911', 'Ankara', '18/02/1996', '30/05/1996', 'Eda Nur', 'Senol', '(545) 800 7449', 'K?r?kkale', 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
