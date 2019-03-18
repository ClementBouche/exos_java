package tp2.exo5;

public class Chien extends AnimalDomestique {

	//Attributs
	public static final String espece = "CHIEN";
		
	//Constructeur
	public Chien(String color, float poids) {
		super(color, poids);
	}
	
	public void moyenExpression() {
		System.out.println("Aboie.");
	}
	
	public String toString() {
		
		return super.toString() + " Je suis un Chien.";
	}
}
