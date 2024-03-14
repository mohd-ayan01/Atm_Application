package bank.management.system;

import java.sql.*;


public class Conn {
	
	Connection connection;
	public java.sql.Statement statement;
	
	public Conn() {
		try {
		 connection=DriverManager.getConnection("jdbc:mysql://localhost/bankSystem","root","Ayan@1609");
		 statement=connection.createStatement();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
