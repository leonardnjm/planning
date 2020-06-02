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
public class Salle {
    private int id;
    private String nom;
    private int capacite;
    private int id_site;
    
    public Salle(){
        id=1;
        nom="test";
        capacite=2;
        id_site=1;
    }
    public Salle(int i,String n,int c,int s){
        id=i;
        nom=n;
        capacite=c;
        id_site=s;
    }
}
