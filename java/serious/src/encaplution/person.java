package encaplution;

public class person {
	public person()
	{
		System.out.println("person object created");
	}

	public static void main(String[] args) {
		Student student=new Student();
		

	}

}
class Student extends person{
	public Student()
	{
		System.out.println("student object created");
	}
}
