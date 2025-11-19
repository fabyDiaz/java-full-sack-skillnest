# Empleados en una Empresa de Software

## Objetivo
Practicar el diseño de un **Diagrama Entidad–Relación (ERD)** para una empresa de software que gestiona información sobre sus empleados, proyectos y departamentos.

---

## Descripción
Se debe diseñar un ERD que modele las siguientes reglas de negocio:

- Cada **empleado** pertenece a un **departamento**.
- Un **empleado** puede trabajar en **múltiples proyectos**.
- Un **proyecto** puede tener **varios empleados** asignados.
- Los **departamentos** tienen nombre y ubicación.
- Los **proyectos** tienen nombre, descripción y fechas de inicio y fin.

---

## Requerimientos (Entidades y atributos)

### Empleados
- `id_empleado` (PK)  
- `nombre`  
- `apellido`  
- `email`  
- `fecha_contratacion`  
- `id_departamento` (FK -> Departamentos)

### Departamentos
- `id_departamento` (PK)  
- `nombre_departamento`  
- `ubicacion`

### Proyectos
- `id_proyecto` (PK)  
- `nombre_proyecto`  
- `descripcion`  
- `fecha_inicio`  
- `fecha_fin`


