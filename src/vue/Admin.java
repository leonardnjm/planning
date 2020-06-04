/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.*;
/**
 *
 * @author Raphael
 */
public class Admin extends JFrame{
  private JPanel top = new JPanel();
  private JFormattedTextField sem = new JFormattedTextField(NumberFormat.getIntegerInstance());
   private JTextField da = new JTextField();
  private JFormattedTextField hdeb = new JFormattedTextField(NumberFormat.getIntegerInstance());
  private JFormattedTextField hfin = new JFormattedTextField(NumberFormat.getIntegerInstance());
  private JTextField etat = new JTextField();
  private JTextField cours = new JTextField();
  private JTextField type = new JTextField();
  private JLabel label = new JLabel("Semaine");
  private JLabel label1 = new JLabel("heure debut");
  private JLabel label2 = new JLabel("heure fin");
  private JLabel label3 = new JLabel("etat");
  private JLabel label4 = new JLabel("cours");
  private JLabel label5 = new JLabel("type");
  private JLabel label6 = new JLabel("date");
SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
Date date;
  private JButton b = new JButton ("AJOUTER UNE SEANCE");

    
    public Admin() throws ParseException{
    this.setTitle("LEOO");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    top.setBackground(Color.red);
    top.setLayout(new BorderLayout());
     sem.setPreferredSize(new Dimension(150, 30));
     da.setPreferredSize(new Dimension(150, 30));
     hdeb.setPreferredSize(new Dimension(150, 30));
     hfin.setPreferredSize(new Dimension(150, 30));
     etat.setPreferredSize(new Dimension(150, 30));
     cours.setPreferredSize(new Dimension(150, 30));
     type.setPreferredSize(new Dimension(150, 30));

JPanel container = new JPanel();
    container.add(label,BorderLayout.CENTER);
    container.add(sem,BorderLayout.CENTER);
    container.add(label1);
    container.add(hdeb);
    container.add(label2);
    container.add(hfin);
    container.add(label3);
    container.add(etat);
    container.add(label4);
    container.add(cours);
    container.add(label5);
    container.add(type);
    container.add(label6);
    container.add(da);
    String mechante=da.getText();
    
        date = (Date) formatter.parse(da.getText());
System.out.println(date);
this.add(container);
    this.setVisible(true);            
  }       
}
