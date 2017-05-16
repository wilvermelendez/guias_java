<%-- 
    Document   : Ejemplo04_Bean2
    Created on : Apr 27, 2017, 7:01:43 PM
    Author     : wilver
--%>
<jsp:useBean id="lenguajeBean" scope="page" class="sv.edu.udb.LenguajeBean"/>
<jsp:setProperty name="lenguajeBean" property="*" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado de prueba del uso de beans</title>
    </head>
    <body>
        <h1>Resultado</h1>
        <p>Hola
            <jsp:getProperty name="lenguajeBean" property="nombre" />.</p>
        <p>Tu lenguaje favorito es 
            <jsp:getProperty name="lenguajeBean" property="lenguaje"/>
        </p>
        <p>Mis comentarios acerca del lenguaje
            <jsp:getProperty name="lenguajeBean" property="comentarios"/>
        </p>
    </body>
</html>
