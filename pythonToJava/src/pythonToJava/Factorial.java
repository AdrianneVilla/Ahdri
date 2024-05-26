package pythonToJava;

import java.util.Scanner;

public class Factorial {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter a number to compute: ");
		int n = scn.nextInt();

		System.out.println("Answer: " + factorial(n));
	}

	public static int factorial(int n) {

		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}// end of factorial method

}// end of main method
