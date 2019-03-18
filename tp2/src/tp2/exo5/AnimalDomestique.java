package tp2.exo5;

public abstract class AnimalDomestique extends Animal {

	//Constructeur
	public AnimalDomestique(String color, float poids) {
		super(color, poids);
	}
	
	//Méthodes
	public void deplacement() {
		System.out.println("Je me déplace en appartement.");

	}
	public String toString() {
		return super.toString() + " Je suis un Animal Domestique.";
	}

}
