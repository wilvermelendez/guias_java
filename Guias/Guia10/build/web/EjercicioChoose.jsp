<%-- 
    Document   : index
    Created on : Apr 5, 2017, 11:11:20 PM
    Author     : wilver
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <form method="post" action="EjercicioChoose.jsp">
                        <p>Seleccione su deporte favorito:</p>
                        <div class="radio">
                            <label><input type="radio" name="optradio" Value="Boxeo">Boxeo</label>
                        </div>
                        <div class="radio">
                            <label><input type="radio" name="optradio" Value="MMA">Artes Marciales mixtas</label>
                        </div>
                        <div class="radio">
                            <label><input type="radio" name="optradio" Value="Futbol">Futbol</label>
                        </div>
                        <div class="radio">
                            <label><input type="radio" name="optradio" Value="Baloncesto">Baloncesto</label>
                        </div>
                        <div class="radio">
                            <label><input type="radio" name="optradio" value="Voleibol">Voleibol</label>
                        </div>
                        <div class="radio">
                            <label><input type="radio" name="optradio" value="Beisbol">Béisbol</label>
                        </div>
                        <div class="radio">
                            <label><input type="radio" name="optradio" value="Otro">Otro</label>
                        </div>
                        <button type="submit" class="btn btn-primary">Procesar</button>
                  </form>
                    <div>
                        <c:if test="${ not empty param.optradio}">
                            <c:set var="opcion" value="${param.optradio}"/>
                            <c:choose>  
                            <c:when test="${opcion=='Boxeo'}">  
                                <p>
                                    <span class="alert-warning">Su selección fue Boxeo</span>
                                </p>
                            </c:when>  
                            <c:when test="${opcion=='MMA'}">  
                                <p>
                                    <span class="alert-danger">Su selección fue Arter Marciales Mixtas (MMA).</span>
                                </p>
                            </c:when> 
                            <c:when test="${opcion=='Futbol'}">  
                                <p>
                                    <span class="alert-info">Su selección fue Futbol.</span>
                                </p>
                            </c:when>
                            <c:when test="${opcion=='Baloncesto'}">  
                                <p>
                                    <span class="alert-success">Su selección fue Baloncesto.</span>
                                </p>
                            </c:when> 
                             <c:when test="${opcion=='Voleibol'}">  
                                <p>
                                    <span class="alert-dismissable">Su selección fue Voleibol.</span>
                                </p>
                            </c:when>
                            <c:when test="${opcion=='Beisbol'}">  
                                <p>
                                    <span class="bg-info">Su selección fue Beisbol.</span>
                                </p>
                            </c:when>
                            <c:otherwise>  
                               <p>Valor no definido</p> 
                            </c:otherwise>  
                        </c:choose>  
                        </c:if>
                    </div>
                </div>
                
            </div>
        </div>
    </header>
</body>
</html>
