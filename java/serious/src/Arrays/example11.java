package Arrays;

import java.util.Arrays;

class course{
	String courseName;
	int []marks=new int[4];
	public course(String courseName, int[] marks) {
		super();
		this.courseName = courseName;
		this.marks = marks;
	}
	public int average()
	{
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		System.out.println("average marks of "+ courseName);
		return sum/marks.length;
	}
	public String display() {
		return "course [courseName=" + courseName + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	
}
class Student1{
	int rollno;
	String name;
	course obj1=new course("maths",new int [] {90,98,95,93});
	course obj2=new course("physics",new int [] {98,98,80,88});
	course obj3=new course("social",new int [] {77,88,75,53});
	course []arr={obj1,obj2,obj3};
public void displayStudentPerformance()
{
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i].display());
	}
}
public void getOverallAverage()
{
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i].average());
	}
}
}
public class example11 {

	public static void main(String[] args) {
		Student1 obj=new Student1();
		obj.displayStudentPerformance();
		obj.getOverallAverage();

	}

}
