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
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leo
 */
public class Header extends JPanel { 
    
    private final JButton cours, viescolaire, promo, salles;
    private final JButton edt, recap;
    
    private final JComboBox enGrille, pourQui;
    
    private final DatePicker datePicker1;
    
     private final JPanel p1, p2, pann, nord;
    
    public Header() {
    
            Object[] choix = new Object[]{ "En grille", "En liste"};
        //creation des listes deroulantes
        enGrille= new JComboBox(choix);
        
        Object[] statut = new Object[]{ "Peronne", "ING3", "ING4", "ING3 GROUPE1", "..."};
        //creation des listes deroulantes
        pourQui= new JComboBox(statut);
        
                cours = new JButton("Cours");
        viescolaire = new JButton("Vie Scolaire");
        promo = new JButton("Promotion");
        salles = new JButton("Salles");
        
       // cours.setPreferredSize(new Dimension(150, 120));
        
        edt = new JButton("Emploi du temps");
        recap = new JButton("Recapitulatif");
        
                p1 = new JPanel();
                p2 = new JPanel();
                pann = new JPanel();
                nord = new JPanel();
        
                p1.setLayout(new GridLayout(1, 2));
        
                p2.setLayout(new GridLayout(1, 4));
        
                pann.setLayout(new GridLayout(1,4));
                
                nord.setLayout(new GridLayout(3,1));
                
                
         p2.add(cours);
        p2.add(viescolaire);
        p2.add(promo);
        p2.add(salles);
        
        p1.add(edt);
        p1.add(recap);
        
        pann.add(enGrille);
        pann.add(pourQui);
        
        nord.add("North", p2);

        nord.add("North", p1);
         
        nord.add("North", pann);
        
            datePicker1 = new DatePicker();
            add(datePicker1);
        
        
         cours.setBackground(Color.gray);
        viescolaire.setBackground(Color.gray);
        promo.setBackground(Color.gray);
        salles.setBackground(Color.GRAY);
        edt.setBackground(Color.gray);
        recap.setBackground(Color.gray);
  
        
        this.add(pann);
        this.add(p1);
        this.add(p2);
        
        this.setVisible(true);
}
    
}
