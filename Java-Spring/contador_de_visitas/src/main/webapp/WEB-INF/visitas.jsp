<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Dashboard </title>
		<link rel="stylesheet" href="css/styles.css">
	</head>
	<body>
		<h1> Cuenta de Visitas: ${numDeVisitas}</h1>
		
		 <a href="/visitas/agregar">
            <button type="button">Agregar Visita</button>
        </a>
	</body>
</html>