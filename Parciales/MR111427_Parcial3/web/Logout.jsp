<%-- 
    Document   : Logout
    Created on : May 14, 2017, 12:11:34 PM
    Author     : wilver
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body>
        <c:if test="${not empty usuario}">
            <c:remove var="usuarioTipo" scope="session"/>
            <c:remove var="usuario" scope="session"/>
            <c:remove var="usuarioTipo" scope="session"/>
            <c:set var="mensajeTipo" scope="session" value="1"/>
            <c:set var="mensaje" scope="session" value="Sesión cerrada existosamente."/>
            <c:redirect url="Index.jsp"/>
        </c:if>
    </body>
</html>
