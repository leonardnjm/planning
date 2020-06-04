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
public class EnseignantDAO extends DAO<Enseignant>{

    public EnseignantDAO() throws SQLException, ClassNotFoundException{
         super();
     } 
    @Override
    public void create(Enseignant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Enseignant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Enseignant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enseignant find(int id) {
Enseignant a=new Enseignant();
        try{
        prepstmt=conna.prepareStatement("SELECT * FROM enseignant WHERE id_utilisateur="+id);
        rset=prepstmt.executeQuery();
        if(rset.first())
        {
            a=new Enseignant(id,rset.getInt("id_cours"));
        }       
        }catch(SQLException e){
            e.printStackTrace();
        }
       return a;     
    }

    @Override
    public Enseignant trouver(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
