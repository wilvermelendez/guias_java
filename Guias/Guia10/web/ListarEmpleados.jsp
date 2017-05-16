<%-- 
    Document   : index
    Created on : Apr 5, 2017, 11:11:20 PM
    Author     : wilver
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Lista Empleados</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Theme CSS -->
    <link href="css/creative.min.css" rel="stylesheet">
</head>

<body id="page-top">
    <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_employees"  
     user="root"  password="1234"/>  
    <sql:query dataSource="${db}" var="employees">  
        SELECT * FROM db_employees.employees;  
    </sql:query>  
    <header>
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
</body>
</html>
