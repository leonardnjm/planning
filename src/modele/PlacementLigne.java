/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Date;

/**
 *
 * @author Raphael
 */
public class PlacementLigne {
    int jour;
    int hdeb;
    private Date da;
    String et;
    String nomCours;
    String nomProf;
    String nomSalle;
    String nomSite;
    String nomType;
    String nomProm;
    int place;
    
    public int getJour() {
        return jour;
    }

    public int getHdeb() {
        return hdeb;
    }

    public String getEt() {
        return et;
    }

    public String getNomCours() {
        return nomCours;
    }

    public String getNomProf() {
        return nomProf;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public String getNomSite() {
        return nomSite;
    }

    public String getNomType() {
        return nomType;
    }
    public String getNomProm() {
        return nomProm;
    }
    public int getp()
    {
        return place;
    }
      public Date getDa()
    {
        return da;
    }
    public PlacementLigne( int b, int c, String d,String e,String f,String g,String h,String i)
    {
        jour=b-1;
        hdeb=c;
        et=d;
        nomCours=e;
        nomProf=f;
        nomSalle=g;
        nomSite=h;
        nomType=i;
        place=((c-8)*6)+b-2;
    }
        public PlacementLigne( int b, int c, String d,String e,String f,String g,String h,String i,String p)
    {
        jour=b-1;
        hdeb=c;
        et=d;
        nomCours=e;
        nomProf=f;
        nomSalle=g;
        nomSite=h;
        nomType=i;
        place=((c-8)*6)+b-2;
        nomProm=p;
    }
    public PlacementLigne(Date s, int b, int c, String d,String e,String f,String g,String h,String i)
        {   
            da=s;
            jour=b-1;
            hdeb=c;
            et=d;
            nomCours=e;
            nomProf=f;
            nomSalle=g;
            nomSite=h;
            nomType=i;
            place=((c-8)*6)+b-2;

        }

}
