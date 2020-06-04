/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

/**
 *
 * @author Leo
 */
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class Login {
    
 // Swing
 private JFrame frame;
 private JLabel loginLabel;
 private JLabel passwordLabel;
 private JTextField loginTextfield;
 private JTextField passwordTextfield;

 private JButton loginbtn;
 private JButton exit;
 
 
 public Login(String title) {
  frame = new JFrame(title);
  frame.getContentPane().setLayout(new BorderLayout());
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(500, 120);
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);
  
  // Creatation des elements swing
  loginLabel = new JLabel("Email :");
  passwordLabel = new JLabel("Password :");
  loginTextfield = new JTextField();
  passwordTextfield = new JPasswordField();

  loginbtn = new JButton("Log in");
  exit = new JButton("Exit");
  
  // Ajout des elemnts sur fenetre Login
  GroupLayout layout = new GroupLayout(frame.getContentPane());
  layout.setAutoCreateGaps(true);
  layout.setAutoCreateContainerGaps(true);
  layout.setHorizontalGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(loginLabel)
    .addComponent(passwordLabel))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(loginTextfield)
    .addComponent(passwordTextfield))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(loginbtn)
    .addComponent(exit)));
  layout.setVerticalGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(loginLabel)
    .addComponent(loginTextfield).addComponent(loginbtn))
    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(passwordLabel)
    .addComponent(passwordTextfield).addComponent(exit)));
  layout.linkSize(SwingConstants.HORIZONTAL, loginbtn, exit);
  frame.getContentPane().setLayout(layout);
 }
 public JFrame getFrame() {
  return frame;
 }
 public void setFrame(JFrame frame) {
  this.frame = frame;
 }
 public JLabel getLoginLabel() {
  return loginLabel;
 }
 public void setLoginLabel(JLabel loginLabel) {
  this.loginLabel = loginLabel;
 }
 public JLabel getPasswordLabel() {
  return passwordLabel;
 }
 public void setPasswordLabel(JLabel passwordLabel) {
  this.passwordLabel = passwordLabel;
 }
 public JTextField getLoginTextfield() {
  return loginTextfield;
 }
 public void setLoginTextfield(JTextField loginTextfield) {
  this.loginTextfield = loginTextfield;
 }
 public JTextField getPasswordTextfield() {
  return passwordTextfield;
 }
 public void setPasswordTextfield(JTextField passwordTextfield) {
  this.passwordTextfield = passwordTextfield;
 }

 public JButton getLoginBtn() {
  return loginbtn;
 }
 public void setLoginBtn(JButton loginbtn) {
  this.loginbtn = loginbtn;
 }
 public JButton getExit() {
  return exit;
 }
 public void setBye(JButton exit) {
  this.exit = exit;
 }
}