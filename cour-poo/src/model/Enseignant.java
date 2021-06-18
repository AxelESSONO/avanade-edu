package model;

public class Enseignant extends Personne {
	
	private int salaire;

	public Enseignant() {
	}

	public Enseignant(int num, String nom, String prenom, int salaire) {
		super(num, nom, prenom);
		this.salaire = salaire;
	}

	public Enseignant(int num, String nom, String prenom, Adresse[] adresse, int salaire) {
		super(num, nom, prenom, adresse);
		this.salaire = salaire;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Enseignant [salaire = " + salaire + " , " + super.toString() + "]" +num;
	}

}
