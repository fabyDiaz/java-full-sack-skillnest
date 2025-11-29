<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Agregar Frases</title>
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
            <!-- FORMULARIO DE REGISTRO -->
            <div class="form-contenedor">
                <h2>Agregar Nueva Frase</h2>
                <form:form action="/add" method="POST" modelAttribute="frase" autocomplete="off">
                       
                    <div class="form-grupo">
                        <label for="nombre">Frase:</label>
                        <div class="input-error">
                            <form:input path="texto" type="text"/>
                            <form:errors path="texto" />
                        </div>
                    </div>

                    <div class="form-grupo">
                        <label for="apellido">Autor Original:</label>
                        <div class="input-error">
                            <form:input path="autor" type="text"/>
                            <form:errors path="autor" />
                        </div>
                    </div>

                    <div class="form-grupo">
                        <label for="correo">Categoría/Tema:</label>
                        <div class="input-error">
                            <form:input path="categoria" type="text"/>
                            <form:errors path="categoria" />
                        </div>
                    </div>

                    <div class="form-grupo">
                        <label for="password">Idioma:</label>
                        <div class="input-error">
                            <form:input path="idioma" type="text"/>
                            <form:errors path="idioma" />
                        </div>
                    </div>

                    <input type="hidden" value="${idUsuario}" name = "creador">


                    <input type="submit" value="Registrarse" class="btn">
                </form:form>
        </div>
    </body>
</html>