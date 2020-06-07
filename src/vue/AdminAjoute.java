/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;


import com.github.lgooddatepicker.components.DatePicker;
import javax.swing.JPanel;
import java.awt.*;  
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Leo
 */
public class AdminAjoute extends JPanel{
    
    private final DatePicker datePicker1;
   // private final String a;
    
    
             Object[] matiere = new Object[]{"Maths", "Physique","Informatique","Electronique"};
             Object[] type = new Object[]{ "magistral", "Zoom","TD","projet"};
             Object[] heure = new Object[]{ "8", "9","10","11","12","13","14","15","16","17","18"};
             Object[] site = new Object[]{ "E1", "E2","CNAM"};
             Object[] promo = new Object[]{ "2022", "2023","2024"};
             Object[] groupe = new Object[]{ "TD1", "TD2","TD3"};

            
            JLabel jl1 = new JLabel("Date du cours:");        
            JLabel jl2 = new JLabel("Nom de la matiere:"); //menu defilant
            JLabel jl3 = new JLabel("Nom de l'enseignant:");    
            JLabel jl8 = new JLabel("Promotion:"); 
            JLabel jl9 = new JLabel("Groupe:");
            JLabel jl4 = new JLabel("Type de cours:");   //presentiel ou zoom
            JLabel jl5 = new JLabel("Site:");        
            JLabel jl6 = new JLabel("Salle:");
            JLabel jl7 = new JLabel("Heure de debut:");
            JButton t = new JButton("Ajouter le cours");
            
            JComboBox jf2 = new JComboBox(matiere); //menu defilant
            JTextField jf3 = new JTextField(); 
            JComboBox jf8 = new JComboBox(promo); 
            JComboBox jf9 = new JComboBox(groupe);
            JComboBox jf4 = new JComboBox(type);   //presentiel ou zoom
            JComboBox jf5 = new JComboBox(site);        
            JTextField jf6 = new JTextField();
            JComboBox jf7 = new JComboBox(heure); //heure
    
    
    
 public AdminAjoute () {  
     
     
            datePicker1 = new DatePicker();
            datePicker1.setSize(20,20);
            
            //pannel pour chaque rang
            
            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();
            
            JPanel test = new JPanel();
            
            JPanel bot = new JPanel();  //panel du buton
            
            //layout
            
        BoxLayout layout1 = new BoxLayout(panel1, BoxLayout.Y_AXIS);
        BoxLayout layout2 = new BoxLayout(panel2, BoxLayout.Y_AXIS);
        BoxLayout layout3 = new BoxLayout(bot, BoxLayout.X_AXIS);
                
        panel1.setLayout(layout1);
        panel2.setLayout(layout2);
        bot.setLayout(layout3);
         
        // set the border labels
        jl1.setBorder(new EmptyBorder(2,10,10,10));
        jl2.setBorder(new EmptyBorder(10,10,10,10));
        jl3.setBorder(new EmptyBorder(10,10,10,10));
        jl4.setBorder(new EmptyBorder(10,10,10,10));
        jl5.setBorder(new EmptyBorder(10,10,10,10));
        jl6.setBorder(new EmptyBorder(10,10,10,10));
        jl7.setBorder(new EmptyBorder(10,10,10,10));
        jl8.setBorder(new EmptyBorder(10,10,10,10));
        jl9.setBorder(new EmptyBorder(10,10,10,10));
        
        //set border boxes
     
        jf2.setBorder(BorderFactory.createCompoundBorder(jf2.getBorder(),BorderFactory.createEmptyBorder(7,7,7,7)));
        jf3.setBorder(BorderFactory.createCompoundBorder(jf3.getBorder(),BorderFactory.createEmptyBorder(7,7,7,7)));
        jf4.setBorder(BorderFactory.createCompoundBorder(jf4.getBorder(),BorderFactory.createEmptyBorder(7,7,7,7)));
        jf5.setBorder(BorderFactory.createCompoundBorder(jf5.getBorder(),BorderFactory.createEmptyBorder(7,7,7,7)));
        jf6.setBorder(BorderFactory.createCompoundBorder(jf6.getBorder(),BorderFactory.createEmptyBorder(7,7,7,7)));
        jf7.setBorder(BorderFactory.createCompoundBorder(jf7.getBorder(),BorderFactory.createEmptyBorder(7,7,7,7)));
        jf8.setBorder(BorderFactory.createCompoundBorder(jf8.getBorder(),BorderFactory.createEmptyBorder(7,7,7,7)));
        jf9.setBorder(BorderFactory.createCompoundBorder(jf9.getBorder(),BorderFactory.createEmptyBorder(7,7,7,7)));
        
        
        jl1.setAlignmentX(Component.LEFT_ALIGNMENT);
        jl1.setAlignmentY(Component.TOP_ALIGNMENT);
       // jl2.setAlignmentX(Component.CENTER_ALIGNMENT);
        jl2.setAlignmentX(Component.LEFT_ALIGNMENT);
      
        //ajout premiere ligne
        panel1.add(Box.createVerticalGlue());
        panel1.add(Box.createHorizontalGlue());
        panel1.add(jl1);
        panel1.add(Box.createHorizontalGlue());
        panel1.add(jl2);
        panel1.add(Box.createHorizontalGlue());
        panel1.add(jl3);
        panel1.add(Box.createHorizontalGlue());
        panel1.add(jl8);
        panel1.add(Box.createHorizontalGlue());
        panel1.add(jl9);
        panel1.add(Box.createHorizontalGlue());
        panel1.add(jl4);
        panel1.add(Box.createHorizontalGlue());
        panel1.add(jl5);
        panel1.add(Box.createHorizontalGlue());
        panel1.add(jl6);
        panel1.add(Box.createHorizontalGlue());
        panel1.add(jl7);
        panel1.add(Box.createHorizontalGlue());
        panel1.add(Box.createVerticalGlue());
       
        
        jf2.setAlignmentX(Component.LEFT_ALIGNMENT);
        jf3.setAlignmentX(Component.LEFT_ALIGNMENT);
        jf4.setAlignmentX(Component.LEFT_ALIGNMENT);
        jf5.setAlignmentX(Component.LEFT_ALIGNMENT);
        jf6.setAlignmentX(Component.LEFT_ALIGNMENT);
        jf7.setAlignmentX(Component.LEFT_ALIGNMENT);
        jf8.setAlignmentX(Component.LEFT_ALIGNMENT);
        jf9.setAlignmentX(Component.LEFT_ALIGNMENT);
          
        
        
        //2eme ligne
        panel2.add(Box.createHorizontalGlue());
        panel2.add(datePicker1);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(jf2);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(jf3);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(jf8);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(jf9);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(jf4);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(jf5);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(jf6);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(jf7);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(Box.createVerticalGlue());
        
       
       JLabel titre = new JLabel("Entrer les information du cours");  
       this.add(Box.createVerticalGlue());
       titre.setAlignmentX(Component.CENTER_ALIGNMENT);
       this.add(titre);
       this.add(Box.createVerticalGlue());
       
        bot.setBackground(Color.RED);
        t.setBackground(Color.green);
        t.setForeground(Color.BLACK);
        bot.setOpaque(true);
        bot.add(t);
       
        t.addActionListener(new BoutonListener());

        
        this.setLayout(new FlowLayout());
       
        test.add(panel1);
        test.add(panel2);
        this.add(test);
        this.add(bot);
        
        
//        panel1.setBorder(BorderFactory.createLineBorder(Color.RED));
//         panel2.setBorder(BorderFactory.createLineBorder(Color.RED));

           
setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));   
setVisible(true);  


}
  
 class BoutonListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent arg0) {
     
      ///recuperation date
      ZoneId defaultZoneId = ZoneId.systemDefault();
      LocalDate d= datePicker1.getDate();
      Date date = Date.from(d.atStartOfDay(defaultZoneId).toInstant());
      
        ///recuperation nom du cours
       String cours= jf2.getSelectedItem().toString();  
       
       ///recuperation nom du prof
       String prof = jf3.getText();
       
       ///recuperation promo
       String promo = jf8.getSelectedItem().toString();
       
       ///recuperation Groupe
       String groupe = jf9.getSelectedItem().toString();
       
       ///recuperation type de cours
       String type = jf4.getSelectedItem().toString();
       
       ///recuperation du site
       String site = jf5.getSelectedItem().toString();
       
       ///recuperation de la salle
       String salle = jf6.getText();
       
       ///recuperation de l'heure du debut
       String heure = jf7.getSelectedItem().toString();
       
      //  System.out.println("" + date +"" + cours+ ""+prof+ ""+promo+ ""+groupe+ ""+type+ ""+salle+""+site+""+heure);
        
        

    }
  }
}
