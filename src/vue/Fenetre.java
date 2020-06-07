/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import modele.Connexion;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;


import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.DateTimePicker;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings.TimeArea;
import modele.Utilisateur;

/**
 *
 * Affiche la fenetre graphique 
 * 
 *
 * @author Leo
 */
public class Fenetre extends JFrame implements ActionListener, ItemListener {

    
    private Connexion maconnexion;
    private final JLabel lundi, mardi, jeudi, mercredi,vendredi,samedi;
    private final JPanel lu,ma,me,je,ve,sa; //panels de chaque jour
    private final JPanel p0, p1, nord, p2, p3, west,p;
    
   
    //headers
    private final JButton local;

    /**
     * Constructeur qui initialise tous les objets graphiques de la fenetre
     */
    public Fenetre(Utilisateur z) {

        // creation par heritage de la fenetre
        super("Hyperplanning");

        // mise en page (layout) de la fenetre visible
        setLayout(new BorderLayout());
        setBounds(65, 27, 1400, 750);
        setResizable(true);
        

        // creation des boutons
        //connect = new JButton("Connexion ECE");
        local = new JButton("Connexion locale");
       

        // creation des listes pour les tables et les requetes
       // listeDeTables = new java.awt.List(10, false);
       // listeDeRequetes = new java.awt.List(10, false);

        //Initialisation du calendrier
           
       
       
        // creation des textes

       
        
        lu = new JPanel();
        ma = new JPanel();
        me = new JPanel();
        je = new JPanel();
        ve = new JPanel();
        sa = new JPanel();
        p = new JPanel();
      
        
        // creation des labels
        lundi = new JLabel("Lundi", JLabel.CENTER);
        mardi = new JLabel("Mardi", JLabel.CENTER);
        mercredi = new JLabel("Mercredi", JLabel.CENTER);
        jeudi = new JLabel("Jeudi", JLabel.CENTER);
        vendredi = new JLabel("Vendredi", JLabel.CENTER);
        samedi = new JLabel("Samedi", JLabel.CENTER);

        //header
        
        // creation des panneaux
        p0 = new JPanel();
        p1 = new JPanel();
        nord = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        west = new JPanel();

        // mise en page des panneaux
        p0.setLayout(new GridLayout(1, 3)); //setting grid layout of 1 rows and 3 columns  
        p1.setLayout(new GridLayout(1, 6));
        nord.setLayout(new GridLayout(2, 1));
        p2.setLayout(new GridLayout(1, 4));
        p3.setLayout(new GridLayout(1, 3));
        west.setLayout(new GridLayout(1,1));

        // ajout des objets graphqiues dans les panneaux

        Header header = new Header(z);
        header.setBounds(20, 20, 300, 300);
       // header.setPreferredSize(new Dimension(300, 300));

        
       //affichage header
        
          p0.add(header);
//        p0.add(datePicker1);
//        p0.add(nameBDD);
//        p0.add(nameBDDTexte);
//        p0.add(local);
        
        //affichage text
        p1.add(lundi);
        p1.add(mardi);
        p1.add(mercredi);
        p1.add(jeudi);
        p1.add(vendredi);
        p1.add(samedi);
        
        nord.add("North", p0);
        nord.add("North",p1);
        
        //panel a gauche (Heure)
        west.add("West",p);
        
      //affichage panel
        p2.add(lu);
        p2.add(ma);
        p2.add(me);
        p2.add(je);
        p2.add(ve);
        p2.add(sa);
        
        //footer
//        p3.add(requeteLabel);
//        p3.add(requeteTexte);
//        p3.add(exec);

        // ajout des listeners
     
        local.addActionListener(this);
//        listeDeTables.addItemListener(this);
 //       listeDeRequetes.addItemListener(this);

        // couleurs des objets graphiques
        lu.setBackground(Color.LIGHT_GRAY);
        ma.setBackground(Color.WHITE);
        me.setBackground(Color.LIGHT_GRAY);
        je.setBackground(Color.WHITE);
        ve.setBackground(Color.LIGHT_GRAY);
        sa.setBackground(Color.WHITE);
        
        p.setBackground(Color.WHITE);
                
  //      p1.setBackground(Color.LIGHT_GRAY);

        // disposition geographique des panneaux
        add("North", nord);
        add("Center", p2);
      // Planning a= new Planning(z,23);
       PlanningProf b=new PlanningProf(z);
       //a.setOpaque(true);

        add("Center", b);
        add("South", p3);
        add("West",p);
        
        //pour l'affichage des horaires
        p.setLayout(new GridLayout(0, 1));
        p.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));    
        
        //boucle qui affiche
        for(int i = 8; i<19;i++){
    JLabel jlabel = new JLabel(""+i);
    jlabel.setFont(new Font("Helvetica",3,15));
    jlabel.setHorizontalAlignment(JLabel.LEFT);
    jlabel.setVerticalAlignment(JLabel.TOP);
    p.add("West",jlabel);
        
    setVisible(true);
    }

        // pour fermer la fenetre
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
               System.exit(0); // tout fermer 
             // dispose();    //On ferme juste la fenetre active
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}