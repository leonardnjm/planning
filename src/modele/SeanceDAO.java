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
public class SeanceDAO extends DAO<Seance>{

     public SeanceDAO() throws SQLException, ClassNotFoundException{
         super();
     } 
    @Override
    public void create(Seance obj) {
    try {
            prepstmt=conna.prepareStatement("INSERT INTO seance VALUES (?, ?, ?,?,?,?,?,?)");
            prepstmt.setInt(1, obj.getid());
            prepstmt.setInt(2, obj.getsemaine());
            prepstmt.setDate(3, obj.getdate());
            prepstmt.setInt(4, obj.getdebut());
            prepstmt.setInt(5, obj.getfin());
            prepstmt.setInt(6, obj.getetat());
            prepstmt.setInt(7, obj.getidcours());
            prepstmt.setInt(8, obj.getidtype());
            prepstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SeanceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Seance obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Seance obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Seance find(int id) {
    Seance a=new Seance();
        try{
        prepstmt=conna.prepareStatement("SELECT * FROM seance WHERE id="+id);
        rset=prepstmt.executeQuery();
        if(rset.first())
        {
            a=new Seance(id,rset.getInt("semaine"),rset.getDate("date"),rset.getInt("heure_debut"),rset.getInt("heure_fin"),rset.getInt("etat"),rset.getInt("id_cours"),rset.getInt("id_type"));
        }
        
        }catch(SQLException e){
            e.printStackTrace();
        }
       return a;    
    }
    
}
