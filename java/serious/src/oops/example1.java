package oops;
abstract class Employee{
	private String employeeId;
	private String name;
	public Employee(String employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public String getName() {
		return name;
	}

abstract double calculateSalary();
abstract void displayDetails();
protected void printBasicInfo()
{
	  System.out.println("Employee Details:");
      System.out.println("ID: " + employeeId);
      System.out.println("Name: " + name);
}
	
}
class FacultyMember extends Employee{
	private int departmentCode;
	private int yearsOfService;
	public FacultyMember(String employeeId, String name, int departmentCode, int yearsOfService) {
		super(employeeId, name);
		this.departmentCode = departmentCode;
		this.yearsOfService = yearsOfService;
	}
	public int getDepartmentCode() {
		return departmentCode;
	}
	
	public int getYearsOfService() {
		return yearsOfService;
	}
	public double calculateSalary()
	{
		return (yearsOfService*1000)+50000;
	}
	public void displayDetails()
	{
//		System.out.println("Employee details ");
//		System.out.println("employee id:-" + getEmployeeId());
//		System.out.println("employee name:-" + getName());
		System.out.println("Departmentcode :-" +  getDepartmentCode());
		System.out.println("Years of service :-"+ getYearsOfService());
		System.out.println("salary:-" + calculateSalary());
	}
}
class StaffMember extends Employee{
	 private String designation;
	private double overtimeHours;
	public StaffMember(String employeeId, String name, String designation, double overtimeHours) {
		super(employeeId, name);
		this.designation = designation;
		this.overtimeHours = overtimeHours;
	}
	public String getDesignation() {
		return designation;
	}
	
	public double getOvertimeHours() {
		return overtimeHours;
	}
	
	public double  calculateSalary()
	{
		return (25*overtimeHours)+40000;
	}
	public void displayDetails() {
//		System.out.println("Employee details ");
//		System.out.println("employee id :-"+getEmployeeId());
//		System.out.println("employee name :-"+getName());
		System.out.println("employee Designation:-"+getDesignation());
		System.out.println("employee over time hours :-"+getOvertimeHours());
		System.out.println("salary:-"+ calculateSalary());
	}
}
public class example1 {

	public static void main(String[] args) {
		Employee n;
		n=new FacultyMember("F001" ,"John Smith",101,5);
		n.printBasicInfo();
 n.displayDetails();
 System.out.println("");
 n=new StaffMember("S001","Jane Doe","Administrator",20.0);
 n.printBasicInfo();
 n.displayDetails();
	}

}
