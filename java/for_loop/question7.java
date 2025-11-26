package for_loop;

public class question7 {
public void printdata()
{
	System.out.print("even numbers:"); // method 2
for(int i=0;i<=200;i++)
{
	
	if(i%2==0)
	{
		System.out.print(i+" ");	
	}
}
	System.out.println(" ");
System.out.print("odd numbers");
for(int i=0;i<=200;i++)
{
	if(i%2!=0)
	{
	System.out.print(i+" ");
	}
}
	
}
	public static void main(String[] args) {
		question7 obj=new question7();
		obj.printdata();
	}

}
