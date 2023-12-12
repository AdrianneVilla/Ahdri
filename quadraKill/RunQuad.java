package quadraKill;

import java.util.Scanner;

public class RunQuad {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		
		while(true) {
		System.out.println("Enter R for Rectangle and S for Square and ANY LETTER to exit: ");
		String shape = scn.next();
		
		if(shape.equalsIgnoreCase("S")) {
			System.out.println("A square: ");
			square.showDescription();
		} else if (shape.equalsIgnoreCase("R")) {
			System.out.println("A rectangle: ");
			rectangle.showDescription();
		} else {
			System.out.println("Thank you!");
			System.exit(0);
		}
		
		}
	}

}
