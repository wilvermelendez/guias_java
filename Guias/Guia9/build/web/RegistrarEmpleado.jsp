<%-- 
    Document   : index
    Created on : Apr 5, 2017, 11:11:20 PM
    Author     : wilver
--%>
<%@page import="sv.udb.edu.util.Mensaje"%>
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
                        //Si existe sessión se registra el cliente
                        if(request.getParameter("fName")!=null &&request.getParameter("fName")!="")
                        {
                            String fName=request.getParameter("fName");
                            String lName= request.getParameter("lName");
                            String address1=request.getParameter("address1");
                            String address2=request.getParameter("address2");
                            String city=request.getParameter("city");
                            String state=request.getParameter("state");
                            String zip=request.getParameter("zip");
                            String phone=request.getParameter("phone");
                            Conexion conRegistrar=new Conexion();
                            Empleado empleado=new Empleado(fName,lName, address1,address2,city, state,zip, phone);
                            Mensaje mensaje= new Mensaje();
                            if(conRegistrar.insertarEmpleado(empleado))
                            {
                                mensaje.setTipo(1);
                                mensaje.setMensaje("Empleado Registrado correctamente");
                            }
                            else
                            {
                                mensaje.setTipo(2);
                                mensaje.setMensaje("Error al registrar al empleado");
                            }
                            session.setAttribute("Mensaje", mensaje);
                        }
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
                        if(session.getAttribute("Mensaje")!=null)
                        {
                            Mensaje mensaje= new Mensaje();
                            mensaje=(Mensaje)session.getAttribute("Mensaje");
                            if(mensaje.getTipo()==1)
                            {
                            %>
                                <div class="alert-success"><%=mensaje.getMensaje()%></div>
                            <%  
                            }
                            else if(mensaje.getTipo()==2)
                            {
                            %>
                                <div class="alert-danger"><%=mensaje.getMensaje()%></div>
                            <%
                            }
                            session.removeAttribute("Mensaje");
                        }
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
