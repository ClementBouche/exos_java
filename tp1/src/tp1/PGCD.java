package tp1;

import java.util.Scanner;

public class PGCD {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez un entier = ");
		String input1 = scanner.next();
		System.out.print("Un autre = ");
		String input2 = scanner.next();
		try {
			int n1 = Integer.parseInt(input1);
			int n2 = Integer.parseInt(input2);
			System.out.println("pgcd de " + n1 + " et " + n2 + ": " + PGCD.pgcd(n1, n2));

		} catch (Exception e) {
			System.out.println("Au moins l'un des nombres n'est pas un entier...");
		}
	}
	
	public static float pgcd(int a, int b) {
		while(true) {
			if (b == 0) {
				break;
			}
			else {
				int r = a % b;
				a = b;
				b = r;
			}
		}
		return a;
	}
	
}
