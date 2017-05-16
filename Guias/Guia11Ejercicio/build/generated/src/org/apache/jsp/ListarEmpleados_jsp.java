package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sv.udb.edu.util.Empleado;
import java.util.List;

public final class ListarEmpleados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      sv.udb.edu.util.Empleado listarEmpleados = null;
      synchronized (_jspx_page_context) {
        listarEmpleados = (sv.udb.edu.util.Empleado) _jspx_page_context.getAttribute("listarEmpleados", PageContext.PAGE_SCOPE);
        if (listarEmpleados == null){
          listarEmpleados = new sv.udb.edu.util.Empleado();
          _jspx_page_context.setAttribute("listarEmpleados", listarEmpleados, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <title>Tarea Gu&iacute;a 11</title>\n");
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
      out.write("    ");

        boolean resultado=false,  requestData=false;
        
        if(request.getParameter("codigoEmpleado")!=null &&request.getParameter("codigoEmpleado")!="")
        {
            requestData=true;
            listarEmpleados.setEmployee_num(Integer.parseInt(request.getParameter("codigoEmpleado")));
            resultado=listarEmpleados.eliminarEmpleado();
        }
    
      out.write("\n");
      out.write("    <nav id=\"mainNav\" class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("         <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"RegistrarEmpleado.jsp\">Agregar Empleados</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"ListarEmpleados.jsp\">Listar Empleados</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header-content\">\n");
      out.write("                <div class=\"header-content-inner\">\n");
      out.write("                    <table class=\"table\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Apellido</th>\n");
      out.write("                                <th>Primer Nombre</th>\n");
      out.write("                                <th>Modificar</th>\n");
      out.write("                                <th>Eliminar</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                            List<Empleado> lista=listarEmpleados.listarEmpleados();
                            for(Empleado empleado:lista)
                            {
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(empleado.getlName());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(empleado.getfName());
      out.write("</td>\n");
      out.write("                                <td><a href=\"ActualizarEmpleado.jsp?codigoEmpleado=");
      out.print(empleado.getEmployee_num());
      out.write("\">Modificar</a></td>\n");
      out.write("                                <td><a href=\"ListarEmpleados.jsp?codigoEmpleado=");
      out.print(empleado.getEmployee_num());
      out.write("\">Eliminar</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                            }
                            
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                    </table>\n");
      out.write("                     ");

                        if(resultado && requestData)
                        {
                        
      out.write("\n");
      out.write("                            <div class=\"alert-success\">Empleado eliminado exitosamente.</div>\n");
      out.write("                        ");
  
                        }
                        else if(resultado==false && requestData==true)
                        {
                        
      out.write("\n");
      out.write("                            <div class=\"alert-danger\">Error al eliminar el empleado.</div>\n");
      out.write("                        ");

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
