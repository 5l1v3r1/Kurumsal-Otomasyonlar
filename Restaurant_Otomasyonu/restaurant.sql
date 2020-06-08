-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Anamakine: localhost
-- Üretim Zamanı: 15 Mayıs 2016 saat 18:00:18
-- Sunucu sürümü: 5.5.8
-- PHP Sürümü: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Veritabanı: `restaurant`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `musteriler`
--

CREATE TABLE IF NOT EXISTS `musteriler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adi_soyadi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `tel` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `masa_konumu` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `kisi_sayisi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `giris_cikis` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci AUTO_INCREMENT=3 ;

--
-- Tablo döküm verisi `musteriler`
--

INSERT INTO `musteriler` (`id`, `adi_soyadi`, `tel`, `masa_konumu`, `kisi_sayisi`, `giris_cikis`) VALUES
(1, 'Kaan BAYRAK', '0532 323 23 23', 'Masa 4', '5', '0'),
(2, 'Murat TOK', '0535 333 33 33', 'Masa 2', '10', '1');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uyeler`
--

CREATE TABLE IF NOT EXISTS `uyeler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kadi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `sifre` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `email` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `unvan` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci AUTO_INCREMENT=3 ;

--
-- Tablo döküm verisi `uyeler`
--

INSERT INTO `uyeler` (`id`, `kadi`, `sifre`, `email`, `unvan`) VALUES
(1, 'ali29', '1', 'ali@gmail.com', 'Çalışan'),
(2, 'selim', '1', 'selim@gmail.com', 'Müdür');
