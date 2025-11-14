CREATE DATABASE core_inscipciones_cursos;
USE core_inscipciones_cursos;

-- Tabla estudiantes
CREATE TABLE estudiantes (
    id_estudiante INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    edad INT
);

-- Tabla cursos
CREATE TABLE cursos (
    id_curso INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    duracion INT
);

-- Tabla intermedia inscripciones (relación muchos a muchos)
CREATE TABLE inscripciones (
    id_estudiante INT NOT NULL,
    id_curso INT NOT NULL,
    PRIMARY KEY (id_estudiante, id_curso),
    FOREIGN KEY (id_estudiante) REFERENCES estudiantes(id_estudiante)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY (id_curso) REFERENCES cursos(id_curso)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);
-- Inserta al menos cinco nuevos estudiantes en la tabla «estudiantes».
INSERT INTO estudiantes (nombre, edad) VALUES
('Ana Torres', 20),
('Luis Martínez', 22),
('María González', 19),
('Pedro Ramírez', 21),
('Carla Soto', 23);

-- Inserta al menos cuatro nuevos cursos en la tabla «cursos». 
INSERT INTO cursos (nombre, duracion) VALUES
('Programación en Java', 40),
('Bases de Datos', 30),
('Desarrollo Web', 45),
('Machine Learning', 50);

-- Asociar a cuatro de los estudiantes a al menos dos de los cursos dados de alta.
INSERT INTO inscripciones (id_estudiante, id_curso) VALUES
(1, 1),  -- Ana -> Java
(1, 2),  -- Ana -> Bases de Datos

(2, 1),  -- Luis -> Java
(2, 3),  -- Luis -> Desarrollo Web

(3, 2),  -- María -> Bases de Datos
(3, 3),  -- María -> Desarrollo Web

(4, 1),  -- Pedro -> Java
(4, 4);  -- Pedro -> Machine Learning

-- Proyecta a todos los estudiantes y sus respectivos cursos.
SELECT e.id_estudiante, e.nombre, e.edad, c.id_curso, c.nombre AS curso, c.duracion FROM estudiantes e 
INNER JOIN inscripciones i ON i.id_estudiante = e.id_estudiante
INNER JOIN cursos c ON c.id_curso = i.id_curso
ORDER BY e.id_estudiante ASC;

-- Proyecta todos los estudiantes que están inscritos en un curso específico, utilizando el nombre del curso como criterio de búsqueda.
SELECT e.id_estudiante, e.nombre, e.edad, c.id_curso, c.nombre AS curso, c.duracion FROM estudiantes e 
INNER JOIN inscripciones i ON i.id_estudiante = e.id_estudiante
INNER JOIN cursos c ON c.id_curso = i.id_curso
WHERE c.nombre = 'Programación en Java';

-- Cuenta el número de estudiantes inscritos en cada curso y muestra el nombre del curso junto con el número de estudiantes inscritos.
SELECT c.nombre AS curso, COUNT(c.nombre) AS 'Numero de estudiantes' FROM inscripciones i
INNER JOIN cursos c ON c.id_curso = i.id_curso
GROUP BY c.nombre;

-- Encuentra los estudiantes que no están inscritos en ningún curso
SELECT e.nombre FROM estudiantes e
LEFT JOIN inscripciones i ON i.id_estudiante = e.id_estudiante
WHERE i.id_estudiante IS NULL;
