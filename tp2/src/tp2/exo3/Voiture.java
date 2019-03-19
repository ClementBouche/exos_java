package tp2.exo3;

import tp2.exo3.Moteur;

public class Voiture{
	
	private Moteur moteur;
	private String marque;
	
	//Constructeur
	public Voiture(Moteur moteur, String marque) {
		this.marque = marque;
		this.moteur = moteur;
	}
	
	//Setter and getter
	public Moteur getMoteur() {
		return this.moteur;
	}
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	@Override
	public String toString() {
		return "Voiture "+this.marque+" munie d'un moteur de "+moteur.getNbChevaux()+" chevaux."; 
	}

}