<%-- 
    Document   : index
    Created on : Apr 5, 2017, 11:11:20 PM
    Author     : wilver
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="java.util.*" session="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Tarea Gu&iacute;a 9</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Theme CSS -->
    <link href="css/creative.min.css" rel="stylesheet">
</head>

<body id="page-top">
    <header>
        <div class="container">
            <div class="header-content">
                <div class="header-content-inner">
                    <h3>N&uacute;mero mayor y menor</h3>
                    <div>
                        <c:if test="${ not empty param.number1}">
                            <fmt:parseNumber var="numero1" type="number" value="${param.number1}" />
                            <fmt:parseNumber var="numero2" type="number" value="${param.number2}" />
                            <fmt:parseNumber var="numero3" type="number" value="${param.number3}" />
                            <c:if test="${numero1>numero2 && numero1>numero3}">
                                <c:set var="numeroMayor" scope="page" value="${numero1}"/>
                            </c:if>
                            <c:if test="${numero2>numero1 && numero2>numero3}">
                                <c:set var="numeroMayor" scope="page" value="${numero2}"/>
                            </c:if>
                            <c:if test="${numero3>numero1 && numero3>numero2}">
                                <c:set var="numeroMayor" scope="page" value="${numero3}"/>
                            </c:if>
                            
                            <c:if test="${numero1<numero2 && numero1<numero3}">
                                <c:set var="numeroMenor" scope="page" value="${numero1}"/>
                            </c:if>
                            <c:if test="${numero2<numero1 && numero2<numero3}">
                                <c:set var="numeroMenor" scope="page" value="${numero2}"/>
                            </c:if>
                            <c:if test="${numero3<numero1 && numero3<numero2}">
                                <c:set var="numeroMenor" scope="page" value="${numero3}"/>
                            </c:if>
                            <spam class="alert-info"><c:out value="Número mayor: ${numeroMayor}"/></spam>
                            <br />
                            <spam class="alert-info"><c:out value="Número menor: ${numeroMenor}"/></spam>
                            
                        </c:if>
                    </div>
                    <form method="post" action="EjercicioIf.jsp">
                        <div class="form-group">
                            <input type="number" class="form-control" id="number1" name="number1" placeholder="Ingrese numero 1" required="true">
                        </div>
                        <div class="form-group">
                            <input type="number" class="form-control" id="number2" name="number2" placeholder="Ingrese numero 2" required="true">
                        </div>
                        <div class="form-group">
                            <input type="number" class="form-control" id="number3" name="number3" placeholder="Ingrese numero 3" required="true">
                        </div>
                        <button type="submit" class="btn btn-primary">Procesar</button>
                  </form>
                </div>
            </div>
        </div>
    </header>
</body>
</html>
