package tp2.exo4;

public class Capitale extends Ville {
	
	private final String nomPays;
	
	//Constructeur
	// attention les variables sont écrit en lowerCamelCase (minuscule au début)
	public Capitale(String nom, String pays) {
		super(nom);
		this.nomPays = pays.toUpperCase();		
	}
	public Capitale(String nom, String pays, int nbHabitants) {
		super(nom, nbHabitants);
		this.nomPays = pays.toUpperCase();		
	}
	
	//Getter
	public String getNomPays() {
		return nomPays;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Cette ville est la capitale du pays "+nomPays+".";
	}
}
