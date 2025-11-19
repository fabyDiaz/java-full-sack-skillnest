Inscripciones a cursos
Objetivos

Practicar queries con JOINS.
 

Requerimientos

Crear el siguiente modelo ERD para una base de datos de inscripciones a cursos.

**estudiantes**
| Campo     | Tipo | Descripción |
|-----------|------|-------------|
| id (PK)   | INT  | Identificador del estudiante |
| nombre    | VARCHAR | Nombre del estudiante |
| edad      | INT  | Edad del estudiante |

**cursos**
| Campo     | Tipo | Descripción |
|-----------|------|-------------|
| id (PK)   | INT  | Identificador del curso |
| nombre    | VARCHAR | Nombre del curso |
| duracion  | INT | Duración del curso |

**inscripciones**
| Campo             | Tipo | Descripción |
|-------------------|-------|-------------|
| id_estudiante (FK)| INT   | Estudiante inscrito |
| id_curso (FK)     | INT   | Curso inscrito |

- Generar la base de datos utilizando “Forward Engineer”.
- Inserta al menos cinco nuevos estudiantes en la tabla «estudiantes».
- Inserta al menos cuatro nuevos cursos en la tabla «cursos». 
- Asociar a cuatro de los estudiantes a al menos dos de los cursos dados de alta.
Proyecta a todos los estudiantes y sus respectivos cursos.
- Proyecta todos los estudiantes que están inscritos en un curso específico, utilizando el nombre del curso como criterio de búsqueda.
- Proyecta todos los cursos en los que está inscrito un estudiante específico, utilizando su nombre como criterio de búsqueda.
- Cuenta el número de estudiantes inscritos en cada curso y muestra el nombre del curso junto con el número de estudiantes inscritos.
- Encuentra los estudiantes que no están inscritos en ningún curso.
