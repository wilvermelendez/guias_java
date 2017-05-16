<%-- 
    Document   : index
    Created on : Apr 5, 2017, 11:11:20 PM
    Author     : wilver
--%>
<jsp:useBean id="registrarEmpleado" class="sv.udb.edu.util.Empleado" scope="request"/>
    <jsp:setProperty name="registrarEmpleado" property="*" />
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
                    <%
                        boolean resultado=false;
                        if(registrarEmpleado.getfName()!=null)
                        {
                            resultado=registrarEmpleado.insertarEmpleado();
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
                    <form method="post" action="RegistrarEmpleado.jsp">

                        <div class="form-group">
                            <input type="text" class="form-control" id="fName" name="fName" placeholder="Ingrese su nombre" required="true">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="lName" name="lName" placeholder="Ingrese su apellido" required="true">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="address1" name="address1" placeholder="Ingrese direcci&oacute;n 1" required="true">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="address2" name="address2" placeholder="Ingrese direcci&oacute;n 2" required="true">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="city" name="city" placeholder="Ingrese la ciudad" required="true">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="state" pattern="[a-zA-Z]{2}" name="state" placeholder="Ingrese el estado" required="true">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="zip" name="zip" placeholder="Ingrese el código zip" required="true">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="phone" name="phone" placeholder="Ingrese el número de télefono" required="true">
                        </div>
                        <button type="submit" class="btn btn-primary">Registrar Empleado</button>
                  </form>
                    <%
                        if(resultado)
                        {
                        %>
                            <div class="alert-success">Empleado registrado exitosamente.</div>
                        <%  
                        }
                        else if(resultado==false &&registrarEmpleado.getfName()!=null)
                        {
                        %>
                            <div class="alert-danger">Error al registrar el empleado.</div>
                        <%
                        }
                    %>
                </div>
            </div>
        </div>
    </header>
</body>
</html>
