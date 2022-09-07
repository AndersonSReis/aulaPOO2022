/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package tarefa3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson Reis
 */
@WebServlet(name = "GreetingServlet", urlPatterns = {"/greeting.html"})
public class GreetingServlet extends HttpServlet {

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
            out.println("<title></title>");            
            out.println("</head>");
          //  out.println("<img id= imagem src= imagem.jpg> ");// como chamar a imagem da folha de estilo            
            out.println("<body style= 'background-color: #B0E0E6 '>");
            int hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                
                if(hora > 19){
                out.println("<h1>Boa Noite</h1>");
                out.println("<img src='https://media.istockphoto.com/photos/estaiada-bridge-sao-paulo-picture-id626906168?s=170667a'>");
                }else if(hora > 12){
                out.println("<h1>Boa Tarde</h1>");
                out.println("<img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRoUIoXS00N6WHUTQaoVxX6_zf1P81uUC5eww&usqp=CAU'>");
                }else if(hora > 6){
                out.println("<h1>Bom dia</h1>");
                out.println("<img src='https://www.notibras.com/site/wp-content/uploads/2021/04/NASCER-DO-SOL-SAO-CONRADO-27.jpg'>");
                }else{
                out.println("<h1>Vai Dormir</h1>");
                out.println("<img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbXng1XVRmKmuYqAmfBOeINZzkGVvogeHGwg&usqp=CAU'>");
                }                    
           
            java.util.Date now  = new java.util.Date();
            out.println("<h2>"+now+"</h2>");
            
            out.println("<h4> <a href = 'index.html'><i>Voltar</i></a></h4>");
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
