USE ejemploCiudades;

-- concat()
SELECT concat(apellido, ', ', nombre) AS nombre_completo, edad, altura FROM personas;

-- length()
SELECT nombre, length(nombre) AS length_nombre FROM personas;

-- upper / lower
SELECT lower(nombre) AS nombre, upper(apellido) AS apellido, fecha_nacimiento FROM personas;

-- sum
SELECT SUM(edad) As suma_edades FROM personas;

-- avg
SELECT AVG(edad) As promedio_edad FROM personas;

-- MIN/MAX
SELECT MIN(altura) AS min_altura, MAX(altura) as max_altura FROM personas;

-- ROUND
SELECT nombre, apellido, round(altura, 1) AS Altura FROM personas;

-- DATE_FORMAT 
SELECT nombre, apellido, date_format(fecha_nacimiento, '%d/%m/%y') AS nacimiento FROM personas;

-- DAY / MONTH / YEAR
SELECT nombre, apellido, DAY(fecha_nacimiento) AS dia, MONTH(fecha_nacimiento) AS mes, YEAR(fecha_nacimiento) AS anio FROM personas;

-- NOW / CURDATE / CURTIME
SELECT now() AS fecha_hora, curdate() AS fecha, curtime() AS horas;

-- COUNT
SELECT COUNT(*) AS cantidad_de_antonios FROM personas WHERE nombre = 'Antonio';

-- IF
SELECT nombre, apellido, IF(ciudad, ciudad, 'N/A') AS ciudad FROM personas;

-- JOIN
SELECT * FROM personas INNER JOIN ciudades ON ciudades.id_ciudad = personas.id_persona;

SELECT p.nombre, p.apellido, p.edad, p.altura, p.fecha_nacimiento, c.nombre As ciudad FROM personas AS p INNER JOIN ciudades AS c ON c.id_ciudad = p.id_persona;

-- LEFT JOIN
SELECT * FROM personas LEFT JOIN ciudades ON ciudades.id_ciudad = personas.id_persona;

-- RIGHT JOIN
SELECT * FROM personas RIGHT JOIN ciudades ON ciudades.id_ciudad = personas.id_persona;

-- FULL JOIN / CROSS JOIN
SELECT * FROM personas FULL JOIN ciudades;


