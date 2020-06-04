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
import javax.swing.JFrame;
import javax.swing.JPanel;

//test



/**
 *
 * Controlleur entre modele et vue
 *
 * @author Raphael
 */
public class Controleur {
     private int droit;
     private Login login;
     private Utilisateur utilisateur;
    
   public Controleur(Login v,Utilisateur m) {
  login = v;
  utilisateur = m;
  initView();
 }
   
   private void saveInfo() throws SQLException, ClassNotFoundException {
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
  login.getLoginBtn().addActionListener(e -> {
      try {
          saveInfo();
      } catch (SQLException ex) {
          Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
      }
  });
  
   login.getPasswordTextfield().addActionListener(b -> {
      try {
          saveInfo();
      } catch (SQLException ex) {
          Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
      }
   });
      
    login.getLoginTextfield().addActionListener(c -> {
      try {
         saveInfo();
      } catch (SQLException ex) {
          Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
      }
      
  });
   
  login.getExit().addActionListener(e -> exit());
  
 
 }
  private int getd(){
      return droit;
  }
   private void exit(){
       System.exit(0);
   }
 
//  System.out.println("email : " + utilisateur.getEmail());
//  System.out.println("pass : " + utilisateur.getPasswd());
  
  private void LoginBtn() throws SQLException, ClassNotFoundException {
  //JOptionPane.showMessageDialog(null, "Hello ", "Info", JOptionPane.INFORMATION_MESSAGE);

             DAO<Utilisateur> classeDao = new UtilisateurDAO();
             Utilisateur k=new Utilisateur();
          //   int resultat = Integer.parseInt(utilisateur.getEmail());

             k=classeDao.trouver(utilisateur.getEmail());
             
             if(utilisateur.getPasswd().equals(k.getPasswd()))
             {
                    this.droit=k.getDroit();
             }
                 else{
                  JOptionPane.showMessageDialog(new JFrame(),
                    "Email or Password are incorrect",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);   
                         }
                           

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

             System.out.println("pass : " + m.getPasswd());
             while(c.getd()==0)
                 try {
                     Thread.sleep(3 * 1000);
                 } catch (InterruptedException ex) {
                     Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 switch (c.getd()){
                 
                     case 1:
                       //  Planning f = new Planning();
                         Fenetre a =new Fenetre();
                         break;
                
                     case 2:
                        
                         break;
                         
                     case 3:
                        
                         break;
                         
                     case 4:
                        
                         break;
                         
                    default:

                         
                 }
             // Cours a= new Cours();
             //  Fenetre f = new Fenetre();
   
    


}
}


