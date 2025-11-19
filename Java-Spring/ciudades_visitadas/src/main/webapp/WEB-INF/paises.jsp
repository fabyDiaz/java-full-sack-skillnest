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

         <h1>Lista de países</h1>

            <div>
                <ul>
                    <c:forEach var="pais" items="${listaPaises.keySet()}">
                        <li>${pais}</li>
                     </c:forEach>
                   </ul>
            </div>
    </body>
</html>