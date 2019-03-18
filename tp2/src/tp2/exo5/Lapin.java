package tp2.exo5;

public class Lapin extends AnimalDomestique implements Herbivore {

	//Attributs
	public static final String espece = "LAPIN";
	
	//Constructeur
	public Lapin(String color, float poids) {
		super(color, poids);
	}
	public void moyenExpression() {
		System.out.println("Glapit.");

	}
	
	public String toString() {
		
		return super.toString() + " Je suis un Lapin.";
	}
	
	public void mange() {
		System.out.println("Je suis herbivore.");
	}
}
