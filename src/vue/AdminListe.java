/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modele.Connexion;
import modele.PlacementLigne;
import modele.Seance;

/**
 *
 * @author Raphael
 */
public class AdminListe extends JPanel{
    private Connexion maconnexion;
    private ResultSet rset;
    private PreparedStatement prepstmt;
    private Connection conna;
    
public AdminListe(){
                 ArrayList<Seance> place = new ArrayList<Seance>();

        try {
            maconnexion=new Connexion("planning","root","");
            conna=maconnexion.getco();
            
            prepstmt=conna.prepareStatement("SELECT seance.*"
                + " FROM `seance`");
            rset=prepstmt.executeQuery();
            while (rset.next()) {
               
                place.add(new Seance(rset.getInt(1),rset.getInt(2),rset.getDate(3),rset.getInt(4),rset.getInt(4)+1,rset.getString(6),rset.getInt(7),rset.getInt(8)));
            }  

            this.setLayout(new GridLayout(place.size(), 0));
            for(int i=0;i<place.size();i++)
            {
                JLabel a =new JLabel("id:"+place.get(i).getid());
                JLabel b =new JLabel("---"+place.get(i).getdate());
                JLabel c =new JLabel("---"+place.get(i).getsemaine());
                JLabel d =new JLabel("---"+place.get(i).getdebut());
                JLabel e =new JLabel("h/"+place.get(i).getfin());
                JLabel f =new JLabel("h---"+place.get(i).getetat());
                JLabel g =new JLabel("--- id cours:"+place.get(i).getidcours());
                JLabel h =new JLabel("--- id type cours:"+place.get(i).getidtype());
                JPanel j= new JPanel();
                j.add(a);
                j.add(b);
                j.add(c);
                j.add(d);
                j.add(e);
                j.add(f);
                j.add(g);
                j.add(h);
                this.add(j);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdminListe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminListe.class.getName()).log(Level.SEVERE, null, ex);
        }
         
}

      
}
