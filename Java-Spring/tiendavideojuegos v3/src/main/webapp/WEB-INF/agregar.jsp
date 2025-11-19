<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Agregar Videojuego</title>
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
        <h1>Agregar Videojuego:</h1>
        <form action="/add" method="POST">
            <label for="nombre">Nombre:</label>
            <input type="text" name="nombre">
            <label for="descripcion">Descripción:</label>
            <textarea name="descripcion"></textarea>
            <label for="portada">Portada:</label>
            <input type="url" name="portada">
            <label for="fecha_lanzamiento">Fecha Lanzamiento:</label>
            <input type="date" name="fecha_lanzamiento">
            <label for="rating">Rating:</label>
            <input type="number" name="rating" min="0" max="5" step="0.5">
            <input type="submit" value="Crear">
        </form> 
        <a href="/getAll">Volver</a>
    </body>
</html>