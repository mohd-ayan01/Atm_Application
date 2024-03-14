package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import bank.management.system.Conn;

public class Sign_Up extends JFrame{
	
	 JTextField textName,textFName,textEmail ,textAdd,
	             textCity,textPin,textState; 
	 JDateChooser dateChooser;
	 JRadioButton r1,r2,m1,m2,m3;
	 JButton next;
	 Random ran=new Random();
	 
	 long first4=(ran.nextLong()%9000L)+1000L;
	 String first=" " +Math.abs(first4);	
	Sign_Up(){
		super("APPLICATION FORM");
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT );
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(25,10,100,100);
		add(image);
		
		JLabel label1=new JLabel("APPLICATION FORM NO." +first);
		label1.setBounds(160,20,600,40);
		label1.setFont(new Font("Raleway",Font.BOLD,38));
		add(label1);
		
		JLabel label2=new JLabel("Page - 1");
		label2.setFont(new Font("Raleway",Font.BOLD,22));
		label2.setBounds(330,70,600,30);
		add(label2);
		
		JLabel label3=new JLabel("Personal Details");
		label3.setFont(new Font("Raleway",Font.BOLD,22));
		label3.setBounds(290,100,600,30);
		add(label3);
		
		JLabel labelName=new JLabel("Name :");
		labelName.setFont(new Font("Raleway",Font.BOLD,20));
		labelName.setBounds(100,160,100,30);
		add(labelName);
		
		textName=new JTextField();
		textName.setFont(new Font("Raleway",Font.BOLD,14));
		textName.setBounds(300,160,400,30);
		add(textName);
		
		JLabel labelFName=new JLabel("Father's Name :");
		labelFName.setFont(new Font("Raleway",Font.BOLD,20));
		labelFName.setBounds(100,200,200,30);
		add(labelFName);
		
		textFName=new JTextField();
		textFName.setFont(new Font("Raleway",Font.BOLD,14));
		textFName.setBounds(300,200,400,30);
		add(textFName);
		
		JLabel DOB=new JLabel("Date of Birth");
		DOB.setFont(new Font("Raleway",Font.BOLD,20));
		DOB.setBounds(100,280,230,30);
		add(DOB);
		
		dateChooser=new JDateChooser();
		dateChooser.setForeground(new Color(105,105,105));
		dateChooser.setBounds(300,280,400,30);
		add(dateChooser);
		
		JLabel labelJ=new JLabel("Gender");
		labelJ.setFont(new Font("Raleway",Font.BOLD,20));
		labelJ.setBounds(100,240,200,30);
		add(labelJ);
		
		r1=new JRadioButton("Male");
		r1.setFont(new Font("Raleway",Font.BOLD,14));
		r1.setBackground(new Color(222,255,228));
		r1.setBounds(300,240,70,30);
		add(r1);
		
		r2=new JRadioButton("Female");
		r2.setFont(new Font("Raleway",Font.BOLD,14));
		r2.setBackground(new Color(222,255,228));
		r2.setBounds(450,240,90,30);
		add(r2);
		
		ButtonGroup obj=new ButtonGroup();
		obj.add(r1);
		obj.add(r2);
		
		JLabel labelEmail=new JLabel("Email address :");
		labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
		labelEmail.setBounds(100,320,200,30);
		add(labelEmail);
		
		textEmail=new JTextField();
		textEmail.setFont(new Font("Raleway",Font.BOLD,14));
		textEmail.setBounds(300,320,400,30);
		add(textEmail);
		
		JLabel labelMs=new JLabel("Marital Status :");
		labelMs.setFont(new Font("Raleway",Font.BOLD,20));
		labelMs.setBounds(100,360,200,30);
		add(labelMs);
		
		    m1 = new JRadioButton("Married");
	        m1.setBounds(300,360,100,30);
	        m1.setBackground(new Color(222,255,228));
	        m1.setFont(new Font("Raleway", Font.BOLD,14));
	        add(m1);

	        m2 = new JRadioButton("Unmarried");
	        m2.setBackground(new Color(222,255,228));
	        m2.setBounds(450,360,100,30);
	        m2.setFont(new Font("Raleway", Font.BOLD,14));
	        add(m2);

	        m3 = new JRadioButton("Other");
	        m3.setBackground(new Color(222,255,228));
	        m3.setBounds(635,360,100,30);
	        m3.setFont(new Font("Raleway", Font.BOLD,14));
	        add(m3);

	        ButtonGroup buttonGroup1 = new ButtonGroup();
	        buttonGroup1.add(m1);
	        buttonGroup1.add(m2);
	        buttonGroup1.add(m3);

		
		JLabel labelAdd=new JLabel("Address :");
		labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
		labelAdd.setBounds(100,400,200,30);
		add(labelAdd);
		
		textAdd=new JTextField();
		textAdd.setFont(new Font("Raleway",Font.BOLD,14));
		textAdd.setBounds(300,400,400,30);
		add(textAdd);
		
		JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100,440,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setBounds(300,440,400,30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100,480,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD, 14));
        textPin.setBounds(300,480,400,30);
        add(textPin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway", Font.BOLD, 20));
        labelstate.setBounds(100,520,200,30);
        add( labelstate);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD, 14));
        textState.setBounds(300,520,400,30);
        add(textState);
        
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(670,580,80,30);
        next.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String formno = first;
                String name = textName.getText();
                String fname = textFName.getText();
                String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText(); 
                String gender = null;
                if(r1.isSelected()){
                    gender = "Male";
                }else if (r2.isSelected()){
                    gender = "Female";
                }
                String email = textEmail.getText();
                String marital =null;
                if (m1.isSelected()){
                    marital = "Married";
                } else if (m2.isSelected()) {
                    marital = "Unmarried";
                } else if (m3.isSelected()) {
                    marital = "Other";
                }

                String address = textAdd.getText();
                String city = textCity.getText();
                String pincode = textPin.getText();
                String state = textState.getText();
                

                try{
                    if (textName.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Fill all the fields");
                    }else {
                        Conn c = new Conn();
                        String q = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"' )";
                        c.statement.executeUpdate(q);
                        new SignUp2(formno);
                        setVisible(false);
                    }

                }catch (Exception E){
                    E.printStackTrace();
                }

 
        	}
        });
        add(next);

		
		getContentPane().setBackground(new Color(222,255,228));
		setLayout(null);
		setSize(850,700);
		setLocation(360,30);
		setUndecorated(true);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new Sign_Up();

	}

}
