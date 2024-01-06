package Query;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import it.unisa.connectionDatabase.SQLDatabaseConnection;

public class VerificaDisp {
	
	
	public VerificaDisp() {
		
	}
	
	
	public void Disponibilita() {
		
		
		try {
			SQLDatabaseConnection con = new SQLDatabaseConnection();
			Connection connessione = con.getConnection();
			
			String selectCorriere = "select nome, count(cfop) as PartecipazioneOperai from operaio join esecuzioneoperaio on operaio.cfop = esecuzioneoperaio.cfoperaio join intervento on esecuzioneoperaio.idinterventoOp = intervento.id AND esecuzioneoperaio.codiceserialeop = intervento.codiceserialemacchinario group by cfop having PartecipazioneOperai < 3";
			Statement query = connessione.createStatement();
			
			ResultSet risultato = query.executeQuery(selectCorriere);
			
			while(risultato.next()) {
				
			System.out.println(risultato.getString("nome")+ " è impegnato/a in " + risultato.getInt("PartecipazioneOperai") + " Interventi \n\n\n");
				
			}
			
			}catch(SQLException e) {
				
			System.out.println("Query sbagliata.."+ e.getMessage());
			e.printStackTrace();
				
			}catch(Exception e){
				System.out.println("Connessione fallita ...." + e.getMessage());
			}
		
		
	}
	

}
