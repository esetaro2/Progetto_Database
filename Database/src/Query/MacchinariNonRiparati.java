package Query;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.unisa.connectionDatabase.SQLDatabaseConnection;

public class MacchinariNonRiparati {

	public MacchinariNonRiparati() {
		
	}
	
	
	public void MaccNoRiparati() {
		SQLDatabaseConnection con = new SQLDatabaseConnection();
		Connection connessione = con.getConnection();
		
		try {
				
			String selectMacchinariMaiRiparati = "select distinct codiceseriale from macchinario where  codiceseriale not in (select codiceserialemacchinario from intervento)";
			Statement query = connessione.createStatement();
			
			ResultSet risultato = query.executeQuery(selectMacchinariMaiRiparati);
			
			while(risultato.next()) {
				
			int MacchinariMaiRiparati = risultato.getInt("codiceseriale");
			
			
			System.out.println("\nCodice Seriale dei macchinari di cui non è stato mai richiesto un intervento di manutenzione :    "+ MacchinariMaiRiparati);
			
			}
			
			}catch(SQLException e) {
				
			System.out.println("Query sbagliata.."+ e.getMessage());
			e.printStackTrace();
				
			}catch(Exception e){
				System.out.println("Connessione fallita ...." + e.getMessage());
			}
		
	}
	
}
