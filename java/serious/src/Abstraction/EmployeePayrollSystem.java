package Abstraction;
abstract class Employee{
	public String  empName;
	public String empid;

	public Employee(String empName, String empid) {
		super();
		this.empName = empName;
		this.empid = empid;
	}
	abstract void calculateSalary();
	public void applyLeave()
	{
		System.out.println("Leave applied successfully.");
	}
	public void getDetails()
	{
		System.out.println("Employee Details:");
	}
}
class FullTimeEmployee extends  Employee{

public int basePay; 
public int benefits;
public FullTimeEmployee(String empName, String empid, int basePay, int benefits) {
	super(empName, empid);
	this.basePay = basePay;
	this.benefits = benefits;
}
@Override
void calculateSalary() {
	System.out.println("Calculating salary: Base pay + benefits ="+(basePay+benefits));
}
@Override
public void getDetails() {
	System.out.println("Employee Details:"+empName+empid);
}

}
class PartTimeEmployee extends Employee{

public int hourlyRate; 
public int hoursWorked;
public PartTimeEmployee(String empName, String empid, int hourlyRate, int hoursWorked) {
	super(empName, empid);
	this.hourlyRate = hourlyRate;
	this.hoursWorked = hoursWorked;
}
@Override
void calculateSalary() {
	System.out.println("Calculating salary: Hours worked × rate ="+(hourlyRate+hoursWorked));
}
public void getDetails()
{
	System.out.println("Employee Details:"+empName+" "+empid);
}
}
class Freelancer extends Employee{
	public int projectPayment;

	public Freelancer(String empName, String empid, int projectPayment) {
		super(empName, empid);
		this.projectPayment = projectPayment;
	}

	@Override
	void calculateSalary() {
		System.out.println("Calculating salary: Project payment = "+"$"+projectPayment);
		
	}
	public void getDetails() {
		System.out.println("Employee Details:"+empName+" "+empid);
	}
	
}
public class EmployeePayrollSystem {

	public static void main(String[] args) {
		Employee em;
		em=new FullTimeEmployee("John Doe", "12345", 50000, 10000);
	em.calculateSalary();
	em.applyLeave();
	em.getDetails();
	em=new PartTimeEmployee("Jane Smith", "67890", 20, 15);
	em.calculateSalary();
	em.applyLeave();
	em.getDetails();
em =new Freelancer("Alice Johnson", "54321", 5000);
em.calculateSalary();
em.applyLeave();
em.getDetails();
	}

	public EmployeePayrollSystem() {
		super();
	}

}
