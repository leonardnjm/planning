/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.GridLayout; 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
 
public class Cours extends JPanel{
  public Cours(){
   
    //On définit le layout à utiliser sur le content pane
    //Trois lignes sur deux colonnes
    //On ajoute le bouton au content pane de la JFrame    
    JLabel a =new JLabel("aaa");
    this.add(a);
        this.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10), new EtchedBorder()));

    this.setVisible(true);
  }      
}