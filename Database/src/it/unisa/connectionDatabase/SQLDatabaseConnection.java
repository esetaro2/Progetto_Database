package it.unisa.connectionDatabase;

import java.sql.Connection;
import java.sql.DriverManager;


public class SQLDatabaseConnection {


	
	public Connection getConnection() {
		
		// TODO Auto-generated method stub

		
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/base_di_dati";
		String username= "root";
		String password = "311000";
		
		
		Connection con = DriverManager.getConnection(url, username , password);
		
		
		return con;
		
		}catch(Exception e){
			System.out.println("Connessione fallita ...." + e.getMessage());
		}
		return null;
	
	}
	
}
