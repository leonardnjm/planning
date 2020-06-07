/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import modele.Connexion;
import modele.Placement;
import modele.PlacementLigne;
import modele.Utilisateur;

/**
 *
 * @author Raphael
 */
public class Liste extends JFrame{
    private Connexion maconnexion;
    private ResultSet rset;
    private PreparedStatement prepstmt;
    private Connection conna;
    private ResultSetMetaData rsetMeta;
    private ArrayList<String> liste;    
    private Date today = new Date();
    
    public Liste(Utilisateur u)
    {
    
        this.setTitle("Liste");
    this.setSize(500, 500);
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
        
                try {
            try {
                maconnexion=new Connexion("planning","root","");
                conna=maconnexion.getco();
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Planning.class.getName()).log(Level.SEVERE, null, ex);
            }
             ArrayList<PlacementLigne> place = new ArrayList<PlacementLigne>();

        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        int iweek = cal.get(Calendar.WEEK_OF_YEAR);
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
            place.add(new PlacementLigne(a,dayOfWeek,Integer.parseInt(rset.getString(2)),rset.getString(3),rset.getString(4),rset.getString(5),rset.getString(6),rset.getString(7),rset.getString(8)));
        }  
        
        JPanel Lundi = new JPanel();
        BoxLayout layout1 = new BoxLayout(Lundi, BoxLayout.Y_AXIS);
        Lundi.setLayout(layout1);
 
        JPanel Mardi = new JPanel();
        BoxLayout layout2 = new BoxLayout(Mardi, BoxLayout.Y_AXIS);
        Mardi.setLayout(layout2);
        
        JPanel Mercredi = new JPanel();
        BoxLayout layout3 = new BoxLayout(Mercredi, BoxLayout.Y_AXIS);
        Mercredi.setLayout(layout3);
        
        JPanel Jeudi = new JPanel();
        BoxLayout layout4 = new BoxLayout(Jeudi, BoxLayout.Y_AXIS);
        Jeudi.setLayout(layout4);
        
        JPanel Vendredi = new JPanel();
        BoxLayout layout5 = new BoxLayout(Vendredi, BoxLayout.Y_AXIS);
        Vendredi.setLayout(layout5);
                     
        JPanel Samedi = new JPanel();
    BoxLayout layout6 = new BoxLayout(Samedi, BoxLayout.Y_AXIS);
        Samedi.setLayout(layout6);

        
       
        
        JLabel a=new JLabel();
        a.setText("Lundi:");
        a.setBorder(new EmptyBorder(4,10,10,10));
         a.setAlignmentX(Component.CENTER_ALIGNMENT);

       // JPanel lundi=new JPanel();
        Lundi. add(a);
        
        for(int i=0;i<place.size();i++)
        {
            if(place.get(i).getJour()==1)
            {
               Lundi.add(new Cours(place.get(i).getDa(),place.get(i).getNomCours(),place.get(i).getNomProf(),place.get(i).getEt(),place.get(i).getNomSalle(),place.get(i).getNomSite(),place.get(i).getNomType(),place.get(i).getHdeb()));
            }
        } 
        Samedi.add(Lundi);

        
        JLabel b=new JLabel();
        b.setText("Mardi:");
        Mardi.add(b);
        b.setAlignmentX(Component.CENTER_ALIGNMENT);
        b.setBorder(new EmptyBorder(4,10,10,10));
      //  this.add(mardi);
        for(int i=0;i<place.size();i++)
        {
            if(place.get(i).getJour()==2)
            {
               Mardi.add(new Cours(place.get(i).getDa(),place.get(i).getNomCours(),place.get(i).getNomProf(),place.get(i).getEt(),place.get(i).getNomSalle(),place.get(i).getNomSite(),place.get(i).getNomType(),place.get(i).getHdeb()));
            }
        }   
        Samedi.add(Mardi);
        
        
        JLabel c=new JLabel();
        c.setText("Mercredi:");
        Mercredi. add(c);
        c.setAlignmentX(Component.CENTER_ALIGNMENT);
        c.setBorder(new EmptyBorder(4,10,10,10));
       // this.add(mercredi);
        for(int i=0;i<place.size();i++)
        {
            if(place.get(i).getJour()==3)
            {
               Mercredi.add(new Cours(place.get(i).getDa(),place.get(i).getNomCours(),place.get(i).getNomProf(),place.get(i).getEt(),place.get(i).getNomSalle(),place.get(i).getNomSite(),place.get(i).getNomType(),place.get(i).getHdeb()));
            }
        } 
        
        Samedi.add(Mercredi);
        
        
        JLabel d=new JLabel();
        d.setText("Jeudi:");
        Jeudi. add(d);
        d.setAlignmentX(Component.CENTER_ALIGNMENT);
        d.setBorder(new EmptyBorder(4,10,10,10));
       // this.add(jeudi);
        for(int i=0;i<place.size();i++)
        {
            if(place.get(i).getJour()==4)
            {
               Jeudi.add(new Cours(place.get(i).getDa(),place.get(i).getNomCours(),place.get(i).getNomProf(),place.get(i).getEt(),place.get(i).getNomSalle(),place.get(i).getNomSite(),place.get(i).getNomType(),place.get(i).getHdeb()));
            }
        } 
            Samedi.add(Jeudi);
        
        
        JLabel e=new JLabel();
        e.setText("Vendredi:");
        Vendredi. add(e);
        e.setAlignmentX(Component.CENTER_ALIGNMENT);
        e.setBorder(new EmptyBorder(4,10,10,10));

       // this.add(vendredi);
        for(int i=0;i<place.size();i++)
        {
            if(place.get(i).getJour()==5)
            {
               Vendredi.add(new Cours(place.get(i).getDa(),place.get(i).getNomCours(),place.get(i).getNomProf(),place.get(i).getEt(),place.get(i).getNomSalle(),place.get(i).getNomSite(),place.get(i).getNomType(),place.get(i).getHdeb()));
            }
        } 
        
            Samedi.add(Vendredi);
        
         this.setLayout(new FlowLayout());
         
  
                 this.add(Samedi);
                 


        this.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Planning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
