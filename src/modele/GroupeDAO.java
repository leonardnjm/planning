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
public class GroupeDAO extends DAO<Groupe>{

        public GroupeDAO() throws SQLException, ClassNotFoundException{
         super();
     } 
    @Override
    public void create(Groupe obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Groupe obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Groupe obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Groupe find(int id) {
        Groupe a=new Groupe();
        try{
        prepstmt=conna.prepareStatement("SELECT * FROM groupe WHERE id="+id);
        rset=prepstmt.executeQuery();
        if(rset.first())
        {
            a=new Groupe(id,rset.getString("nom"),rset.getInt("id_prom"));
        }
        
        }catch(SQLException e){
            e.printStackTrace();
        }
       return a;
    }

    @Override
    public Groupe trouver(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
