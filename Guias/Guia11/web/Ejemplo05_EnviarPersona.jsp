<%-- 
    Document   : Ejemplo05_EnviarPersona
    Created on : Apr 27, 2017, 7:19:50 PM
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
        <h1>Hello World!</h1>
        <form  name="persona" action="Ejemplo06_Persona.jsp" method="post">
            Ingrese su nombre: <input tupe="text" name="nombre" value="" /><br />
            Ingreso su edad: <input type="text" name="edad" value="" /><br />
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
