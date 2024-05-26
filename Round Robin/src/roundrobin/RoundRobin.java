package roundrobin;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class RoundRobin {

	static Scanner input = new Scanner(System.in);
	static int processNum, at, bt, ft, tr, wTime, quantum, timeCounter;
	static double aveTr, aveWt, aveTrTs, TrTs;
	static boolean processRunning;
	static String tableFormat = "%7s";
	static String ganttFormat = "%8s";

	static List<String> processID = new LinkedList<>();
	static List<String> currentProcess = new LinkedList<>();
	static List<String> finishProcess = new LinkedList<>();
	static List<String> ganttP = new LinkedList<>();
	static List<Integer> ganttT = new LinkedList<>();
	static Map<String, Integer> processID_arrivalTime = new HashMap<>();
	static Map<String, Integer> processID_burstTime = new HashMap<>();
	static Map<String, Integer> processID_burstTimeTable = new HashMap<>();
	static Map<String, Integer> processID_finishTime = new HashMap<>();
	static Map<String, Integer> processID_turnAroundTime = new HashMap<>();
	static Map<String, Integer> processID_waitingTime = new HashMap<>();
	static Map<String, Double> processID_TRTS = new HashMap<>();
	static Queue<String> processQueue = new LinkedList<>();

	public static void main(String[] args) {

		setDetails();
		while (true) {
			System.out.println("Do you want to make another process? Y for Yes | N for No");
			String choices = input.next();

			if (choices.equalsIgnoreCase("Y")) {
				clearDetails();
				setDetails();
			} else if (choices.equalsIgnoreCase("N")) {
				System.exit(0);
			}
		}

	}

	public static void clearDetails() {
		processID.clear();
		currentProcess.clear();
		finishProcess.clear();
		ganttP.clear();
		ganttT.clear();
		processID_arrivalTime.clear();
		processID_burstTime.clear();
		processID_burstTimeTable.clear();
		processID_finishTime.clear();
		processID_turnAroundTime.clear();
		processID_waitingTime.clear();
		processID_TRTS.clear();
	}

	public static void setDetails() {
		System.out.print("Enter quantum value: ");
		quantum = input.nextInt();

		System.out.print("Enter number of process: ");
		processNum = input.nextInt();

		for (int i = 0; i < processNum; i++) {
			int processCounter = 1 + i;

			System.out.print("Enter the arrival time of process " + processCounter + ": ");
			at = input.nextInt();

			System.out.print("Enter the burst time of process " + processCounter + ": ");
			bt = input.nextInt();

			processID.add(String.valueOf(processCounter));
			processID_arrivalTime.put(processID.get(i), at);
			processID_burstTime.put(processID.get(i), bt);
			processID_burstTimeTable.put(processID.get(i), bt);
		}

		System.out.println("\nQuantum = " + quantum);

		System.out.println("");
		System.out.print("Process         |");
		for (int i = 0; i < processID.size(); i++) {
			System.out.printf(tableFormat, processID.get(i));
			System.out.print("|");
		}

		System.out.println("");
		System.out.print("Arrival Time    |");
		for (int i = 0; i < processID.size(); i++) {
			System.out.printf(tableFormat, processID_arrivalTime.get(processID.get(i)));
			System.out.print("|");
		}

		System.out.println("");
		System.out.print("Burst Time      |");
		for (int i = 0; i < processID.size(); i++) {
			System.out.printf(tableFormat, processID_burstTimeTable.get(processID.get(i)));
			System.out.print("|");
		}

		processRunning = true;
		timeCounter = 0;

		processQueue.offer(processID.get(0));
		while (processRunning) {

			currentProcess.add(processQueue.poll());
			for (int i = 0; i < quantum; i++) {
				timeCounter++;

				for (int j = 0; j < processID.size(); j++) {
					at = processID_arrivalTime.get(processID.get(j));
					if (at == timeCounter) {
						processQueue.offer(processID.get(j));
					}
				}

				bt = processID_burstTime.get(currentProcess.get(0));
				if (bt != 0) {
					bt -= 1;
					processID_burstTime.replace(currentProcess.get(0), bt);
				}
				if (bt == 0) {
					finishProcess.add(currentProcess.get(0));
					processID_finishTime.put(currentProcess.get(0), timeCounter);
					break;
				}

			}

			ganttP.add(currentProcess.get(0));
			ganttT.add(timeCounter);

			if (bt != 0) {
				processQueue.offer(currentProcess.get(0));
			}

			currentProcess.clear();

			if (finishProcess.size() == processID.size()) {
				processRunning = false;
			}
		}

		printing();

	}

	public static void printing() {
		System.out.println("");
		System.out.print("Finish Time     |");
		for (int i = 0; i < processID.size(); i++) {
			System.out.printf(tableFormat, processID_finishTime.get(processID.get(i)));
			System.out.print("|");
		}

		System.out.println("");
		System.out.print("Turnaround Time |");
		for (int i = 0; i < processID.size(); i++) {
			tr = processID_finishTime.get(processID.get(i)) - processID_arrivalTime.get(processID.get(i));
			processID_turnAroundTime.put(processID.get(i), tr);
			System.out.printf(tableFormat, processID_turnAroundTime.get(processID.get(i)));
			System.out.print("|");
		}

		System.out.println("");
		System.out.print("Waiting Time    |");
		for (int i = 0; i < processID.size(); i++) {
			wTime = processID_turnAroundTime.get(processID.get(i)) - processID_burstTimeTable.get(processID.get(i));
			processID_waitingTime.put(processID.get(i), wTime);
			System.out.printf(tableFormat, processID_waitingTime.get(processID.get(i)));
			System.out.print("|");
		}

		System.out.println("");
		System.out.print("Tr/Ts           |");
		for (int i = 0; i < processID.size(); i++) {
			TrTs = processID_turnAroundTime.get(processID.get(i))
					/ (double) processID_burstTimeTable.get(processID.get(i));
			processID_TRTS.put(processID.get(i), TrTs);
			System.out.printf(tableFormat, processID_TRTS.get(processID.get(i)));
			System.out.print("|");
		}

		System.out.println("\n");
		System.out.println("Gantt Chart: ");
		for (int i = 0; i < ganttP.size(); i++) {
			System.out.print("---------");
		}
		System.out.print("\n|");
		for (int i = 0; i < ganttP.size(); i++) {
			System.out.printf(tableFormat, ganttP.get(i));
			System.out.print("|");
		}
		System.out.println("");
		for (int i = 0; i < ganttP.size(); i++) {
			System.out.print("---------");
		}

		System.out.println("");
		System.out.print(0);

		for (int i = 0; i < ganttT.size(); i++) {
			System.out.printf(ganttFormat, ganttT.get(i));
		}

		System.out.println("\n");
		tr = 0;
		wTime = 0;
		TrTs = 0;
		for (int i = 0; i < processID.size(); i++) {
			tr += processID_turnAroundTime.get(processID.get(i));
			wTime += processID_waitingTime.get(processID.get(i));
			TrTs += processID_TRTS.get(processID.get(i));
		}
		aveTr = tr / (double) processNum;
		aveWt = wTime / (double) processNum;
		aveTrTs = TrTs / (double) processNum;

		System.out.println("Average Turnaround Time: " + tr + " / " + processNum + " = " + aveTr);
		System.out.println("Average Waiting Time: " + wTime + " / " + processNum + " = " + aveWt);
		System.out.println("Average Tr/Ts: " + TrTs + " / " + processNum + " = " + TrTs);
	}
}
