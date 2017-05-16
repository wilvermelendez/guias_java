<%-- 
    Document   : index
    Created on : Apr 5, 2017, 11:11:20 PM
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

    <title>Tarea Gu&iacute;a 9</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Theme CSS -->
    <link href="css/creative.min.css" rel="stylesheet">
</head>

<body id="page-top">
    <div class="container">
            <div class="header-content">
                <div class="header-content-inner">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Number</th>
                                <th>Last Name</th>
                                <th>First Name</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="row" items="${employees.rows}">
                                <tr>
                                    <td><c:out value="${row.employee_num}" /></td>
                                    <td><c:out value="${row.lname_txt}"/></td>
                                    <td><c:out value="${row.fname_txt}"/></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </header>
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
                    <c:catch var ="catchException">
                        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
                            url="jdbc:mysql://localhost:3306/db_employees"  
                            user="root"  password="1234"/>  
                        <c:if test="${not empty param.fName}">

                            <sql:update dataSource="${db}" var="count">  
                                INSERT INTO employees(lname_txt,fname_txt,address1,address2,city,state,zip,phone) 
                                VALUES ('${param.fName}', '${param.lName}','${param.address1}','${param.address2}', '${param.city}','${param.state}','${param.zip}','${param.phone}');
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
</body>
</html>
    