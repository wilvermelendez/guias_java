<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expresiones JSP</title>
    </head>
    <body>
        <h2>Expresiones JSP</h2>
        <ul>
            <li>Hora Actual: <%= new java.util.Date()%>
            <li>Servidor:<%=application.getServerInfo()%> </li>
        </ul>
    </body>
</html>
