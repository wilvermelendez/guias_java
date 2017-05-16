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
@WebServlet(name = "ServletFormulario01", urlPatterns = {"/ServletFormulario01"})
public class ServletFormulario01 extends HttpServlet {

    PrintWriter printWriter;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        String enteredValue=request.getParameter("enteredValue");
        response.setContentType("text/html");
        
        try {
            printWriter=response.getWriter();
            printWriter.println("<p>Texto Ingresado: ");
            printWriter.println(enteredValue+"</p>");
            
        } catch (Exception e) {
            printWriter.println(e.toString());
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
