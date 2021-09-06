

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.annotation.Resource;
import javax.annotation.sql.DataSourceDefinition;
import javax.sql.DataSource;

@DataSourceDefinition(name="java:app/env/jdbc/SALMA",
                      className="org.apache.derby.jdbc.ClientDataSource",
                      portNumber=1527,
                      serverName="localhost",
                      databaseName="dbimpot")
 
public class control extends HttpServlet {
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
            out.println("<title>Servlet control</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet control at " + request.getContextPath() + "</h1>");
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
     try{
         
         Connection con = data.getConnection("SALMA","SALMA");
        
        
        PreparedStatement ps = con.prepareStatement("select * from login where gmail=? and password= ?");
        String gmail=request.getParameter("gmail");
        String password=request.getParameter("password");
        
        ps.setString(1,gmail);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            HttpSession session = request.getSession(true);
            session.setAttribute("gmail", gmail);
            response.sendRedirect("Generator.jsp");
        }
        else{
            response.sendRedirect("reponse.html");
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
