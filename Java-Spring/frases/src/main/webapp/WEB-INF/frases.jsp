<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Frases</title>
        <link rel="stylesheet" href="/css/style.css">
    </head>
    <body>
        <h1>FREASES</h1>
            <ul id="nav">
                <li><a href="/favoritos">Mis favoritos</a></li>
                <li><a href="/frases">Todas las frases</a></li>
                <li><a href="/form/add">Agregar Frase</a></li>
                <li><a href="/logout">Logout</a></li>
            </ul>
        <div class="container">
            <h2>Bienvenido de vuelta ${nombreCompleto}</h2>
            <ul>
                <c:forEach var = "frase" items="${frases}">
                    <li>${frase.texto}</li>
                </c:forEach>
            </ul>
        </div>
    </body>
</html>