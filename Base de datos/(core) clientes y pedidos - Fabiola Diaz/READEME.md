# Clientes y Pedidos

## Objetivos
Practicar queries con JOINS.

## Requerimientos

Crear el siguiente modelo ERD para una base de datos de clientes y pedidos:

### Tabla: clientes
| Campo     | Tipo | Descripción |
|-----------|-------|-------------|
| id (PK)   | INT   | Identificador del cliente |
| nombre    | VARCHAR | Nombre del cliente |
| direccion | VARCHAR | Dirección del cliente |
| telefono  | VARCHAR | Teléfono del cliente |

### Tabla: pedidos
| Campo          | Tipo | Descripción |
|----------------|-------|-------------|
| id (PK)        | INT   | Identificador del pedido |
| cliente_id (FK)| INT   | Cliente asociado al pedido |
| fecha          | DATE  | Fecha del pedido |
| total          | DECIMAL | Total del pedido |



Generar la base de datos utilizando “Forward Engineer”.

Inserta al menos cinco nuevos clientes en la tabla «clientes».

Inserta al menos diez nuevos pedidos en la tabla «pedidos». Asegúrate de asignar correctamente el cliente correspondiente a cada pedido utilizando la columna «cliente_id».

Proyecta todos los clientes de la tabla «clientes» y sus respectivos pedidos.

Proyecta todos los pedidos realizados por un cliente específico, utilizando su ID.

Calcula el total de todos los pedidos para cada cliente.

Elimina un cliente específico de la tabla «clientes» y todos sus pedidos asociados de la tabla «pedidos».

Proyecta los tres clientes que han realizado más pedidos, ordenados de forma descendente por el número de pedidos.

Entrega un archivo .sql que contenga todas las consultas que ejecutaste en el entorno de trabajo.
