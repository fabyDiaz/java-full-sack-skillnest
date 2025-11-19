<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>videojuegos</title>
    </head>
    <body>
        <h1>VIDEOJUEGOS:</h1>
        <ul>
           <c:forEach var="juego" items="${videojuegos}">
                <li>Nombre: <b>${juego.nombre}</b></li>
                <li>Descripcion: <b>${juego.descripcion}</b></li>
                <li>Portada: <b>${juego.portada}</b></li>
                <br>
            </c:forEach>
        </ul>

    </body>

</html>