package pythonToJava;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = scn.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scn.nextInt();

		System.out.println("Answer: " + findGCD(num1, num2));

	}

	public static int findGCD(int num1, int num2) {
		if (num1 % num2 == 0) {
			return num2;
		} else {
			return findGCD(num2, num1 % num2);
		}

	}// GCD
}
