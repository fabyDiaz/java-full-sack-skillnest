# Inventarios para una Cadena de Tiendas (Core)

## Objetivos
Practicar el diseño de ERD.  
Esta tarea implica diseñar un ERD para un sistema de gestión de inventarios para una cadena de tiendas. Cada tienda tiene su propio inventario de productos que se gestionan mediante pedidos a proveedores.

## Requerimientos

### Tiendas
- ID de tienda  
- Nombre de la tienda  
- Dirección  
- Teléfono

### Productos
- ID de producto  
- Nombre del producto  
- Descripción  
- Precio

### Categorías
- ID de categoría  
- Nombre de la categoría

### Inventarios
- ID de inventario  
- ID de tienda  
- ID de producto  
- Cantidad en stock

### Proveedores
- ID de proveedor  
- Nombre del proveedor  
- Dirección  
- Teléfono

### Pedidos
- ID de pedido  
- ID de proveedor  
- Fecha de pedido  
- Estado del pedido
