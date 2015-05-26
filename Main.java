import java.util.Date;


public class Main {

	public static void main(String[] args) {

		Teilnehmer teilnehmer1 = new Teilnehmer("Alice", "alice@xyz.de", "Student");
		Teilnehmer teilnehmer2 = new Teilnehmer("Bob", "bobe@xyz.de", "Mitglied");
		Teilnehmer teilnehmer3 = new Teilnehmer("Charlie", "charlie@xyz.de", "Nichtmitglied");

		Referent referent1 = new Referent("Prof. Andreas Plaß", "andreas.plass@haw-hamburg.de", "HAW Hamburg");
		Referent referent2 = new Referent("Dennis Abraham", "info@abaraham.com", "Abraham Solutions GmbH");
		
		Workshop entwickelnFuerAnfaenger = new Workshop("ws-123", "Entwickeln für Anfänger", new Date(1369699200), referent1);
		Workshop moderneSmartphones = new Workshop("ws-234", "Moderne Smartphones", new Date(1369699200), referent2);
		
		Rahmenprogramm musical = new Rahmenprogramm("Silent Musickal", "Raum 345", "20:00", new Date(1369700200));

		entwickelnFuerAnfaenger.addTeilnehmer(teilnehmer1);
		entwickelnFuerAnfaenger.addTeilnehmer(teilnehmer2);

		moderneSmartphones.addTeilnehmer(teilnehmer2);
		moderneSmartphones.addTeilnehmer(teilnehmer3);
		moderneSmartphones.addTeilnehmer(referent1);

		musical.addTeilnehmer(teilnehmer3);

		System.out.println(entwickelnFuerAnfaenger);
		System.out.println(moderneSmartphones);
		System.out.println(musical);
		
		/*	Ausgabe:
 			Entwickeln für Anfänger (ws-123) findet am Fri Jan 16 21:28:19 CET 1970 statt. 
			Referent: Prof. Andreas Plaß(HAW Hamburg, andreas.plass@haw-hamburg.de)Es gibt folgende Teilnehmer: 
			 - Alice (Student, alice@xyz.de)
			 - Bob (Mitglied, bobe@xyz.de)
			
			Moderne Smartphones (ws-234) findet am Fri Jan 16 21:28:19 CET 1970 statt. 
			Referent: Dennis Abraham(Abraham Solutions GmbH, info@abaraham.com)Es gibt folgende Teilnehmer: 
			 - Bob (Mitglied, bobe@xyz.de)
			 - Charlie (Nichtmitglied, charlie@xyz.de)
			 - Prof. Andreas Plaß(HAW Hamburg, andreas.plass@haw-hamburg.de)
			
			Silent Musickal (Raum 345) findet am Fri Jan 16 21:28:20 CET 1970 um 20:00 Uhr statt. 
			Es gibt folgende Teilnehmer: 
			 - Charlie (Nichtmitglied, charlie@xyz.de)
			 - Dennis Abraham(Abraham Solutions GmbH, info@abaraham.com)
		 */
		
	}

}
