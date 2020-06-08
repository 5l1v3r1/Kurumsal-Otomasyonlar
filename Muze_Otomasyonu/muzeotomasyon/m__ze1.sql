-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 27 May 2016, 18:21:02
-- Sunucu sürümü: 5.6.17
-- PHP Sürümü: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Veritabanı: `müze1`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `eserler`
--

CREATE TABLE IF NOT EXISTS `eserler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `EserAdi` varchar(100) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Kategori` varchar(100) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `personel` varchar(100) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Yil` year(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci AUTO_INCREMENT=19 ;

--
-- Tablo döküm verisi `eserler`
--

INSERT INTO `eserler` (`id`, `EserAdi`, `Kategori`, `personel`, `Yil`) VALUES
(1, 'kil tabletler', 'Orta CaĞ Eserleri', 'Ramazan ÇETİN', 1994),
(2, 'resimler', 'Orta Çağ Eserleri', 'Ramazan ÇETİN', 1994),
(3, 'yaz?tlar', 'Dini Eserler', 'Mehmet', 2004),
(4, 'resimler', 'Tarihi Eserler', 'Ahmet ', 2000),
(7, 'fdhg', 'Ta? Ça?? Eserleri', '?brahim', 2007),
(9, 'paralar', 'Bizans ?mparatorlu?u Eserleri ', '?smail', 2005),
(11, 'yaz?tlar3', 'Yak?n Ça? Eserleri', 'Mehmet', 2001),
(17, 'gfhf', 'Dini Eserler', 'Mehmet', 2000);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `giriscikis`
--

CREATE TABLE IF NOT EXISTS `giriscikis` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Ad` text COLLATE utf8mb4_turkish_ci,
  `Soyad` text COLLATE utf8mb4_turkish_ci,
  `GirisTarihi` varchar(100) COLLATE utf8mb4_turkish_ci NOT NULL,
  `GirisSaati` varchar(100) COLLATE utf8mb4_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci AUTO_INCREMENT=10 ;

--
-- Tablo döküm verisi `giriscikis`
--

INSERT INTO `giriscikis` (`id`, `Ad`, `Soyad`, `GirisTarihi`, `GirisSaati`) VALUES
(3, 'mehmet', 'uysal', '2015 - 2 - 3', '17:31'),
(5, 'deniz', 'mert', '2015 - 2 - 4', '19:56'),
(6, 'elif', 'ya?mur', '2014 - 4 - 2', '23:34'),
(7, 'harun', 'aydo?an', '2015 - 8 - 7', '01:12'),
(8, 'salla', 'kerim', '2015 - 4 - 2', '17:30'),
(9, 'xv ', 'c ', '2016 - 1 - 1', '19:14');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personeller`
--

CREATE TABLE IF NOT EXISTS `personeller` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Ad` text COLLATE utf8mb4_turkish_ci,
  `Soyad` text COLLATE utf8mb4_turkish_ci,
  `No` varchar(10) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Kodu` varchar(5) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Tel` varchar(11) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Adre` varchar(100) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Eserler` varchar(100) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci AUTO_INCREMENT=13 ;

--
-- Tablo döküm verisi `personeller`
--

INSERT INTO `personeller` (`id`, `Ad`, `Soyad`, `No`, `Kodu`, `Tel`, `Adre`, `Eserler`) VALUES
(1, 'Mehmet', 'ÇET?N', '16', '12345', '05467896534', 'BURSA', 'Yakın Çağ Eserleri'),
(10, 'AHMET', 'UYSAL', '01', '1', '2656545126', 'BURSA', 'TARİHİ ESERLER'),
(11, 'ismail', 'laaaa', '12365477', '10', '0511546412', 'vhggnbvjm', 'Tarihi Eserler');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `rezervasyon`
--

CREATE TABLE IF NOT EXISTS `rezervasyon` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Ad` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `Soyad` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `GirisTarihi` varchar(100) COLLATE utf8mb4_turkish_ci NOT NULL,
  `GirisSaati` varchar(100) COLLATE utf8mb4_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci AUTO_INCREMENT=9 ;

--
-- Tablo döküm verisi `rezervasyon`
--

INSERT INTO `rezervasyon` (`id`, `Ad`, `Soyad`, `GirisTarihi`, `GirisSaati`) VALUES
(1, 'kerim', 'aslan', '2015-02-08', '15:00'),
(2, 'hakan', 'ç?nar', '2015 - 2 - 4', '23:14'),
(3, 'hale', 'demir', '2013 - 3 - 3', '11:00'),
(4, 'ramazan', 'uysal', '2015 - 2 - 3', '10:00'),
(5, 'haydar', 'aydo?an', '2014 - 5 - 3', '13:30'),
(6, 'salla', 'kerim', '2015 - 2 - 3', '10:30'),
(7, ' chvbbc', 'nfbxvbc', '2014 - 3 - 3', '13:00'),
(8, 'kmö', 'd bc', '2016 - 1 - 1', '09:00');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uyeler`
--

CREATE TABLE IF NOT EXISTS `uyeler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Ad` text COLLATE utf8mb4_turkish_ci,
  `Soyad` text COLLATE utf8mb4_turkish_ci,
  `Cinsiyet` text COLLATE utf8mb4_turkish_ci,
  `Kadi` varchar(100) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Sifre` varchar(100) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci AUTO_INCREMENT=6 ;

--
-- Tablo döküm verisi `uyeler`
--

INSERT INTO `uyeler` (`id`, `Ad`, `Soyad`, `Cinsiyet`, `Kadi`, `Sifre`) VALUES
(1, 'Fatmanur', 'UYSAL', 'Bayan', 'fatma', '123'),
(2, 'mehmet', 'uysal', 'Bay', 'mehmet', '12345'),
(3, 'haydar', 'aydo?an', 'Bay', 'haydar', '1576'),
(4, 'salla', 'salla', 'Bayan', 'salla', 'salla'),
(5, 'fatmanur', 'uy', 'Bayan', 'fatmanur', '5126');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ziyaretsaatleri`
--

CREATE TABLE IF NOT EXISTS `ziyaretsaatleri` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Gunler` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `TarihiEserler` varchar(100) COLLATE utf8mb4_turkish_ci NOT NULL,
  `SanatsalEserler` varchar(100) COLLATE utf8mb4_turkish_ci NOT NULL,
  `DiniEserler` varchar(100) COLLATE utf8mb4_turkish_ci NOT NULL,
  `YakinCagEserleri` varchar(100) COLLATE utf8mb4_turkish_ci NOT NULL,
  `OrtaCagEserleri` varchar(100) COLLATE utf8mb4_turkish_ci NOT NULL,
  `TasCagiEserleri` varchar(100) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Romaİmparatorlugu` varchar(100) COLLATE utf8mb4_turkish_ci NOT NULL,
  `Bizansİmparatorlugu` varchar(100) COLLATE utf8mb4_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci AUTO_INCREMENT=7 ;

--
-- Tablo döküm verisi `ziyaretsaatleri`
--

INSERT INTO `ziyaretsaatleri` (`id`, `Gunler`, `TarihiEserler`, `SanatsalEserler`, `DiniEserler`, `YakinCagEserleri`, `OrtaCagEserleri`, `TasCagiEserleri`, `Romaİmparatorlugu`, `Bizansİmparatorlugu`) VALUES
(1, 'Pazartesi', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00'),
(2, 'Salı', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00'),
(3, 'Çarşamba', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00'),
(4, 'Perşembe', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00'),
(5, 'Cuma', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00'),
(6, 'Cumartesi', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00', '09:00-11:00\r\n13:00-16:00');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
