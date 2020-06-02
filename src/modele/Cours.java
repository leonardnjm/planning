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
public class Cours {
    private int id;
    private String nom;
    public Cours(){
        id=1;
        nom="test";
    }
    public Cours(int i,String n){
        id=i;
        nom=n;
    }
    public int getid(){
        return id;
    }
    public String getnom(){
        return nom;
    }
}
