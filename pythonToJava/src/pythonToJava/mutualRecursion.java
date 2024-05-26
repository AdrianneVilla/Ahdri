package pythonToJava;

import java.util.Scanner;

public class mutualRecursion {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scn.nextInt();

		if (isEven(num)) {
			System.out.println(num + " is an even number");
		} else {
			System.out.println(num + " is an odd number");
		}
	}// end of main method

	public static boolean isEven(int num) {

		if (num == 0) {
			return true;
		} else {
			return isOdd(num - 1);
		}

	}// end of isEven method

	public static boolean isOdd(int num) {
		if (num == 0) {
			return false;
		} else {
			return isEven(num - 1);
		}
	}// end of isOdd method
}
