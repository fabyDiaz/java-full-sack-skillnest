CREATE DATABASE reservas_Compania_transporte;
USE reservas_Compania_transporte;

CREATE TABLE viajes(
	id_viaje INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    origen VARCHAR(45) NOT NULL,
    destino VARCHAR(45),
    fecha_salida DATE,
    fecha_llegada DATE,
    precio_boleto DOUBLE
);

CREATE TABLE pasajeros(
	id_pasajero INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NOT NULL,
    direccion VARCHAR(100),
    correo_electronico VARCHAR(100) NOT NULL
    );

CREATE TABLE asientos(
	id_asiento INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    numero_asiento INT NOT NULL,
    estado_disponibilidad TINYINT(1)
);

CREATE TABLE reservas(
	id_reserva INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_viaje INT NOT NULL,
    id_pasajero INT NOT NULL,
    id_asiento INT,
    estado_reserva VARCHAR(10),
    FOREIGN KEY (id_viaje) REFERENCES viajes(id_viaje),
    FOREIGN KEY (id_pasajero) REFERENCES pasajeros(id_pasajero),
    FOREIGN KEY (id_asiento) REFERENCES asientos(id_asiento)
);

CREATE TABLE conductores(
	id_conductores INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NOT NULL,
    numero_licencia VARCHAR(8),
    vehiculo_asignado VARCHAR(45)
);

CREATE TABLE vehiculos(
	id_vehiculo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    numero_placa VARCHAR(45) NOT NULL,
    modelo VARCHAR(100) NOT NULL,
    capacidad INT NOT NULL
);

CREATE TABLE conductores_vehiculos(
	id_conductores INT NOT NULL,
    id_vehiculo INT NOT NULL,
    PRIMARY KEY (id_conductores, id_vehiculo),
    FOREIGN KEY (id_vehiculo) REFERENCES vehiculos(id_vehiculo),
    FOREIGN KEY(id_conductores) REFERENCES conductores(id_conductores)
);


