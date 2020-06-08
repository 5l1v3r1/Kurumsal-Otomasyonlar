-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Anamakine: localhost
-- Üretim Zamanı: 04 Haziran 2016 saat 10:00:56
-- Sunucu sürümü: 5.5.8
-- PHP Sürümü: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Veritabanı: `ariza_takip`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `musteriler`
--

CREATE TABLE IF NOT EXISTS `musteriler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adi_soyadi` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `turu` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `nedeni` text COLLATE utf8_turkish_ci,
  `durumu` text COLLATE utf8_turkish_ci,
  `tarihi` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `ucreti` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `islemler` text COLLATE utf8_turkish_ci,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci AUTO_INCREMENT=11 ;

--
-- Tablo döküm verisi `musteriler`
--

INSERT INTO `musteriler` (`id`, `adi_soyadi`, `turu`, `nedeni`, `durumu`, `tarihi`, `ucreti`, `islemler`) VALUES
(3, 'Mehmet DAL', 'Tablet', 'Ekran kırılmış', 'Cihaz Teslim Edildi', '28 Mayıs 2016', '50 TL', 'Ekran Değişitirildi'),
(4, 'Ebubekir', 'Cep Telefonu', 'Çok fazla ısnıyor.	', 'Arıza tespit ediliyor.', '31 Mayıs 2016', '75 TL', ''),
(5, 'Tolga ÖZKILIÇ', 'Tablet', 'Kendi kendine kapanıyor.', 'Parça Bekleniyor.	', '31 Mayıs 2016', '100 TL', NULL),
(6, 'Mukadtes SERT', 'Bilgisayar', 'Ekran kartı yandı. Cihaz aşırı ısınıyor.', 'Teknik destek sağlanıyor.	', '05 Haziran 2016', '350 TL', 'Arıza tespit ediliyor.'),
(7, 'Canberk GÜNEŞ', 'Cep Telefonu', 'Ekranı kırıık.', 'Parça bekleniyor', '09 Haziran 2016', '100 TL', 'Ekran değişti.'),
(8, 'Habibe ÖZTÜRK', 'Cep Telefonu', 'Çok fazla ısnıyor.	', 'Arıza tespit ediliyor.', '31 Mayıs 2016', '75 TL', ''),
(9, 'asassfafssf', 'Cep Telefonu', 'Ekranı kırık', 'Teknik serviste', '08 Haziran 2016', '1000 TL', ''),
(10, 'Engin DAL', 'Bilgisayar', 'İşlemcisi arızalı. DVD-ROM açılıp kapanmıyor.', 'Teknik Ekip Bakıyor.', '2 Haziran 2016', '400 TL', '');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uyeler`
--

CREATE TABLE IF NOT EXISTS `uyeler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adi_soyadi` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `kadi` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `sifre` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `turu` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci AUTO_INCREMENT=7 ;

--
-- Tablo döküm verisi `uyeler`
--

INSERT INTO `uyeler` (`id`, `adi_soyadi`, `kadi`, `sifre`, `email`, `turu`) VALUES
(1, 'Murat KOC', 'murat', '1', 'murat@gmail.com', 'Müşteri'),
(2, 'Canberk DAL', 'canberk', '1', 'canberk@gmail.com', 'Müdür'),
(3, 'Enes ŞAHİNER', 'enes', '1', 'enes@gmail.com', 'Müşteri'),
(4, 'Mehmet DAL', 'mehmet', '1', 'mehmet@gmail.com', 'Müşteri'),
(5, 'Ebubekir YAŞAR', 'Ebubekir', '123', 'ebubekir@gmail.com', 'Müşteri'),
(6, 'Canberk GÜNEŞ', 'SakallıAdamm', '123', 'canberkg@gmail.com', 'Müşteri');
