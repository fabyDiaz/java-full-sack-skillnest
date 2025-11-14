
-- Genera la base de datos utilizando “Forward Engineer” y crea la tabla empleados con los campos mencionados.
CREATE DATABASE AP_empleados;
USE AP_empleados;

CREATE TABLE empleados(
	id_empleado INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(45),
    departamento VARCHAR(80),
    salario DOUBLE
);
-- Inserta al menos cinco registros en la tabla empleados.
INSERT INTO empleados(nombre, departamento, salario) VALUES
	('Juan', 'Finanzas', 1200.0),
    ('sofía', 'TI', 1300.0),
    ('Felipe', 'administración', 1100.0),
    ('María', 'ventas' , 1350.0),
    ('Pedro', 'Operaciones', 1000.0),
	('Diego', 'ventas' , 1150.0),
    ('Luis', 'Operaciones', 1100.0);
    
SELECT * FROM empleados;

-- Actualiza el salario del empleado con id = 3 a 3000.00.    
UPDATE empleados SET salario = 3000.00 WHERE id_empleado = 3;

-- Proyecta (consulta) todos los empleados que trabajen en el departamento de ‘Ventas’.
SELECT * FROM empleados WHERE departamento = 'ventas';

-- Calcula el salario promedio para cada departamento.
SELECT departamento, AVG(salario) AS salario FROM empleados
GROUP BY departamento;

-- Elimina al empleado con id = 2 de la tabla empleados.
DELETE FROM empleados WHERE id_empleado = 2;

-- Proyecta (consulta) todos los empleados.
SELECT * FROM empleados;

-- Proyecta (consulta) los dos empleados con los salarios más bajos, ordenados de forma ascendente por salario.
SELECT * FROM empleados 
ORDER BY salario ASC
LIMIT 2;

SELECT count(*) FROM empleados;





