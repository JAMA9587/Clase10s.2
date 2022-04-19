
package com.mycompany.clase12;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "DatosFinales", urlPatterns = {"/DatosFinales"})
public class DatosFinales extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DatosFinales</title>");     
            out.println("<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<h1 class=\"titulo\">Resultado de Promedios </h1>");
            
            out.println("<table class=\"cuadro\">");
            out.println("<tr>");
            out.println("<td>Nombre :</td>");
            out.println("<td>" + request.getParameter("nombre") + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Apellido :</td>");
            out.println("<td>" + request.getParameter("apellido") + "</td>");
            out.println("</tr>");
            
            if(request.getParameter("promedio")!= null);
            {
            int numero1=Integer.parseInt(request.getParameter("nota1"));
            int numero2=Integer.parseInt(request.getParameter("nota2"));
            int numero3=Integer.parseInt(request.getParameter("nota3"));
            int promedio = (numero1+numero2+numero3)/3;
            
            out.println("<tr>");
            out.println("<td>El promedio es :</td>");
            out.println("<td>" + promedio + "</td>");
            out.println("</tr>");
            
            }
            
            out.println("<tr>");
            out.println("<td colspan=\"2\" > <a href=\"Notas.jsp \" class=\"botonRegresar\">Regresar</a> </td>");
            out.println("<td></td>");
            out.println("</tr>");
            
            
            out.println("</table>");
            
                        
            out.println("</body>");
            out.println("</html>");
        }
    
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
