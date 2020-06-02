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
public class EtudiantDAO extends DAO<Etudiant>{

    public EtudiantDAO() throws SQLException, ClassNotFoundException{
         super();
     } 
    @Override
    public void create(Etudiant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Etudiant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Etudiant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Etudiant find(int id) {
        Etudiant a=new Etudiant();
        try{
        prepstmt=conna.prepareStatement("SELECT * FROM etudiant WHERE id_utilisateur="+id);
        rset=prepstmt.executeQuery();
        if(rset.first())
        {
            a=new Etudiant(id,rset.getInt("numero"),rset.getInt("id_groupe"));
        }
        
        }catch(SQLException e){
            e.printStackTrace();
        }
       return a;       
    }
}
