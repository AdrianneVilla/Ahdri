package performanceTask;

class Exam {
	
	//1. Create a constructor named Exam that assigns "Good luck" to a previously declared String variable named message.
	public Exam() {
		String message = "Good luck";
	}
	//2. Create an empty overloaded constructor for the Exam class with two (2) String parameters named period and level.
	public Exam(String period, String level) {
		
	}
	//3. Declare a double-type accessor named getPrice that returns the value of price.
	public double getPrice(double price) {
		return price;
	}
	//4. Declare a boolean-type accessor named isFinished that returns the value of status.
	public boolean isFinished(boolean status) {
		return status;
	}
	
	//5. Declare a class named Midterm that inherits from the class named Exam.
	//6. Create three (3) class declarations to show multiple levels of inheritance. Use the classes named Exam, Midterm, and Quiz.
	class Midterm extends Exam{
		//7. Create a constructor named Midterm that prints "Exam has started." using println(). Its first statement should be a call to a constructor in the parent class.
		public Midterm() {
			super();
			System.out.println("Exam has started.");
		}
	}
	class Quiz extends Exam{
		
	}
	//8. Given the base class named Quiz and the derived class named Essay, write a statement to show inheritance between these classes.
	class Essay extends Quiz{
		
	}
	public static void main (String []args) {
		
	}
	
	
	
}




