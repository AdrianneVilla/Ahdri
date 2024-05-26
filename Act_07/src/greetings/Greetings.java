package greetings;

import java.util.Scanner;
import java.util.PriorityQueue;

public class Greetings {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//*
		PriorityQueue nicknames = new PriorityQueue();

		System.out.println("Enter number of inputs: ");
		int inputs = scn.nextInt();
		scn.nextLine();
		System.out.println("Enter " + inputs + " names: ");

		while (true) {
			nicknames.offer(scn.nextLine());
			if (inputs == nicknames.size()) {
				System.out.println(nicknames);
			}
			System.out.println("Press H to say Hi");
			}
		
		} 

		
	}

