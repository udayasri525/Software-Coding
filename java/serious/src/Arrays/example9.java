package Arrays;

import java.util.Arrays;

class Employeecon{
	int empid;
	String empname;
	double salary[]=new double[12];
	public Employeecon(int empid, String empname, double[] salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	public double calculateAnnualsal()
	{
		double total=0;
		for(int i=0;i<salary.length;i++)
		{
			total=total+salary[i];
		}
		return total;
	}
	public String EmployeeDetails() {
		return "Employeecon [empid=" + empid + ", empname=" + empname + ", salary=" + Arrays.toString(salary) + "]";
	}
	
}
public class example9 {
	public static void main(String [] args)
	{
Employeecon obj1=new Employeecon(101,"udaya",new double[] {1000.0,2000.0,3000.0,4000.0,5000.0});
Employeecon obj2=new Employeecon(103,"sri",new double[] {10000.0,20000.0,30000.0,40000.0,50000.0});
Employeecon [] arr= {obj1,obj2};
for(Employeecon ele:arr)
{
	System.out.println(ele.EmployeeDetails());
}
}
}
