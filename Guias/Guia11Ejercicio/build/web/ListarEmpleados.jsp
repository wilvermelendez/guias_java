<%-- 
    Document   : index
    Created on : Apr 5, 2017, 11:11:20 PM
    Author     : wilver
--%>
<%@page import="sv.udb.edu.util.Empleado"%>
<%@page import="java.util.List"%>
<jsp:useBean id="listarEmpleados" class="sv.udb.edu.util.Empleado" scope="page" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Tarea Gu&iacute;a 11</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Theme CSS -->
    <link href="css/creative.min.css" rel="stylesheet">
</head>

<body id="page-top">
    <%
        boolean resultado=false,  requestData=false;
        
        if(request.getParameter("codigoEmpleado")!=null &&request.getParameter("codigoEmpleado")!="")
        {
            requestData=true;
            listarEmpleados.setEmployee_num(Integer.parseInt(request.getParameter("codigoEmpleado")));
            resultado=listarEmpleados.eliminarEmpleado();
        }
    %>
    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
         <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="RegistrarEmpleado.jsp">Agregar Empleados</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="ListarEmpleados.jsp">Listar Empleados</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <header>
        <div class="container">
            <div class="header-content">
                <div class="header-content-inner">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Apellido</th>
                                <th>Primer Nombre</th>
                                <th>Modificar</th>
                                <th>Eliminar</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            List<Empleado> lista=listarEmpleados.listarEmpleados();
                            for(Empleado empleado:lista)
                            {
                            %>
                            <tr>
                                <td><%=empleado.getlName()%></td>
                                <td><%=empleado.getfName()%></td>
                                <td><a href="ActualizarEmpleado.jsp?codigoEmpleado=<%=empleado.getEmployee_num()%>">Modificar</a></td>
                                <td><a href="ListarEmpleados.jsp?codigoEmpleado=<%=empleado.getEmployee_num()%>">Eliminar</a></td>
                            </tr>
                            <%
                            }
                            %>
                            </tbody>
                    </table>
                     <%
                        if(resultado && requestData)
                        {
                        %>
                            <div class="alert-success">Empleado eliminado exitosamente.</div>
                        <%  
                        }
                        else if(resultado==false && requestData==true)
                        {
                        %>
                            <div class="alert-danger">Error al eliminar el empleado.</div>
                        <%
                        }
                    %>
                </div>
            </div>
        </div>
    </header>
</body>
</html>
