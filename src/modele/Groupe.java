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
public class Groupe {
    private int id;
    private String nom;
    private int id_promotion;
    public Groupe(){
        id=0;
        nom="test";
        id_promotion=1;
    }
   public Groupe(int i,String n,int p){
        id=i;
        nom=n;
        id_promotion=p;
    }
}
