-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Anamakine: localhost
-- Üretim Zamanı: 10 Haz 2015, 06:35:18
-- Sunucu sürümü: 5.5.16
-- PHP Sürümü: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Veritabanı: `personel`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `kadi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `sifre` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `admin`
--

INSERT INTO `admin` (`kadi`, `sifre`) VALUES
('admin', 123456);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `calisan`
--

CREATE TABLE IF NOT EXISTS `calisan` (
  `ad` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `soyad` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `cinsiyet` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `tc` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `adres` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `sifre` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `telefon` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `ucret` int(50) NOT NULL,
  UNIQUE KEY `tc` (`tc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `calisan`
--

INSERT INTO `calisan` (`ad`, `soyad`, `cinsiyet`, `tc`, `adres`, `sifre`, `telefon`, `ucret`) VALUES
('aysegül', 'bursa', 'BAYAN', '1234567895', 'Çorum', '789', '2134566789', 200),
('hatice', 'kurtt', 'BAYAN', '44491189134', 'istanbul', '123', '1234567789', 100),
('Feyzanur', 'Agri', 'BAYAN', '4567891234', 'kirikkale', '789', '1234567894', 100),
('sena', 'olcar', 'BAYAN', '7794561234', 'kirikkale', '852', '123456789', 500),
('mert', 'coskun', 'BAY', '7894561234', 'edirne', '1230', '0123456789', 100),
('burak', 'kurt', 'BAY', '78945612356', 'istanbul', '201', '0523145675', 321);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
