-- MySQL Forward Engineering - FIX FINAL
-- Ejecuta todo este bloque completo

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- CREAR SCHEMA
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `BancoChileOct2025`;
CREATE SCHEMA IF NOT EXISTS `BancoChileOct2025` DEFAULT CHARACTER SET utf8;
USE `BancoChileOct2025`;

-- -----------------------------------------------------
-- TABLE: FORMATOS
-- -----------------------------------------------------
CREATE TABLE `Formatos` (
  `id_formato` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_formato`)
) ENGINE=InnoDB;

-- -----------------------------------------------------
-- TABLE: AUTORES
-- -----------------------------------------------------
CREATE TABLE `Autores` (
  `id_autor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(80) NOT NULL,
  `Formatos_id_formato` INT NOT NULL,
  PRIMARY KEY (`id_autor`),
  INDEX `fk_Autores_Formatos1_idx` (`Formatos_id_formato` ASC),
  CONSTRAINT `fk_Autores_Formatos1`
    FOREIGN KEY (`Formatos_id_formato`)
    REFERENCES `Formatos` (`id_formato`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB;

-- -----------------------------------------------------
-- TABLE: TEMAS
-- -----------------------------------------------------
CREATE TABLE `Temas` (
  `id_tema` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(80) NOT NULL,
  PRIMARY KEY (`id_tema`)
) ENGINE=InnoDB;

-- -----------------------------------------------------
-- TABLE: IDIOMAS
-- -----------------------------------------------------
CREATE TABLE `Idiomas` (
  `id_idioma` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `Autores_id_autor` INT NOT NULL,
  PRIMARY KEY (`id_idioma`),
  INDEX `fk_Idiomas_Autores1_idx` (`Autores_id_autor` ASC),
  CONSTRAINT `fk_Idiomas_Autores1`
    FOREIGN KEY (`Autores_id_autor`)
    REFERENCES `Autores` (`id_autor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB;

-- -----------------------------------------------------
-- TABLE: REGIONES
-- -----------------------------------------------------
CREATE TABLE `Regiones` (
  `id_region` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `Autores_id_autor` INT NOT NULL,
  PRIMARY KEY (`id_region`),
  INDEX `fk_Regiones_Autores_idx` (`Autores_id_autor` ASC),
  CONSTRAINT `fk_Regiones_Autores`
    FOREIGN KEY (`Autores_id_autor`)
    REFERENCES `Autores` (`id_autor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB;

-- -----------------------------------------------------
-- TABLE: CURSOS
-- -----------------------------------------------------
CREATE TABLE `Cursos` (
  `id_cursos` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(80) NOT NULL,
  `Autores_id_autor` INT NOT NULL,
  PRIMARY KEY (`id_cursos`),
  INDEX `fk_Cursos_Autores1_idx` (`Autores_id_autor` ASC),
  CONSTRAINT `fk_Cursos_Autores1`
    FOREIGN KEY (`Autores_id_autor`)
    REFERENCES `Autores` (`id_autor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB;

-- -----------------------------------------------------
-- TABLE: CURSOS_TEMAS
-- -----------------------------------------------------
CREATE TABLE `Cursos_Temas` (
  `Cursos_id_cursos` INT NOT NULL,
  `Temas_id_tema` INT NOT NULL,
  PRIMARY KEY (`Cursos_id_cursos`, `Temas_id_tema`),
  INDEX `fk_Cursos_Temas_Temas1_idx` (`Temas_id_tema` ASC),
  INDEX `fk_Cursos_Temas_Cursos1_idx` (`Cursos_id_cursos` ASC),
  CONSTRAINT `fk_Cursos_has_Temas_Cursos1`
    FOREIGN KEY (`Cursos_id_cursos`)
    REFERENCES `Cursos` (`id_cursos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cursos_has_Temas_Temas1`
    FOREIGN KEY (`Temas_id_tema`)
    REFERENCES `Temas` (`id_tema`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;