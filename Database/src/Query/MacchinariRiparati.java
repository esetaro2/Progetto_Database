package Query;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.unisa.connectionDatabase.SQLDatabaseConnection;

public class MacchinariRiparati {

	public MacchinariRiparati() {
		
	}

	
	
	public void MacchRiparati() {
		
		SQLDatabaseConnection con = new SQLDatabaseConnection();
		Connection connessione = con.getConnection();
		
		try {
				
			String selectMacchinariRiparati = "select nome, count(cfoperaio) as NumeroRiparati from operaio join esecuzioneoperaio on operaio.cfop = esecuzioneoperaio.cfoperaio join intervento on esecuzioneoperaio.idinterventoOp = intervento.id where statointervento = 'completato' group by cfop";
			
			Statement query = connessione.createStatement();
			
			ResultSet risultato = query.executeQuery(selectMacchinariRiparati);
			
			while(risultato.next()) {
				
			int MacchinariRiparati = risultato.getInt("NumeroRiparati");
			String cfOperai = risultato.getString("nome");
			
			System.out.println("\nL'operaio "+ cfOperai + " ha riparato " + MacchinariRiparati +" macchinario/i\n");
			
			}
			
			}catch(SQLException e) {
				
			System.out.println("Query sbagliata.."+ e.getMessage());
			e.printStackTrace();
				
			}catch(Exception e){
				System.out.println("Connessione fallita ...." + e.getMessage());
			}
		}
		
		
		
	
}



