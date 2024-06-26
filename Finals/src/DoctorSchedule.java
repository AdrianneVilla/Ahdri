
import java.util.*;

public class DoctorSchedule {
	static String schedule;
	static Scanner scn = new Scanner(System.in);
	static TreeMap<String, String> doctorSchedule = new TreeMap<>();
	static ListOfStaff staffList = new ListOfStaff();
	static Map<String, String> staffName = new TreeMap<>(staffList.D_staffName);
	static Map<String, String> staffPosition = new TreeMap<>(staffList.D_staffPosition);
	static Map<String, String> staffNumber = new TreeMap<>(staffList.D_staffNumber);
	static Map<String, String> staffSched = new TreeMap<>(staffList.D_staffSched);
	static Billing billing = new Billing();
	static PatientAppointment pInfo = new PatientAppointment();

	public static void doctorSchedule() {

		System.out.println("=============================================================");
		System.out.println("DOCTORS' SCHEDULE\n");
		Ddisplay();

		System.out.println("=============================================================");
		System.out.println("APPOINTMENT SCHEDULING\n");
		pInfo.patientInfo();
		Ddisplay();

	}

	public static void picking() {
		while (true) {
			System.out.print("Enter Doctor's Last name to schedule an appointment: ");
			String details = "DR_" + scn.nextLine().toUpperCase();
			String key = details;
			if (staffName.containsKey(key)) {
				for (Map.Entry<String, String> entry : staffName.entrySet()) {
					if (key.equals(entry.getKey())) {
						System.out.println("\nChosen Doctor: " + entry.getKey());
						System.out.println("Dr. " + staffName.get(key));
						System.out.println("Specialization: " + staffPosition.get(key));
						System.out.println("Contact #: " + staffNumber.get(key));
						System.out.println("Schedule: " + staffSched.get(key));
						pInfo.setChosen("Dr. " + entry.getValue());
						System.out.println();
						pInfo.displaySched();
						billing.redirect();
					}
				}
			} else {
				System.err.println("Doctor cannot be found.");
			}
		}
	}

	public static void Ddisplay() {
		staffList.D_staffMap();
		staffName = new TreeMap<>(staffList.D_staffName);
		staffPosition = new TreeMap<>(staffList.D_staffPosition);
		staffNumber = new TreeMap<>(staffList.D_staffNumber);
		staffSched = new TreeMap<>(staffList.D_staffSched);
		for (Map.Entry<String, String> entry : staffName.entrySet()) {
			String key = entry.getKey().toString();
			System.out.println(entry.getKey());
			System.out.println("Dr. " + staffName.get(key));
			System.out.println("Specialization: " + staffPosition.get(key));
			System.out.println("Contact #: " + staffNumber.get(key));
			System.out.println("Schedule: " + staffSched.get(key));
			System.out.println();
		}
	}
}