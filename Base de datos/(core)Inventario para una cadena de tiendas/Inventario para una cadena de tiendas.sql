/*
Inventarios para una Cadena de Tiendas (Core)
**Fabiola Díaz**
Esta tarea implica diseñar un ERD para un sistema de gestión de inventarios para una cadena de tiendas. 
Cada tienda tiene su propio inventario de productos que se gestionan mediante pedidos a proveedores.
*/

CREATE DATABASE inventario_en_tiendas;
USE inventario_en_tiendas;

-- Tiendas: ID de tienda, nombre de la tienda, dirección, teléfono.
CREATE TABLE tiendas(
	id_tienda INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre_tienda VARCHAR(100),
    direccion VARCHAR(100),
    tielefono VARCHAR(10)
);

-- Productos: ID de producto, nombre del producto, descripción, precio.
CREATE TABLE productos(
	id_producto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre_producto VARCHAR(80),
    descripcion VARCHAR(100),
    precio DOUBLE
);


-- Categorías: ID de categoría, nombre de la categoría.
CREATE TABLE categorias(
	id_categoria INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre_categoria VARCHAR(45)
);

-- Inventarios: ID de inventario, ID de tienda, ID de producto, cantidad en stock.
CREATE TABLE inventarios(
	id_inventario INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_tienda INT UNIQUE, 
    id_producto INT,
    cantidad_stock INT,
    FOREIGN KEY (id_tienda) REFERENCES tiendas(id_tienda),
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);

-- Proveedores: ID de proveedor, nombre del proveedor, dirección, teléfono.
CREATE TABLE proveedores(
	id_proveedor INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre_proveedor VARCHAR(45),
    direccion VARCHAR(100),
    telefono VARCHAR(100)
);

-- Pedidos: ID de pedido, ID de proveedor, fecha de pedido, estado del pedido.
CREATE TABLE pedidos(
	id_pedido INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_proveedor INT,
    fecha_pedido DATE,
    estado_pedido VARCHAR(10),
    FOREIGN KEY (id_proveedor) REFERENCES proveedores(id_proveedor)
);

CREATE TABLE categoria_productos(
	id_categoria INT NOT NULL UNIQUE,
    id_producto INT NOT NULL UNIQUE,
    PRIMARY KEY (id_categoria, id_producto),
    FOREIGN KEY (id_categoria) REFERENCES categorias(id_categoria),
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);

CREATE TABLE pedidos_productos(
	id_pedido INT NOT NULL UNIQUE,
    id_producto INT NOT NULL UNIQUE,
    PRIMARY KEY (id_pedido, id_producto),
    FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido),
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);


