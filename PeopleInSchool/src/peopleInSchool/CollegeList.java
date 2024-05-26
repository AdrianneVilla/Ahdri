package peopleInSchool;

import java.util.*;

public class CollegeList {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Press E for Employee, F for Faculty, or S for Student: ");

		String choices = scn.next().toUpperCase();

		switch (choices) {
		case "E":
			Employee employee = new Employee();
			System.out.println("Type employee's name, contact number, salary, and department.");
			scn.nextLine();
			System.out.print("Enter name: ");
			employee.setName(scn.nextLine());

			System.out.print("Enter number: ");
			employee.setContactNum(scn.nextLine());

			System.out.print("Enter salary: ");
			employee.setSalary(scn.nextDouble());

			System.out.print("Enter department: ");
			employee.setDepartment(scn.next());

			System.out.println("--------------------------------------");

			System.out.println("Name: " + employee.getName());
			System.out.println("Contact Number: " + employee.getContactNum());
			System.out.println("Salary: " + employee.getSalary());
			System.out.println("Department: " + employee.getDepartment());

			break;

		case "F":

			Faculty faculty = new Faculty();
			System.out.println("Press Y if Regular/Tenured or N if not.");
			String status = scn.next();

			System.out.println("Type Faculty member's name, contact number, salary, and department.");
			scn.nextLine();
			System.out.print("Enter name: ");
			faculty.setName(scn.nextLine());

			System.out.print("Enter number: ");
			faculty.setContactNum(scn.nextLine());

			System.out.print("Enter salary: ");
			faculty.setSalary(scn.nextDouble());

			System.out.print("Enter department: ");
			faculty.setDepartment(scn.next());

			if (status.equalsIgnoreCase("Y")) {
				faculty.setStatus(true);
			} else {
				faculty.setStatus(false);
			}

			System.out.println("--------------------------------------");

			System.out.println("Name: " + faculty.getName());
			System.out.println("Contact Number: " + faculty.getContactNum());
			System.out.println("Salary: " + faculty.getSalary());
			System.out.println("Department: " + faculty.getDepartment());

			if (faculty.isRegular()) {
				System.out.println("Status: Regular");
			} else {
				System.out.println("Status: Not Regular");
			}
			break;

		case "S":
			Student student = new Student();
			System.out.println("Type employee's name, contact number, salary, and department.");
			scn.nextLine();
			System.out.print("Enter name: ");
			student.setName(scn.nextLine());

			System.out.print("Enter number: ");
			student.setContactNum(scn.nextLine());

			System.out.print("Enter program (e.g. BSIT, BSTM): ");
			student.setProgram(scn.next());

			System.out.print("Enter year level (1-4): ");
			student.setYearLevel(scn.nextInt());

			System.out.println("--------------------------------------");

			System.out.println("Name: " + student.getName());
			System.out.println("Contact Number: " + student.getContactNum());
			System.out.println("Program: " + student.getProgram());
			System.out.println("Year Level: " + student.getYearLevel());

			break;
		}

	}

}
