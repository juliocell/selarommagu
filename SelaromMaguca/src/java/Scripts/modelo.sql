SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `selarom` DEFAULT CHARACTER SET latin1 ;
USE `selarom`;

-- -----------------------------------------------------
-- Table `selarom`.`Cargo`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `selarom`.`Cargo` (
  `idCargo` INT(11) NOT NULL ,
  `CargoDescripcion` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`idCargo`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `selarom`.`Empleados`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `selarom`.`Empleados` (
  `idEmpleados` INT(11) NOT NULL AUTO_INCREMENT ,
  `EmpleadosNombre` VARCHAR(45) NOT NULL ,
  `EmpleadosApellido` VARCHAR(45) NOT NULL ,
  `EmpleadosCI` INT(11) NOT NULL ,
  `EmpleadosDir` VARCHAR(250) NULL DEFAULT NULL ,
  `EmpleadosTlfCasa` VARCHAR(20) NULL DEFAULT NULL ,
  `EmpleadosTlfMovil` VARCHAR(20) NULL DEFAULT NULL ,
  `EmpleadosContrasena` VARCHAR(20) NOT NULL ,
  `EmpleadosFechaIng` DATE NOT NULL ,
  `EmpleadosFechaFin` DATE NULL DEFAULT NULL ,
  `EmpleadosSueldoBase` INT(11) NULL DEFAULT NULL ,
  `EmpleadosLogin` VARCHAR(20) NOT NULL ,
  `EmpleadosCorreo` VARCHAR(45) NOT NULL ,
  `Cargo_idCargo` INT(11) NOT NULL ,
  PRIMARY KEY (`idEmpleados`, `Cargo_idCargo`) ,
  INDEX `fk_Empleados_Cargo` (`Cargo_idCargo` ASC) ,
  CONSTRAINT `fk_Empleados_Cargo`
    FOREIGN KEY (`Cargo_idCargo` )
    REFERENCES `selarom`.`Cargo` (`idCargo` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;