<%-- 
    Document   : index
    Created on : Apr 5, 2017, 11:11:20 PM
    Author     : wilver
--%>
<%@page import="sv.udb.edu.util.Empleado"%>
<%@page import="sv.udb.edu.util.Utileria"%>
<%@page import="sv.udb.edu.util.Conexion"%>
<%@page import="java.util.*" session="true"%>
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

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
         <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <%
                     //verificamos si se recibe datos
                     
                      session=request.getSession();
                    if(session.getAttribute("usuario") != null && session.getAttribute("usuario")!="")
                    {                        
                    %>
                    <li>
                        <a class="page-scroll" href="RegistrarEmpleado.jsp">Agregar Empleados</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="ListarEmpleados.jsp">Listar Empleados</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="Logout.jsp">Cerrar sessión</a>
                    </li>
                    <%
                        }
                    %>
                </ul>
            </div>
        </div>
    </nav>

    <header>
        <div class="container">
            <div class="header-content">
                <div class="header-content-inner">
                    <%
                        
                    if(session.getAttribute("usuario") != null && session.getAttribute("usuario")!="")
                    {   
                    %>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Last Name</th>
                                    <th>First Name</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%

                                    try {
                                        
                                        Conexion con= new Conexion();
                                        ArrayList<Empleado> empleados=con.listarEmpleados();
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
    
                    <%
                    }
                    else
                        response.sendRedirect("Index.jsp");
                    %>
                </div>
            </div>
        </div>
    </header>
</body>
</html>
