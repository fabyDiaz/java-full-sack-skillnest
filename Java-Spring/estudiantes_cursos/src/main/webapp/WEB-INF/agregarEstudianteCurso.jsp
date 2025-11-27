<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar Estudiante a Curso</title>
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

<div class=container>
    <h1>Agregar Estudiante al Curso: ${curso.nombre} </h1>
</div>
<div class="container mt-4">
    
    <div class="card">
        <div class="card-body">
            <form action="/procesa/agregar/estudiante/curso/${curso.id}" method="post">
                
                <div class="mb-3">
                    <label for="idEstudiante" class="form-label">Selecciona un estudiante:</label>
                    <select name="idEstudiante" id="idEstudiante" class="form-select" required>
                        <option value="">-- Selecciona un estudiante --</option>
                        <c:forEach items="${estudiantes}" var="estudiante">
                            <option value="${estudiante.id}">
                                ${estudiante.nombre} ${estudiante.apellido} - Edad: ${estudiante.edad}
                            </option>
                        </c:forEach>
                    </select>
                </div>
                
                <div class="d-flex gap-2">
                    <button type="submit" class="btn btn-primary">Agregar Estudiante</button>
                    <a href="/cursos" class="btn btn-secondary">Volver</a>
                </div>
            </form>
        </div>
    </div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>