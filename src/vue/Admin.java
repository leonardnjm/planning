/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import com.github.lgooddatepicker.components.DatePicker;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.*;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;


/**
 *
 * @author Raphael
 */
public class Admin extends JFrame{
    

  //SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
//Date date;
 
private JButton b = new JButton ("AJOUTER UNE SEANCE");

    
    
    public Admin() throws ParseException{
        
    
    this.setTitle("Admin");
    this.setSize(700, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = createImageIcon("/images/test.png");
        AdminAjoute ajoute = new AdminAjoute();
        
       
        AdminAnul anul = new AdminAnul();
        AdminModif modif = new AdminModif();
        AdminListe liste =new AdminListe();
        JComponent panel1 = ajoute;
        tabbedPane.addTab("Ajouter Cours", icon, panel1,
                "Ajouter cours pour un eleve ou prof");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
    //    System.out.println("Veuillez saisir un mot :");

        JComponent panel2 = liste;
        tabbedPane.addTab("Acceder aux cours", icon, panel2,
                "Acceder a tout les cours");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        
        JComponent panel3 = anul;
        tabbedPane.addTab("Annule un cours", icon, panel3,
                "Annule un cours d'un eleve ou prof");
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
        
        JComponent panel4 = modif;
        tabbedPane.addTab("Modifier un cours", icon, panel4,
                "Modifer l'heure d'une seance");
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_3);
        
        //Add the tabbed pane to this panel.
        add(tabbedPane);
        this.setVisible(true);
        
        
        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
    
    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
    
    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Admin.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

  }       

