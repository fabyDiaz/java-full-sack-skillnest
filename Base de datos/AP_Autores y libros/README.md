# Autores y Libros (Actividad práctica)

## Objetivos
Practicar queries con JOINS.

---

## Requerimientos

Crear el siguiente modelo ERD para una base de datos de autores y libros.


### Tabla: autores
| Campo             | Descripción |
|-------------------|-------------|
| id (PK)           |             |
| nombre            |             |
| nacionalidad      |             |
| fecha_publicacion |             |

### Tabla: libros
| Campo          | Descripción |
|----------------|-------------|
| id (PK)        |             |
| autor_id (FK)  |             |
| titulo         |             |
| genero         |             |
| editorial      |             |


- Generar la base de datos utilizando “Forward Engineer”.
- Inserta al menos cinco nuevos autores en la tabla «autores».
- Inserta al menos diez nuevos libros en la tabla «libros». Asegúrate de asignar correctamente el autor correspondiente a cada libro utilizando la columna «autor_id».
- Proyecta todos los autores de la tabla «autores» y sus respectivos libros.
- Proyecta todos los libros escritos por un autor específico, utilizando su ID.
- Cuenta el número de libros para cada género literario (por ejemplo, ficción, no ficción, romance, etc.).
- Actualiza la nacionalidad de un autor específico en la tabla «autores».
- Proyecta todos los autores donde su nombre empiece con “Al”.
- Elimina un autor específico de la tabla «autores» y todos los libros asociados de la tabla «libros».
- Proyecta todos los autores y, si tienen libros asociados, también muestra los detalles de esos libros. Incluso debe mostrar los autores que no tienen ningún libro registrado.
- Entrega un archivo .sql que contenga todas las consultas que ejecutaste en el entorno de trabajo.
