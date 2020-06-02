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
public class Seance_groupes {
    private int id_seance;
    private int id_groupe;
    public Seance_groupes(){
        id_seance=1;
        id_groupe=1;
    }
    public Seance_groupes(int s,int g){
        id_seance=s;
        id_groupe=g;
    }
}
