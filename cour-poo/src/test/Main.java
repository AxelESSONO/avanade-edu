package test;

import model.Adresse;
import model.Enseignant;
import model.Etudiant;
import model.Personne;

public class Main {

	public static void main(String[] args) {

		Adresse adresse1 = new Adresse("Malakoff", "75016", "Paris");
		Adresse adresse2 = new Adresse("Foch", "75017", "Marseilles");
		Adresse adresse3 = new Adresse("Charles de Gaulles", "75018", "Rouen");

		Adresse[] adresses = { adresse1, adresse2, adresse3};
 
		Personne personne3 = new Personne(200, "dalton", "jack", adresses);
	
		Etudiant etudiant = new Etudiant(400, "cervera", "sophie", adresses, "master");
		//System.out.println(etudiant);
		
		Enseignant enseignant = new Enseignant(500, "Essono", "Axel", adresses, 4000);
		//System.out.println(enseignant);
		
		Personne [] personnes = new Personne[] {etudiant, personne3, enseignant};
		
		for(Personne personne : personnes) {
			if (personne instanceof Enseignant) {
				System.out.println(((Enseignant) personne).getSalaire());
			}else if(personne instanceof Etudiant) {
				System.out.println(((Etudiant) personne).getNiveau());
			}else {
				System.out.println(personne.getNum());
			}
		}
	}
}
