<%-- 
    Document   : index
    Created on : Apr 5, 2017, 11:11:20 PM
    Author     : wilver
--%>
<%@page import="sv.udb.edu.util.Mensaje"%>
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
                     session=request.getSession();
                     //verificamos si se recibe datos
                     if(request.getParameter("usuario")!=null && request.getParameter("password")!=null)
                     {//
                         String usuario=request.getParameter("usuario");
                         String password=request.getParameter("password");
                         String passwordEncriptado=Utileria.hashPassword(password);
                         Conexion con= new Conexion();
                         Mensaje mensaje= new Mensaje();
                         if(con.login(usuario,passwordEncriptado))
                         {
                            mensaje.setTipo(1);
                            mensaje.setMensaje("Usuario logeado correctamente");
                            session.setAttribute("usuario", usuario);
                         }
                         else
                         {
                            mensaje.setTipo(2);
                            mensaje.setMensaje("Error, datos incorrectos para inicar sesi&oacute;n");
                         }
                         session.setAttribute("Mensaje", mensaje);
                     }
                    if(session.getAttribute("usuario") != null)
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
                        
                    if(session.getAttribute("usuario") == null)
                    {   
                    %>
                    <form method="post" action="Index.jsp">
                        <div class="form-group">
                            <label for="usuario">Usuario</label>
                            <input type="text" class="form-control" name="usuario" id="usuario" placeholder="Ingrese su usuario" required="true" autocomplete="off">
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" class="form-control" name="password" id="password" placeholder="Password" required="true">
                        </div>
                        <button type="submit" class="btn btn-primary">Iniciar Sessi&oacute;n</button>
                  </form>
                    <%
                    }
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
                    %>
                </div>
            </div>
        </div>
    </header>
</body>
</html>
