<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Inicio de Sesión</title>
        <link rel="stylesheet" href="/css/style.css">
    </head>
    <body>
        <div class="titulo">
        <h2>Agregar Libro</h2>
        </div>
        <form action="/procesa/registro" method="POST">
            <div>
                <label for="nombre">Nombre</label>
                <input type="text" name="nombre">
                <span>${errorNombre}</span>
            </div>

            <div>
                <label for="apellido">Apellido:</label>
                <input type="text" name="apellido">
                <span>${errorApellido}</span>
            </div>

            <div>
                <label for="edad">Edad:</label>
                <input type="number" min="1" max="120" value=0 name="edad">
                <span>${errorEdad}</span>
            </div>

            <div>
                <label for="correo">Correo Electrónico:</label>
                <input type="text" name="correo">
                <span>${errorCorreo}</span>
            </div>

            <div>
                <label for="contrasenia">Contraseña:</label>
                <input type="password" name="contrasenia">
                <span>${errorContrasenia}</span>
            </div>

            <div>
                <label for="confirmacionContrasenia">Confirmar contraseña:</label>
                <input type="password" name="confirmacionContrasenia">
                <span>${errorConfirmacion}</span>
            </div>

            <div>
                <input type="submit" value="Agregar">
            </div>
        </form>

    </body>
</html>