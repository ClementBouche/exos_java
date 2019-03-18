package tp2.exo5;

public abstract class Animal {
	protected float poids;
	protected String couleur;	
	
	//Constructeur
	public Animal(String color, float poids) {
		this.couleur = color;
		this.poids = poids;
	}
	
	// Methodes
	public abstract void deplacement();
	public abstract void moyenExpression();
	public String toString() {
		return "Je suis un Animal.";
	}
	
	// Getters et setters
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public float getPoids() {
		return poids;
	}
	public void setPoids(float poids) {
		this.poids = poids;
	}
	
}
