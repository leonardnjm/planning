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
public class Seance_enseignants {
    private int id_seance;
    private int id_enseignant;
    public Seance_enseignants(){
        id_seance=1;
        id_enseignant=1;
    }
    public Seance_enseignants(int s,int e){
        id_seance=s;
        id_enseignant=e;
    }
}
