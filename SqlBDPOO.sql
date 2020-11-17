-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Cpu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cpu` (
  `idCpu` INT NOT NULL,
  `Cores` VARCHAR(45) NULL,
  `threads` VARCHAR(45) NULL,
  `ClocksCpu` FLOAT NULL,
  `nomeCpu` VARCHAR(45) NULL,
  `brandCpu` VARCHAR(45) NULL,
  `costCpu` FLOAT NULL,
  `memoryCpu` VARCHAR(45) NULL,
  PRIMARY KEY (`idCpu`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Gpu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Gpu` (
  `idGpu` INT NOT NULL,
  `madeBy` VARCHAR(45) NULL,
  `vRam` VARCHAR(45) NULL,
  `ClocksGpu` FLOAT NULL,
  `nomeGpu` VARCHAR(45) NULL,
  `brandGpu` VARCHAR(45) NULL,
  `costGpu` FLOAT NULL,
  `memoryGpu` VARCHAR(45) NULL,
  PRIMARY KEY (`idGpu`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Test`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Test` (
  `idTest` INT NOT NULL,
  `fps` INT NULL,
  PRIMARY KEY (`idTest`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`PC`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`PC` (
  `idPC` INT NOT NULL,
  `Cpu_idCpu` INT NULL,
  `Gpu_idGpu` INT NULL,
  `Cpu_idCpu1` INT NOT NULL,
  `Gpu_idGpu1` INT NOT NULL,
  `Test_idTest` INT NOT NULL,
  `Cost` FLOAT NULL,
  PRIMARY KEY (`idPC`),
  INDEX `fk_PC_Cpu_idx` (`Cpu_idCpu1` ASC) ,
  INDEX `fk_PC_Gpu1_idx` (`Gpu_idGpu1` ASC) ,
  INDEX `fk_PC_Test1_idx` (`Test_idTest` ASC) ,
  CONSTRAINT `fk_PC_Cpu`
    FOREIGN KEY (`Cpu_idCpu1`)
    REFERENCES `mydb`.`Cpu` (`idCpu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PC_Gpu1`
    FOREIGN KEY (`Gpu_idGpu1`)
    REFERENCES `mydb`.`Gpu` (`idGpu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PC_Test1`
    FOREIGN KEY (`Test_idTest`)
    REFERENCES `mydb`.`Test` (`idTest`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Jogo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Jogo` (
  `idJogo` INT NOT NULL,
  `Test_idTest` INT NOT NULL,
  `Name` VARCHAR(45) NULL,
  `Developer` VARCHAR(45) NULL,
  PRIMARY KEY (`idJogo`),
  INDEX `fk_Jogo_Test1_idx` (`Test_idTest` ASC) ,
  CONSTRAINT `fk_Jogo_Test1`
    FOREIGN KEY (`Test_idTest`)
    REFERENCES `mydb`.`Test` (`idTest`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Jogo_has_PC`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Jogo_has_PC` (
  `Jogo_idJogo` INT NOT NULL,
  `PC_idPC` INT NOT NULL,
  PRIMARY KEY (`Jogo_idJogo`, `PC_idPC`),
  INDEX `fk_Jogo_has_PC_PC1_idx` (`PC_idPC` ASC) ,
  INDEX `fk_Jogo_has_PC_Jogo1_idx` (`Jogo_idJogo` ASC) ,
  CONSTRAINT `fk_Jogo_has_PC_Jogo1`
    FOREIGN KEY (`Jogo_idJogo`)
    REFERENCES `mydb`.`Jogo` (`idJogo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Jogo_has_PC_PC1`
    FOREIGN KEY (`PC_idPC`)
    REFERENCES `mydb`.`PC` (`idPC`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
