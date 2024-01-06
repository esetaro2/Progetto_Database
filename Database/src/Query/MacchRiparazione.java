package Query;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.unisa.connectionDatabase.SQLDatabaseConnection;

public class MacchRiparazione {

	
	public MacchRiparazione() {
			
	}
	
	
	public void MacchinariInRiparazione() {
		
		SQLDatabaseConnection con = new SQLDatabaseConnection();
		Connection connessione = con.getConnection();
		
		try {
				
			String selectMacchinariInRiparazione = "select distinct codiceseriale from macchinario join intervento where targacorriere is not null or (macchinario.codiceseriale = intervento.codiceserialemacchinario and intervento.statointervento ='in lavorazione' )";
			Statement query = connessione.createStatement();
			
			ResultSet risultato = query.executeQuery(selectMacchinariInRiparazione);
			
			while(risultato.next()) {
				
			int MacchinariRiparati = risultato.getInt("codiceseriale");
			
			System.out.println("\nCodice Seriali non ancora consegnati o in riparazione :"+ MacchinariRiparati);
			
			}
			
			}catch(SQLException e) {
				
			System.out.println("Query sbagliata.."+ e.getMessage());
			e.printStackTrace();
				
			}catch(Exception e){
				System.out.println("Connessione fallita ...." + e.getMessage());
			}
		}
		
	}
	
	

