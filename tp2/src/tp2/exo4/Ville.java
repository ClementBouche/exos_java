package tp2.exo4;

public class Ville {
	
	protected final String nom;
	protected int nbHabitants;
	
	//Constructeurs
	public Ville(String nomFourni) {
		this.nom = nomFourni.toUpperCase();
		this.nbHabitants = 0;
	}
	public Ville(String nomFourni, int nbHabFourni) {
		this.nom = nomFourni.toUpperCase();
		if (nbHabFourni >= 0) {
			this.nbHabitants = nbHabFourni;
		}
		else {
			this.nbHabitants = 0;
		}
		
	}
	
	//Setters et Getters
	public String getNom() {
		return nom;
	}
	public int getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(int nbHabitants) {
		if (nbHabitants >= 0) {
			this.nbHabitants = nbHabitants;
		}
		else {
			this.nbHabitants = 0;
		}
	}
	
	//Autres méthodes
	public boolean nbHabitantsConnu() {
		if (nbHabitants > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return nom+" comporte "+nbHabitants+" habitants.";
	}
	
	// on utilisera que dans des cas très précis l'utilisation de char
	public String categorie() {
		// pour la categorie on travaillera par surcharge de méthode
		if (this.getNbHabitants() < 500000 && this.getNbHabitants() != 0) {
			return "A";
		}
		else if (this.getNbHabitants() >= 500000 ){
			return "B";
		}
		else if (this.getNbHabitants() == 0) {
			return "?";
		}
	}
}
