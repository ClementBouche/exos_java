package tp2.exo3;

import java.util.List;
import tp2.exo3.Voiture;

public class Garage{
	private List<Voiture> enReparation;
	
	
	public void upgrade(Voiture v, int augmentationPuissance) {
		v.getMoteur().setNbChevaux(v.getMoteur().getNbChevaux()+augmentationPuissance);
	}
}