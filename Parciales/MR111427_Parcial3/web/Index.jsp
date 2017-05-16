<%-- 
    Document   : index
    Created on : Apr 5, 2017, 11:11:20 PM
    Author     : wilver
--%>
<jsp:useBean id="encriptarPassword" class="sv.edu.udb.EncriptarPassword" scope="request"/>
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
    <title>Parcial 3</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <!-- Theme CSS -->
    <link href="css/creative.min.css" rel="stylesheet">
</head>

<body id="page-top">

    <c:catch var ="catchException">
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
            url="jdbc:mysql://localhost:3306/parcial3"  
            user="root"  password="1234"/>  
        <c:if test="${not empty param.usuario}">
            <jsp:setProperty name="encriptarPassword" property="password" value="${param.password}" />
            <c:set var="passwordEncriptado" scope="request">
                <jsp:getProperty name="encriptarPassword" property="password" />
            </c:set>
            <c:if test="${not empty param.director}">
                <c:set scope="request" var="query" value="SELECT * FROM parcial3.escueladirector where Usuario='${param.usuario}' and Password='${passwordEncriptado}';"/>
            </c:if>
            <c:if test="${empty param.director}">
                <c:set scope="request" var="query" value="SELECT * FROM parcial3.docenteescuela where Usuario='${param.usuario}' and Password='${passwordEncriptado}';"/>
            </c:if>
            <sql:query dataSource="${db}" var="rowLogin">  
                ${query}
            </sql:query>
            <c:choose>
                <c:when test="${rowLogin.rowCount eq 1}">
                    <c:set var="mensajeTipo" scope="session" value="1"/>
                    <c:set var="mensaje" scope="session" value="Usuario logeado correctamente"/>
                    <c:forEach var="row" items="${rowLogin.rows}">
                        <c:set var="usuario" scope="session" value="${row.Usuario}"/>
                        <c:set var="escuela" scope="session" value="${row.Nombre}"/>
                    </c:forEach>
                    <c:if test="${empty param.director}">
                        <c:set var="usuarioTipo" scope="session" value="Docente"/>
                    </c:if>
                    <c:if test="${not empty param.director}">
                        <c:set var="usuarioTipo" scope="session" value="Director"/>
                    </c:if>
                </c:when>
                <c:when test="${rowLogin.rowCount eq 0}">
                    <c:if test="${empty param.director}">
                        <c:set scope="request" var="query" value="SELECT * FROM parcial3.escueladirector where Usuario='${param.usuario}' and Password='${passwordEncriptado}';"/>
                    </c:if>
                    <sql:query dataSource="${db}" var="loginDirectorDocente">  
                        ${query}
                    </sql:query>
                    <c:if test="${loginDirectorDocente.rowCount eq 1}">
                        <c:set var="mensajeTipo" scope="session" value="1"/>
                        <c:set var="mensaje" scope="session" value="Usuario logeado correctamente"/>
                        <c:set var="usuarioTipo" scope="session" value="DirectorDocente"/>
                        <c:forEach var="row" items="${loginDirectorDocente.rows}">
                            <c:set var="usuario" scope="session" value="${row.Usuario}"/>
                            <c:set var="escuela" scope="session" value="${row.Nombre}"/>
                        </c:forEach>
                    </c:if>
                    <c:if test="${loginDirectorDocente.rowCount eq 0}">
                        <c:set var="mensajeTipo" scope="session" value="2"/>
                        <c:set var="mensaje" scope="session" value="Error, datos incorrectos para inicar sesión"/>
                    </c:if>
                </c:when>
                <c:otherwise>
                    <c:set var="mensajeTipo" scope="session" value="0"/>
                    <c:set var="mensaje" scope="session" value=""/>
                </c:otherwise>
            </c:choose>
        </c:if>
    </c:catch>
    <c:if test = "${catchException != null}">
        <c:set var="mensajeTipo" scope="session" value="2"/>
        <c:set var="mensaje" scope="session" value="${catchException}"/>
    </c:if>
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

    <header>
        
        <div class="container">
            <div class="header-content">
                <div class="header-content-inner">
                    <c:if test="${empty usuario}">
                        
                        <form method="post" action="Index.jsp">
                            <div class="form-group">
                                <label for="usuario">Usuario</label>
                                <input type="text" class="form-control" name="usuario" id="usuario" placeholder="Ingrese su usuario" required="true" autocomplete="off">
                            </div>
                            <div class="form-group">
                                <label for="password">Password</label>
                                <input type="password" class="form-control" name="password" id="password" placeholder="Password" required="true">
                            </div>
                            <div class="form-group">
                                <label for="director">Ingresar como director</label>
                                <input type="checkbox" class="form-control" name="director" id="director" checked="true">
                            </div>
                            <button type="submit" class="btn btn-primary">Iniciar Sessi&oacute;n</button>
                        </form>
                    </c:if>
                    <c:if test="${(not empty usuario) && (usuarioTipo!='Director') }">
                        <c:if test="${empty param.fechaInicio}">
                            <c:set var="query" scope="request">
                                SELECT * FROM parcial3.actividadesdocente where Usuario='${usuario}';
                            </c:set>
                        </c:if>
                        <c:if test="${not empty param.fechaInicio}">
                            <c:set var="query" scope="request">
                                SELECT * FROM parcial3.actividadesdocente where Usuario='${usuario}' && Fecha between  DATE_FORMAT('${param.fechaInicio}', '%d/%m/%Y') and DATE_FORMAT('${param.fechaFin}', '%d/%m/%Y');
                            </c:set>
                        </c:if>
                        <sql:query dataSource="${db}" var="rowActividades">  
                            ${query};
                        </sql:query>
                            <form method="post" action="Index.jsp">
                            <h3>Filtros</h3>
                            <div class="form-group">
                                <label for="fechaInicio">Fecha inicio</label>
                                <input type="date" class="form-control" id="fechaInicio" name="fechaInicio" required="true"/>
                            </div>
                            <div class="form-group">
                                <label for="fechaFin">Fecha Final</label>
                                <input type="date" class="form-control" id="fechaFin" name="fechaFin" required="true"/>
                            </div>
                            <button type="submit" class="btn btn-primary">Filtrar</button>
                        </form>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Fecha</th>
                                    <th>Institución</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:if test="${rowActividades.rowCount>0}">
                                    <c:forEach var="row" items="${rowActividades.rows}">
                                        <tr>
                                            <td><c:out value="${row.Institucion}"/></td>
                                            <td><c:out value="${row.Fecha}"/></td>
                                        </tr>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${rowActividades.rowCount==0}">
                                    <tr>
                                        <td colspan="6"> No hay actividad registrados para este docente</td>
                                    </tr>
                                </c:if>
                            </tbody>
                        </table>
                    </c:if>
                    <c:if test="${mensajeTipo eq 1}">
                        <span class="alert-success" ><c:out value="${mensaje}"/></span>
                        <c:remove var="mensajeTipo" scope="session"/>
                        <c:remove var="mensaje" scope="session"/>
                    </c:if> 
                    <c:if test="${mensajeTipo eq 2}">
                        <span class="alert-danger"><c:out value="${mensaje}"/></span>
                        <c:remove var="mensajeTipo" scope="session"/>
                        <c:remove var="mensaje" scope="session"/>
                    </c:if> 
                </div>
            </div>
        </div>
    </header>
</body>
</html>
