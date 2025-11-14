CREATE DATABASE core_clientes_pedidos;
USE core_clientes_pedidos;

CREATE TABLE clientes(
	id_cliente INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(45) NOT NULL,
    direccion VARCHAR(100),
    telefono varchar(10) NOT NULL
);

CREATE TABLE pedidos(
	id_pedido INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    fecha DATE, 
    total DOUBLE,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
	ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- Inserta al menos cinco nuevos clientes en la tabla «clientes».
INSERT INTO clientes (nombre, direccion, telefono) VALUES
('Juan Pérez', 'Av. Las Flores 123, Santiago', '987654321'),
('María Gómez', 'Calle Los Olivos 45, Valparaíso', '945612378'),
('Carlos Ruiz', 'Pasaje El Sol 233, Concepción', '912345678'),
('Ana Martínez', 'Av. Central 890, La Serena', '956789012'),
('Pedro Sánchez', 'Calle Norte 12, Temuco', '934567890');

-- Inserta al menos diez nuevos pedidos en la tabla «pedidos». Asegúrate de asignar correctamente el cliente correspondiente a cada pedido utilizando la columna «cliente_id».
INSERT INTO pedidos (id_cliente, fecha, total)
VALUES
(1, '2025-01-05', 45000),
(2, '2025-01-10', 29990),
(3, '2025-01-12', 120000),
(1, '2025-01-15', 18000),
(4, '2025-01-18', 75500),
(5, '2025-01-20', 39990),
(3, '2025-01-22', 85000),
(2, '2025-01-25', 23000),
(2, '2025-01-28', 150000),
(2, '2025-01-30', 52000);

-- Proyecta todos los clientes de la tabla «clientes» y sus respectivos pedidos.
SELECT c.id_cliente, c.nombre, c.direccion, c.telefono, p.fecha, p.total  FROM clientes c 
INNER JOIN pedidos p ON  p.id_cliente = c.id_cliente;

-- Proyecta todos los pedidos realizados por un cliente específico, utilizando su ID.
SELECT c.id_cliente, c.nombre, c.direccion, c.telefono, p.fecha, p.total  FROM clientes c 
INNER JOIN pedidos p ON  p.id_cliente = c.id_cliente
WHERE c.id_cliente = 2;

-- Calcula el total de todos los pedidos para cada cliente.
SELECT c.id_cliente, c.nombre, SUM(p.total) AS total_pedidos  FROM clientes c 
INNER JOIN pedidos p ON  p.id_cliente = c.id_cliente
GROUP BY c.id_cliente;

-- Elimina un cliente específico de la tabla «clientes» y todos sus pedidos asociados de la tabla «pedidos».
DELETE FROM clientes WHERE clientes.id_cliente = 1;

-- Proyecta los tres clientes que han realizado más pedidos, ordenados de forma descendente por el número de pedidos.
SELECT c.id_cliente, c.nombre, COUNT(p.id_pedido) AS cantidad_pedidos FROM clientes c 
INNER JOIN pedidos p ON  p.id_cliente = c.id_cliente
GROUP BY c.id_cliente
ORDER BY cantidad_pedidos DESC
LIMIT 3;


