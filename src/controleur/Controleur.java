/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vue.Fenetre;
import vue.Login;
import modele.Utilisateur;
import vue.Cours;

import javax.swing.JOptionPane;
import modele.DAO;
import modele.UtilisateurDAO;


/**
 *
 * Controlleur entre modele et vue
 *
 * @author Raphael
 */
public class Controleur {
    
     private Login login;
     private Utilisateur utilisateur;
    
   public Controleur(Login v,Utilisateur m) {
  login = v;
  utilisateur = m;
  initView();
 }
   
   private void saveInfo() {
  utilisateur.setEmail(login.getLoginTextfield().getText());
  utilisateur.setPasswd(login.getPasswordTextfield().getText());
  LoginBtn();
  // utilisateur.getEmail();
 }
  
  public void initView() {
  login.getLoginTextfield().setText(utilisateur.getEmail());
  login.getPasswordTextfield().setText(utilisateur.getPasswd());
 }

  public void initController() {
  login.getLoginBtn().addActionListener(e -> saveInfo());
  login.getExit().addActionListener(e -> exit());
 }
   
 
  
  
  private void LoginBtn() throws SQLException, ClassNotFoundException {
  //JOptionPane.showMessageDialog(null, "Hello ", "Info", JOptionPane.INFORMATION_MESSAGE);
  Fenetre f = new Fenetre();
  System.out.println("email : " + utilisateur.getEmail());
  System.out.println("pass : " + utilisateur.getPasswd());
  
             DAO<Utilisateur> classeDao = new UtilisateurDAO();
             Utilisateur k=new Utilisateur();
             k=classeDao.trouver(utilisateur.getEmail());
             if(utilisateur.getPasswd()==k.getPasswd())
             {
                   System.out.println("SOLENE EST MECHANTEEEEEE");
             }
                                System.out.println(""+k.getNom());

  
 }
 private void exit() {
  System.exit(0);
 }
 
 
  
    
    
    /**
     *
     * une methode principal (main) pour lancer l'application
     *
     * @param s
     */
    
    public static void main(String[] s) {
             // creation de la fenetre
             
             Utilisateur m = new Utilisateur();
             
             Login v = new Login("Log in");
             Controleur c = new Controleur(v,m);
             c.initController();


             // Cours a= new Cours();
             //  Fenetre f = new Fenetre();
   
    
}

}



