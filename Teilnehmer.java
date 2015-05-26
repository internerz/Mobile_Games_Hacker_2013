
public class Teilnehmer {
	private String name;
	private String mail;
	private String status;
	
	public Teilnehmer(String name, String mail, String status) {
		this.name = name;
		this.mail = mail;
		this.status = status;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString() {
		return name + " (" + status + ", " + mail + ")";
	}

}
