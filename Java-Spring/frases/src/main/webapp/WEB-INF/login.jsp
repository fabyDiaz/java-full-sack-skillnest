<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Registro e Inicio de Sesión</title>
        <link rel="stylesheet" href="/css/style.css">
    </head>
    <body>
        <div class="container">
            <h1>FREASES</h1>
            <ul id="nav">
                <li><a href="/">Login</a></li>
                <li><a href="/form/registro">Registro</a></li>
            </ul>
            <!-- FORMULARIO DE LOGIN -->

            <h2>Registro</h2>
            <div class="form-contenedor">
                <form:form action="/login" method="POST" modelAttribute="loginUsuario" autocomplete="off">
                    <h2>Login</h2>

                   <div class="form-grupo">
                        <label for="correo">Correo Electrónico:</label>
                        <div class="input-error">
                            <form:input path="correo" type="email" id="correo"/>
                            <form:errors path="correo" />
                        </div>
                    </div>

                    <div class="form-grupo">
                        <label for="password">Contraseña:</label>
                        <div class="input-error">
                            <form:input path="password" type="password"/>
                            <form:errors path="password" />
                        </div>
                    </div>
                    <input type="submit" value="Login" class="btn">
                </form:form>
            </div>
        </div>
    </body>
</html>