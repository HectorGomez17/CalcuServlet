/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteCalculadora;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gomez Tapia Hector
 */
@WebServlet(name = "CalculadoraServlet", urlPatterns = {"/CalculadoraServlet"})
public class CalcuServlet extends HttpServlet {

   
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
            double NumeroUno = Double.parseDouble(request.getParameter("NumeroUno"));
            double NumeroDos = Double.parseDouble(request.getParameter("NumeroDos"));
            String Operacion = request.getParameter("operacion");
            double ResultadoOperacion = 0;
            
            if(Operacion.equals("suma"))
            {
                ResultadoOperacion = NumeroUno + NumeroDos;
            }else if(Operacion.equals("resta"))
            {
                ResultadoOperacion = NumeroUno - NumeroDos;
            }else if(Operacion.equals("multiplicacion"))
            {
                ResultadoOperacion = NumeroUno * NumeroDos;
            }else if(Operacion.equals("division"))
            {
                ResultadoOperacion = NumeroUno / NumeroDos;
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculadoraServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado de la operación: " + ResultadoOperacion + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    

}
