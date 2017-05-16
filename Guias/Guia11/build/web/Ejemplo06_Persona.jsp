<%-- 
    Document   : Ejemplo06_Persona
    Created on : Apr 27, 2017, 7:25:32 PM
    Author     : wilver
--%>
<jsp:useBean id="cientifico" scope="request" class="sv.edu.udb.PersonaBean"/>
<jsp:setProperty name="cientifico" property="*"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP:useBean</title>
    </head>
    <body>
        <h1>Uso de jsp:useBean coorinado con parámetros de la petición</h1>
        <p>El científico es 
            <jsp:getProperty name="cientifico" property="nombre" />.
            Sue edad es:
            <jsp:getProperty name="cientifico" property="edad"/>.
        </p>
        <p>A continuación usamos getProperty, sin que hay una propiedad de clase Bean para
            soportar los metodos getTipo() y getEsJoven():
        </p>
        <ul>
            <li>Tipo:
                <jsp:getProperty name="cientifico" property="tipo"/>
            </li>
            <li>Joven?
                <jsp:getProperty name="cientifico" property="esJoven"/>
            </li>
    </body>
</html>
