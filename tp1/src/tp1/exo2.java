package tp1;

import java.util.Scanner;

public class exo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entrez un nombre: ");
		int x = scan.nextInt();
		System.out.println("Un autre: ");
		int y = scan.nextInt();
		System.out.println("Encore un :");
		int z = scan.nextInt();
		
		float moyenne = (x+y+z)/3;
		
		System.out.println(moyenne);
	}
}