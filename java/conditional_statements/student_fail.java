package conditional_statements;

public class student_fail {
public String student(int marks)
{
	if(marks>=35)
	{
		return "pass";
	}
	else
	{
		return "fail";
	}
}
	public static void main(String[] args) {
		
System.out.println(new student_fail().student(45));
	}

}
