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
public class PromotionDAO extends DAO<Promotion>{

     public PromotionDAO() throws SQLException, ClassNotFoundException{
         super();
     } 
    @Override
    public void create(Promotion obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Promotion obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Promotion obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Promotion find(int id) {
        Promotion a=new Promotion();
        try{
        prepstmt=conna.prepareStatement("SELECT * FROM promotion WHERE id="+id);
        rset=prepstmt.executeQuery();
        if(rset.first())
        {
            a=new Promotion(id,rset.getString("nom"));
        }
        
        }catch(SQLException e){
            e.printStackTrace();
        }
       return a;    
    }
}
