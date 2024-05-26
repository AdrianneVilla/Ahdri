package OOP;
import java.util.Scanner;
public class OOPisFun {

	public static void main(String[] args) {


		Scanner scn = new Scanner (System.in);
		
		System.out.println("1 + 1 = ?");
	String answer;
		 answer = scn.next();		
	
		if (answer.equals("2")) {
			System.out.println("You're correct");
		} else {
			System.out.println("Wrong!");
		}

	}

}
