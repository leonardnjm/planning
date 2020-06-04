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
public class Type_coursDAO extends DAO<Type_cours>{

     public Type_coursDAO() throws SQLException, ClassNotFoundException{
         super();
     } 
    @Override
    public void create(Type_cours obj){
        try {
            prepstmt=conna.prepareStatement("INSERT INTO type_cours VALUES (?, ?)");
            prepstmt.setInt(1, obj.getid());
            prepstmt.setString(2, obj.getnom());
            prepstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Type_coursDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }


    @Override
    public void delete(Type_cours obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Type_cours obj) {
        try {
            prepstmt=conna.prepareStatement("UPDATE INTO cours SET nom = ? WHERE id = ?");
            prepstmt.setInt(1, obj.getid()); 
            prepstmt.setString(2, obj.getnom());
            prepstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Type_coursDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            }

    @Override
    public Type_cours find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Type_cours trouver(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
