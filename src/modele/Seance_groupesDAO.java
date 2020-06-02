/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.SQLException;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
    
}
