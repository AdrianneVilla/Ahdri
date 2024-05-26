package doctors;

import java.util.Random;
import java.util.Scanner;

public class PatientDetails {

	public PatientDetails() {
		Scanner input = new Scanner(System.in);
       Patient patient = new Patient();
        
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        patient.setName(name);
        System.out.println("Enter Contact Num: ");
        String num = input.nextLine();
        patient.contactNumber(num);
        System.out.println("[1]Flu\t[2]Cough or Cold");
        String disease =input.next();
        patient.setDisease(disease);
        System.out.println("-----------Client Information------------");
        System.out.println("Name: " + name );
        System.out.println("Contact Num: " + num );
        System.out.println("Reason: " + disease);
        
         String Id = generateRandomAppointmentId();
          System.out.println("Appointment ID: " + Id );
          
          System.out.println();
        }
   
    
         private static String generateRandomAppointmentId() {
       
        int idLength = 8;

        String allowedCharacters = "0123456789";

        StringBuilder randomId = new StringBuilder(idLength);
        Random random = new Random();

        for (int i = 0; i < idLength; i++) {
            int randomIndex = random.nextInt(allowedCharacters.length());
            randomId.append(allowedCharacters.charAt(randomIndex));
        }
        return randomId.toString();         
    }
	}

