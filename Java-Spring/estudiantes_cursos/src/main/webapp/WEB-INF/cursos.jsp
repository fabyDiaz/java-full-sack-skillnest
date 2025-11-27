<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cursos</title>
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
    <h1>Lista de cursos</h1>
    
    <div class="accordion" id="accordionCursos">
        <c:forEach var="curso" items="${listaCursos}" varStatus="status">
            <div class="accordion-item">
                <h2 class="accordion-header d-flex align-items-center">
                    <button class="accordion-button collapsed flex-grow-1" type="button" 
                            data-bs-toggle="collapse" 
                            data-bs-target="#collapse${status.index}" 
                            aria-expanded="false" 
                            aria-controls="collapse${status.index}">
                        ${curso.nombre}
                    </button>
                    <a href="/formulario/cursos/estudiantes/${curso.id}" 
                       class="btn btn-sm btn-primary ms-2 me-2"
                       style="white-space: nowrap;">
                        + Agregar Estudiante
                    </a>
                </h2>
                <div id="collapse${status.index}" 
                     class="accordion-collapse collapse" 
                     data-bs-parent="#accordionCursos">
                    <div class="accordion-body">
                        <h5>Estudiantes inscritos:</h5>
                        <c:choose>
                            <c:when test="${empty curso.estudiantes}">
                                <p class="text-muted">No hay estudiantes inscritos en este curso.</p>
                            </c:when>
                            <c:otherwise>
                                <ol class="list-group list-group-numbered">
                                    <c:forEach var="estudiante" items="${curso.estudiantes}">
                                        <li class="list-group-item">
                                            ${estudiante.nombre} ${estudiante.apellido} - Edad: ${estudiante.edad}
                                        </li>
                                    </c:forEach>
                                </ol>
                            </c:otherwise>
                        </c:choose>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>