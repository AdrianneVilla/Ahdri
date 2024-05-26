package typesOfVariables;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		int processNum, process, burstTime;
		Scanner scn = new Scanner(System.in);
		Queue queue = new LinkedList();
		System.out.print("Enter a number of process: ");
		processNum = scn.nextInt();
		queue.add(processNum);
		for (int i = 1; i <= processNum; i++) {

			System.out.print("Enter Arrival Time for Process " + i + ": ");
			process = scn.nextInt();

			System.out.print("Enter Burst Time for Process " + i + ": ");

			 burstTime = scn.nextInt();

		}
		System.out.println(" ");

		System.out.println("Process Table");
		System.out.println("P     |     AT     |     BT");

		for (int i = 1; i <= processNum; i++) {
			System.out.println(i);
		}

	}

}
