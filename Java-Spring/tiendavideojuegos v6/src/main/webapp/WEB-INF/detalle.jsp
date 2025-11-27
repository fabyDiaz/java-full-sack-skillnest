<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Detalle Videojuego</title>
     <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<nav>
    <ul>
        <li><a href="/getAll">VIDEOJUEGOS</a></li>
        <li class="nav-links">
            <a href="/getAll">Lista</a>
            <a href="/add">Agregar</a>
        </li>
    </ul>
</nav>

<div class="game-detail">
    <div class="game-image">
        <img src="${videojuego.portada}" alt="${videojuego.nombre}" />
    </div>
    <div class="game-info">
        <h1>${videojuego.nombre}</h1>
        <ul>
            <li><strong>Descripción:</strong> ${videojuego.descripcion}</li>
            <li><strong>Fecha de lanzamiento:</strong> ${videojuego.fecha_lanzamiento}</li>
            <li><strong>Rating:</strong> ${videojuego.raiting} ⭐</li>
            <li>Creador: <b>${videojuego.creador.nombre} ${videojuego.creador.apellido}</b></li>
        </ul>
        <br>
    </div>
</div>
<div>
    <c:if test="${fn:length(videojuego.resenas) > 0}">
     <h4>Reseñas</h4>
     <ul>
        <c:forEach var="resena" items="${videojuego.resenas}">
            <li>${resnea.mensaje}</li>
        </c:forEach>
     </ul>
     </c:if>
</div>

<div>
    <form:form action="/comment" method="POST" modelAttribute="resena">
        <form:label path = "mensaje"> Escribir reseña:</form:label>
        <form:textarea path = "mensaje"></form:textarea>
        <form:errors path="mensaje"/>
        <input type = "hidden" name = "videojuego" value="${videojuego.id}"/>
        <input type = "submit" value = "Enviar"/>
    </form:form>


</div>
 <a href="/getAll" class="back-link">← Volver al listado</a>
</body>
</html>
