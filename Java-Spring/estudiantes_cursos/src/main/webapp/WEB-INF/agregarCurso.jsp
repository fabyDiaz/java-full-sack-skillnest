<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar Curso</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="/cursos">Cursos</a>
        <div class="navbar-nav">
            <a class="nav-link" href="/cursos">Lista de Cursos</a>
            <a class="nav-link" href="/cursos/formulario/agregar">Nuevo Curso</a>
            <a class="nav-link" href="/estudiantes/formulario/agregar">Nuevo Estudiante</a>
        </div>
    </div>
</nav>


<div class="container mt-4">
    <h1>Nuevo Curso</h1>
    
    <div class="card">
        <div class="card-body">
            <form:form action="/cursos/procesa/agregar" method="POST" modelAttribute="curso">
                <div class="mb-3">
                    <form:label path="nombre" class="form-label">Nombre del Curso:</form:label>
                    <form:input type="text" path="nombre" class="form-control" 
                                placeholder="Ej: Matemáticas Avanzadas"/>
                    <form:errors path="nombre" class="text-danger"/>
                </div>
                
                <div class="d-flex gap-2">
                    <button type="submit" class="btn btn-primary">Agregar Curso</button>
                    <a href="/cursos" class="btn btn-secondary">Volver</a>
                </div>
            </form:form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>