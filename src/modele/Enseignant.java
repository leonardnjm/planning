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

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public int getId_cours() {
        return id_cours;
    }

    public void setId_cours(int id_cours) {
        this.id_cours = id_cours;
    }
    
}
