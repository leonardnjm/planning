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

/**
 *
 * @author Leo
 */
public class AdminAjoute extends JPanel {
    
    private final DatePicker datePicker1; 
  
 public AdminAjoute () {  
     
     
            datePicker1 = new DatePicker();
            datePicker1.setSize(20,20);
//            datePicker1.setPreferredSize(preferredSize);
//            datePicker1.setMinHeight(12.);
//            datePicker1.setPrefHeight(16.);
            
            JButton jb1 = new JButton("Button 1 -");        
            JButton jb2 = new JButton("Button 2 --------");
            JButton jb3 = new JButton("Button 3 -");        
            JButton jb4 = new JButton("Button 4 --------");
            JButton jb5 = new JButton("Button 5 -");        
            JButton jb6 = new JButton("Button 6 --------");
           
            //pannel pour chaque rang
            
            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();
            JPanel panel3 = new JPanel();
            
            JPanel test = new JPanel();
            
            //layout
            
        BoxLayout layout1 = new BoxLayout(panel1, BoxLayout.Y_AXIS);
        BoxLayout layout2 = new BoxLayout(panel2, BoxLayout.Y_AXIS);
        BoxLayout layout3 = new BoxLayout(panel3, BoxLayout.Y_AXIS);
                
        panel1.setLayout(layout1);
        panel2.setLayout(layout2);
        panel3.setLayout(layout3);
        
        jb1.setAlignmentX(Component.CENTER_ALIGNMENT);
        jb2.setAlignmentX(Component.CENTER_ALIGNMENT);
      
        //ajout premiere ligne
        panel1.add(Box.createVerticalGlue());
        panel1.add(Box.createHorizontalGlue());
        panel1.add(jb2);
        panel1.add(Box.createHorizontalGlue());
        panel1.add(datePicker1);
        panel1.add(Box.createHorizontalGlue());
        panel1.add(Box.createVerticalGlue());
       
        
        //2eme ligne
        panel2.add(Box.createHorizontalGlue());
        panel2.add(jb3);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(jb4);
        panel2.add(Box.createHorizontalGlue());
        panel2.add(Box.createVerticalGlue());
        panel2.add(Box.createVerticalGlue());
        panel3.add(Box.createHorizontalGlue());
        
                //2eme ligne
        panel3.add(Box.createHorizontalGlue());
        panel3.add(jb5);
        panel3.add(Box.createHorizontalGlue());
        panel3.add(jb6);
        panel3.add(Box.createHorizontalGlue());
        panel3.add(Box.createVerticalGlue());
        panel3.add(Box.createVerticalGlue());
        
        this.setLayout(new FlowLayout());
        test.add(panel1);
        test.add(panel2);
        test.add(panel3);
        this.add(test);
        
            
            
        
  
            
setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));   
setVisible(true);  
}
}
