/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import com.github.lgooddatepicker.components.DatePicker;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import modele.DAO;
import modele.Seance;
import modele.SeanceDAO;

/**
 *
 * @author Leo
 */
public class AdminAnul extends JPanel{
             
            JLabel jl3 = new JLabel("ID du cours a annule:");        
            JTextField jf3 = new JTextField(); 
            JButton t= new JButton("Annule le cours");
             
 public AdminAnul () {  
     
          
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
 
        jl3.setBorder(new EmptyBorder(10,10,10,10));
        
      

        
        //set border boxes
       jf3.setAlignmentX(Component.LEFT_ALIGNMENT);
       jf3.setAlignmentY(Component.TOP_ALIGNMENT);
        jf3.setBorder(BorderFactory.createCompoundBorder(jf3.getBorder(),BorderFactory.createEmptyBorder(7,7,7,7)));

        jf3.setColumns(3);
      
        //ajout premiere ligne
        panel1.add(Box.createVerticalGlue());
        panel1.add(Box.createHorizontalGlue());
        panel1.add(jl3);
        panel1.add(Box.createHorizontalGlue());
        panel1.add(Box.createVerticalGlue());
      
        jf3.setAlignmentX(Component.LEFT_ALIGNMENT);
        //2eme ligne
        panel2.add(jf3);

        panel2.add(Box.createHorizontalGlue());
        panel2.add(Box.createVerticalGlue());
        
       
       JLabel titre = new JLabel("Cours a annule");  
       this.add(Box.createVerticalGlue());
       titre.setAlignmentX(Component.CENTER_ALIGNMENT);
       this.add(titre);
       this.add(Box.createVerticalGlue());
       
        bot.setBackground(Color.RED);
        t.setBackground(Color.RED);
        t.setForeground(Color.BLACK);
        bot.setOpaque(true);
        bot.add(t);
       
        t.addActionListener(new AdminAnul.BoutonListener());

        
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
   
        try {
            ///recuperation nom du prof
            String id = jf3.getText();
            //convertir id en entier
            int k=Integer.parseInt(id);  
            Seance a=new Seance();
            DAO<Seance> s = new SeanceDAO();
            
            a=s.find(k);
            a.setEtat("ANNULE");
            s.update(a);
            
                     
        } catch (SQLException ex) {
            Logger.getLogger(AdminAnul.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminAnul.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

}
