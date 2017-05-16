/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.edu.ejemplos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wilver
 */
@WebServlet(name = "Calculadora", urlPatterns = {"/Calculadora"})
public class Calculadora extends HttpServlet {

    PrintWriter printWriter;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        try {
            printWriter=response.getWriter();
            response.setContentType("text/html");
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
            
            printWriter.println("<p> La operación matemática seleccionada es: "+ finalOutput);
            printWriter.println("</p><p>El resultado es: "+resultado+"</p>");
                
        } catch (Exception e) {
            printWriter.println(e.toString());
        }
        
    }

}
