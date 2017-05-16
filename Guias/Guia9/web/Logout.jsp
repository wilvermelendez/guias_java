<%@page import="java.util.*" session="true"%>

<%
    session=request.getSession();
    session.setAttribute("usuario", null);
    session.invalidate();
    response.sendRedirect("Index.jsp");
%>