-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: bgc8ogaucodjxbt92vow-mysql.services.clever-cloud.com:3306
-- Generation Time: Jun 12, 2023 at 11:44 AM
-- Server version: 8.0.15-5
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bgc8ogaucodjxbt92vow`
--
CREATE DATABASE IF NOT EXISTS `bgc8ogaucodjxbt92vow` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `bgc8ogaucodjxbt92vow`;

-- --------------------------------------------------------

--
-- Table structure for table `educacion`
--

CREATE TABLE `educacion` (
  `id` bigint(20) NOT NULL,
  `desde` int(11) DEFAULT NULL,
  `hasta` int(11) DEFAULT NULL,
  `n_orden` bigint(20) DEFAULT NULL,
  `institucion_id` bigint(20) DEFAULT NULL,
  `persona_id` bigint(20) NOT NULL,
  `titulo_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `educacion`
--

INSERT INTO `educacion` (`id`, `desde`, `hasta`, `n_orden`, `institucion_id`, `persona_id`, `titulo_id`) VALUES
(1, 1991, 1997, 1, 1, 1, 1),
(2, 2001, 2002, 2, 2, 1, 2),
(3, 2004, 2005, 3, 3, 1, 3),
(4, 2022, 2023, 4, 4, 1, 4);

-- --------------------------------------------------------

--
-- Table structure for table `experiencia`
--

CREATE TABLE `experiencia` (
  `id` bigint(20) NOT NULL,
  `desde` int(11) DEFAULT NULL,
  `hasta` int(11) DEFAULT NULL,
  `n_orden` bigint(20) DEFAULT NULL,
  `pais` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `provincia` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `texto` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `institucion_id` bigint(20) DEFAULT NULL,
  `persona_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `experiencia`
--

INSERT INTO `experiencia` (`id`, `desde`, `hasta`, `n_orden`, `pais`, `provincia`, `texto`, `institucion_id`, `persona_id`) VALUES
(1, 2002, 2022, NULL, 'Argentina', 'C.A.B.A.', 'Desarrollador Visual Basic - Jefe de Desarrollo - Jefe de Tecnología - Responsable del Área de Sistemas de información de la Dirección Nacional de Medicamentos y Tecnología Sanitaria.', 5, 1),
(2, 1997, 2012, NULL, 'Argentina', 'Buenos Aires', 'Docente en la cátedra de Algoritmos y Programación I - Lenguaje C++.', 1, 1),
(3, 1997, 1997, NULL, 'Argentina', 'C.A.B.A.', 'Consultor en el Area de Informática.', 6, 1),
(4, 1993, 2002, NULL, 'Argentina', 'Buenos Aires', 'Desarrollador - Analista Funcional - Lider de Proyecto - Gerente de Sistemas.', 7, 1);

-- --------------------------------------------------------

--
-- Table structure for table `habilidades`
--

CREATE TABLE `habilidades` (
  `id` bigint(20) NOT NULL,
  `n_orden` bigint(20) DEFAULT NULL,
  `titulo` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `persona_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `habilidades`
--

INSERT INTO `habilidades` (`id`, `n_orden`, `titulo`, `persona_id`) VALUES
(1, 1, 'Lenguajes de Programación', 1),
(2, NULL, 'Inglés Técnico', 1),
(3, 3, 'Frances', 1);

-- --------------------------------------------------------

--
-- Table structure for table `habilidades_datos`
--

CREATE TABLE `habilidades_datos` (
  `id` bigint(20) NOT NULL,
  `color` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `etiqueta` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `porcentaje` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `habilidades_datos`
--

INSERT INTO `habilidades_datos` (`id`, `color`, `etiqueta`, `porcentaje`) VALUES
(1, 'red', 'C/C++', 35),
(2, 'green', 'VB/.Net', 35),
(3, 'blue', 'Assembler', 10),
(4, 'orange', 'HTML/CSS/JavaScript', 15),
(5, 'red', 'Escritura', 10),
(6, 'green', 'Hablado', 10),
(7, 'blue', 'Lectura', 50),
(8, 'red', 'Escritura', 10),
(9, 'green', 'Hablado', 10),
(10, 'blue', 'Lectura', 80);

-- --------------------------------------------------------

--
-- Table structure for table `habilidades_habilidades_datos`
--

CREATE TABLE `habilidades_habilidades_datos` (
  `habilidades_id` bigint(20) NOT NULL,
  `habilidades_datos_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `habilidades_habilidades_datos`
--

INSERT INTO `habilidades_habilidades_datos` (`habilidades_id`, `habilidades_datos_id`) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(2, 5),
(2, 6),
(2, 7),
(3, 8),
(3, 9),
(3, 10);

-- --------------------------------------------------------

--
-- Table structure for table `institucion`
--

CREATE TABLE `institucion` (
  `id` bigint(20) NOT NULL,
  `institucion` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `link_icono` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `institucion`
--

INSERT INTO `institucion` (`id`, `institucion`, `link_icono`) VALUES
(1, 'Universidad Nacional de Quilmes.', 'https://i.postimg.cc/rmVnK4Fk/Unqui-modified.png'),
(2, 'Instituto Perpetuo Socorro.', 'https://i.postimg.cc/90SJ8NPm/Cisco-modified.png'),
(3, 'BS Trainig.', 'https://i.postimg.cc/SQtTxjBB/Microsoft-modified.png'),
(4, 'Instituto Nacional de Tecnología Industrial.', 'https://i.postimg.cc/T3cxqkbm/Argentina-Programa.png'),
(5, 'Ministerio de Salud de la Nación.', 'https://i.postimg.cc/4dW8t3mh/MSAL-modified.png'),
(6, 'Comisión Nacional de Regulación del Transporte.', 'https://i.postimg.cc/ht835k8t/CNRT-modified.png'),
(7, 'Datafox Informática S.A.', 'https://i.postimg.cc/zv3xk1g2/Datafox-modified.png');

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE `persona` (
  `id` bigint(20) NOT NULL,
  `acerca_de` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `apellidos` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cargo_actual` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `link_banner` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `link_foto` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `link_icono` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `link_servidor_imagenes` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nombres` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pais` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `provincia` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `persona`
--

INSERT INTO `persona` (`id`, `acerca_de`, `apellidos`, `cargo_actual`, `link_banner`, `link_foto`, `link_icono`, `link_servidor_imagenes`, `nombres`, `pais`, `provincia`) VALUES
(1, 'Técnico Universitario en Automatización y Control, Informático, Docente, MCP, CCNA, Full Stack Developer Jr.', 'Genovese', 'Responsable del Area de Sistemas de Información en la DNMyTS dependiente del Ministerio de Salud de la Nación', 'https://i.postimg.cc/FKKMbhN5/Banner.png', 'https://i.postimg.cc/W4WPxhX1/Foto-Fondo-Gris.png', 'https://i.postimg.cc/mtp6pFBx/MSAL.png', 'https://postimg.cc/gallery/SzbzjyF', 'Sergio Lorenzo', 'Argentina', 'C.A.B.A.');

-- --------------------------------------------------------

--
-- Table structure for table `persona_red`
--

CREATE TABLE `persona_red` (
  `id` bigint(20) NOT NULL,
  `icono` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `link` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `persona_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `persona_red`
--

INSERT INTO `persona_red` (`id`, `icono`, `link`, `nombre`, `persona_id`) VALUES
(1, 'bi bi-linkedin', 'https://www.linkedin.com/in/sergio-genovese-2075295b/', 'Linkedin', 1),
(2, 'bi bi-facebook', 'https://www.facebook.com/sergio.genovese', 'Facebook', 1);

-- --------------------------------------------------------

--
-- Table structure for table `proyectos`
--

CREATE TABLE `proyectos` (
  `id` bigint(20) NOT NULL,
  `desde` int(11) DEFAULT NULL,
  `hasta` int(11) DEFAULT NULL,
  `n_orden` bigint(20) DEFAULT NULL,
  `texto` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `institucion_id` bigint(20) DEFAULT NULL,
  `persona_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `proyectos`
--

INSERT INTO `proyectos` (`id`, `desde`, `hasta`, `n_orden`, `texto`, `institucion_id`, `persona_id`) VALUES
(1, 2002, 2023, 1, 'Programa Remediar.', 5, 1),
(2, 1993, 2002, NULL, 'Medifox - Hospital de Autogestión.', 7, 1);

-- --------------------------------------------------------

--
-- Table structure for table `red`
--

CREATE TABLE `red` (
  `id` bigint(20) NOT NULL,
  `icono` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `red`
--

INSERT INTO `red` (`id`, `icono`, `nombre`) VALUES
(1, 'bi bi-linkedin', 'Linkedin'),
(2, 'bi bi-facebook', 'Facebook'),
(3, 'bi bi-instagram', 'Instagram'),
(4, 'bi bi-whatsapp', 'Whatsapp'),
(5, 'bi bi-twitter', 'Twitter'),
(6, 'bi bi-telegram', 'Telegram'),
(7, 'bi bi-tiktok', 'Tiktok'),
(8, 'bi bi-youtube', 'Youtube'),
(9, 'bi bi-snapchat', 'Snapchat'),
(10, 'bi bi-pinterest', 'Pinterest'),
(11, 'bi bi-reddit', 'Reddit');

-- --------------------------------------------------------

--
-- Table structure for table `titulo`
--

CREATE TABLE `titulo` (
  `id` bigint(20) NOT NULL,
  `titulo` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `titulo`
--

INSERT INTO `titulo` (`id`, `titulo`) VALUES
(1, 'Técnico Universitario en Automatización y Control.'),
(2, 'Cisco Certified Network Associate (CCNA).'),
(3, 'Microsoft Certified Professional (MCP).'),
(4, 'Full Stack Developer Jr.');

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `persona_id` bigint(20) DEFAULT NULL,
  `usuario` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id`, `password`, `persona_id`, `usuario`) VALUES
(1, '42247476', 1, 'sgenovese');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `educacion`
--
ALTER TABLE `educacion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK6b592txk0bydpslm0aunwds63` (`institucion_id`),
  ADD KEY `FK8co4tldnpfbl6l8oc06veg4jr` (`persona_id`),
  ADD KEY `FKc12uatkf8klo0ihvrifod7n6p` (`titulo_id`);

--
-- Indexes for table `experiencia`
--
ALTER TABLE `experiencia`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKdx0l3sondw8dx729mgeg0y1oc` (`institucion_id`),
  ADD KEY `FK30e9aa2tv4x2kirmadmmggsme` (`persona_id`);

--
-- Indexes for table `habilidades`
--
ALTER TABLE `habilidades`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKftwa43rd17ubvqpubg4iu44ig` (`persona_id`);

--
-- Indexes for table `habilidades_datos`
--
ALTER TABLE `habilidades_datos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `habilidades_habilidades_datos`
--
ALTER TABLE `habilidades_habilidades_datos`
  ADD UNIQUE KEY `UK_6ek29e70imwn8x19awsbax62v` (`habilidades_datos_id`),
  ADD KEY `FK4guv0cnonrjot9k0nvt6cjput` (`habilidades_id`);

--
-- Indexes for table `institucion`
--
ALTER TABLE `institucion`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `persona_red`
--
ALTER TABLE `persona_red`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK9xfujjdmyi5sqq3y23vodjurb` (`persona_id`);

--
-- Indexes for table `proyectos`
--
ALTER TABLE `proyectos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKnkr2k3uqwt9tubm53cs1pqh0t` (`institucion_id`),
  ADD KEY `FK3j15b08y1pckrr47n9pxq5x2e` (`persona_id`);

--
-- Indexes for table `red`
--
ALTER TABLE `red`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `titulo`
--
ALTER TABLE `titulo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `educacion`
--
ALTER TABLE `educacion`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `experiencia`
--
ALTER TABLE `experiencia`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `habilidades`
--
ALTER TABLE `habilidades`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `habilidades_datos`
--
ALTER TABLE `habilidades_datos`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT for table `institucion`
--
ALTER TABLE `institucion`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `persona`
--
ALTER TABLE `persona`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `persona_red`
--
ALTER TABLE `persona_red`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `proyectos`
--
ALTER TABLE `proyectos`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `red`
--
ALTER TABLE `red`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `titulo`
--
ALTER TABLE `titulo`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `educacion`
--
ALTER TABLE `educacion`
  ADD CONSTRAINT `FK6b592txk0bydpslm0aunwds63` FOREIGN KEY (`institucion_id`) REFERENCES `institucion` (`id`),
  ADD CONSTRAINT `FK8co4tldnpfbl6l8oc06veg4jr` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`),
  ADD CONSTRAINT `FKc12uatkf8klo0ihvrifod7n6p` FOREIGN KEY (`titulo_id`) REFERENCES `titulo` (`id`);

--
-- Constraints for table `experiencia`
--
ALTER TABLE `experiencia`
  ADD CONSTRAINT `FK30e9aa2tv4x2kirmadmmggsme` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`),
  ADD CONSTRAINT `FKdx0l3sondw8dx729mgeg0y1oc` FOREIGN KEY (`institucion_id`) REFERENCES `institucion` (`id`);

--
-- Constraints for table `habilidades`
--
ALTER TABLE `habilidades`
  ADD CONSTRAINT `FKftwa43rd17ubvqpubg4iu44ig` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`);

--
-- Constraints for table `habilidades_habilidades_datos`
--
ALTER TABLE `habilidades_habilidades_datos`
  ADD CONSTRAINT `FK2fkv3a478abqg3eapqrxkuygk` FOREIGN KEY (`habilidades_datos_id`) REFERENCES `habilidades_datos` (`id`),
  ADD CONSTRAINT `FK4guv0cnonrjot9k0nvt6cjput` FOREIGN KEY (`habilidades_id`) REFERENCES `habilidades` (`id`);

--
-- Constraints for table `persona_red`
--
ALTER TABLE `persona_red`
  ADD CONSTRAINT `FK9xfujjdmyi5sqq3y23vodjurb` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`);

--
-- Constraints for table `proyectos`
--
ALTER TABLE `proyectos`
  ADD CONSTRAINT `FK3j15b08y1pckrr47n9pxq5x2e` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`),
  ADD CONSTRAINT `FKnkr2k3uqwt9tubm53cs1pqh0t` FOREIGN KEY (`institucion_id`) REFERENCES `institucion` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
