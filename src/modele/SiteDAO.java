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
public class SiteDAO extends DAO<Site>{

        public SiteDAO() throws SQLException, ClassNotFoundException{
         super();
     } 
    @Override
    public void create(Site obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Site obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Site obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Site find(int id) {
        Site a=new Site();
        try{
        prepstmt=conna.prepareStatement("SELECT * FROM site WHERE id="+id);
        rset=prepstmt.executeQuery();
        if(rset.first())
        {
            a=new Site(id,rset.getString("nom"));
        }
        
        }catch(SQLException e){
            e.printStackTrace();
        }
       return a; 
    }    

    @Override
    public Site trouver(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    