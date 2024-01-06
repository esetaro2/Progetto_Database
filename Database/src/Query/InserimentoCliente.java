package Query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;

import it.unisa.connectionDatabase.SQLDatabaseConnection;

public class InserimentoCliente {

	private String cf;
	private String nome;
	private String cognome;
	private int CAP;
	private String via;
	private int numerocivico;
	private String numerotelefono;

	public InserimentoCliente(String cf, String nome, String cognome, int CAP, String via, int numerocivico,
			String numerotelefono) {
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
		this.CAP = CAP;
		this.via = via;
		this.numerocivico = numerocivico;
		this.numerotelefono = numerotelefono;
	}
	
	
	@SuppressWarnings("null")
	public void returnInserimento() {
		
		try {
			SQLDatabaseConnection con = new SQLDatabaseConnection();
			Connection connessione = con.getConnection();
			
			String registraCliente="INSERT INTO `base_di_dati`.`cliente` (`cf`, `nome`, `cognome`, `CAP`, `via`, `numerocivico`, `numerotelefono`) VALUES (?, ?, ?, ?, ?, ?, ?);";
			
			PreparedStatement inserisci = null;
				
			inserisci= connessione.prepareStatement(registraCliente);	
			inserisci.setString(1, cf);
			inserisci.setString(2, nome);
			inserisci.setString(3, cognome);
			inserisci.setInt(4, CAP);
			inserisci.setString(5, via);
			inserisci.setInt(6, numerocivico);
			inserisci.setString(7, numerotelefono);
			inserisci.executeUpdate();
			
			
			System.out.println("Inserimento eseguito...");
		
		}catch(SQLException e) {
			
		System.out.println("Query sbagliata.."+ e.getMessage());
		e.printStackTrace();
				
		}catch(Exception e){
		
			System.out.println("Connessione fallita ...." + e.getMessage());
		}
		
		}
	}
	
	
	

