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
public class Seance_groupesDAO extends DAO<Seance_groupes>{

    public Seance_groupesDAO() throws SQLException, ClassNotFoundException{
         super();
     } 
    @Override
    public void create(Seance_groupes obj) {
    try {
            prepstmt=conna.prepareStatement("INSERT INTO seances_groupes VALUES (?, ?)");
            prepstmt.setInt(1, obj.getId_seance());
            prepstmt.setInt(2, obj.getId_groupe());
            prepstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SeanceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }       }

    @Override
    public void delete(Seance_groupes obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Seance_groupes obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Seance_groupes find(int id) {
        Seance_groupes a=new Seance_groupes();
        try{
        prepstmt=conna.prepareStatement("SELECT * FROM salle WHERE id="+id);
        rset=prepstmt.executeQuery();
        if(rset.first())
        {
            a=new Seance_groupes(id,rset.getInt("id_groupe"));
        }
        
        }catch(SQLException e){
            e.printStackTrace();
        }
       return a;     }

    @Override
    public Seance_groupes trouver(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
