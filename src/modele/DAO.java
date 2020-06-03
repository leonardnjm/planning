/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Raphael
 */
import java.sql.*;
import java.sql.PreparedStatement;

public abstract class DAO<T> {
       protected Connexion maconnexion;
        protected ResultSet rset;
        protected ResultSetMetaData rsetMeta; 
        protected PreparedStatement prepstmt;
        protected Connection conna;

       public DAO() throws SQLException, ClassNotFoundException{
        maconnexion=new Connexion("planning","root","");
        conna=maconnexion.getco();
        }
   
  /**
  * Methode de creation
  * @param obj
  */
  public abstract void create(T obj);

  /**
  * Methode pour effacer
  * @param obj
  */
  public abstract void delete(T obj);

  /**
  * Methode de mise à jour
  * @param obj
  */
  public abstract void update(T obj);

  /**
  * Methode de recherche des informations
  * @param id
  * @return T
  */
  public abstract T find(int id);
    public abstract T trouver(String a);

}

