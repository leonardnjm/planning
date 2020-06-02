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
public class Enseignant extends Utilisateur{
    private int id_utilisateur;
    private int id_cours;
    
    public Enseignant(){
        id_utilisateur=1;
        id_cours=1;
    }
    public Enseignant(int e, int c){
        id_utilisateur=e;
        id_cours=c;
    }
}
