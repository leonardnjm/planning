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
public class Site {
    private int id;
    private String nom;
    public Site(){
        id=1;
        nom="test";
    }
    public Site(int i,String n){
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
