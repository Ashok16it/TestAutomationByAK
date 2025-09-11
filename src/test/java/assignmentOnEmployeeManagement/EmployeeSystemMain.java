package assignmentOnEmployeeManagement;

import java.util.Scanner;

public class EmployeeSystemMain {

	public static void main(String[] args) {
		EmployeeManagement em= new EmployeeManagement();
		em.loadFromFile();// Load saved data.
		Scanner sc= new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n ===Employee Management System ===== ");
			System.out.println("1. Add Employee  ");
			System.out.println("2. Display All Employee ");
			System.out.println("3. Search Employee by ID:  ");
			System.out.println("4. Average Salary  ");
			System.out.println("5. Save & Exit ");
			System.out.println(" Enter Your Choice ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				
				System.out.println("Enter Id");
				int id=sc.nextInt();
				sc.nextLine();// Consume newLine
				
				System.out.println("Enter Name ");
				String name=sc.nextLine();
				
				System.out.println("Enter Department");
				String department= sc.nextLine();
				
				System.out.println("Enter Salary");
				double salary=sc.nextDouble();
				
				Employee emp= new Employee(id,name,department,salary);
				em.addEmployee(emp);
				break;
			case 2:
				em.displayEmployees();
				break;
			case 3:
				System.out.println("Please Enter Id");
				int searchId= sc.nextInt();
				em.searchEmployeeById(searchId);
				break;
			case 4:
				em.averageSalary();
				break;
			case 5:
				em.saveToFile();
				System.out.println("Exiting System");
				break;
			default :
				System.out.println("Invalid Choice! Try again...");
			}	
		}while(choice!=5);
		sc.close();
	}
	
}
