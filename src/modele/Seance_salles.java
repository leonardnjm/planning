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
public class Seance_salles {
    private int id_seance;
    private int id_salle;
    public Seance_salles(){
        id_seance=1;
        id_salle=1;
    }
    public Seance_salles(int se,int s){
        id_seance=se;
        id_salle=s;
    }
}
