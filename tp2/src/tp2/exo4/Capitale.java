package tp2.exo4;

public class Capitale extends Ville {
	
	private final String nomPays;
	
	//Constructeur
	public Capitale(String nom, String Pays) {
		super(nom);
		this.nomPays = Pays.toUpperCase();		
	}
	public Capitale(String nom, String Pays, int nbHabitants) {
		super(nom, nbHabitants);
		this.nomPays = Pays.toUpperCase();		
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
