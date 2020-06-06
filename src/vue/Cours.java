/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.Color;
import java.awt.GridLayout; 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
 
public class Cours extends JPanel{
  public Cours(String cou,String prof, String etat, String salle, String site, String type){
                  this.setLayout(new GridLayout(4, 0));
    if(type.equals("zoom")) 
    {
        JLabel a=new JLabel(cou);
        JLabel b=new JLabel(prof);
        JLabel d=new JLabel(type);
        //JLabel c=new JLabel(salle+"-"+site);
        this.add(a);
        this.add(b);
        this.add(d);
        if(etat.equals("valide"))
        {}
        else{
        JLabel c=new JLabel(etat); 
        this.add(c);
        }    
    }
    else
    {
        JLabel a=new JLabel(cou);
        JLabel b=new JLabel(prof);
        JLabel c=new JLabel(salle+"-"+site);
        this.add("center",a);
        this.add(b);
        this.add(c);
        if(etat.equals("valide"))
        {}
        else{
        JLabel d=new JLabel(etat); 
        this.add(d);
        }     
    }
    if(cou.equals("Physique"))
    {
        this.setBackground(Color.pink);
    }
    if(cou.equals("Maths"))
    {
        this.setBackground(Color.cyan);
    }
      // this.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10), new EtchedBorder()));
            Border matteborder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.darkGray);
            this.setBorder(matteborder);
      
      this.setVisible(true);
  }  
  
  public Cours(String cou,String grp, String etat, String salle, String site, String type,String prom){
                  this.setLayout(new GridLayout(4, 0));
    if(type.equals("zoom")) 
    {
        JLabel a=new JLabel(cou);
        JLabel b=new JLabel(grp+"- Promo:"+prom);
        JLabel d=new JLabel(type);
        //JLabel c=new JLabel(salle+"-"+site);
        this.add(a);
        this.add(b);
        this.add(d);
        if(etat.equals("valide"))
        {}
        else{
        JLabel c=new JLabel(etat); 
        this.add(c);
        }    
    }
    else
    {
        JLabel a=new JLabel(cou);
        JLabel b=new JLabel(grp+"- Promo:"+prom);
        JLabel c=new JLabel(salle+"-"+site);
        this.add("center",a);
        this.add(b);
        this.add(c);
        if(etat.equals("valide"))
        {}
        else{
        JLabel d=new JLabel(etat); 
        this.add(d);
        }     
    }
    if(cou.equals("Physique"))
    {
        this.setBackground(Color.pink);
    }
    if(cou.equals("Maths"))
    {
        this.setBackground(Color.cyan);
    }
      // this.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10), new EtchedBorder()));
            Border matteborder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.darkGray);
            this.setBorder(matteborder);
      
      this.setVisible(true);
  }      
}