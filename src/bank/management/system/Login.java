package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	   JLabel l,l1,l2;
	   JTextField t1;
	   JPasswordField passwordField3;
	   JButton b1,b2,b3;
       Login(){
    	 super("Bank_Management_System");
    	 // load image
    	 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
    	 //scale image
    	 Image i2= i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    	 //storing image
    	 ImageIcon i3=new ImageIcon(i2);
    	 //label creating
    	 JLabel image =new JLabel(i3);
    	 //set label
    	 image.setBounds(350,10,100,100);
    	 add(image);
    	 ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
    	 Image ii2= ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
       	 ImageIcon ii3=new ImageIcon(ii2);
     	 JLabel image1 =new JLabel(ii3);
    	 image1.setBounds(630,350,100,100);
    	 add(image1);
    	 
    	 l=new JLabel("WELCOME TO ATM");
    	 l.setForeground(Color.WHITE);
    	 l.setFont(new Font("AvantGarde",Font.BOLD,38));
    	 l.setBounds(230,125,450,40);
    	 add(l);
    	 
    	 l1=new JLabel("Card_No: ");
    	 l1.setForeground(Color.WHITE);
    	 l1.setFont(new Font("Ralway",Font.BOLD,28));
    	 l1.setBounds(150,190,375,30);
    	 add(l1);
    	 
    	 t1=new JTextField(15);
    	 t1.setBounds(325,190,230,30);
    	 t1.setFont(new Font("Arial", Font.BOLD,14));
    	 add(t1);
    	 
    	 l2=new JLabel("PIN: ");
    	 l2.setForeground(Color.WHITE);
    	 l2.setFont(new Font("Ralway",Font.BOLD,28));
    	 l2.setBounds(150,250,375,30);
    	 add(l2);
    	 
    	 passwordField3=new JPasswordField(15);
    	 passwordField3.setBounds(325,250,230,30);
    	 passwordField3.setFont(new Font("Arial",Font.BOLD,14));
    	 add(passwordField3);
    	 
    	 b1=new JButton("SIGN IN");
    	 b1.setBounds(335,300,100,30);
    	 b1.setFont(new Font("Arial",Font.BOLD,14));
    	 b1.setForeground(Color.WHITE);
    	 b1.setBackground(Color.black);
    	 b1.addActionListener(this);
    	 add(b1);
    	 
    	 b2=new JButton("CLEAR");
    	 b2.setBounds(450,300,100,30);
    	 b2.setFont(new Font("Arial",Font.BOLD,14));
    	 b2.setForeground(Color.white);
    	 b2.setBackground(Color.black);
    	 b2.addActionListener(this);
    	 add(b2);
    	 
    	 b3=new JButton("SIGN UP");
    	 b3.setBounds(330,350,230,30);
    	 b3.setFont(new Font("Arial",Font.BOLD,14));
    	 b3.setForeground(Color.white);
    	 b3.setBackground(Color.black);
    	 b3.addActionListener(this);
    	 add(b3);
    	 
    	 ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
    	 Image iii2= iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
       	 ImageIcon iii3=new ImageIcon(iii2);
     	 JLabel image2 =new JLabel(iii3);
    	 image2.setBounds(0,0,850,480);
    	 add(image2);
    	 setLayout(null);
    	 setSize(850,480);
    	 setLocation(350,150);
    	 setUndecorated(true);
    	 setVisible(true);
       }
       
       public void actionPerformed(ActionEvent ae) {
    	   try {
    		   if(ae.getSource()==b1) {
    			   Conn c = new Conn();
                   String cardno = t1.getText();
				   String pin =passwordField3.getText();
                   String q = "select * from login where cardNo = '"+cardno+"' and  pin = '"+pin+"'";
                   ResultSet resultSet = c.statement.executeQuery(q);
                   if (resultSet.next()){
                       setVisible(false);
                       new Main_Class(pin);
                   }else {
                       JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                   }
    			   
    		   }
    		   else if(ae.getSource()==b2) {
    			   t1.setText("");
    			   passwordField3.setText("");
    		   }
    		   else {
    			   new Sign_Up();
    			   setVisible(false);
    			   
    		   }
    		   
    	   }
    	   catch(Exception e) {
    		   e.printStackTrace();
    	   }
       }
	public static void main(String[] args) {
		new Login();

	}

}
