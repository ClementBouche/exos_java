package tp1;

import java.util.Arrays;

public class Tableau {

	public static int maxTableau(int[] tabIntegers) {
		Arrays.parallelSort(tabIntegers);
		return tabIntegers[tabIntegers.length-1];
		}
	
	public static void afficheTableau(int[] tab) {
		for(int e: tab) {
			System.out.println(e + "\n");
		}
	}
	
}
