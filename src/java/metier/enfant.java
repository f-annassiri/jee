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
public class enfant {
    String nom ;
    String prenom ;
    String niveausc;
    String assurance;

    public enfant() {
    }

    public enfant(String nom, String prenom, String niveausc, String assurance) {
        this.nom = nom;
        this.prenom = prenom;
        this.niveausc = niveausc;
        this.assurance = assurance;
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

    public String getNiveausc() {
        return niveausc;
    }

    public void setNiveausc(String niveausc) {
        this.niveausc = niveausc;
    }

    public String getAssurance() {
        return assurance;
    }

    public void setAssurance(String assurance) {
        this.assurance = assurance;
    }
    
    
}
