
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.annotation.Resource;
import javax.annotation.sql.DataSourceDefinition;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import metier.enfant;
import metier.famille;

@DataSourceDefinition(name="java:app/env/jdbc/SALMA",
                      className="org.apache.derby.jdbc.ClientDataSource",
                      portNumber=1527,
                      serverName="localhost",
                      databaseName="dbimpot")

@WebServlet(urlPatterns = {"/generator"})
public class generator extends HttpServlet {

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
         // recuperation de info de famille  
    String firstName = request.getParameter("firstName") ;
    String lasttName = request.getParameter("lasttName") ;
    String email = request.getParameter("email") ;
    String tele = request.getParameter("tele") ;
    int nbef =Integer.parseInt(request.getParameter("nbef")) ;
     //autre
        String nomt=request.getParameter("nomt");
        String prenomt=request.getParameter("prenomt");
        String emailt=request.getParameter("emailt");
        String telet=request.getParameter("telet");
        
        try{
            int id =1;
           //classe famille 
   famille f = new famille();
    f.setNom(firstName);
    f.setPrenom(lasttName);
   f.setGmail(email);
   f.setTele(tele);
    f.setNbenfant(nbef);
    f.setNomautre(nomt);
    f.setPrenomautre(prenomt);
    f.setGmailautre(emailt);
    f.setTeleautre(telet);
       Connection con = data.getConnection("SALMA","SALMA");
        PreparedStatement ps = con.prepareStatement("insert into famille(nom,prenom,gmail,tele,nomt,prenomt,gmailt,telet,nbenf) values(?,?,?,?,?,?,?,?,?)");
        ps.setString(1,f.getNom());
    ps.setString(2,f.getPrenom());
    ps.setString(3,f.getGmail());
    ps.setString(4,f.getTele());
    ps.setString(5,f.getNomautre());
    ps.setString(6,f.getPrenomautre());
    ps.setString(7,f.getGmailautre());
    ps.setString(8,f.getTeleautre());
    ps.setInt(9,f.getNbenfant());
   
    int a= ps.executeUpdate();

   
PreparedStatement ps1 = con.prepareStatement("select max(numadh) from famille");
     
    ResultSet rs = ps1.executeQuery();
   if (rs.next()) {
       id = rs.getInt(1); 
 
 }
 
     for(int i = 1; i <= nbef; i++)
      {
          enfant ef= new enfant();
        String nomef = request.getParameter("nom"+i);
        String prenomef = request.getParameter("prenom"+i);
         
        String nivS =request.getParameter("niveau"+i);
        String serv =request.getParameter("service"+i);
        
        ef.setNom(nomef);
        ef.setPrenom(prenomef);
        ef.setNiveausc(nivS);
        ef.setAssurance(serv);
        
 PreparedStatement ps2 = con.prepareStatement("insert into enfant  values(?,?,?,?,?)");
             ps2.setInt(1,id);
        ps2.setString(2,ef.getNom());
        ps2.setString(3,ef.getPrenom());
        ps2.setString(4,ef.getNiveausc());
         ps2.setString(5,ef.getAssurance());
         
        ps2.executeUpdate();
      }
     
       // pour le calcul *****************************************
   ArrayList<enfant> list_enfant = new ArrayList<enfant>();
   PreparedStatement ps3 = con.prepareStatement("select * from enfant where numadhp = "+id);
   PreparedStatement ps4= con.prepareStatement("select * from famille where numadh = "+id);
      ResultSet rs3 = ps3.executeQuery();
      ResultSet rs4 = ps4.executeQuery();
      famille fm = new famille();
      //famille
      if(rs4.next() ){
        fm.setNom(rs4.getString("nom"));
         fm.setPrenom(rs4.getString("prenom"));
           request.setAttribute("famille",fm);
      }       
       while(rs3.next())
            {   
                
                 //enfant
                 enfant en = new enfant();
                en.setNom(rs3.getString("nom"));
                en.setPrenom(rs3.getString("prenom"));
                en.setNiveausc(rs3.getString("niveausc"));
                en.setAssurance(rs3.getString("asssc"));
              
                list_enfant.add(en);
            }
       
      HttpSession session = request.getSession(true);
     session.setAttribute("gmail", email);
      request.setAttribute("tabenfant",list_enfant);
       
       
       //**********************************************************
       
       
     
        request.getRequestDispatcher("assurance.jsp").forward(request, response);
             //<% int id=(int) session.getAttribute("numadh");%>
    
        }
     catch(Exception e){
       System.out.println("connexion échoué "+e.getMessage() );
     }
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
