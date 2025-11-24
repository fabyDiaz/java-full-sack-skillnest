<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Videojuegos</title>
        <link rel="stylesheet" href="/css/style.css">
    </head>
    <body>
        <form action="/logout" method="POST" >
            <button>cerrar sesion</button>
        </form>
        <div class="content">
	        <div class="titulo">
	            <h1>Bienvenido/a: ${nombre}</h1>
	        </div>
            <div class="detalle">
                <p>Nombre: ${nombre}</p>
                <p>Apellido: ${apellido}</p>
                <p>Edad: ${edad}</p>
                <p>Correo: ${correo}</p>
                <p>Contraseña: <input type=password value=${contrasenia}></p>
            </div>
        </div>
    </body>
</html>