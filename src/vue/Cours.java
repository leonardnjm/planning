/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout; 
import java.text.SimpleDateFormat;
import java.util.Date;
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
    if(type.equals("Zoom")) 
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
    if(cou.equals("Informatique"))
    {
        this.setBackground(Color.red);
    }
     if(cou.equals("Electronique"))
    {
        this.setBackground(Color.yellow);
    }
      // this.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10), new EtchedBorder()));
            Border matteborder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.darkGray);
            this.setBorder(matteborder);
      
      this.setVisible(true);
  }  
  
  public Cours(String cou,String grp, String etat, String salle, String site, String type,String prom){
                  this.setLayout(new GridLayout(4, 0));
    if(type.equals("Zoom")) 
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
    if(cou.equals("Informatique"))
    {
        this.setBackground(Color.red);
    }
     if(cou.equals("Electronique"))
    {
        this.setBackground(Color.yellow);
    }
      // this.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10), new EtchedBorder()));
            Border matteborder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.darkGray);
            this.setBorder(matteborder);
      
      this.setVisible(true);
  }      

  public Cours(Date da,String cou,String prof, String etat, String salle, String site, String type,int w){
      String pattern="dd-MM-yyyy";
      SimpleDateFormat j=new SimpleDateFormat(pattern);
      String Date = j.format(da);
      int z=w+1;
      JLabel h=new JLabel(""+w+"h-"+z+"h");
      h.setBorder(new EmptyBorder(4,10,4,10));
      h.setAlignmentX(Component.LEFT_ALIGNMENT);
    if(type.equals("Zoom")) 
    {
        
        JLabel dat=new JLabel(Date);
        JLabel a=new JLabel(cou);
        JLabel b=new JLabel(prof);
        JLabel d=new JLabel(type);
        //JLabel c=new JLabel(salle+"-"+site);
        this.add(dat);
        this.add(h);
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
                JLabel dat=new JLabel(Date);
        JLabel a=new JLabel(cou);
        a.setBorder(new EmptyBorder(4,10,4,10));
        JLabel b=new JLabel(prof);
        b.setBorder(new EmptyBorder(4,10,4,10));
        JLabel c=new JLabel(salle+"-"+site);
        c.setBorder(new EmptyBorder(4,10,4,10));
                this.add(dat);
this.add(h);

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
    if(cou.equals("Informatique"))
    {
        this.setBackground(Color.red);
    }
     if(cou.equals("Electronique"))
    {
        this.setBackground(Color.yellow);
    }
      // this.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10), new EtchedBorder()));
            Border matteborder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.darkGray);
            this.setBorder(matteborder);
      this.setSize(800, 20);
      this.setVisible(true);
  }  

  public Cours(String cou,String grp, String etat, String salle, String site, String type,String prom,String cou1,String grp1, String etat1, String salle1, String site1, String type1,String prom1){
    JPanel tt =new JPanel();
    JPanel tt1 =new JPanel();
    tt.setLayout(new GridLayout(4, 0));
    tt1.setLayout(new GridLayout(4, 0));
    Font font = new Font("Arial",Font.BOLD,10);
   //Debut du premier cours
         System.out.println("Veuillez saisir un mot ffffffffffffffffffff:");

    if(type.equals("Zoom")) 
    {
        JLabel a=new JLabel(cou);
a.setFont(font);
        JLabel b=new JLabel(grp+"- Promo:"+prom);
        b.setFont(font);

        JLabel d=new JLabel(type);
        d.setFont(font);

        //JLabel c=new JLabel(salle+"-"+site);
        tt.add(a);
        tt.add(b);
        tt.add(d);
        if(etat.equals("valide"))
        {}
        else{
        JLabel c=new JLabel(etat); 
        c.setFont(font);

        tt.add(c);
        }    
    }
    else
    {
        JLabel a=new JLabel(cou);
        a.setFont(font);

        JLabel b=new JLabel(grp+"- Promo:"+prom);
        b.setFont(font);

        JLabel c=new JLabel(salle+"-"+site);
        c.setFont(font);

        tt.add("center",a);
        tt.add(b);
        tt.add(c);
        if(etat.equals("valide"))
        {}
        else{
        JLabel d=new JLabel(etat); 
        d.setFont(font);

        tt.add(d);
        }     
    }
   if(cou.equals("Physique"))
    {
        tt.setBackground(Color.pink);
    }
    if(cou.equals("Maths"))
    {
        tt.setBackground(Color.cyan);
    }
    if(cou.equals("Informatique"))
    {
        tt.setBackground(Color.red);
    }
     if(cou.equals("Electronique"))
    {
        tt.setBackground(Color.yellow);
    }
      // this.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10), new EtchedBorder()));
            Border matteborder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.darkGray);
            tt.setBorder(matteborder);
            //debut du deuxieme cours
         if(type1.equals("Zoom")) 
    {
        JLabel a=new JLabel(cou);
        a.setFont(font);

        JLabel b=new JLabel(grp1+"- Promo:"+prom1);
        b.setFont(font);

        JLabel d=new JLabel(type1);
        d.setFont(font);

        //JLabel c=new JLabel(salle+"-"+site);
        tt1.add(a);
        tt1.add(b);
        tt1.add(d);
        if(etat1.equals("valide"))
        {}
        else{
        JLabel c=new JLabel(etat1); 
        c.setFont(font);

        tt1.add(c);
        
        }    
    }
    else
    {
        JLabel a=new JLabel(cou1);
        a.setFont(font);

        JLabel b=new JLabel(grp1+"- Promo:"+prom1);
        b.setFont(font);

        JLabel c=new JLabel(salle1+"-"+site1);
        c.setFont(font);

        tt1.add("center",a);
        tt1.add(b);
        tt1.add(c);
        if(etat1.equals("valide"))
        {}
        else{
        JLabel d=new JLabel(etat); 
        d.setFont(font);

        tt1.add(d);
        }     
    }
   if(cou1.equals("Physique"))
    {
        tt1.setBackground(Color.pink);
    }
    if(cou1.equals("Maths"))
    {
        tt1.setBackground(Color.cyan);
    }
    if(cou1.equals("Informatique"))
    {
        tt1.setBackground(Color.red);
    }
     if(cou1.equals("Electronique"))
    {
        tt1.setBackground(Color.yellow);
    }
      // this.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10), new EtchedBorder()));
            tt1.setBorder(matteborder);
            JPanel g=new JPanel(new FlowLayout());
                              tt.setFont(tt.getFont().deriveFont((float)(this.getWidth()/2)));
                              tt1.setFont(tt1.getFont().deriveFont((float)(this.getWidth()/2)));

         g.add(tt);
                  g.add(tt1);

       //tt.add(q);
      //this.add(tt);
      System.out.println("Veuillez saisir un mot ffffffffffffffffffff:");

      this.add(g);
      
      this.setVisible(true);
  }      

}