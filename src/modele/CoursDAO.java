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
 * @author Raph
 */
public class CoursDAO extends DAO<Cours>{

    @Override
    public void create(Cours obj) {
    try {
            prepstmt=conna.prepareStatement("INSERT INTO cours VALUES (?, ?)");
            prepstmt.setInt(1, obj.getid());
            prepstmt.setString(2, obj.getnom());
            prepstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CoursDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public void delete(Cours obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Cours obj) {
        try {
            prepstmt=conna.prepareStatement("UPDATE INTO cours SET nom = ? WHERE id = ?");
            prepstmt.setInt(1, obj.getid()); 
            prepstmt.setString(2, obj.getnom());
            prepstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CoursDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    @Override
    public Cours find(int id) {
        Cours a=new Cours();
        try{
        prepstmt=conna.prepareStatement("SELECT * FROM cours WHERE id="+id);
        rset=prepstmt.executeQuery();
        if(rset.first())
        {
            a=new Cours(id,rset.getString("nom"));
        }
        
        }catch(SQLException e){
            e.printStackTrace();
        }
       return a; 
    }
    
}
