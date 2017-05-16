<%@page language="java"%>
<%@page import= "java.lang.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <h1>Resultado</h1>
        test<%=request.getContextPath()%>
        <%
            
            String str=request.getParameter("r1");
            int parameter1=Integer.parseInt(request.getParameter("t1"));
            int parameter2=Integer.parseInt(request.getParameter("t2"));
            int resultado=0;
            String finalOutput="";
            if(str.equals("sum"))
            {
                resultado=parameter1+parameter2;
                finalOutput="Suma";
            }
            if(str.equals("resta"))
            {
                resultado=parameter1-parameter2;
                finalOutput="Resta";
            }
            if(str.equals("mul"))
            {
                resultado=parameter1*parameter2;
                finalOutput="Multiplicación";
            }
            if(str.equals("div"))
            {
                if(parameter2==0)
                    throw new Exception("Error no se permite la división entre 0");
                resultado=parameter1/parameter2;
                finalOutput="División";
            }
        
        %>
        <p>
            La funci&oacute;n Matem&aacute;tica seleccionada es: <%=finalOutput%>
        </p>
        <p>
            <%
                Integer in=new Integer(resultado);
                out.println("El resultado es: "+ in.toString());
            %>
        </p>
    </body>
</html>
