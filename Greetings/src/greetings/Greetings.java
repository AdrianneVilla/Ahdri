package greetings;

import java.util.Scanner;
import java.util.PriorityQueue;

public class Greetings {
	static Scanner scn = new Scanner(System.in);
	static PriorityQueue nicknames = new PriorityQueue();
	static int inputs;
	public static void main(String[] args) {
	
		while (true) {
			askInputs();
			askNicknames();

			while (true) {

				String hi = scn.nextLine();

				if (hi.equalsIgnoreCase("H")) {
					System.out.println("Hi " + nicknames.remove() + "!");
					if (nicknames.isEmpty()) {
						System.out.println("Done saying Hi.");
						System.out.println(
								"Press the first letter of your firstname to continue, kindly use second letter of it's X, x to end the program.");
						String firstname = scn.nextLine();
						
						if(firstname.equalsIgnoreCase("X")) {
							System.out.println("PROGRAM ENDED");
							System.exit(0);
						} else {
							askInputs();
							askNicknames();
						}
						
					}
				}

			}

		}

	} //end of main method
	
	public static void askInputs() {
		System.out.println("Enter number of inputs: ");
		inputs = scn.nextInt();
	} 
	public static void askNicknames() {
		System.out.println("Enter " + inputs + " names: ");
		scn.nextLine();
		do {
			nicknames.offer(scn.nextLine());

			if (inputs == nicknames.size()) {
				System.out.println(nicknames);

			}

		} while (inputs > nicknames.size());
		System.out.println("Press H to say Hi!");
	}
}
