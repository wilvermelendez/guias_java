/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.edu.ejercicios;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wilver
 */
@WebServlet(name = "ProcesarFormulario", urlPatterns = {"/ProcesarFormulario"})
public class ProcesarFormulario extends HttpServlet {

    PrintWriter printWriter;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        try {
            printWriter=response.getWriter();
            response.setContentType("text/html");
            
            
            String nombreEditorial=request.getParameter("nombreEditorial");
            String sitioWeb=request.getParameter("sitioWeb");
            String telefono=request.getParameter("numeroTelefono");
            String direccion=request.getParameter("direccion");
            String email=request.getParameter("email");
             
             String query="Insert into editorial (nombre, sitioWeb, telefono, direccion, mail)"
                     +" values('"+nombreEditorial+"','"+sitioWeb+"','"+telefono+"','"+direccion+"','"+email+"');";
             
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_authors", "root","1234");
            Statement stmt=con.createStatement();
            int res=stmt.executeUpdate(query);
            String cadenaResultado="";
            if(res>0)
            {
                cadenaResultado+="La editorial "+ nombreEditorial
                    +" con sitio web: "+sitioWeb +" con teléfono "+ telefono
                    +" ubicada en la dirección: "+direccion +" y correo: "+ email 
                    +" ha sido ingresada exitosamente.";
            }
            else
            {
                cadenaResultado="Error en el registro";
            }
            con.close();
             
            printWriter.println(cadenaResultado);
        } catch (Exception e) {
            printWriter.println(e.toString());
        }
    }
}
