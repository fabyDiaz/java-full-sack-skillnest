CREATE SCHEMA SistemaReservaHoteles DEFAULT CHARACTER SET utf8;
USE SistemaReservaHoteles;

-- tabla Habitaciones
CREATE TABLE Habitaciones (
id_habitacion INT NOT NULL AUTO_INCREMENT,
nro_habitacion INT NOT NULL UNIQUE,
capacidad INT NOT NULL,
precio_por_noche DOUBLE NOT NULL,
PRIMARY KEY(id_habitacion)
) ENGINE=InnoDB;

-- tabla Clientes
CREATE TABLE Clientes (
	id_cliente INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NOT NULL,
    direccion VARCHAR(100),
    correo_electronico VARCHAR(100),
    PRIMARY KEY(id_cliente)
) ENGINE = InnoDB;

-- tabla Reservas
CREATE TABLE Reservas(
	id_reserva INT NOT NULL AUTO_INCREMENT,
    id_cliente INT NOT NULL,
    id_habitacion INT NOT NULL,
    fecha_llegada DATE NOT NULL,
    fecha_salida DATE,
    PRIMARY KEY(id_reserva),
    FOREIGN KEY(id_cliente) REFERENCES Clientes(id_cliente),
    FOREIGN KEY(id_habitacion) REFERENCES Habitaciones(id_habitacion)
) ENGINE = InnoDB;
    