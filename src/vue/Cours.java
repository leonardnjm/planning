/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.GridLayout; 
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class Cours extends JFrame{
  public Cours(){
   
    this.setTitle("Bouton");
    this.setSize(1400, 750);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    //On définit le layout à utiliser sur le content pane
    //Trois lignes sur deux colonnes
    this.setLayout(new GridLayout(11, 6));
    //On ajoute le bouton au content pane de la JFrame
    for(int i =0; i<66; i++)
    {
     
    this.getContentPane().add(new JButton(""+i));
    }
   
    this.setVisible(true);
  }      
}