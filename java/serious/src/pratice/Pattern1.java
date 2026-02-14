package pratice;

public class Pattern1 {
public void prat(int num)
{
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print("*");
		}
		System.out.println("*");
		System.out.println(" ");
	}
	
}
	public static void main(String[] args) {
		
		 Pattern1 n=new  Pattern1();
		n.prat(5);
	}

}
