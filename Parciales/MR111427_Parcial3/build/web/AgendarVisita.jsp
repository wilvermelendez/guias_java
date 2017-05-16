<%-- 
    Document   : AgendarVisita
    Created on : May 14, 2017, 6:21:14 PM
    Author     : wilver
--%>

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
    <c:if test="${(not empty usuario) &&(usuarioTipo eq 'Director') && (not empty param.codigoDocente)}">
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
            url="jdbc:mysql://localhost:3306/parcial3"  
            user="root"  password="1234"/>  
        <c:set var="habil" value="true"/>
        <!--Evaluamos si el docente pertenece a la escuela por medio del director logeado-->
        <sql:query dataSource="${db}" var="rowDocentes">  
                SELECT * FROM parcial3.docentesescuela where UsuarioDirector='${usuario}' and IdDocente=${param.codigoDocente};
        </sql:query>
        <header>
            <div class="container">
                <div class="header-content">
                    <div class="header-content-inner">
                        <c:if test="${rowDocentes.rowCount>0}">
                            <c:forEach var="row" items="${rowDocentes.rows}">
                                <c:set var="NombreCompleto" scope="page" value="${row.PrimerNombre} ${row.SegundoNombre} ${row.PrimerApellido} ${row.SegundoApellido}"/>
                            </c:forEach>
                            <form method="post" action="AgendarVisita.jsp">
                                <h3>Agendar</h3>
                                <div class="form-group">
                                    <label for="director">Código</label>
                                    <input type="text" class="form-control" id="codigoDocente" name="codigoDocente" readonly="true" value="${param.codigoDocente}" />
                                </div>
                                <div class="form-group">
                                    <label for="director">Nombre Completo</label>
                                    <input type="text" class="form-control" id="nombreCompleto" name="nombreCompleto"  value="${NombreCompleto}" readonly="true"/>
                                </div>
                                <div class="form-group">
                                    <label for="fecha">Fecha</label>
                                    <input type="date" class="form-control" id="fecha" name="fecha" required="true"/>
                                </div>
                                <div class="form-group">
                                    <label for="institucion">Institución</label>
                                    <input type="text" class="form-control" id="institucion" name="institucion" placeholder="Ingrese la institución"  required="true"/>
                                </div>
                                <button type="submit" class="btn btn-primary">Agendar</button>
                          </form>
                            <c:catch var ="catchException">
                                <c:if test="${(not empty param.codigoDocente) && (not empty param.institucion) && (habil eq true)}">
                                    <sql:update dataSource="${db}" var="count">  
                                        Insert into parcial3.visitas (IdDocente,Fecha, Institucion) Values (${param.codigoDocente},'${param.fecha}','${param.institucion}');
                                    </sql:update>  
                                    <c:if test="${count>=1}">
                                    <span class="alert-success" >Registro hecho exitosamente</span>
                                    </c:if> 
                                    <c:if test="${count<1}">
                                    <span class="alert-danger" >Error al registrar al visita</span>
                                    </c:if> 
                                </c:if>
                            </c:catch>
                            <c:if test = "${catchException != null}">
                                <span class="alert-danger" >Error:<c:out value="${catchException}"/>.</span>
                            </c:if>
                        </c:if>
                        <c:if test="${rowDocentes.rowCount==0}">
                            <span class="alert-danger" >Error el docente ingresado no existe o no pertenece a la escuela.</span>
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
