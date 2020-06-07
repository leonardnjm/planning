/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

/**
 *
 * @author Raphael
 */
import java.time.ZoneId;
import java.awt.Color;
import java.awt.GridLayout; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;
import java.util.Collections;
import javax.swing.BorderFactory;
//import java.util.Calendar
import javax.swing.JPanel;
import javax.swing.border.Border;
import modele.Connexion;
import modele.Utilisateur;
import modele.Placement;
public class Planning extends JPanel{
    
    private Connexion maconnexion;
    private ResultSet rset;
    private PreparedStatement prepstmt;
    private Connection conna;
    private ResultSetMetaData rsetMeta;
    private Date today = new Date();

    public Planning(Utilisateur u){
        try {
            try {
                maconnexion=new Connexion("planning","root","");
                conna=maconnexion.getco();
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Planning.class.getName()).log(Level.SEVERE, null, ex);
            }
             ArrayList<Placement> place = new ArrayList<Placement>();

        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        int iweek = cal.get(Calendar.WEEK_OF_YEAR); 

        /*    prepstmt=conna.prepareStatement(" SELECT seance.*"
                    + " FROM seance,seances_groupes,groupe,etudiant,utilisateurs" 
                    + " WHERE etudiant.ID_utilisateur="+u.getId()
                    + " AND groupe.ID=etudiant.ID_groupe" 
                   + " AND seances_groupes.ID_groupe=groupe.ID" 
                   + " AND seance.ID=seances_groupes.ID_seance");
*/
        ZoneId defaultZoneId = ZoneId.systemDefault();
     prepstmt=conna.prepareStatement("SELECT seance.date,seance.heure_debut,seance.etat,cours.nom,utilisateurs.nom,salle.nom,site.nom,type_cours.nom"
                    + " FROM `seance`,`seances_groupes`,`groupe`,`etudiant`,`utilisateurs`, cours, enseignant ,salle, site, type_cours,seance_salles, seance_enseignants"
                    + " WHERE etudiant.ID_utilisateur="+u.getId()
                    + " AND groupe.ID=etudiant.ID_groupe"
                    + " AND seances_groupes.ID_groupe=groupe.ID"
                    + " AND seance.ID=seances_groupes.ID_seance"
                    + " AND seance.semaine="+iweek
                    + " AND cours.ID=seance.ID_cours"
                    + " AND type_cours.ID=seance.ID_type"
                    + " AND seance_salles.ID_seance=seance.ID"
                    + " AND salle.ID=seance_salles.ID_salle"
                    + " AND site.ID=salle.ID_site"
                    + " AND seance_enseignants.ID_seance=seance.ID"
                    + " AND enseignant.ID_utilisateur=seance_enseignants.ID_enseignant"
                    + " AND utilisateurs.ID=enseignant.ID_utilisateur");


            rset=prepstmt.executeQuery();
                    rsetMeta = rset.getMetaData();
        while (rset.next()) {
            Calendar cala = Calendar.getInstance();
            LocalDate localDate = LocalDate.parse(rset.getString(1));
            Date a = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
            cala.setTime(a);
            int dayOfWeek = cala.get(Calendar.DAY_OF_WEEK); 
            place.add(new Placement(dayOfWeek,Integer.parseInt(rset.getString(2)),rset.getString(3),rset.getString(4),rset.getString(5),rset.getString(6),rset.getString(7),rset.getString(8)));
                }             

            Collections.sort(place);
            for(int i=0;i<place.size();i++)
                  {
                       System.out.println(""+place.get(i).getNomCours());
                       System.out.println(""+place.get(i).getp());    
                       System.out.println(""+place.get(i).getHdeb());   
                       System.out.println(""+place.get(i).getJour());   
                  }
            int l=0;
            this.setLayout(new GridLayout(11, 6));
            Border matteborder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.gray);

            for(int i=0; i<66; i++){
                JPanel a=new JPanel();
                // Border blackline=BorderFactory.createLineBorder(Color.yellow);
                // a.setBorder(blackline);
                //a.setBackground(new Color(200,0,0,125));
                //a.setOpaque(false);
                if(i==place.get(l).getp())
                {
                    this.add(new Cours(place.get(l).getNomCours(),place.get(l).getNomProf(),place.get(l).getEt(),place.get(l).getNomSalle(),place.get(l).getNomSite(),place.get(l).getNomType()));      
                    if(l+1<place.size())
                    {
                       l++;   
                    }
                }
                else{
                if(i%2==0)
                {
                    
                    a.setBackground(Color.LIGHT_GRAY);
                    a.setBorder(matteborder);
                    this.add(a);
                }
                if(i%2==1)
                {
                    a.setBackground(Color.white);
                    a.setBorder(matteborder);
                    this.add(a);
                }
                }
            }
            //     this.setOpaque(false);
            //this.setBackground(new Color(200,0,0,200));
            this.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Planning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    
    public Planning(Utilisateur u,int s){
        try {
            try {
                maconnexion=new Connexion("planning","root","");
                conna=maconnexion.getco();
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Planning.class.getName()).log(Level.SEVERE, null, ex);
            }
             ArrayList<Placement> place = new ArrayList<Placement>();


        /*    prepstmt=conna.prepareStatement(" SELECT seance.*"
                    + " FROM seance,seances_groupes,groupe,etudiant,utilisateurs" 
                    + " WHERE etudiant.ID_utilisateur="+u.getId()
                    + " AND groupe.ID=etudiant.ID_groupe" 
                   + " AND seances_groupes.ID_groupe=groupe.ID" 
                   + " AND seance.ID=seances_groupes.ID_seance");
*/
        ZoneId defaultZoneId = ZoneId.systemDefault();
     prepstmt=conna.prepareStatement("SELECT seance.date,seance.heure_debut,seance.etat,cours.nom,utilisateurs.nom,salle.nom,site.nom,type_cours.nom"
                    + " FROM `seance`,`seances_groupes`,`groupe`,`etudiant`,`utilisateurs`, cours, enseignant ,salle, site, type_cours,seance_salles, seance_enseignants"
                    + " WHERE etudiant.ID_utilisateur="+u.getId()
                    + " AND groupe.ID=etudiant.ID_groupe"
                    + " AND seances_groupes.ID_groupe=groupe.ID"
                    + " AND seance.ID=seances_groupes.ID_seance"
                    + " AND seance.semaine="+s
                    + " AND cours.ID=seance.ID_cours"
                    + " AND type_cours.ID=seance.ID_type"
                    + " AND seance_salles.ID_seance=seance.ID"
                    + " AND salle.ID=seance_salles.ID_salle"
                    + " AND site.ID=salle.ID_site"
                    + " AND seance_enseignants.ID_seance=seance.ID"
                    + " AND enseignant.ID_utilisateur=seance_enseignants.ID_enseignant"
                    + " AND utilisateurs.ID=enseignant.ID_utilisateur");


            rset=prepstmt.executeQuery();
                    rsetMeta = rset.getMetaData();
        while (rset.next()) {
            Calendar cala = Calendar.getInstance();
            LocalDate localDate = LocalDate.parse(rset.getString(1));
            Date a = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
            cala.setTime(a);
            int dayOfWeek = cala.get(Calendar.DAY_OF_WEEK); 
            place.add(new Placement(dayOfWeek,Integer.parseInt(rset.getString(2)),rset.getString(3),rset.getString(4),rset.getString(5),rset.getString(6),rset.getString(7),rset.getString(8)));
                }             

            Collections.sort(place);
            for(int i=0;i<place.size();i++)
                  {
                       System.out.println(""+place.get(i).getNomCours());
                       System.out.println(""+place.get(i).getp());    
                       System.out.println(""+place.get(i).getHdeb());   
                       System.out.println(""+place.get(i).getJour());   
                  }
            int l=0;
            this.setLayout(new GridLayout(11, 6));
            Border matteborder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.gray);

            for(int i=0; i<66; i++){
                JPanel a=new JPanel();
                // Border blackline=BorderFactory.createLineBorder(Color.yellow);
                // a.setBorder(blackline);
                //a.setBackground(new Color(200,0,0,125));
                //a.setOpaque(false);
                if(place.size()!=0)
                {
                if(i==place.get(l).getp())
                {
                    this.add(new Cours(place.get(l).getNomCours(),place.get(l).getNomProf(),place.get(l).getEt(),place.get(l).getNomSalle(),place.get(l).getNomSite(),place.get(l).getNomType()));      
                    if(l+1<place.size())
                    {
                       l++;   
                    }
                }
                else{
                if(i%2==0)
                {
                    
                    a.setBackground(Color.LIGHT_GRAY);
                    a.setBorder(matteborder);
                    this.add(a);
                }
                if(i%2==1)
                {
                    a.setBackground(Color.white);
                    a.setBorder(matteborder);
                    this.add(a);
                }
                }
          }
                else{
                if(i%2==0)
                {
                    
                    a.setBackground(Color.LIGHT_GRAY);
                    a.setBorder(matteborder);
                    this.add(a);
                }
                if(i%2==1)
                {
                    a.setBackground(Color.white);
                    a.setBorder(matteborder);
                    this.add(a);
                }
                }
            }
            //     this.setOpaque(false);
            //this.setBackground(new Color(200,0,0,200));
            this.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Planning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public Planning(Utilisateur u,int s,String prom){
        try {
            try {
                maconnexion=new Connexion("planning","root","");
                conna=maconnexion.getco();
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Planning.class.getName()).log(Level.SEVERE, null, ex);
            }
             ArrayList<Placement> place = new ArrayList<Placement>();

        

             

        





        ZoneId defaultZoneId = ZoneId.systemDefault();
     prepstmt=conna.prepareStatement("SELECT seance.date,seance.heure_debut,seance.etat,cours.nom,utilisateurs.nom,salle.nom,site.nom,type_cours.nom,groupe.Nom"
                    + " FROM `seance`,`seances_groupes`,`groupe`,`utilisateurs`, cours, enseignant ,salle, site, type_cours,seance_salles, seance_enseignants, promotion"
                    + " WHERE promotion.nom="+prom
                    + " AND groupe.ID_prom=promotion.ID"
                    + " AND seances_groupes.ID_groupe=groupe.ID"
                    + " AND seance.ID=seances_groupes.ID_seance"
                    + " AND seance.semaine="+s
                    + " AND seance_salles.ID_seance=seance.ID"
                    + " AND salle.ID=seance_salles.ID_salle"
                    + " AND seance_salles.ID_seance=seance.ID"
                    + " AND salle.ID=seance_salles.ID_salle"
                    + " AND site.ID=salle.ID_site"
                    + " AND cours.ID=seance.ID_cours"
                    + " AND type_cours.ID=seance.ID_type"
                    + " AND seance_enseignants.ID_seance=seance.ID"
                    + " AND enseignant.ID_utilisateur=seance_enseignants.ID_enseignant"
                    + " AND utilisateurs.ID=enseignant.ID_utilisateur");


            rset=prepstmt.executeQuery();
                    rsetMeta = rset.getMetaData();
        while (rset.next()) {
            Calendar cala = Calendar.getInstance();
            LocalDate localDate = LocalDate.parse(rset.getString(1));
            Date a = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
            cala.setTime(a);
            int dayOfWeek = cala.get(Calendar.DAY_OF_WEEK); 
            place.add(new Placement(dayOfWeek,Integer.parseInt(rset.getString(2)),rset.getString(3),rset.getString(4),rset.getString(5),rset.getString(6),rset.getString(7),rset.getString(8),rset.getString(9)));
                }             

            Collections.sort(place);
            int l=0;
            this.setLayout(new GridLayout(11, 6));
            Border matteborder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.gray);

            for(int i=0; i<66; i++){
                JPanel a=new JPanel();
                // Border blackline=BorderFactory.createLineBorder(Color.yellow);
                // a.setBorder(blackline);
                //a.setBackground(new Color(200,0,0,125));
                //a.setOpaque(false);
                if(place.size()!=0)
                {
                if(i==place.get(l).getp())
                {
                    this.add(new Cours(place.get(l).getNomCours(),place.get(l).getNomProf(),place.get(l).getEt(),place.get(l).getNomSalle(),place.get(l).getNomSite(),place.get(l).getNomType(),place.get(l).getNomProm()));      
                    if(l+1<place.size())
                    {
                       l++;   
                    }
                }
                else{
                if(i%2==0)
                {
                    
                    a.setBackground(Color.LIGHT_GRAY);
                    a.setBorder(matteborder);
                    this.add(a);
                }
                if(i%2==1)
                {
                    a.setBackground(Color.white);
                    a.setBorder(matteborder);
                    this.add(a);
                }
                }
                }
                else{
                if(i%2==0)
                {
                    
                    a.setBackground(Color.LIGHT_GRAY);
                    a.setBorder(matteborder);
                    this.add(a);
                }
                if(i%2==1)
                {
                    a.setBackground(Color.white);
                    a.setBorder(matteborder);
                    this.add(a);
                }
                }
            }
            //     this.setOpaque(false);
            //this.setBackground(new Color(200,0,0,200));
            this.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Planning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
               
}


