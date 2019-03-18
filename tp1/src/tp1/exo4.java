package tp1;

import java.util.Scanner;

public class exo4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String chaine = scan.nextLine();
		
		String reverse = "";
		for (int i=chaine.length()-1 ; i>=0 ; i--) {
			reverse = reverse + chaine.charAt(i);
		}
		System.out.println(reverse);
	}
}
