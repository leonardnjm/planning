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
import java.util.*;
import javax.swing.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public Header(Utilisateur b) {
        
        a=b;
    
        Object[] choix = new Object[]{ "En grille", "En liste"};
        //creation des listes deroulantes
        enGrille= new JComboBox(choix);
        
        Object[] statut = new Object[]{ "Peronne", "ING3", "ING4", "ING3 GROUPE1", "..."};
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
       String groupe = pourQui.getSelectedItem().toString();
       
       ///recuperation du groupe
       String types = type.getSelectedItem().toString();
               
   //    System.out.println("" + f +""+choix+""+groupe+""+types);
           
           Fenetre k;
           k=new Fenetre(a);          
   
    }
  }
    
}
