/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ServletsTarefa4;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson Reis
 */
@WebServlet(name = "MathServlet", urlPatterns = {"/mathservlet.html"})
public class MathServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MathServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h4><a href = 'index.html'>Voltar</a></h4>");
            
            out.println("<h1>Servlet MathServlet at " + request.getContextPath() + "</h1>");
            int n1 = 1, n2 = 1;
            String operador="";
            try{
             n1 = Integer.parseInt(request.getParameter("n1"));
             n2 = Integer.parseInt(request.getParameter("n2"));
             operador = request.getParameter("op");
                
            }catch(Exception ex ){
             out.println("<div style = 'color: red'>"
                     +"Parametro Inválido"
                     + "</div>");
             
            }
            out.println( "<form>\n"+
        "Quantidade:"+    
        "<input type='number' step='0.1' name='n1' value='"+n1+"'/>"+
        "<input type='number' step='0.1' name='n2' value='"+n2+"'/>"+
        "<input type='submit' name='somar value='='/>\n" +
               
        "</form>");
            
             switch (operador){
               case "soma":
         
            out.println("<h2>"+ n1 +" + "+ n2 +" = " + (n1+n2)+"</h2>");
            break;
               case "sub":
                   out.println("<h2>"+ n1 +" + "+ n2 +" = " + (n1-n2)+"</h2>");
            break;
            case "div":
                  out.println("<h2>"+ n1 +" + "+ n2 +" = " + (n1/n2)+"</h2>");
            break;
            case "mult":
                   out.println("<h2>"+ n1 +" + "+ n2 +" = " + (n1*n2)+"</h2>");
            break;
            
                    
               
           }
           
       
            out.println("<table>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
