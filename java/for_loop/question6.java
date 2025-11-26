package for_loop;

public class question6 {
public void printdata()
{                            //method 1
	String evennumbers=" ";
	String oddnumbers=" ";
for(int i=0;i<=200;i++)
{
	if(i%2==0)
	{
	evennumbers=evennumbers+i+" ";
	}
}
for(int i=0;i<=200;i++)
{
	if(i%2!=0)
	{
	oddnumbers=oddnumbers+i+" ";
	}
}
	System.out.println("even numbers:-"+evennumbers);
	System.out.println("odd numbers:-"+oddnumbers);
}
	public static void main(String[] args) {
		question6 obj=new question6();
		obj.printdata();
	}

}
