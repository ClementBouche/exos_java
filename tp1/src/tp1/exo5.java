package tp1;

import java.util.Scanner;
import java.lang.Math; 

public class exo5 {
	public static void main(String[] args) {
		String command = "";
		boolean continuer = true;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print(">>> ");
			command = scanner.nextLine();
			String[] cmd_values = command.split(" ");			
			if(command.contains("sum") && cmd_values.length == 3){
				try {
					float n1 = Float.parseFloat(cmd_values[1]);
					float n2 = Float.parseFloat(cmd_values[2]);
					System.out.println(n1+n2);
				}
				catch (Exception e) {
					System.out.println("Error: not a number");
				}
				
			}
			else if(command.contains("concat") && cmd_values.length == 3) {
				System.out.println(cmd_values[1]+cmd_values[2]);
			}
			else if(command.contains("power") && cmd_values.length == 3) {
				try {
					float n1 = Float.parseFloat(cmd_values[1]);
					try {
						int n2 = Integer.parseInt(cmd_values[2]);
						System.out.println(Math.pow(n1,n2));
					} catch (Exception e) {
						System.out.println("Error: not an integer");
					}
				}
				catch (Exception e) {
					System.out.println("Error: not a number");
				}
				
				
			}
			else if(command.contains("div") && cmd_values.length == 3) {
				try {
					float n1 = Float.parseFloat(cmd_values[1]);
					float n2 = Float.parseFloat(cmd_values[2]);
					System.out.println(n1/n2);
				}
				catch (Exception e) {
					System.out.println("Error: not a number");
				}
				
			}
			else if(command.contains("exit") && cmd_values.length == 1) {
				continuer = false;
			}
			else if(command.contains("help") && cmd_values.length == 1) {
				System.out.println("List of commands:");
				System.out.println("* sum [number] [number]");
				System.out.println("* concat [string] [string]");
				System.out.println("* power [number] [integer]");
				System.out.println("* div [number] [number]");
				System.out.println("* exit");
				System.out.println("* help");
			}
			else {
				System.out.println("Invalid syntax. Please try again.");
			}
		}while (continuer);
		System.out.println("---terminated---");
		scanner.close();
	}

	
}
