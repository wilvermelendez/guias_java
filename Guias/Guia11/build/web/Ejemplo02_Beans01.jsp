<%-- 
    Document   : Ejemplo02_Beans01
    Created on : Apr 27, 2017, 6:29:06 PM
    Author     : wilver
--%>
<%
    String nom_cli="John";
    String ape_cli="Chambers";
    String dir_cli="Cisco";
%>
<jsp:useBean id="cli_bean" class="sv.edu.udb.ClienteBean"/>
<jsp:setProperty name="cli_bean" property="nomb_cli" value="<%=nom_cli%>" />
<jsp:setProperty name="cli_bean" property="ape_cli" value="<%=ape_cli%>" />
<jsp:setProperty name="cli_bean" property="dir_cli" value="<%=dir_cli%>"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ejemplo 2: JavaBeans</h1>
        <jsp:getProperty name="cli_bean" property="nomb_cli" />
        <%
            out.println("<h3>Nombre: "+ cli_bean.getNomb_cli() +"<br />");
            out.println("<h3>Apellido: "+ cli_bean.getApe_cli()+"<br />");
            out.println("<h3>Dirección: "+ cli_bean.getDir_cli()+"<br />");
        %>
    </body>
</html>
