package Query;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Timer;

import it.unisa.connectionDatabase.SQLDatabaseConnection;

public class AcquistoMacchinario {

	private int codiceseriale;
	private String cfcliente;
	private String targacorriere;
	private String descrizione;
	private int numerolotto;
	private double prezzo;
	private int numeroMacchinari;
	private int numeroacquisti;
	
	
	public AcquistoMacchinario() {
		
	}
	
	public AcquistoMacchinario(int codiceseriale, String cfcliente, String descrizione,
			int numerolotto, double prezzo) {
		
		this.codiceseriale = codiceseriale;
		this.cfcliente = cfcliente;
		this.descrizione = descrizione;
		this.numerolotto = numerolotto;
		this.prezzo = prezzo;
				
	}
	public void incrementaAcquisto() {
		
		try {
			SQLDatabaseConnection con = new SQLDatabaseConnection();
			Connection connessione = con.getConnection();
			
			String InsertCorriere="UPDATE cliente SET numeroacquisti = ? WHERE cf = '"+cfcliente +"'";
			
			PreparedStatement inserisci = null;
			
			
				inserisci = connessione.prepareStatement(InsertCorriere);
				System.out.println("Numero attuale di ordini da parte di questo cliente :"+ numeroAcquisti(cfcliente));
				inserisci.setInt(1,numeroAcquisti(cfcliente)+1);
				inserisci.executeUpdate();
				
				System.out.println("Inserimento eseguito con successo..");
				
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
	
	public void acquisto() {
		
		SQLDatabaseConnection con = new SQLDatabaseConnection();
		Connection connessione = con.getConnection();
	
		String inserisciMacchinario="INSERT INTO `base_di_dati`.`macchinario` (`codiceseriale`, `cfcliente`, `descrizione`, `numerolotto`, `prezzo`) VALUES (?, ?, ?, ?, ?)"; 
			
		PreparedStatement inserisci = null;
		
		try {
			
			
			inserisci = connessione.prepareStatement(inserisciMacchinario);
			
			inserisci.setInt(1, codiceseriale);
			inserisci.setString(2, cfcliente);
			inserisci.setString(3, descrizione);
			inserisci.setInt(4,numerolotto);
			inserisci.setDouble(5, prezzo);
			
			
			inserisci.executeUpdate();
			
			System.out.println("Inserimento eseguito...");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public int numeroAcquisti(String cfl) {
		
		SQLDatabaseConnection con = new SQLDatabaseConnection();
		Connection connessione = con.getConnection();
		
		
		int numeroAcquisti=0;
		
		String selectnumeroAcquisti = "Select numeroacquisti from cliente where cf = '"+ cfl +  "'" ;
		
		Statement query;
		try {
			
			query = connessione.createStatement();
			
			ResultSet risultato = query.executeQuery(selectnumeroAcquisti);
			
			while(risultato.next()) {
				
				numeroAcquisti = risultato.getInt("numeroacquisti");
							
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return numeroAcquisti;
	}
	
	public int numeroLotto() {
		
		SQLDatabaseConnection con = new SQLDatabaseConnection();
		Connection connessione = con.getConnection();
		
		
		int numeroLotto=0;
		
		String selectnumeroLotto = "Select numerolotto from macchinario " ;
		
		Statement query;
		try {
			
			query = connessione.createStatement();
			
			ResultSet risultato = query.executeQuery(selectnumeroLotto);
			
			while(risultato.next()) {
				
				numeroLotto = risultato.getInt("numerolotto");
							
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return numeroLotto;
	}
	
	
	
	public int codiceAttuale() {
		
		int codice = 0;
		
		SQLDatabaseConnection con = new SQLDatabaseConnection();
		Connection connessione = con.getConnection();
		
		String stringa = "select codiceseriale from macchinario where codiceseriale = (select max(codiceseriale) from macchinario)";
		
		Statement query;
		try {
			query = connessione.createStatement();
			
			ResultSet result = query.executeQuery(stringa);
			
			while(result.next()) {
			codice = result.getInt("codiceseriale");
			
			}
		}catch(Exception e) {
			
		}
		
		return codice;
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
	
	public ArrayList listaMacchinariDisponibili() {
		
		String lista1 ="";
		
		ArrayList lista= new ArrayList();
		
		SQLDatabaseConnection con = new SQLDatabaseConnection();
		Connection connessione = con.getConnection();
		
		try {
				
			String selectCorriere = "Select descrizione from macchinario";
			
			Statement query = connessione.createStatement();
			
			ResultSet risultato = query.executeQuery(selectCorriere);
			
			while(risultato.next()) {
				
			lista1 =  risultato.getString("descrizione");
			
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
	
}
