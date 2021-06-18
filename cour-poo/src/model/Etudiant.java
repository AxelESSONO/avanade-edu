package model;

public class Etudiant extends Personne implements Affichage {
	
	private String niveau;

	public Etudiant() {
	}
	
	public Etudiant(int num, String nom, String prenom, String niveau) {
		super(num, nom, prenom);
		this.niveau = niveau;
	}

	public Etudiant(int num, String nom, String prenom, Adresse[] adresse, String niveau) {
		super(num, nom, prenom, adresse);
		this.niveau = niveau;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Etudiant [niveau = " + niveau + ", = \n" + super.toString() + "]";
	}

	@Override
	public void afficherNomMajuscule() {
		// TODO Auto-generated method stub
	}

	@Override
	public void afficherPrenomMajuscule() {
		// TODO Auto-generated method stub
	}
}

