/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import vue.Fenetre;
import vue.Login;
import vue.Cours;

import javax.swing.JOptionPane;


/**
 *
 * Controlleur entre modele et vue
 *
 * @author Raphael
 */
public class Controleur {
    
     private Login login;
    
   public Controleur(Login v) {
  login = v;

 }

  private void LoginBtn() {
  //JOptionPane.showMessageDialog(null, "Hello ", "Info", JOptionPane.INFORMATION_MESSAGE);
  Fenetre f = new Fenetre();
 }
 private void exit() {
  System.exit(0);
 }
 
  public void initController() {
  login.getLoginBtn().addActionListener(e -> LoginBtn());
  login.getExit().addActionListener(e -> exit());
 }
    
    
    /**
     *
     * une methode principal (main) pour lancer l'application
     *
     * @param s
     */
    
    public static void main(String[] s) {
        // creation de la fenetre
        Login v = new Login("Log in");
        Controleur c = new Controleur(v);
        c.initController();
        
       // Cours a= new Cours();
      //  Fenetre f = new Fenetre();

    }
}



