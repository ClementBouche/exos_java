package tp2.exo5;

public class Sanglier extends AnimalSauvage {

	//Attributs
	public static final String espece = "SANGLIER";
		
	//Constructeur
	public Sanglier(String color, float poids) {
		super(color, poids);
	}
	
	public void moyenExpression() {
		System.out.println("Grommelle.");
	}
	
	public String toString() {
		
		return super.toString() + " Je suis un Sanglier.";
	}

}
