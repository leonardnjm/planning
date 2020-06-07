/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import com.github.lgooddatepicker.components.DatePicker;
import javax.accessibility.Accessible;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import java.awt.event.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.Connexion;
import modele.Utilisateur;

/**
 *
 * @author Leo
 */
public class Header extends JPanel { 
    
    private final JButton valider;
    
    private final JComboBox enGrille, pourQui,type;
    
    private final DatePicker datePicker1;
    
     private final JPanel p1, p2, pann, nord;
     private Utilisateur a;
    private Connexion maconnexion;
    private ResultSet rset;
    private PreparedStatement prepstmt;
    private Connection conna;
    public Header(Utilisateur z) {
        
        try {             
            maconnexion=new Connexion("planning","root","");
                conna=maconnexion.getco();
        } catch (SQLException ex) {
            Logger.getLogger(Header.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Header.class.getName()).log(Level.SEVERE, null, ex);
        }

        a=z;
        Object[] choix = new Object[]{ "En grille", "En liste"};
        //creation des listes deroulantes
        enGrille= new JComboBox(choix);
        
        Object[] statut = new Object[]{ "TD", "PROMO"};
        //creation des listes deroulantes
        pourQui= new JComboBox(statut);
                        
        
        Object[] t = new Object[]{ "Emploi du temps", "Recapitulatif" };
        //creation des listes deroulantes
        type = new JComboBox(t);
        
       // cours.setPreferredSize(new Dimension(150, 120));
        

        valider = new JButton("Filtrer");
        
                p1 = new JPanel();
                p2 = new JPanel();
                pann = new JPanel();
                nord = new JPanel();
        
                p1.setLayout(new GridLayout(1, 2));
        
                p2.setLayout(new GridLayout(1, 4));
        
                pann.setLayout(new GridLayout(1,4));
                
                nord.setLayout(new GridLayout(3,1));
                
                
        
        p1.add(type);
        
        pann.add(enGrille);
        pann.add(pourQui);
        
       // p2.add(valider);
        
        nord.add("North", p2);

        nord.add("North", p1);
         
        nord.add("North", pann);
        
        datePicker1 = new DatePicker();
        add(datePicker1);
        datePicker1.setDateToToday();

        type.setBackground(Color.gray);
         
        valider.addActionListener(new Header.BoutonListener());
  
        this.add(pann);
        this.add(p1);
        this.add(p2);
        this.add(valider);
        
        this.setVisible(true);
        
}
    
    public void test(){
                      System.out.println("Veuillez saisir un mot :");

    }
    
    class BoutonListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent arg0) {

        String prom = "";
        try {
            prepstmt=conna.prepareStatement("SELECT promotion.nom "
                    + " FROM `promotion`, utilisateurs, etudiant, groupe "
                    + " WHERE utilisateurs.ID="+a.getId()
                    + " AND etudiant.ID_utilisateur=utilisateurs.ID"
                    + " AND groupe.ID=etudiant.ID_groupe"
                    + " AND promotion.ID=groupe.ID_prom");
            rset=prepstmt.executeQuery();
                    while(rset.next())
                    {
                        prom=rset.getString(1);
                    }
        

      ///recuperation date
      ZoneId defaultZoneId = ZoneId.systemDefault();
      LocalDate d= datePicker1.getDate();
      Date date = Date.from(d.atStartOfDay(defaultZoneId).toInstant());
      Calendar cal= Calendar.getInstance();
      cal.setTime(date);
      int f = cal.get(Calendar.WEEK_OF_YEAR);
        ///recuperation liste
       String choix= enGrille.getSelectedItem().toString();  
       
       ///recuperation du groupe
       String groupe = pourQui.getSelectedItem().toString();
       
       ///recuperation du groupe
       String types = type.getSelectedItem().toString();
       Utilisateur z=a;
     
        Fenetre k;
        Liste a;
        if(types.equals("Emploi du temps"))
        {         
            if(choix.equals("En grille"))
            { 
                if(groupe.equals("TD"))
                {
                    k = new Fenetre(z,f);                    
                }
                else
                {
                if(choix.equals("En grille"))
                { 
                    k = new Fenetre(z,f,prom);
                }
                }            
            }
            else
            {
                 a=new Liste(z);
            }
            
        }
        else{
            EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Chart demo = new Chart("Recapitulatif",z);
                demo.pack();
                demo.setVisible(true);
                demo.start();
            }
        });
        }
      
    } catch (SQLException ex) {
            Logger.getLogger(Header.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  }   
}
