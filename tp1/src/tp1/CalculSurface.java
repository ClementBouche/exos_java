package tp1;

import java.util.Scanner;

public class CalculSurface {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Rayon = ");
		// on utilisera directement nextFloat() pour ne pas avoir à parser le String
		String input = scanner.nextLine();
		try {
			float r = Float.parseFloat(input);
			double surface = 3.14*Math.pow(r, 2);
			System.out.print("La surface du cercle de rayon " + r + " est " + surface);
		} catch (Exception e) {
			System.out.println("Not a number...");
		}
		
		
		
	}
}
