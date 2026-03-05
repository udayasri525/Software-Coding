package Arrays;

import java.util.Scanner;

class Student{
	public int rollnumber;
	public String name;
	double []arr=new double [5];
	double sum=0;
	public Student(int rollnumber, String name, double[] arr) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.arr = arr;
		System.out.println("successfully profile updated");
	}
	public void calculateAverage()
	{
		
		for(int i=0;i<5;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("average marks of the student :"+ (sum/5));
		
	}
	public void displayDetails()
	{
		System.out.println("name :"+name);
		System.out.println("roll no:"+ rollnumber);
		System.out.println("average marks:"+(sum/5));
	}
}
public class example8 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter student name here:");
	String name=scan.nextLine();
	System.out.println("enter student roll no here:");
	int roll=scan.nextInt();
	System.err.println("enter 5 subject marks here:");
	double []arr=new double[5];
	for(int i=0;i<5;i++)
	{
		arr[i]=scan.nextDouble();
	}
	Student obj1=new Student(roll,name,arr);



Student obj2=new Student(roll,name,arr);



Student obj3=new Student(roll,name,arr);

Student [] arr1= {obj1,obj2,obj3};
for(Student st: arr1)
{
	st.displayDetails();
}
scan.close();
	}

}
