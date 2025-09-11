package assignmentOnEmployeeManagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {

	private List<Employee > employees= new ArrayList<>();
	private final String File_Name= "C:\\Users\\santo\\OneDrive\\Desktop\\GitProjectSept5\\TestAutomationByAK\\EmployeeFile_Ak";
	
	// Adding Employees
	public void addEmployee(Employee emp) {
		employees.add(emp);
		System.out.println(" Employee added Successfully");
	}
	
	// Display All Employees.
	public void displayEmployees() {
		if (employees.isEmpty()){
			System.out.println(" No Employees to Display");
		}else { 
			for (Employee em:employees) {
				System.out.println(em);
			}
		}
	}	

	// search Employee By ID.
	public void searchEmployeeById(int id) {
		for(Employee em:employees) {
			if (em.getId()==id) {
				System.out.println("Employee With Id= "+id +" is "+em);
				return;
			}
			
		}
		System.out.println(" Employee with Id= "+id+ "  not Found");
	}
	// Calculate Average Salary.
	public void averageSalary() {
		double total=0;
		for(Employee em:employees) {
			total+= em.getSalary();
		}
		System.out.println("The Average salary is :"+ total/employees.size());
	}
	// Save Employees to file.
	public void saveToFile() {
		try {
			ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(File_Name));
			oos.writeObject(employees);
			System.out.println("Employees Saved to file Successfully");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error Saving Employees : "+e.getMessage());
		}
	}
	// Load Employees from File.
	public void loadFromFile() {
		try {
			ObjectInputStream ois= new ObjectInputStream(new FileInputStream(File_Name));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error loading Employees : " +e.getMessage());
			e.printStackTrace();
		}
	}
}
 






















