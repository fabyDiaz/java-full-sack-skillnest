CREATE SCHEMA tienda_electronica DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci ;

-- Tabla productos
CREATE TABLE productos(
	id_productos INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    marca VARCHAR(45) NOT NULL,
    precio DOUBLE NOT NULL,
    stock INT NOT NULL,
    PRIMARY KEY (id_productos)
);

-- tabla proveedor
CREATE TABLE proveedores(
	id_proveedor INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL, 
    direccion VARCHAR(100),
    correo_electronico VARCHAR(100),
    PRIMARY KEY (id_proveedor)
);

-- tabla inventario
CREATE TABLE inventarios(
	id_inventario INT NOT NULL AUTO_INCREMENT,
    id_producto INT NOT NULL,
    id_proveedor INT NOT NULL,
    fecha_recepcion DATE NOT NULL,
    cantidad_recibida INT NOT NULL DEFAULT 0,
    PRIMARY KEY (id_inventario),
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto),
    FOREIGN KEY (id_proveedor) REFERENCES proveedores(id_proveedor)
);