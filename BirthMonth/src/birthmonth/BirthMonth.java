package birthmonth;

import java.util.*;

public class BirthMonth {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Set group1 = new HashSet();
		Set group2 = new HashSet();
		Set self = new HashSet();
	
		System.out.println("Group 1: ");
		for (int i = 1; i <= 3; i++) {
			System.out.print("Enter birth month" + i + ": ");
			String G1Month = scn.nextLine();
			Collections.addAll(group1, G1Month);

		}
		System.out.println("Group 2: ");
		for (int j = 1; j <= 3; j++) {
			System.out.print("Enter birth month" + j + ": ");
			String G2Month = scn.nextLine();
			Collections.addAll(group2, G2Month);
		}
		System.out.println("");
		System.out.println("Group 1: " + group1);
		System.out.println("Group 2: " + group2);

		System.out.println("Enter your birth month: ");
		String bmonth = scn.nextLine();
		Collections.addAll(self, bmonth);
		
		Set union = new HashSet(group1);
		Set intersect = new HashSet(group1);
		Set difference = new HashSet(group1);
		union.addAll(group2);
		intersect.retainAll(group2);
		difference.removeAll(group2);

		System.out.println("Union: " + union);
		System.out.println("Intersection: " + intersect);
		System.out.println("Difference: " + difference);
		
		 if (group1.containsAll(self) || group2.containsAll(self)) {
	            System.out.println("You have the same birth month with one of your classmates!");
	        } else {
	            System.out.println("You do not share the same birth month with any of your classmates.");
	        }
		
		
		

	}

}
