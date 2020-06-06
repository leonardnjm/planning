/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JPanel;
import modele.Connexion;

/**
 *
 * @author Raphael
 */
public class Liste extends JPanel{
    private Connexion maconnexion;
    private ResultSet rset;
    private PreparedStatement prepstmt;
    private Connection conna;
    private ResultSetMetaData rsetMeta;
    private ArrayList<String> liste;    
    private Date today = new Date();
    

}
