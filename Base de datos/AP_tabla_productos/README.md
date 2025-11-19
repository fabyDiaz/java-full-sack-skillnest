# Tabla de productos (Actividad práctica)

## Modelo ERD de la tabla `productos`

| Campo  | Tipo    | Descripción            |
|--------|---------|------------------------|
| id     | PK      | Identificador único    |
| nombre | VARCHAR | Nombre del producto    |
| precio | DOUBLE  | Precio del producto    |
| stock  | INT     | Cantidad disponible    |

---

## Objetivo
Practicar queries básicos.

---

## Requerimientos

- Crear el modelo ERD de la tabla `productos`.
- Generar la base de datos utilizando **Forward Engineer**.
- Insertar al menos **cinco registros** en la tabla `productos`.
- Actualizar el **precio del producto con ID = 2** a **40.00**.
- Proyectar todos los productos que tienen **stock igual a cero**.
- Calcular el **valor total del inventario**, sumando el precio de todos los productos disponibles.
- Eliminar el **producto con ID = 3** de la tabla `productos`.
- Proyectar **todos los productos**.
- Proyectar **los tres productos con el precio más alto**, ordenados de forma descendente por precio.
- Entregar un archivo **.sql** con todas las consultas ejecutadas.

