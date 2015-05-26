
public class Referent extends Teilnehmer {

	private String name;
	private String mail;
	private String firma;
	
	public Referent(String name, String mail, String firma) {
		super(name, mail, "Mitglied");
		this.name = name;
		this.mail = mail;
		this.firma = firma;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getFirma() {
		return firma;
	}
	
	public void setFirma(String firma) {
		this.firma = firma;
	}
	
	public String toString() {
		return name + "(" + firma + ", " + mail + ")";
	}
	
}
