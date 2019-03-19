package tp2.exo5;

public abstract class AnimalSauvage extends Animal {
	
	//Constructeur
	public AnimalSauvage(String color, float poids) {
		super(color, poids);
	}
	
	//Méthodes
	public void deplacement() {
		System.out.println("Je me déplace dans la nature.");

	}
	
	public String toString() {
		// attention ici au premier appel a super.toString() (surement un copié collé)
		super.toString();
		return super.toString() + " Je suis un Animal Sauvage.";
	}

}
