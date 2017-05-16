package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sv.udb.edu.util.Mensaje;
import sv.udb.edu.util.Utileria;
import sv.udb.edu.util.Conexion;
import java.util.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <title>Tarea Gu&iacute;a 9</title>\n");
      out.write("\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("    <!-- Theme CSS -->\n");
      out.write("    <link href=\"css/creative.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("    <nav id=\"mainNav\" class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("         <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    ");

                     session=request.getSession();
                     //verificamos si se recibe datos
                     if(request.getParameter("usuario")!=null && request.getParameter("password")!=null)
                     {//
                         String usuario=request.getParameter("usuario");
                         String password=request.getParameter("password");
                         String passwordEncriptado=Utileria.hashPassword(password);
                         Conexion con= new Conexion();
                         Mensaje mensaje= new Mensaje();
                         if(con.login(usuario,passwordEncriptado))
                         {
                            mensaje.setTipo(1);
                            mensaje.setMensaje("Usuario logeado correctamente");
                            session.setAttribute("usuario", usuario);
                         }
                         else
                         {
                            mensaje.setTipo(2);
                            mensaje.setMensaje("Error, datos incorrectos para inicar sesi&oacute;n");
                         }
                         session.setAttribute("Mensaje", mensaje);
                     }
                    if(session.getAttribute("usuario") != null)
                    {                        
                    
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"RegistrarEmpleado.jsp\">Agregar Empleados</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"ListarEmpleados.jsp\">Listar Empleados</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"Logout.jsp\">Cerrar sessión</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header-content\">\n");
      out.write("                <div class=\"header-content-inner\">\n");
      out.write("                    ");

                        
                    if(session.getAttribute("usuario") == null)
                    {   
                    
      out.write("\n");
      out.write("                    <form method=\"post\" action=\"Index.jsp\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"usuario\">Usuario</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"usuario\" id=\"usuario\" placeholder=\"Ingrese su usuario\" required=\"true\" autocomplete=\"off\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"password\">Password</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"Password\" required=\"true\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Iniciar Sessi&oacute;n</button>\n");
      out.write("                  </form>\n");
      out.write("                    ");

                    }
                    if(session.getAttribute("Mensaje")!=null)
                    {
                        Mensaje mensaje= new Mensaje();
                        mensaje=(Mensaje)session.getAttribute("Mensaje");
                        if(mensaje.getTipo()==1)
                        {
                        
      out.write("\n");
      out.write("                            <div class=\"alert-success\">");
      out.print(mensaje.getMensaje());
      out.write("</div>\n");
      out.write("                        ");
  
                        }
                        else if(mensaje.getTipo()==2)
                        {
                        
      out.write("\n");
      out.write("                            <div class=\"alert-danger\">");
      out.print(mensaje.getMensaje());
      out.write("</div>\n");
      out.write("                        ");

                        }
                        session.removeAttribute("Mensaje");
                    }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
