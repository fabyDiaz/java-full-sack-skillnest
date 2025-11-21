<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Países</title>
        <link rel="stylesheet" href="/css/style.css">
    </head>
    <body>

    
        <c:if test="${not empty mensaje}">
            <p>${mensaje}</p>
        </c:if>

        <c:if test="${not empty pais}">
            <h1>Capital de ${pais}</h1>

            <div>
                <p>${capital}</p>
            </div>
        </c:if>

       
    </body>
</html>