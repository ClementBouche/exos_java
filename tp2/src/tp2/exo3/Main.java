package tp2.exo3;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		//On crée moteurs et voitures
		Moteur m1 = new Moteur(50);
		Moteur m2 = new Moteur(300);
		Voiture v1 = new Voiture(m1, "mercedez");
		Voiture v2 = new Voiture(m2, "Tesla");
		Voiture v3 = new Voiture(m1, "Peugeot");
		
		//On crée un garage et on y ajoute les voitures
		Garage g1= new Garage();
		g1.addVoiture(v1);
		g1.addVoiture(v2);
		g1.addVoiture(v3);
		
		//On affiche les caractéristiques des voitures en réparation
		for (Voiture voiture : g1.getEnReparation()) {
			System.out.println(voiture.toString());
		}
		//On améliore une voiture du garage tirée au hasard
		Random rand = new Random();
		int n = rand.nextInt(g1.getEnReparation().size());
		Voiture voitureTiree = g1.getVoitureEnReparation(n);
		System.out.println("Avant répéaration : "+voitureTiree.getMoteur().getNbChevaux());
		g1.upgrade(voitureTiree, 50);
		System.out.println("Après répéaration : "+voitureTiree.getMoteur().getNbChevaux());

	}
	
	
	
}