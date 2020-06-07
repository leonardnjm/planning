/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raphael
 */
public class Seance_sallesDAO extends DAO<Seance_salles>{
     public Seance_sallesDAO() throws SQLException, ClassNotFoundException{
         super();
     } 
    @Override
    public void create(Seance_salles obj) {
    try {
            prepstmt=conna.prepareStatement("INSERT INTO seance_salles VALUES (?, ?)");
            prepstmt.setInt(1, obj.getId_seance());
            prepstmt.setInt(2, obj.getId_salle());
            prepstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SeanceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }       }

    @Override
    public void delete(Seance_salles obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Seance_salles obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Seance_salles find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Seance_salles trouver(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
