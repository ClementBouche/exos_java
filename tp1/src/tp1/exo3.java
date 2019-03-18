package tp1;

import java.util.Scanner;
import java.util.ArrayList;
public class exo3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean error = false;
		ArrayList<Integer> listeEntiers=new ArrayList<Integer>(); 
		do {
			String entierString = scan.next();
			try {
				int entier = Integer.parseInt(entierString);
				listeEntiers.add(entier);
			}
			catch (Exception e) {
				error = true;
			}
			
		}while(error == false);
		scan.close();
		System.out.println("moyenne = " + moyenne(listeEntiers) + "\\nsomme = " + somme(listeEntiers));
	}
	
	public static float moyenne(ArrayList<Integer> listeEntiers) {
		float moy = 0;
		for (int e : listeEntiers) {
			moy += e;
		}
		moy /= listeEntiers.size();
		return moy;
	}
	
	public static int somme(ArrayList<Integer> listeEntiers) {
		int som = 0;
		for (int e : listeEntiers) {
			som += e;
		}
		return som;
	}
}
