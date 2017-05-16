<%-- 
    Document   : Docentes
    Created on : May 14, 2017, 1:42:00 PM
    Author     : wilver
--%>
<jsp:useBean id="encriptarPassword" class="sv.edu.udb.EncriptarPassword" scope="request"/>
<jsp:useBean id="datosUsuario" class="sv.edu.udb.Usuario" scope="request"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page import="java.util.*" session="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Registrar Docente</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <!-- Theme CSS -->
    <link href="css/creative.min.css" rel="stylesheet">
</head>

<body id="page-top">

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <c:if test="${(not empty usuario) && (usuarioTipo eq 'Director')}">
                    <span class="navbar-brand page-scroll">Director: <c:out value="${usuario}"/> - ${escuela}</span>
                </c:if>
                <c:if test="${(not empty usuario) && (usuarioTipo eq 'DirectorDocente')}">
                    <span class="navbar-brand page-scroll">Director-Docente: <c:out value="${usuario}"/> - ${escuela}</span>
                </c:if>
                <c:if test="${(not empty usuario) && (usuarioTipo eq 'Docente')}">
                    <span class="navbar-brand page-scroll">Docente: <c:out value="${usuario}"/> - ${escuela}</span>
                </c:if>
            </div>
         <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                
                    <ul class="nav navbar-nav navbar-right">
                        <c:if test="${(not empty usuario) && (usuarioTipo eq 'Director')}">
                            <li>
                                <a class="page-scroll" href="RegistrarDocente.jsp">Registrar Docente</a>
                            </li>
                            <li>
                                <a class="page-scroll" href="ListarDocentes.jsp">Listar Docentes</a>
                            </li>
                        </c:if>
                        <c:if test="${not empty usuario}">
                            <li>
                                <a class="page-scroll" href="Logout.jsp">Cerrar sessión</a>
                            </li>
                        </c:if>
                    </ul>
            </div>
        </div>
    </nav>

    <c:set var="habil" value="false"/>
    <c:if test="${(not empty usuario) &&((usuarioTipo eq 'Director'))}">
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
            url="jdbc:mysql://localhost:3306/parcial3"  
            user="root"  password="1234"/>  
        <c:set var="habil" value="true"/>
        <header>
            <div class="container">
                <div class="header-content">
                    <div class="header-content-inner">
                        <form method="post" action="RegistrarDocente.jsp">
                            <h3>Registrar Docente</h3>
                            <div class="form-group">
                                <label for="director">Ingrese su primer nombre</label>
                                <input type="text" class="form-control" id="pNombre" name="pNombre" placeholder="Ingrese su primer nombre" required="true"/>
                            </div>
                            <div class="form-group">
                                <label for="director">Ingrese su segundo nombre</label>
                                <input type="text" class="form-control" id="sNombre" name="sNombre" placeholder="Ingrese su segundo nombre" />
                            </div>
                            <div class="form-group">
                                <label for="director">Ingrese su primer apellido</label>
                                <input type="text" class="form-control" id="pApellido" name="pApellido" placeholder="Ingrese su primer apellido" required="true"/>
                            </div>
                            <div class="form-group">
                                <label for="director">Ingrese su segundo apellido</label>
                                <input type="text" class="form-control" id="sApellido" name="sApellido" placeholder="Ingrese su segundo apellido" />
                            </div>
                            <div class="form-group">
                                <label for="director">Escuela</label>
                                <sql:query dataSource="${db}" var="rowEscuelas">  
                                        SELECT * FROM parcial3.escueladirector where Usuario='${usuario}';
                                </sql:query>
                                <select class="form-control" id="escuela" name="escuela">
                                    <c:if test="${rowEscuelas.rowCount> 0}">
                                        <c:forEach var="row" items="${rowEscuelas.rows}">
                                            <option value="<c:out value="${row.IdEscuela}" />"><c:out value="${row.Nombre}" /></option>
                                        </c:forEach>
                                    </c:if>
                                </select>
                            </div>
                            <button type="submit" class="btn btn-primary">Registrar Docente</button>
                      </form>
                        <c:catch var ="catchException">
                            <c:if test="${not empty param.pNombre}">
                                <jsp:setProperty name="datosUsuario" property="nombre" value="${param.pNombre}" />
                                <jsp:setProperty name="datosUsuario" property="apellido" value="${param.pApellido}" />
                                <c:set var="usuarioDocente" scope="request">
                                    <jsp:getProperty name="datosUsuario" property="usuario" />
                                </c:set>
                                <jsp:setProperty name="encriptarPassword" property="password" value="${usuarioDocente}" />
                                <c:set var="passwordEncriptado" scope="request">
                                    <jsp:getProperty name="encriptarPassword" property="password" />
                                </c:set>
                                <sql:update dataSource="${db}" var="count">  
                                    INSERT INTO `parcial3`.`docentes` (`PrimerNombre`, `SegundoNombre`, `PrimerApellido`, `SegundoApellido`, `Usuario`, `Password`, `IdEscuela`) VALUES ('${param.pNombre}', '${param.sNombre}', '${param.pApellido}', '${param.sApellido}', '${usuarioDocente}', '${passwordEncriptado}', '${param.escuela}');
                                </sql:update>  
                                <c:if test="${count>=1}">
                                <span class="alert-success" >Registro hecho exitosamente</span>
                                </c:if> 
                                <c:if test="${count<1}">
                                <span class="alert-danger" >Error al registrar al empleado</span>
                                </c:if> 
                            </c:if>
                        </c:catch>
                        <c:if test = "${catchException != null}">
                            <span class="alert-danger" >Error al insertar los datos.</span>
                        </c:if>
                    </div>
                </div>
            </div>
        </header>
    </c:if>
    <c:if test="${habil eq false}">
        <c:redirect url="Index.jsp"/>
    </c:if>
</body>
</html>