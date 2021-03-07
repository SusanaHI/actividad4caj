package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (name = "muestraOperacion", urlPatterns = {"/muestraOperacion"})

public class muestraOperacion extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
    
            String n1=request.getParameter("base");
            String n2=request.getParameter("altura");

            model.Triangulo2 e1 = new model.Triangulo2();
            double area1=e1.Area(n1, n2);
            double peri2=e1.Perimeter(n1);
            
            request.setAttribute("areaResuelta", area1);
            request.setAttribute("perimetroResuelto", peri2);
            request.getRequestDispatcher("/muestraResultado.jsp").forward(request, response);
            
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo(){
        return "Short description";       
    }
}