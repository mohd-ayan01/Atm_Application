package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.*;

public class Withdrawl extends JFrame implements ActionListener {
	String pin;
	TextField textField;
    JButton b1,b2;
	Withdrawl(String pin){
		this.pin=pin;
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,650,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(-50,-45,1550,830);
        add(l3);
        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(460,230,400,35);
        l3.add(label1);
        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(460,270,400,35);
        l3.add(label2);
        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,300,320,25);
        textField.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(textField);
        
        b1 = new JButton("WITHDRAW");
        b1.setBounds(700,375,150,30);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,410,150,30);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);
        
        setLayout(null);
		setSize(1550,750);
		setLocation(0,0);
		setUndecorated(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Withdrawl("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
			try {
				String amount=textField.getText();
				Date date=new Date();
				if(amount.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
				}
				else {
					Conn c=new Conn();
					ResultSet resultSet=c.statement.executeQuery("select * from bank where pin='" +pin +"'");
					int balance=0;
					 while (resultSet.next()) {
	                        if (resultSet.getString("type").equals("Deposit")) {
	                            balance += Integer.parseInt(resultSet.getString("amount"));
	                        } else {
	                            balance -= Integer.parseInt(resultSet.getString("amount"));
	                        }
	                    }
					 if (balance < Integer.parseInt(amount)) {
	                        JOptionPane.showMessageDialog(null, "Insuffient Balance");
	                        return;
	                    }
					 c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '" + amount + "' )");
	                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
	                    setVisible(false);
	                    new Main_Class(pin);
					
				}
			}
			catch(Exception E){
				
			}
		}
		else if (e.getSource()==b2) {
            setVisible(false);
            new Main_Class(pin);
        }
	}

}
