

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.annotation.Resource;
import javax.annotation.sql.DataSourceDefinition;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@DataSourceDefinition(name="java:app/env/jdbc/SALMA",
                      className="org.apache.derby.jdbc.ClientDataSource",
                      portNumber=1527,
                      serverName="localhost",
                      databaseName="dbimpot")
 
public class pdf extends HttpServlet {

  @Resource(lookup="java:app/env/jdbc/SALMA")
private DataSource data;

  
    private Connection con ; 

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        OutputStream out = response.getOutputStream();
       
         try {
           String nom = request.getParameter("nom");
         String total = request.getParameter("total");
         String pay = request.getParameter("paymentMethod");
                Document doc = new Document();
                PdfWriter.getInstance(doc, out);
                doc.open();
                Paragraph par1 = new Paragraph();
                Font fon = new Font(Font.FontFamily.HELVETICA,16,Font.BOLD,BaseColor.BLUE);
                par1.add(new Phrase("Recu d'inscription \n \n",fon));
                par1.setAlignment(Element.ALIGN_CENTER);
                par1.add(new Phrase(Chunk.NEWLINE));       
                par1.add(new Phrase(Chunk.NEWLINE)); 
                doc.add(par1);
                
                Paragraph par2 = new Paragraph();
                Font fondesc = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD,BaseColor.BLACK);
                
                par2.add(new Phrase("La famille de Mr "+nom+"\n",fondesc));
                par2.add(new Phrase(" le prix totale a payé  : "+total+"\n",fondesc));
                 par2.add(new Phrase(" le payement est faite par  : "+pay+"\n",fondesc));
               
                par2.setAlignment(Element.ALIGN_CENTER);
                par2.add(new Phrase(Chunk.NEWLINE));       
                par2.add(new Phrase(Chunk.NEWLINE)); 
                 
                doc.add(par2);
                doc.close();

       
              
         }catch(DocumentException ex){
                ex.getMessage();
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
