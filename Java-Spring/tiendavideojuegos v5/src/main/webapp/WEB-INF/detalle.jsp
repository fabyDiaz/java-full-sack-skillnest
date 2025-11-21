<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
        </ul>
        <br>
        <a href="/getAll" class="back-link">← Volver al listado</a>
    </div>
</div>

</body>
</html>
