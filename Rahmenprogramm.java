import java.util.ArrayList;
import java.util.Date;


public class Rahmenprogramm {
	
	private String bezeichnung;
	private String ort;
	private String zeit;
	private Date datum;
	private ArrayList<Teilnehmer> teilnehmer;
	
	public Rahmenprogramm(String bezeichnung, String ort, String zeit, Date datum) {
		this.bezeichnung = bezeichnung;
		this.ort = ort;
		this.zeit = zeit;
		this.datum = datum;
		teilnehmer = new ArrayList<Teilnehmer>();
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getZeit() {
		return zeit;
	}

	public void setZeit(String zeit) {
		this.zeit = zeit;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}
	
	public ArrayList<Teilnehmer> getTeilnehmer() {
		return teilnehmer;
	}
	
	public void addTeilnehmer(Teilnehmer teilnehmer) {
		this.teilnehmer.add(teilnehmer);
	}
	
	public String toString() {
		String returnString = bezeichnung + " (" + ort + ")" + " findet am " + datum + " um " + zeit + " Uhr statt. \nEs gibt folgende Teilnehmer: \n";
		
		if (teilnehmer.size() > 0) {
			for (Teilnehmer person : teilnehmer) {
				returnString = returnString + " - " + person + "\n";
			}
		} else {
			returnString = returnString + "--- keine ---";
		}
		
		return returnString;
	}
	
}
