/*Creamos la base de datos*/
CREATE SCHEMA tienda_en_linea DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci ;
USE tienda_en_linea;

-- creamos la tabla clientes
CREATE TABLE clientes(
	id_cliente INT NOT NULL	AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NOT NULL,
    direccion VARCHAR(100),
    correo_electronico VARCHAR(100) NOT NULL,
	PRIMARY KEY (id_cliente)
); 

--  creamos la tabla pedidos
CREATE TABLE pedidos(
	id_pedido INT NOT NULL AUTO_INCREMENT,
    id_cliente INT NOT NULL,
    fecha_pedido DATE NOT NULL,
    estado_pedido VARCHAR(45),
    PRIMARY KEY (id_pedido),
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente)
);

-- creamos la tabla produtos 
CREATE TABLE productos(
	id_producto INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(80),
    descripcion VARCHAR(100),
    precio DOUBLE,
    PRIMARY KEY (id_producto)
);