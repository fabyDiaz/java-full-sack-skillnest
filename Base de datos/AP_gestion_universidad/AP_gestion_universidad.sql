/*
Estudiantes: ID de estudiante, nombre, apellido, dirección, correo electrónico.
Profesores: ID de profesor, nombre, apellido, departamento, salario.
Cursos: ID de curso, nombre del curso, código del curso, créditos.
Matrículas: ID de matrícula, ID de estudiante, ID de curso, semestre, calificación.
Departamentos: ID de departamento, nombre del departamento, ubicación.
Horarios: ID de horario, ID de curso, ID de profesor, día de la semana, hora de inicio, hora de finalización.
*/

CREATE SCHEMA gestion_universidades DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci ;
-- Estudiantes: ID de estudiante, nombre, apellido, dirección, correo electrónico.
CREATE TABLE estudiantes(
	id_estudiante INT NOT NULL	AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NOT NULL,
    direccion VARCHAR(100),
    correo_electronico VARCHAR(100) NOT NULL,
	PRIMARY KEY (id_estudiante)
); 

-- Profesores: ID de profesor, nombre, apellido, departamento, salario.
CREATE TABLE profesores(
	id_profesor INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NOT NULL,
    id_departamento INT NOT NULL,
    salario DOUBLE NOT NULL,
	PRIMARY KEY (id_profesor),
    FOREIGN KEY (id_departamento) REFERENCES departamentos(id_departamentos)
); 

-- Cursos: ID de curso, nombre del curso, código del curso, créditos.
CREATE TABLE cursos(
	id_curso INT NOT NULL AUTO_INCREMENT,
    nombre_curso VARCHAR(45) NOT NULL,
    codigo_curso VARCHAR(45) NOT NULL,
    creditos INT,
	PRIMARY KEY (id_curso)
); 

-- Matrículas: ID de matrícula, ID de estudiante, ID de curso, semestre, calificación.
CREATE TABLE matriculas(
	id_matricula INT NOT NULL AUTO_INCREMENT,
    id_estudiante INT NOT NULL,
    id_curso INT NOT NULL,
    semestre INT NOT NULL,
    calificacion DOUBLE,
	PRIMARY KEY (id_matricula)
); 
 
-- Departamentos: ID de departamento, nombre del departamento, ubicación.
CREATE TABLE departamentos(
	id_departamento INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100),
    ubicacion VARCHAR(100),
	PRIMARY KEY (id_departamento)
); 

-- Horarios: ID de horario, ID de curso, ID de profesor, día de la semana, hora de inicio, hora de finalización.
CREATE TABLE horarios(
	id_horario INT NOT NULL AUTO_INCREMENT,
    id_curso INT NOT NULL,
    id_profesor INT NULL,
    dia_semana VARCHAR(10),
    hora_inicio TIMESTAMP,
    hora_finalizacion TIMESTAMP,
	PRIMARY KEY (id_horario),
    FOREIGN KEY (id_curso) REFERENCES cursos(id_curso),
    FOREIGN KEY (id_profesor) REFERENCES profesores(id_profesor)
); 
 

