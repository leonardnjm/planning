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
    email="test";
    passwd="passwordtest";
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
    public int getid(){
        return id;
    }
    public String getemail(){
        return email;
    }
    public String getpasswd(){
        return passwd;
    }
    public String getnom(){
        return nom;
    }
    public String getprenom(){
        return prenom;
    }
    public int getdroit(){
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
