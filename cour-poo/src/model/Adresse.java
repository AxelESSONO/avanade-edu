package model;

public class Adresse {

	private String rue;
	private String codePostal;
	private String ville;

	/**
	 * Default constructor
	 */
	public Adresse() {
	}
	

	/**
	 * @param rue
	 * @param codePostal
	 * @param ville
	 */
	public Adresse(String rue, String codePostal, String ville) {
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}



	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}
	
	public void doSomeThing() {
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [rue = " + rue + ", codePostal =  " + codePostal + ", ville = " + ville + "]";
	}
}
