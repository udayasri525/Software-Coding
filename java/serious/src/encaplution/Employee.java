package encaplution;

public class Employee {
 public int salary=50000;
	public static void main(String[] args) {
		Manager man=new Manager();
				System.out.println("total salary:"+(man.salary+man.bonous));
	}

}
class Manager extends Employee{
	public int bonous=2000;
}
