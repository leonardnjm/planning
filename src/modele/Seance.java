/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Date;

/**
 *
 * @author Raphael
 */
public class Seance {
    private int id;
    private int semaine;
    private Date date;
    private int heure_debut;
    private int heure_fin;
    private int etat;
    private int id_cours;
    private int id_type;
    
    public Seance(){
        id=1;
        semaine=1;
        date=new Date(2002,10,20);
        heure_debut=1;
        heure_fin=1;
        etat=0;
        id_cours=1;
        id_type=1;     
    }
    public Seance(int i,int s,Date d, int deb,int fin,int e,int c,int t){
        id=i;
        semaine=s;
        date=d;
        heure_debut=deb;
        heure_fin=fin;
        etat=e;
        id_cours=c;
        id_type=t;
    }
    public int getid(){
        return id;
    }
    public int getsemaine(){
        return semaine;
    }
    public Date getdate(){
        return date;
    }
    public int getdebut(){
        return heure_debut;
    }
    public int getfin(){
        return heure_fin;
    }
    public int getetat(){
        return etat;
    }
    public int getidcours(){
        return id_cours;
    }
    public int getidtype(){
        return id_type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSemaine(int semaine) {
        this.semaine = semaine;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHeure_debut(int heure_debut) {
        this.heure_debut = heure_debut;
    }

    public void setHeure_fin(int heure_fin) {
        this.heure_fin = heure_fin;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public void setId_cours(int id_cours) {
        this.id_cours = id_cours;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }
}
