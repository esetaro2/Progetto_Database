package it.unisa.main;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

import Query.*;
import it.unisa.connectionDatabase.SQLDatabaseConnection;

public class Main {

	 static AllQuery chiamaQuery = null;
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		chiamaQuery = new AllQuery();
		Scanner in = new Scanner(System.in);
		
		chiamaQuery.stampaQuery();
		
		boolean verifica = false;
	
		while(!verifica) {
			
		
		
		
		String numero = in.next();
		
		
		if(numero.equalsIgnoreCase("exit")) {
			verifica = true;
			System.out.println("A presto....");
		}
		
		switch(numero) {
				
				case "1":
			{																						//Inserimento Cliente 
					System.out.println("****Inserimento di un cliente*****");
					System.out.println("Inserisci il codice fiscale");
					String cf = in.next().toUpperCase();
					System.out.println("\n");
					
					System.out.println("Inserisci il tuo nome");
					String nome = in.next();
					System.out.println("\n");
					
					System.out.println("Inserisci il tuo cognome");
					String cognome = in.next();
					System.out.println("\n");
					
					System.out.println("Inserisci il tuo CAP");
					int CAP = in.nextInt();
					System.out.println("\n");
					
					System.out.println("Inserisci la tua via");
					String via = in.next();
					System.out.println("\n");
					
					System.out.println("Inserisci il tuo numerocivico");
					int numerocivico = in.nextInt();
					System.out.println("\n");
					
					System.out.println("Inserisci il tuo numero di telefono");
					String numerotelefono = in.next();
					System.out.println("\n");
					

					
					InserimentoCliente cliente = new InserimentoCliente(cf, nome , cognome, CAP ,via , numerocivico, numerotelefono);
					
					cliente.returnInserimento();
					
					chiamaQuery.stampaQuery();
			}
					break;
				
				case "2":																					//Acquisto Macchinario
			{	
				AcquistoMacchinario acquisto1= new AcquistoMacchinario();
				int codiceseriale=0;
				System.out.println("Inserisci il codice seriale del macchinario ... codice seriale attuale :"+acquisto1.codiceAttuale());
				boolean verifica1= false;
				while(verifica1==false) {
					
					  codiceseriale = in.nextInt();
					 if(codiceseriale == acquisto1.codiceAttuale()+1) {
						 verifica1 = true;
						 System.out.println("Codice seriale inserito corretto..");
					 }else {
					 System.out.println("codice seriale inserito uguale, minore o troppo grande , inserire il codiceseriale successivo");
					 }
				}
				System.out.println("Inserisci il codice fiscale del cliente che vuole acquistare un macchinario");
				String cf=in.next();
				
				/*ArrayList lista = acquisto1.listacorrieri();
				System.out.println("Inserisci la targa corriere tenendo conto di quelli disponibili : " + lista);
				String targacorriere = in.next();
				System.out.println("\n"); */
				
				ArrayList descrizioni = acquisto1.listaMacchinariDisponibili();
				System.out.println("Inserisci la descrizione del macchinario che vuoi acquistare scegliendo una tra quelle disponibili ...\n "+ descrizioni);
				/*inserire un controllo sulla grandezza dell'acquisto rispetto a quelle presenti nella tabella macchinario*/
				String descrizione = in.nextLine();
				String descrizione1 = in.nextLine();
				descrizione = descrizione1 ;
				
				System.out.println("Inserisci il numero di lotto");
				int numerolotto = 0;
				boolean verifica2= false;
				while(verifica2==false) {
					
					  numerolotto = in.nextInt();
					 if(numerolotto != acquisto1.numeroLotto()) {
						 verifica1 = true;
						 System.out.println("Numero Lotto inserito corretto..");
					 }else {
					 System.out.println("Il Numero Lotto inseritto è errato!");
					 }
				}
				
				System.out.println("\n"); 
				
				System.out.println("Inserisci il prezzo");	
				Double prezzo = in.nextDouble();
				System.out.println("\n");
				
				
				AcquistoMacchinario acquisto = new AcquistoMacchinario(codiceseriale,cf,descrizione,numerolotto,prezzo);
				
				acquisto.acquisto();
				acquisto.incrementaAcquisto();
				chiamaQuery.stampaQuery();
			}
				break;	
					
				case "3":																							//Consegna macchinario ad un corriere
				{
					
					System.out.println("****Inserimento di un corriere*****");
					
					Consegna listatarga= new Consegna();
					
					ArrayList lista = listatarga.listacorrieri();	
					System.out.println("Inserisci la targa di un corriere a cui affidare la consegna di un macchinario tenendo conto di quelli disponibili ... " + lista);
					String targa=in.next();	
					System.out.print("\n");
				
					
					System.out.println("Inserisci il cf del cliente a cui vuoi affidare un corriere");
					String cf = in.next();
					System.out.println("\n");
			
					Consegna consegna = new Consegna(targa);
					consegna.InserisciCorriere(cf);
					chiamaQuery.stampaQuery();
				}
				break;
				
				case "4":{
					//Acquisto di un macchinario di tipo accessorio
			
				}
				break;
				
				case "5":{
					//Inizio Intervento di Manutenzione
				}
				break;
		
				case "6":{
					//Verifica Disponibilità Operaio
					
					
					VerificaDisp verificaDispOp = new VerificaDisp();
					
					verificaDispOp.Disponibilita();
					
					chiamaQuery.stampaQuery();
					
				}
				break;
				
				case "7":{
				//Coinvolgimento di un dipendente in un intervento
				
					
				}
				
				break;
		
				case "8":{
				//Visualizza per ogni dipendente il numero di macchinari riparati
					
					
					MacchinariRiparati maccRip= new MacchinariRiparati();
					
					maccRip.MacchRiparati();
					
					chiamaQuery.stampaQuery();	
					
					
				}
				break;
		
				
			    case "9":{
				//	Visualizza codici macchinari affidati ad un corriere o per i quali è in atto un intervento di manuntenzione con stato 'in lavorazione'
					
					MacchRiparazione macchRiparazione = new MacchRiparazione();
					
					macchRiparazione.MacchinariInRiparazione();
					
					chiamaQuery.stampaQuery();
					
				}
				break;
				
			    case "10":{
					// Visualizza macchinari per i quali non è stato mai richiesto un intervento di manuntenzione
			    	
			    	MacchinariNonRiparati maccNoRiparati = new MacchinariNonRiparati();
			    	
			    	maccNoRiparati.MaccNoRiparati();		    	
			    	
			    	chiamaQuery.stampaQuery();
					
				}
			    break;
			    
			    
		}
				
		
		
	}

	}
}
