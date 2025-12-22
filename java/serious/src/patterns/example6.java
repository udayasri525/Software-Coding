package patterns;

public class example6 {
public static void triangle(int n)
{
	for(int i=1;i<=n;i++)
	{  
		for(int j=1;j<i;j++)
		{
			System.out.print((i-j)+" ");
		}
		System.out.println();
	}
}
public static void triangle1(int n)
{
	for(int i=n;i>=1;i--)
	{  
		for(int j=1;j<i;j++)
		{
			System.out.print((i-j)+" ");
		}
		System.out.println();
	}
	
}

	public static void main(String[] args) {
		
triangle(8);
System.out.println("================================");
triangle1(8);
	}

}
