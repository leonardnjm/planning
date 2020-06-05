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
import java.awt.Color;
import java.awt.GridLayout; 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Planning extends JPanel{
    public Planning(){
    //On définit le layout à utiliser sur le content pane
    //Trois lignes sur deux colonnes
    this.setLayout(new GridLayout(11, 6));
    //On ajoute le bouton au content pane de la JFrame
    for(int i=0; i<66; i++){
        JPanel a=new JPanel();
       // Border blackline=BorderFactory.createLineBorder(Color.yellow);
       // a.setBorder(blackline);
        //a.setBackground(new Color(200,0,0,125));
        //a.setOpaque(false);
        if(i%2==0)
        {
            
                a.setBackground(Color.LIGHT_GRAY);
                this.add(a);
        }
        if(i%2==1)
        {
            a.setBackground(Color.white);
                this.add(a);
        }
    }
              //     this.setOpaque(false);
               //this.setBackground(new Color(200,0,0,200));

    this.setVisible(true);
    }
}
