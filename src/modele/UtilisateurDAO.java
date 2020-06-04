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
public class UtilisateurDAO extends DAO<Utilisateur>{

    public UtilisateurDAO() throws SQLException, ClassNotFoundException{
         super();
     } 
    @Override
    public void create(Utilisateur obj) {
        try {
            prepstmt=conna.prepareStatement("INSERT INTO utilisateurs VALUES (?, ?, ?,?,?,?)");
            prepstmt.setInt(1, obj.getId());
            prepstmt.setString(2, obj.getEmail());
            prepstmt.setString(3, obj.getPasswd());
            prepstmt.setString(4, obj.getNom());
            prepstmt.setString(5, obj.getPrenom());
            prepstmt.setInt(6, obj.getDroit());
            prepstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Utilisateur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Utilisateur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Utilisateur find(int id) {
        Utilisateur a=new Utilisateur();
        try{
        prepstmt=conna.prepareStatement("SELECT * FROM utilisateurs WHERE id="+id);
        rset=prepstmt.executeQuery();
        if(rset.first())
        {
            a=new Utilisateur(id,rset.getString("email"),rset.getString("passwd"),rset.getString("nom"),rset.getString("premon"),rset.getInt("droit"));
        }
        
        }catch(SQLException e){
            e.printStackTrace();
        }
       return a;    
    }
    
    @Override
    public Utilisateur trouver(String a) {
        Utilisateur b=new Utilisateur();
        try{
                  
        prepstmt=conna.prepareStatement("SELECT * FROM `utilisateurs` WHERE email='"+a+"'");
                       
        rset=prepstmt.executeQuery();
                           
        if(rset.first())
        {                              
            b=new Utilisateur(rset.getInt("id"),rset.getString("email"),rset.getString("passwd"),rset.getString("nom"),rset.getString("premon"),rset.getInt("droit"));
        }
        
        }catch(SQLException e){
        }
       return b;    
    }
    
}
