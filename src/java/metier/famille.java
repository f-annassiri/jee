/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author SAFAE
 */
public class famille {

    public famille() {
    }
    

    public famille( String nom, String prenom, String gmail, String tele, int nbenfant) {
       
        this.nom = nom;
        this.prenom = prenom;
        this.gmail = gmail;
        this.tele = tele;
        this.nbenfant = nbenfant;
    }

  
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public int getNbenfant() {
        return nbenfant;
    }

    public void setNbenfant(int nbenfant) {
        this.nbenfant = nbenfant;
    }
    
 
    String nom;
     String prenom;
      String gmail;
       String tele;
        int nbenfant;
         String nomautre;
     String prenomautre;
      String gmailautre;
      String teleautre;

    public String getNomautre() {
        return nomautre;
    }

    public String getPrenomautre() {
        return prenomautre;
    }

    public String getGmailautre() {
        return gmailautre;
    }

    public String getTeleautre() {
        return teleautre;
    }

    public void setNomautre(String nomautre) {
        this.nomautre = nomautre;
    }

    public void setPrenomautre(String prenomautre) {
        this.prenomautre = prenomautre;
    }

    public void setGmailautre(String gmailautre) {
        this.gmailautre = gmailautre;
    }

    public void setTeleautre(String teleautre) {
        this.teleautre = teleautre;
    }
      
        
}
