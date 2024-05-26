
import java.util.*;

public class Patient extends DoctorSchedule {
	Scanner scn = new Scanner(System.in);

	public void Patient() {
		int pInput = 0;
		while (true) {
			pickingPatient(pInput);
			categories(pInput);
		}
	}

	public void pickingPatient(int pInput) {
		System.out.println(
				"============================================================================================================================================================================================================================================");
		System.out.println("\r\n"
				+ "\t \t \t \t \t \t \t ██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ██████╗  █████╗ ████████╗██╗███████╗███╗   ██╗████████╗██╗\r\n"
				+ "\t \t \t \t \t \t \t ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ██╔══██╗██╔══██╗╚══██╔══╝██║██╔════╝████╗  ██║╚══██╔══╝██║\r\n"
				+ "\t \t \t \t \t \t \t ██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗      ██████╔╝███████║   ██║   ██║█████╗  ██╔██╗ ██║   ██║   ██║\r\n"
				+ "\t \t \t \t \t \t \t ██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝      ██╔═══╝ ██╔══██║   ██║   ██║██╔══╝  ██║╚██╗██║   ██║   ╚═╝\r\n"
				+ "\t \t \t \t \t \t \t ╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗    ██║     ██║  ██║   ██║   ██║███████╗██║ ╚████║   ██║   ██╗\r\n"
				+ "\t \t \t \t \t \t \t  ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝    ╚═╝     ╚═╝  ╚═╝   ╚═╝   ╚═╝╚══════╝╚═╝  ╚═══╝   ╚═╝   ╚═╝\r\n"
				+ "");
		System.out.println(
				"============================================================================================================================================================================================================================================");
		System.out.println("" + "\t \t \t \t \t \t \t \t \t \t \t \t [1] Patients' Appointment\n"
				+ "\t \t \t \t \t \t \t \t \t \t \t \t [2] Admission\n"
				+ "\t \t \t \t \t \t \t \t \t \t \t \t [3] Billing\n" + "\t \t \t \t \t \t \t \t \t \t \t \t [0] Back");
		System.out.println(
				"============================================================================================================================================================================================================================================");
		pInput = scn.nextInt();
		categories(pInput);
	}

	public void categories(int pInput) {
		switch (pInput) {
		case 1:
			System.out.println(
					"============================================================================================================================================================================================================================================");
			System.out.println("\r\n"
					+ "\t \t \t \t \t \t  ██████╗  █████╗ ████████╗██╗███████╗███╗   ██╗████████╗███████╗     █████╗ ██████╗ ██████╗  ██████╗ ██╗███╗   ██╗████████╗███╗   ███╗███████╗███╗   ██╗████████╗\r\n"
					+ "\t \t \t \t \t \t  ██╔══██╗██╔══██╗╚══██╔══╝██║██╔════╝████╗  ██║╚══██╔══╝██╔════╝    ██╔══██╗██╔══██╗██╔══██╗██╔═══██╗██║████╗  ██║╚══██╔══╝████╗ ████║██╔════╝████╗  ██║╚══██╔══╝\r\n"
					+ "\t \t \t \t \t \t  ██████╔╝███████║   ██║   ██║█████╗  ██╔██╗ ██║   ██║   ███████╗    ███████║██████╔╝██████╔╝██║   ██║██║██╔██╗ ██║   ██║   ██╔████╔██║█████╗  ██╔██╗ ██║   ██║   \r\n"
					+ "\t \t \t \t \t \t  ██╔═══╝ ██╔══██║   ██║   ██║██╔══╝  ██║╚██╗██║   ██║   ╚════██║    ██╔══██║██╔═══╝ ██╔═══╝ ██║   ██║██║██║╚██╗██║   ██║   ██║╚██╔╝██║██╔══╝  ██║╚██╗██║   ██║   \r\n"
					+ "\t \t \t \t \t \t  ██║     ██║  ██║   ██║   ██║███████╗██║ ╚████║   ██║   ███████║    ██║  ██║██║     ██║     ╚██████╔╝██║██║ ╚████║   ██║   ██║ ╚═╝ ██║███████╗██║ ╚████║   ██║   \r\n"
					+ "\t \t \t \t \t \t  ╚═╝     ╚═╝  ╚═╝   ╚═╝   ╚═╝╚══════╝╚═╝  ╚═══╝   ╚═╝   ╚══════╝    ╚═╝  ╚═╝╚═╝     ╚═╝      ╚═════╝ ╚═╝╚═╝  ╚═══╝   ╚═╝   ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝   ╚═╝   \r\n"
					+ "");
			System.out.println(
					"============================================================================================================================================================================================================================================");
			
			doctorSchedule();

			break;
		case 2:
			Admission admission = new Admission();
			admission.admit();
			break;
		case 3:
			System.out.println(
					"============================================================================================================================================================================================================================================");
			System.out.println("\r\n"
					+ "\t \t \t \t \t \t \t \t \t \t \t     ██████╗ ██╗██╗     ██╗     ██╗███╗   ██╗ ██████╗ \r\n"
					+ "\t \t \t \t \t \t \t \t \t \t \t     ██╔══██╗██║██║     ██║     ██║████╗  ██║██╔════╝ \r\n"
					+ "\t \t \t \t \t \t \t \t \t \t \t     ██████╔╝██║██║     ██║     ██║██╔██╗ ██║██║  ███╗\r\n"
					+ "\t \t \t \t \t \t \t \t \t \t \t     ██╔══██╗██║██║     ██║     ██║██║╚██╗██║██║   ██║\r\n"
					+ "\t \t \t \t \t \t \t \t \t \t \t     ██████╔╝██║███████╗███████╗██║██║ ╚████║╚██████╔╝\r\n"
					+ "\t \t \t \t \t \t \t \t \t \t \t     ╚═════╝ ╚═╝╚══════╝╚══════╝╚═╝╚═╝  ╚═══╝ ╚═════╝ \r\n"
					+ "                                                 ");
			System.out.println(
					"============================================================================================================================================================================================================================================");
			Billing bill = new Billing();
			bill.displayBillingInfo();
			break;
		case 0:
			Main main = new Main();
			main.pickingMain(pInput, scn);
		}
		// pickingPatient(pInput);
	}
}