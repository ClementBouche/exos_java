package tp1;

import java.util.Arrays;
import java.util.Random;

public class TestArrays {
	public static void main(String[] args) {
		int[] tabEntiers = new int[150];
		Random rand = new Random();
		
		for (int i=0; i<150; i++) {
			tabEntiers[i] = rand.nextInt(200)+1;
		}
		System.out.println(Arrays.toString(tabEntiers));
		
		Arrays.parallelSort(tabEntiers);
		System.out.println(Arrays.toString(tabEntiers));
		
		for (int i=0; i<20; i++) {
			int rand_num = rand.nextInt(200)+1;
			int index = Arrays.binarySearch(tabEntiers, rand_num);
			if (index > 0) {
				System.out.println("Le nombre " + rand_num + " est dans le tableau en position "+ index);
			}
		}
	}
}
