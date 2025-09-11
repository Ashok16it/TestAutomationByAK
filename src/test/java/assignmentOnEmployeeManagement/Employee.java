// ProblemStatement:  Create a console-based Employee Management System that allows:
//1) Adding New Employees (ID,Name,Department,Salary). 2)Displaying All Employees. 3)Searching an Employee by ID
//4) Calculating average salary of all employees. 5) saving employee data to a file and reading from it

package assignmentOnEmployeeManagement;

public class Employee {

	private int id;
	private String name;
	private String department;
	private double salary;
	
	public Employee(int id, String name, String deptt, double salary) {
		this.id=id;
		this.name=name;
		this.department=deptt;
		this.salary=salary;
	}
	// Getters
	public int getId() {return id;}
	public String getName() { return name;}
	public String getDepartment() { return department;}
	public double getSalary() { return salary;}
	
	@Override 
	public String toString() {
		return " Employee[ ID= "+id +", Name= "+name +" , Department= "+department + " , Salary= "+salary+ "]";
	}
}
