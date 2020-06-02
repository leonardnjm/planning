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
public class EtudiantDAO extends DAO<Etudiantt>{

    @Override
    public void create(Etudiantt obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Etudiantt obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Etudiantt obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Etudiantt find(int id) {
        Etudiantt a=new Etudiantt();
        try{
        prepstmt=conna.prepareStatement("SELECT * FROM etudiant WHERE id_utilisateur="+id);
        rset=prepstmt.executeQuery();
        if(rset.first())
        {
            a=new Etudiantt(id,rset.getInt("numero"),rset.getInt("id_groupe"));
        }
        
        }catch(SQLException e){
            e.printStackTrace();
        }
       return a;       
    }
}
