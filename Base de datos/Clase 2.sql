CREATE DATABASE ejemploCiudades;
USE ejemploCiudades;

-- tabla ciudades
CREATE TABLE ciudades(
	id_ciudad INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) UNIQUE NOT NULL
);

-- tabla personas
CREATE TABLE personas(
	id_persona INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(15) NOT NULL,
    apellido VARCHAR(15) NOT NULL,
    edad INT, 
    altura FLOAT,
    fecha_nacimiento DATE,
    ciudad INT,
    FOREIGN KEY (ciudad) REFERENCES ciudades(id_ciudad)
);


INSERT INTO ciudades (nombre) VALUES ('Tucumán');
INSERT INTO ciudades (nombre) VALUES ('Buenos Aires');
INSERT INTO ciudades (nombre) VALUES ('New York');
INSERT INTO ciudades (nombre) VALUES ('Caracas');
INSERT INTO ciudades (nombre) VALUES ('Bogotá');
INSERT INTO ciudades (nombre) VALUES ('Santiago');
INSERT INTO ciudades (nombre) VALUES ('Santa Cruz');


INSERT INTO personas (nombre, apellido, edad, altura, fecha_nacimiento, id_ciudad)
VALUES ('Lucas', 'Álvarez', 35, 1.72, '1985-03-29', 1),
	   ('Leo', 'Sierras', 24, 1.89, '1996-01-10', 4),
       ('Romina', 'Moyano', 56, 1.80, '1972-03-23', 1),
       ('Antonio', 'López', 47, 1.65, '1981-09-15', 2),
       ('Cecilia', 'Gutiérrez', 44, 1.67, '1983-12-08', 4),
       ('Luis', 'Pinki', 22, 1.58, '1999-08-05', 5),
       ('Antonio', 'López', 38, 1.64, '1989-10-31', 1),
       ('Luis', 'Barboza', 53, 1.72, '1973-11-09', 3),
       ('Carmen', 'Solano', 75, 1.56, '1945-09-02', 1),
       ('Diego', 'Palacios', 35, 1.76, '1990-01-26', 2);
       
SELECT * FROM ciudades;

TRUNCATE ejemploCiudades;
