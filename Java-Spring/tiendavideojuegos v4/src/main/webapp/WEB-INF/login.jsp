<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Inicio de Sesión</title>
        <link rel="stylesheet" href="/css/style.css">
    </head>
    <body>
        <h2>Registrarse</h2>
        <form action="/register" method="POST">
            <label for="nombre">Nombre:</label>
            <input type="text" name="nombre">

            <label for="apellido">Apellido:</label>
            <input type="text" name="apellido">

            <label for="email">Correo Electrónico:</label>
            <input type="email" name="email">

            <label for="password">Contraseña:</label>
            <input type="password" name="password">
            <span>${errorLongitudPassword}</span>

            <input type="submit" value="Registrarse">
        </form>

        <h2>Iniciar Sesión</h2>
        <form action="/login" method="POST">
            <label for="email">Correo Electrónico:</label>
            <input type="email" name="email">

            <label for="password">Contraseña:</label>
            <input type="password" name="password">
            <span>${errorPassword1}</span>

            <input type="submit" value="Iniciar Sesión">
        </form>
    </body>
</html>