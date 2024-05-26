package doctorSchedule;
import java.util.Scanner;
import java.util.Random;

public class Doctors {

   
    public static void Doctors(){
    	DoctorSchedule docSched = new DoctorSchedule();
      Scanner input = new Scanner(System.in);
       
        
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        System.out.println("Enter Contact Num: ");
        String num = input.nextLine();
        
        System.out.println("-----------Client Information------------");
        System.out.println("Name: " + name );
        System.out.println("Contact Num: " + num );
       
        
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
