<%-- 
    Document   : Ejemplo03_LenguajeFavorito
    Created on : Apr 27, 2017, 6:44:06 PM
    Author     : wilver
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pagina de prueba del uso de beans</h1>
        <form method="post" action="Ejemplo04_Bean2.jsp">
            <p>Se envia el formulario al servicio cuyo fichero es beans.jsp</p>
            <p>Por favor, ingrese su nombre:<input type="text" name="nombre"></p>
            <br>Cuál es tu lenguaje de programación favorito?
            <select name="lenguaje">
                <option value="Java">Java</option>
                <option value="C++">C++</option>
                <option value="C#">C#</option>
                <option value="PHP">PHP</option>
                <option value="Perl">Perl</option>
            </select>
            <input type="submit" value="Enviar" />
        </for>
    </body>
</html>
