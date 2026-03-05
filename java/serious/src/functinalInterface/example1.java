package functinalInterface;
import java.util.function.Predicate;
class employee implements Predicate<Integer>
{

private String empname;
private String empdesg;
private double empsalary;
public employee(String empname, String empdesg, double empsalary) {
	super();
	this.empname = empname;
	this.empdesg = empdesg;
	this.empsalary = empsalary;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpdesg() {
	return empdesg;
}
public void setEmpdesg(String empdesg) {
	this.empdesg = empdesg;
}
public double getEmpsalary() {
	return empsalary;
}
public void setEmpsalary(double empsalary) {
	this.empsalary = empsalary;
}
@Override
public boolean test(Integer sal) {
	if(sal>10000)
	{
		return true;
	}
	return false;
}
@Override
public String toString() {
	return "employee [empname=" + empname + ", empdesg=" + empdesg + ", empsalary=" + empsalary + "]";
}


	
}
public class example1 {

	public static void main(String[] args) {
		
Predicate<Integer> predicate=new employee("udayasri","backend engineer",40000.0);




	}

}
