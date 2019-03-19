package tp2.exo3;


import java.util.List;
import java.util.ArrayList;
import tp2.exo3.Voiture;


public class Garage{
	
	private List<Voiture> enReparation;
	
	//Constructeur
	public Garage() {
		this.enReparation = new ArrayList<Voiture>();
	}
	
	//Setter et Getter
	public void addVoiture(Voiture voitToAdd) {
		this.enReparation.add(voitToAdd);
	}
	public List<Voiture> getEnReparation() {
		return enReparation;
	}
	public Voiture getVoitureEnReparation(int index){
		try {
			Voiture voitureRetournee = enReparation.get(index);
			return voitureRetournee;
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}
	
	
	
	//Autre méthode
	public void upgrade(Voiture v, int augmentationPuissance) {
		v.getMoteur().setNbChevaux(v.getMoteur().getNbChevaux()+augmentationPuissance);
	}
}