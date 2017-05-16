<%-- 
    Document   : ejemplo01_BeanSencillo
    Created on : Apr 27, 2017, 6:24:42 PM
    Author     : wilver
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acción jsp:UseBean</title>
    </head>
    <body>
        <h1>Date Java Beans</h1>
        <jsp:useBean id="fecha" scope="page" class="java.util.Date" />
        <%=fecha%>
        
    </body>
</html>
