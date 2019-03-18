package tp2.exo5;

public class Chat extends AnimalDomestique{
	
	 //Attributs
	public static final String espece = "CHAT";
	
	public Chat(String color, float poids) {
		super(color, poids);
	}
	
	public void moyenExpression() {
		System.out.println("Miaule.");
		
	}
	public String toString() {
		
		return super.toString() + " Je suis un Chat.";
	}
	
}
