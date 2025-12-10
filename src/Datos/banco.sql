-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 10-12-2025 a las 19:11:36
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `sistemadebanco`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE IF NOT EXISTS `administrador` (
  `id_admin` varchar(6) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `celular` varchar(15) DEFAULT NULL,
  `contrasena` varchar(50) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`id_admin`, `dni`, `nombre`, `apellido`, `direccion`, `celular`, `contrasena`, `activo`) VALUES
('ADM001', '00000000', 'Javier', 'Solis', 'Av. Administrador', '999999999', 'admin123', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `id_cliente` varchar(6) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `celular` varchar(9) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `contrasena` varchar(50) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `dni`, `nombre`, `apellido`, `direccion`, `celular`, `correo`, `contrasena`, `activo`) VALUES
('CLI001', '32164255', 'Alejandro', 'Mendoza', 'Av. Siempre Viva', '999999999', 'alejandro@mail.com', 'cli123', 1),
('CLI002', '45678912', 'Barbara', 'Cuba', 'Jr. Los Olivos', '974875175', 'bcuba@unsa.edu.pe', 'cli234', 1),
('CLI003', '40931398', 'Alina Sdenka', 'Guevara Achata', 'sad', '950839807', 'asgaga@hotmail.com', 'cli789', 1),
('CLI004', '41414141', 'Ricardo', 'Torres', 'Calle Las Lomas 123, Miraflores', '963258741', 'ricardo@example.com', 'cli456', 1),
('CLI005', '52525252', 'Daniela', 'Rojas', 'Av. Sol Naciente 456, Surco', '971829364', 'daniela@mail.pe', 'cli789', 1),
('CLI006', '63636363', 'Gabriel', 'Castro', 'Jr. Puno 789, Cercado de Lima', '954617283', 'gabriel@inbox.com', 'cli012', 1),
('CLI007', '74747474', 'Andrea', 'Salas', 'Urb. Los Álamos, La Molina', '938459610', 'andrea.s@web.com', 'cli345', 1),
('CLI008', '85858585', 'Felipe', 'Núñez', 'Av. Ejército, San Isidro', '917028495', 'felipe@mymail.net', 'cli678', 1),
('CLI009', '96969696', 'Patricia', 'Ríos', 'Res. Alameda, Chorrillos', '926374859', 'patricia@banco.com', 'cli901', 1),
('CLI010', '10101010', 'Renzo', 'Herrera', 'Jr. Chiclayo 333, Magdalena', '985746321', 'renzo.h@company.pe', 'cli234', 1),
('CLI011', '11211211', 'Jessica', 'Ramos', 'Psje. Húsares 555, Barranco', '947810293', 'jessica@mailservice.com', 'cli567', 1),
('CLI012', '12321232', 'Esteban', 'Vidal', 'Av. Pardo y Aliaga, San Borja', '903491827', 'estebanv@yahoo.com', 'cli890', 1),
('CLI013', '13431343', 'Laura', 'Melgar', 'Calle Arica 999, Breña', '972635481', 'laura.m@provider.net', 'cli1234', 1),
('CLI014', '14541454', 'Sergio', 'Soto', 'Av. Primavera 100, San Miguel', '961504372', 'sergios@mail.net', 'cli5678', 1),
('CLI015', '15651565', 'Vanesa', 'Pinedo', 'Urb. Santa Rosa, Callao', '950493821', 'vanesa.p@gmail.com', 'cli9012', 1),
('CLI016', '16761676', 'Martín', 'Vera', 'Jr. Cuzco 222, Jesús María', '949382710', 'martin.vera@mail.pe', 'cli3456', 1),
('CLI017', '17871787', 'Gisela', 'Morales', 'Av. La Marina, Pueblo Libre', '938271605', 'giselam@webmail.com', 'cli7890', 1),
('CLI018', '18981898', 'Diego', 'Quiroga', 'Calle Real 400, Lince', '927160594', 'diego.q@example.net', 'cli12345', 1),
('CLI019', '19091909', 'Nadia', 'Paz', 'Av. Larco, Trujillo', '916059483', 'nadia@mail.net', 'cli67890', 1),
('CLI020', '20202020', 'Alberto', 'Aguirre', 'Jr. Grau 101, Huancayo', '905948372', 'alberto@inbox.pe', 'cli1230', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta`
--

CREATE TABLE IF NOT EXISTS `cuenta` (
  `id_cuenta` varchar(20) NOT NULL,
  `tipo` varchar(20) DEFAULT NULL,
  `saldo` double DEFAULT '0',
  PRIMARY KEY (`id_cuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cuenta`
--

INSERT INTO `cuenta` (`id_cuenta`, `tipo`, `saldo`) VALUES
('CTA001', 'Ahorro', 5000),
('CTA002', 'Corriente', 14500),
('CTA003', 'Ahorro', 1500),
('CTA004', 'Corriente', 22000),
('CTA005', 'Ahorro', 8700),
('CTA006', 'Corriente', 3500),
('CTA007', 'Ahorro', 12000),
('CTA008', 'Corriente', 550),
('CTA009', 'Ahorro', 42000),
('CTA010', 'Corriente', 18000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE IF NOT EXISTS `empleado` (
  `id_empleado` varchar(6) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `celular` varchar(9) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `cargo` varchar(30) DEFAULT NULL,
  `contrasena` varchar(50) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id_empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`id_empleado`, `dni`, `nombre`, `apellido`, `direccion`, `celular`, `correo`, `cargo`, `contrasena`, `activo`) VALUES
('EMP001', '11111111', 'Juan', 'Perez', 'Lima', '999999999', 'juan@banco.com', 'Cajero', 'emp123', 1),
('EMP002', '22222222', 'María', 'Gómez', 'Arequipa', '987654321', 'maria@banco.com', 'Gerente', 'emp456', 1),
('EMP003', '33333333', 'Carlos', 'Rodríguez', 'Cusco', '912345678', 'carlos@banco.com', 'Analista', 'emp789', 1),
('EMP004', '44444444', 'Ana', 'López', 'Trujillo', '900112233', 'ana@banco.com', 'Cajero', 'emp101', 1),
('EMP005', '55555555', 'Luis', 'Fernández', 'Piura', '977889900', 'luis@banco.com', 'Supervisor', 'emp112', 1),
('EMP006', '66666666', 'Elena', 'Martínez', 'Chiclayo', '933445566', 'elena@banco.com', 'Cajero', 'emp134', 1),
('EMP007', '77777777', 'Javier', 'Díaz', 'Huancayo', '922110099', 'javier@banco.com', 'Asesor', 'emp567', 1),
('EMP008', '88888888', 'Sofía', 'Sánchez', 'Iquitos', '966554433', 'sofia@banco.com', 'Contador', 'emp890', 1),
('EMP009', '99999999', 'Miguel', 'Torres', 'Tacna', '944332211', 'miguel@banco.com', 'Cajero', 'emp012', 1),
('EMP010', '10101010', 'Valeria', 'Ramírez', 'Puno', '955667788', 'valeria@banco.com', 'Gerente', 'emp345', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `titular`
--

CREATE TABLE IF NOT EXISTS `titular` (
  `id_cuenta` varchar(20) NOT NULL DEFAULT '',
  `id_cliente` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`id_cuenta`,`id_cliente`),
  KEY `id_cliente` (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `titular`
--

INSERT INTO `titular` (`id_cuenta`, `id_cliente`) VALUES
('CTA001', 'CLI001'),
('CTA002', 'CLI001'),
('CTA001', 'CLI002'),
('CTA003', 'CLI003'),
('CTA004', 'CLI004'),
('CTA005', 'CLI005'),
('CTA006', 'CLI006'),
('CTA007', 'CLI007'),
('CTA008', 'CLI008'),
('CTA009', 'CLI009'),
('CTA010', 'CLI010');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transaccion`
--

CREATE TABLE IF NOT EXISTS `transaccion` (
  `id_transaccion` varchar(20) NOT NULL,
  `id_cuenta` varchar(20) DEFAULT NULL,
  `tipo` varchar(20) DEFAULT NULL,
  `monto` double DEFAULT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `cuenta_destino` varchar(20) DEFAULT NULL,
  `nombre_servicio` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_transaccion`),
  KEY `id_cuenta` (`id_cuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `transaccion`
--

INSERT INTO `transaccion` (`id_transaccion`, `id_cuenta`, `tipo`, `monto`, `fecha`, `cuenta_destino`, `nombre_servicio`) VALUES
('TRA001', 'CTA002', 'RETIRO', 500, '2025-12-10 16:38:46', NULL, NULL);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `titular`
--
ALTER TABLE `titular`
  ADD CONSTRAINT `titular_ibfk_1` FOREIGN KEY (`id_cuenta`) REFERENCES `cuenta` (`id_cuenta`),
  ADD CONSTRAINT `titular_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);

--
-- Filtros para la tabla `transaccion`
--
ALTER TABLE `transaccion`
  ADD CONSTRAINT `transaccion_ibfk_1` FOREIGN KEY (`id_cuenta`) REFERENCES `cuenta` (`id_cuenta`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
