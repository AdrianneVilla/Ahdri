package amountDue;

import java.util.Scanner;

public class RunAmountDue {
	static Scanner scn = new Scanner(System.in);
	static AmountDue due = new AmountDue();

	public static void main(String[] args) {

		choosing();
	}

	public static void choosing() {
		System.out.println("Press any of the following then enter values seperated by spaces: " + "\n 1 - Price only"
				+ "\n 2 - Price and quantity" + "\n 3 - Price, quantity, and discount amount");
		int choices = scn.nextInt();
		

				if (choices == 1) {
					priceOnly();
				} else if (choices == 2) {
					priceAndQuant();
				} else if (choices == 3) {
					priceQuantDiscount();
				}

	}

	public static void priceOnly() {
		System.out.println("Enter price: ");
		double totalDue = scn.nextDouble();
		totalDue = due.computeAmountDue(scn.nextDouble());
		System.out.println("Amount due is "+totalDue);
	}

	public static void priceAndQuant() {
		System.out.println("Enter price and quantity in seperated spaces");
		double totalDue = due.computeAmountDue(scn.nextDouble(), scn.nextInt());
		System.out.println("Amount due is "+totalDue);
		
	}
	public static void priceQuantDiscount() {
		System.out.println("Enter price, quantity, and discount in seperated spaces");
		double totalDue = due.computeAmountDue(scn.nextDouble(), scn.nextInt(), scn.nextDouble());
		System.out.println("Amount due is "+totalDue);
	}

}
