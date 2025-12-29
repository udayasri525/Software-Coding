package scanner;
import java.util.Scanner;
public class studentElc {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter student name :");
	String studentName=scan.next();
	System.out.println("enter student id :");
	int studentId=scan.nextInt();
	System.out.println("enter course name :");
	String courseName=scan.next();
	System.out.println("enter total marks :");
	double totalmarks=scan.nextDouble();
		studentBlc obj=new studentBlc(studentName,studentId,courseName,totalmarks);
		System.out.println("student records recreated successfully");
		int choice;
		do {
			System.out.println("1.Add more subject marks");
			System.out.println("2.calculate grade");
			System.out.println("3.view total marks");
			System.out.println("4.Exit");
		choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter addmarks here");
			double marks=scan.nextDouble();
			obj.addmarks(marks);
			System.out.println("total marks:"+ obj.getmarks());
			break;
		case 2:
			obj.calaculateGrade();
			break;
		case 3:
			System.out.println("yout total marks:"+ obj.getmarks());
			break;
		case 4:
			System.out.println("Thank you! Result processing completed");
			break;
	    default :
	    System.out.println("please enter valid number");
	    break;
			
		}
		
		}
		while(choice!=4);

	}

}
