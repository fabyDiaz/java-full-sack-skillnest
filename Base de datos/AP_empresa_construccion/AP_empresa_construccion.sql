/*
Esta tarea implica diseñar un ERD para una empresa de construcción que administra proyectos, empleados, clientes, tareas, materiales y equipos. 
Los empleados están asignados a proyectos y realizan tareas específicas, utilizando materiales y equipos proporcionados por la empresa.
*/
-- creamos la base de datos
CREATE SCHEMA empresa_construccion DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci ;

-- tabla proyectosProyectos: ID de proyecto, nombre del proyecto, fecha de inicio, fecha de finalización.
CREATE TABLE proyectos(
	id_proyecto INT NOT NULL AUTO_INCREMENT,
    id_empleado INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    fecha_inicio DATE,
    fecha_termino DATE,
    fecha_finalizacion DATE,
    PRIMARY KEY (id_proyecto),
    FOREIGN KEY (id_empleado) REFERENCES empleados(id_empleado)
);

-- Empleados: ID de empleado, nombre, apellido, puesto, salario.
CREATE TABLE empleados(
	id_empleado INT NOT NULL AUTO_INCREMENT,
    id_tarea INT NOT NULL,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NOT NULL,
    puesto VARCHAR(45) NOT NULL,
    salario DOUBLE NOT NULL,
    PRIMARY KEY (id_empleado),
    FOREIGN KEY (id_tarea) REFERENCES tareas(id_tarea)
);

-- Clientes: ID de cliente, nombre del cliente, dirección, correo electrónico.
CREATE TABLE clientes( 
	id_cliente INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    direccion VARCHAR(100),
    correo_electronico VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_cliente)
);

-- Tareas: ID de tarea, descripción de la tarea, fecha de asignación, estado.
CREATE TABLE tareas(
	id_tarea INT NOT NULL AUTO_INCREMENT,
    id_material INT NOT NULL,
    id_equipo INT NOT NULL,
    descripcion VARCHAR(200) NOT NULL,
    fecha_asignacion DATE,
    estado VARCHAR(45) NOT NULL,
    PRIMARY KEY (id_tarea),
    FOREIGN KEY (id_material) REFERENCES materiales(id_material),
    FOREIGN KEY	(id_equipo) REFERENCES equipos(id_equipo)
);

-- Materiales: ID de material, nombre del material, cantidad en stock, precio por unidad.
CREATE TABLE materiales(
	id_material INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    cantidad_stock INT NOT NULL,
    precio DOUBLE,
    PRIMARY KEY (id_material)
);

-- Equipos: ID de equipo, nombre del equipo, estado de disponibilidad.
CREATE TABLE equipos(
	id_equipos INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    estado_disponibilidad VARCHAR(100),
    PRIMARY KEY (id_equipo)
);
