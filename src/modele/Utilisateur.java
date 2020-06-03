/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Raphael
 */
public class Utilisateur {
    private int id;
    private String email;
    private String passwd;
    private String nom;
    private String prenom;
    private int droit;
    
    public Utilisateur(){
    id=0;
    email="";
    passwd="";
    nom="nomtest";
    prenom="prenomtest";
    droit=1;
    }
    public Utilisateur(int i,String e,String pass,String n,String p,int d){
    id=i;
    email=e;
    passwd=pass;
    nom=n;
    prenom=p;
    droit=d;
    }
    public int getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }
    public String getPasswd(){
        return passwd;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public int getDroit(){
        return droit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDroit(int droit) {
        this.droit = droit;
    }
    
    
}
