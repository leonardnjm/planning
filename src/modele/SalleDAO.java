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
public class SalleDAO extends DAO<Salle>{

    @Override
    public void create(Salle obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Salle obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Salle obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Salle find(int id) {
    Salle a=new Salle();
        try{
        prepstmt=conna.prepareStatement("SELECT * FROM salle WHERE id="+id);
        rset=prepstmt.executeQuery();
        if(rset.first())
        {
            a=new Salle(id,rset.getString("nom"),rset.getInt("capacite"),rset.getInt("id_site"));
        }
        
        }catch(SQLException e){
            e.printStackTrace();
        }
       return a; 
    }
    
}
