import java.util.ArrayList;
import java.util.Date;

public class Workshop {

	private String nummer;
	private String bezeichnung;
	private Date datum;
	private ArrayList<Teilnehmer> teilnehmer;
	private Referent referent;
	
	public Workshop(String nummer, String bezeichnung, Date datum, Referent referent) {
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		teilnehmer = new ArrayList<Teilnehmer>();
		this.referent = referent;
	}

	public String getNummer() {
		return nummer;
	}

	public void setNummer(String nummer) {
		this.nummer = nummer;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
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

	public Referent getReferent() {
		return referent;
	}

	public void setReferent(Referent referent) {
		this.referent = referent;
	}
	
	public String toString() {
		String returnString = bezeichnung + " (" + nummer + ")" + " findet am " + datum + " statt. \n";
		returnString = returnString + "Referent: " + referent;
		returnString = returnString + "Es gibt folgende Teilnehmer: \n";
		
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
