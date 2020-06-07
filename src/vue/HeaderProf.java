/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import com.github.lgooddatepicker.components.DatePicker;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import modele.Connexion;
import modele.Utilisateur;

/**
 *
 * @author Raphael
 */
public class HeaderProf extends JPanel { 
    
    private final JButton valider;
    
    private final JComboBox enGrille;
    
    private final DatePicker datePicker1;
    
     private final JPanel p1, p2, pann, nord;
     private Utilisateur a;
    private Connexion maconnexion;
    private ResultSet rset;
    private PreparedStatement prepstmt;
    private Connection conna;
    public HeaderProf(Utilisateur z) {
        
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
                
                
        
        
        pann.add(enGrille);
        
       // p2.add(valider);
        
        nord.add("North", p2);

        nord.add("North", p1);
         
        nord.add("North", pann);
        
        datePicker1 = new DatePicker();
        add(datePicker1);
        datePicker1.setDateToToday();

         
        valider.addActionListener(new HeaderProf.BoutonListener());
  
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
            
            ///recuperation du groupe
            Utilisateur z=a;
            
            FenetreProf k;
            ListeProf a;
            
            if(choix.equals("En grille"))
            {                
                k = new FenetreProf(z,f);                      
            }
            else
            {
                a=new ListeProf(z,f);
            }
            
        }
      

  }   
}

