package scanner;

public class studentBlc {
private String studentName;
private int studentId;
private String courseName;
private double totalmarks;
public studentBlc(String studentName,int studentId,String courseName,double totalmarks)
{
	this.studentName=studentName;
	this.studentId=studentId;
	this.courseName=courseName;
	this.totalmarks=totalmarks;
}
public double getmarks()
{
	return totalmarks;
}
public void addmarks(double marks)
{
	if(marks<=0)
	{
		System.out.println("invalid marks entered");
	}
	else if(marks>0) {
	totalmarks=totalmarks+marks;
	System.out.println("successfully marks updated");
	}
}
public void calaculateGrade()
{
	if(totalmarks>=90)
	{
		System.out.println("Grade A");
	}
	else if(totalmarks>=80 && totalmarks<=89)
	{
		System.out.println("Grade B");
	}
	else if(totalmarks>=70 && totalmarks<=79)
	{
		System.out.println("Grade C");
	}
	else if(totalmarks>=60 && totalmarks<=69)
	{
		System.out.println("Grade D");
	}
	else if(totalmarks<=60)
	{
		System.out.println("fail");
	}
	else if(totalmarks<=0)
	{
		System.out.println("No marks available to calculate grade");
	}
	
}

}
