package Query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;

import it.unisa.connectionDatabase.SQLDatabaseConnection;

public class Consegna {

	private String targa;
	
	
	public Consegna() {
		
	}
	
	public Consegna(String targa) {
		this.targa = targa;
	}
	
public ArrayList listacorrieri() {
		
		String lista1 ="";
		
		ArrayList lista= new ArrayList();
		
		SQLDatabaseConnection con = new SQLDatabaseConnection();
		Connection connessione = con.getConnection();
		
		try {
				
			String selectCorriere = "Select targa from corriere";
			
			Statement query = connessione.createStatement();
			
			ResultSet risultato = query.executeQuery(selectCorriere);
			
			while(risultato.next()) {
				
			lista1 =  risultato.getString("targa");
			
			lista.add(lista1);
			
			
			}
			
			}catch(SQLException e) {
				
			System.out.println("Query sbagliata.."+ e.getMessage());
			e.printStackTrace();
				
			}catch(Exception e){
				System.out.println("Connessione fallita ...." + e.getMessage());
			}
		
		return lista;
			
	}
	
	public void InserisciCorriere(String cf) {
		
		
		try {
		SQLDatabaseConnection con = new SQLDatabaseConnection();
		Connection connessione = con.getConnection();
		
		String InsertCorriere="UPDATE macchinario SET targacorriere = ? WHERE cfcliente = '"+cf +"'";
		
		PreparedStatement inserisci = null;
		
		
			inserisci = connessione.prepareStatement(InsertCorriere);
			
			inserisci.setString(1,targa);
			inserisci.executeUpdate();
			
			System.out.println("Inserimento eseguito con successo..");
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
