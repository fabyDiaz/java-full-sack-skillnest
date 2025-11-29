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
        <h1>FREASES</h1>
            <ul id="nav">
                <li><a href="/">Login</a></li>
                <li><a href="/form/registro">Registro</a></li>
            </ul>
        <div class="container">
            <!-- FORMULARIO DE REGISTRO -->
            <div class="form-contenedor">
                <h2>Iniciar Sesión</h2>
                <form:form action="/register" method="POST" modelAttribute="usuario" autocomplete="off">
                       
                    <div class="form-grupo">
                        <label for="nombre">Nombre:</label>
                        <div class="input-error">
                            <form:input path="nombre" type="text"/>
                            <form:errors path="nombre" />
                        </div>
                    </div>

                    <div class="form-grupo">
                        <label for="apellido">Apellido:</label>
                        <div class="input-error">
                            <form:input path="apellido" type="text"/>
                            <form:errors path="apellido" />
                        </div>
                    </div>

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

                    <div class="form-grupo">
                        <label for="confirmarPassword">Confirmar Contraseña:</label>
                        <div class="input-error">
                            <form:input path="confirmarPassword" type="password"/>
                            <form:errors path="confirmarPassword"/>
                        </div>
                    </div>

                    <input type="submit" value="Registrarse" class="btn">
                </form:form>
        </div>
    </body>
</html>