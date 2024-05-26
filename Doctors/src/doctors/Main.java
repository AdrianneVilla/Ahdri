package doctors;

import java.util.Scanner;
import java.util.TreeMap;

public class Main extends Patient implements Doctors {
	static Scanner scn = new Scanner(System.in);
	static TreeMap<String, String> doctorSchedule = new TreeMap<>();
	static TreeMap<String, String> doctorAppointment = new TreeMap<>();
	static String schedule;
	static Patient p = new Patient();

	public static void main(String[] args) {
		Patient pd = new Patient();
		System.out.println(" \t \t \t  _    _                 _ _        _   _____        __                           _   _                _____           _                 \t \t \t \r\n"
				+ " \t \t \t | |  | |               (_) |      | | |_   _|      / _|                         | | (_)              / ____|         | |               \t \t \t   \r\n"
				+ " \t \t \t | |__| | ___  ___ _ __  _| |_ __ _| |   | |  _ __ | |_ ___  _ __ _ __ ___   __ _| |_ _  ___  _ __   | (___  _   _ ___| |_ ___ _ __ ___  \t \t \t  \r\n"
				+ " \t \t \t |  __  |/ _ \\/ __| '_ \\| | __/ _` | |   | | | '_ \\|  _/ _ \\| '__| '_ ` _ \\ / _` | __| |/ _ \\| '_ \\   \\___ \\| | | / __| __/ _ \\ '_ ` _ \\ \t \t \t  \r\n"
				+ " \t \t  \t | |  | | (_) \\__ \\ |_) | | || (_| | |  _| |_| | | | || (_) | |  | | | | | | (_| | |_| | (_) | | | |  ____) | |_| \\__ \\ ||  __/ | | | | | \t \t \t \r\n"
				+ " \t \t \t |_|  |_|\\___/|___/ .__/|_|\\__\\__,_|_| |_____|_| |_|_| \\___/|_|  |_| |_| |_|\\__,_|\\__|_|\\___/|_| |_| |_____/ \\__, |___/\\__\\___|_| |_| |_| \t \t \t \r\n"
				+ " \t \t \t                  | |                                                                                         __/ |                      \t \t \t  \r\n"
				+ " \t \t \t                  |_|                                                                                        |___/                       \t \t \t");
		System.out.println("\t \t \t========================================================================================================================================= \t \t \t ");
		System.out.println("\t \t \t \t \t \t \t \t \t \t  [1]Doctors names" + "\n[2]Doctors Appointment/s");
		schedule = scn.next();
		if (schedule.equals("1")) {
			schedule();
		} else if (schedule.equals("2")) {

			appointment();
		}
	}

	public static void appointment() {

		p.getName();
		p.getDisease();
		p.contactNumber();
	}

	public static void schedule() {

		doctorSchedule.put("1", "Dr.Smith");
		doctorSchedule.put("2", "Dr. James");
		doctorSchedule.put("3", "Dr.Mundo");
		doctorSchedule.put("4", "Dr. Speed");
		System.out.println(" \t \t \t \t \t \t \t \t \t \t "+doctorSchedule.values());
		picking();

		while (true) {
			System.out.println("\t \t \t \t \t \t \t \t \t \t [0]Back");
			String back = scn.next();

			if (back.equals("0")) {
				picking();
			} else {
				System.exit(0);
			}
		}

	}

	public static void picking() {

		System.out.println("\t \t \t \t \t \t \t \t \t \t ------------------------------------------------");
		System.out.println("\t \t \t \t \t \t \t \t \t \t Choose Number to see the details of each Doctors");
		System.out.println("\t \t \t \t \t \t \t \t \t \t"+"[1]" + doctorSchedule.get("1") + "\t" + "[2]" + doctorSchedule.get("2") + "\t" + "[3]"
				+ doctorSchedule.get("3") + "\t" + "[4]" + doctorSchedule.get("4"));
		String details = scn.next();

		if (details.equals("1")) {
			doctorSchedule.get("1");
			Doc1();
		} else if (details.equals("2")) {
			doctorSchedule.get("2");
			Doc2();
		} else if (details.equals("3")) {
			doctorSchedule.get("3");
			Doc3();
		} else if (details.equals("4")) {
			doctorSchedule.get("4");
			Doc4();
		}
	}

	public static void Doc1() {
		System.out.println("\t \t \t \t \t \t \t \t \t \t Name: Dr. Smith");
		System.out.println("\t \t \t \t \t \t \t \t \t \t Room: RM-101");
		System.out.println("\t \t \t \t \t \t \t \t \t \t Specialization: Orthopedic");
		System.out.println("\t \t \t \t \t \t \t \t \t \t Contact Number: 0912-223-4431");
		System.out.println("\t \t \t \t \t \t \t \t \t \t Schedule: Mon-Wed \t Time: 8am - 4pm");
	}

	public static void Doc2() {
		System.out.println("Name: Dr. James");
		System.out.println("Room: RM-102");
		System.out.println("Specialization: Pediatrics");
		System.out.println("Contact Number: 0953-223-2213");
		System.out.println("Schedule: Tues-Fri \t Time: 8am - 1pm");
	}

	public static void Doc3() {
		System.out.println("Name: Dr. Mundo");
		System.out.println("Room: RM-103");
		System.out.println("Specialization: Cardiology");
		System.out.println("Contact Number: 0966-213-2713");
		System.out.println("Schedule: Fri-Saturday \t Time: 12pm - 5pm");
	}

	public static void Doc4() {
		System.out.println("Name: Dr. Speed");
		System.out.println("Room: RM-104");
		System.out.println("Specialization: General Surgery");
		System.out.println("Contact Number: 0942-221-2253");
		System.out.println("Schedule: Saturday \t Time: 8am - 4pm");
	}

}
