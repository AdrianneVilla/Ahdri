package studentlist;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class StudentList {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Map<String, String> students = new HashMap<>();

		System.out.println("Enter student number 1: ");
		String sNum1 = scn.nextLine();
		System.out.println("Enter first name 1: ");
		String fname1 = scn.nextLine();
		students.put(sNum1, fname1);
		System.out.println("Enter student number 2: ");
		String sNum2 = scn.nextLine();
		System.out.println("Enter first name 2: ");
		String fname2 = scn.nextLine();
		students.put(sNum2, fname2);
		System.out.println("Enter student number 3: ");
		String sNum3 = scn.nextLine();
		System.out.println("Enter first name 3: ");
		String fname3 = scn.nextLine();
		students.put(sNum3, fname3);
		System.out.println(students.keySet());
		System.out.println("Student List: ");
		for(Map.Entry s: students.entrySet() ) {
			System.out.println(s.getKey() +" "+ s.getValue());
		}
		
		System.out.println("Enter student number: ");
		String sNum4 = scn.nextLine();
		System.out.println("Enter first name: ");
		String fname4 = scn.nextLine();
		students.put(sNum4, fname4);
		students.remove(sNum3);
	
		
		System.out.println("Student List: ");
		for(Map.Entry e: students.entrySet() ) {
			
			System.out.println(e.getKey() +" "+ e.getValue());
		}
	}

}
