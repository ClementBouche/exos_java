package tp2.exo5;

public class Vache extends AnimalSauvage implements Herbivore{
	
	//Attributs
		public static final String espece = "VACHE";
		
	//Constructeur
		public Vache(String color, float poids) {
			super(color, poids);
		}
	
	public void moyenExpression() {
		System.out.println("Meugle.");

	}
	
	public String toString() {
		
		return super.toString() + " Je suis une Vache.";
	}
	
	public void mange() {
		System.out.println("Je suis herbivore.");
	}

}
