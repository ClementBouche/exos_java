package tp2.exo5;

public class Tigre extends AnimalSauvage implements Carnivore{
	
	
	//Constructeur
	public Tigre(String color, float poids) {
		super(color, poids);
	}
	
	//Méthodes
	public void moyenExpression() {
		System.out.println("Rugissement.");
	}
	
	public String toString() {
		
		return super.toString() + " Je suis un Tigre.";
	}
	
	public void mange(Animal victime) {
		System.out.println("Je suis carnivore et je mange l'espèce "+((victime.getClass().getSimpleName()+".")));
	}
	
	public static void main(String[] args) {
		Animal tigrou = new Tigre("blanco", 150);
		System.out.println(tigrou.toString());
		((Tigre) tigrou).mange(tigrou);
		
	}
	
	
}
