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
public class Etudiant extends Utilisateur{
    private int id_utilisateur;
    private int numero;
    private int id_groupe;
    public Etudiant(){
        id_utilisateur=0;
        numero=0;
        id_groupe=0;
    }
    public Etudiant(int i,int n,int g){
        id_utilisateur=i;
        numero=n;
        id_groupe=g;
    }

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId_groupe() {
        return id_groupe;
    }

    public void setId_groupe(int id_groupe) {
        this.id_groupe = id_groupe;
    }
    
}
