<%-- 
    Document   : Empleados
    Created on : Mar 23, 2017, 7:30:15 PM
    Author     : wilver
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="sv.udb.edu.util.Empleado"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="sv.udb.edu.util.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista empleados</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Apellido</th>
                </tr>
            </thead>
            <tbody>
                <%

                    try {
                        String sql="SELECT * FROM db_employees.employees;";
                        Conexion con= new Conexion();
                        ArrayList<Empleado> empleados=con.ejecutarResult(sql);
                        for(Empleado empleado:empleados)
                        {
                        %>
                        <tr>
                            <td><%=empleado.getfName()%></td>
                            <td><%=empleado.getlName()%></td>
                        </tr>
                        
                        <%
                        }
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    finally
                    {
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
