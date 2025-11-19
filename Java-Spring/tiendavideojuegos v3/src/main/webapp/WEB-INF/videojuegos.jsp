<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>videojuegos</title>
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

        <h1>VIDEOJUEGOS</h1>
        
        <div class="games-grid">
           <c:forEach var="juego" items="${videojuegos}">
                <div class="game-card">
                    <img src="${juego.portada}" alt="${juego.nombre}" class="game-card-image" />
                    <div class="game-card-content">
                        <h3 class="game-card-title">${juego.nombre}</h3>
                        <p class="game-card-description">${juego.descripcion}</p>
                        <a href="/detail/${juego.id}" class="card-link">Ver detalles →</a>
                    </div>
                </div>
            </c:forEach>
        </div>

        <script src="/js/script.js"></script>
    </body>
</html>