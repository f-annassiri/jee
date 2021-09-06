/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.annotation.Resource;
import javax.annotation.sql.DataSourceDefinition;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

@DataSourceDefinition(name="java:app/env/jdbc/SALMA",
                      className="org.apache.derby.jdbc.ClientDataSource",
                      portNumber=1527,
                      serverName="localhost",
                      databaseName="dbimpot")

@WebServlet(urlPatterns = {"/inscrit"})
public class inscrit extends HttpServlet {

   @Resource(lookup="java:app/env/jdbc/SALMA")
private DataSource data;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet inscrit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet inscrit at " + request.getContextPath() + "</h1>");
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

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
         
         Connection con = data.getConnection("SALMA","SALMA");
         String gmail=request.getParameter("gmail");
        String password=request.getParameter("password");
         PreparedStatement ps0 = con.prepareStatement("select * from login where gmail=? and password= ?");
         ps0.setString(1,gmail);
         ps0.setString(2,password);
         ResultSet rs0 = ps0.executeQuery();
        if(!rs0.next()){
         PreparedStatement ps = con.prepareStatement("insert into login(gmail,password) values(?,?)");
        ps.setString(1,gmail);
          ps.setString(2,password);
          int a= ps.executeUpdate();
          if (a==1){
           HttpSession session = request.getSession(true);
            session.setAttribute("gmail", gmail);
            response.sendRedirect("login.jsp");
        }
        }
        else {
            
          
    
      request.getRequestDispatcher("reponse.jsp").forward(request, response);
       
        }
        
        
       
        
       
        
        
       
     }
     catch(Exception e){
         System.out.println(e.getMessage());
     }
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
