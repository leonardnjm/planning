/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import modele.Connexion;
import modele.Utilisateur;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.JFreeChart;
public class Chart extends ApplicationFrame {
    private Timer timer;
    private Connexion maconnexion;
    private ResultSet rset;
    private PreparedStatement prepstmt;
    private Connection conna;
    Utilisateur d;
    public Chart(final String title,Utilisateur a) {
        super(title);
        d=a;
      JFreeChart barChart = ChartFactory.createBarChart(
         "Nombre d'heure restante de cette semaine",           
         "Nom de la matiere",            
         "Nombre d'heure de cours",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 700 , 500 ) );      
    this.setSize(700, 500);
    this.setLocationRelativeTo(null);
      setContentPane(chartPanel);
    }
      private CategoryDataset createDataset( ) {
        
            final String fiat = "Nombre d'heure de la matiere";
            final String inf = "Info";
            final String elec = "Elec";
            final String phys = "Physique";
            final String maths = "Maths";
            int nbmaths=0;
            int nbphys=0;
            int nbelec=0;
            int nbinfo=0;
            
            try {
            maconnexion=new Connexion("planning","root","");
            conna=maconnexion.getco();
            prepstmt=conna.prepareStatement("SELECT seance.id"
                    + " FROM `seance`,cours,etudiant,groupe,utilisateurs,seances_groupes"
                    + " WHERE utilisateurs.id="+d.getId()
                    + " AND cours.nom='Maths'"
                            + " AND etudiant.id_utilisateur=utilisateurs.id"
                            + " AND groupe.id=etudiant.id_groupe"
                            + " AND seances_groupes.id_groupe=groupe.id"
                            + " AND seance.id=seances_groupes.id_seance"
                            + " AND cours.id=seance.id_cours");
            rset=prepstmt.executeQuery();
            while(rset.next())
            {
                nbmaths++;
            }
            prepstmt=conna.prepareStatement("SELECT seance.id"
                    + " FROM `seance`,cours,etudiant,groupe,utilisateurs,seances_groupes"
                    + " WHERE utilisateurs.id="+d.getId()
                    + " AND cours.nom='Physique'"
                            + " AND etudiant.id_utilisateur=utilisateurs.id"
                            + " AND groupe.id=etudiant.id_groupe"
                            + " AND seances_groupes.id_groupe=groupe.id"
                            + " AND seance.id=seances_groupes.id_seance"
                            + " AND cours.id=seance.id_cours");
            rset=prepstmt.executeQuery();
            while(rset.next())
            {
                nbphys++;
            }
            prepstmt=conna.prepareStatement("SELECT seance.id"
                    + " FROM `seance`,cours,etudiant,groupe,utilisateurs,seances_groupes"
                    + " WHERE utilisateurs.id="+d.getId()
                    + " AND cours.nom='Informatique'"
                            + " AND etudiant.id_utilisateur=utilisateurs.id"
                            + " AND groupe.id=etudiant.id_groupe"
                            + " AND seances_groupes.id_groupe=groupe.id"
                            + " AND seance.id=seances_groupes.id_seance"
                            + " AND cours.id=seance.id_cours");
            rset=prepstmt.executeQuery();
            while(rset.next())
            {
                nbinfo++;
            }
            prepstmt=conna.prepareStatement("SELECT seance.id"
                    + " FROM `seance`,cours,etudiant,groupe,utilisateurs,seances_groupes"
                    + " WHERE utilisateurs.id="+d.getId()
                    + " AND cours.nom='Electronique'"
                            + " AND etudiant.id_utilisateur=utilisateurs.id"
                            + " AND groupe.id=etudiant.id_groupe"
                            + " AND seances_groupes.id_groupe=groupe.id"
                            + " AND seance.id=seances_groupes.id_seance"
                            + " AND cours.id=seance.id_cours");
            rset=prepstmt.executeQuery();
            while(rset.next())
            {
                nbelec++;
            }
            
            
            
            
            

        } catch (SQLException ex) {
            Logger.getLogger(Chart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Chart.class.getName()).log(Level.SEVERE, null, ex);
        }
            final DefaultCategoryDataset dataset =
                    new DefaultCategoryDataset();
            dataset.addValue( nbinfo , fiat , inf );
            dataset.addValue( nbphys , fiat , phys );
            dataset.addValue( nbelec , fiat , elec );
            dataset.addValue( nbmaths , fiat , maths );

            return dataset;

   }
    public void start() {
     //   timer.start();
    }
}
