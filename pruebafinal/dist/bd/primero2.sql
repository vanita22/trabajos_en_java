-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 29-12-2017 a las 14:46:36
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `conexion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `primero2`
--

CREATE TABLE IF NOT EXISTS `primero2` (
  `NOMBRE` varchar(100) NOT NULL,
  `TELEFONO` int(11) NOT NULL,
  `CIUDAD` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `primero2`
--

INSERT INTO `primero2` (`NOMBRE`, `TELEFONO`, `CIUDAD`) VALUES
('VANESSA PEREZ', 1234567887, 'SANTIAGO'),
('MAGDALENA CASTRO', 8745632, 'SANTIAGO'),
('RODRIGO CASTRO', 54698712, 'PUERTO MONTT');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
