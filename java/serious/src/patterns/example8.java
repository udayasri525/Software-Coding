package patterns;

public class example8 {
public static void triangle(int n)
{
	for(int i=1;i<=n;i++)
	{  
		for(int j=1;j<i;j++)
		{
			System.out.print((j)+" ");
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
			System.out.print((j)+" ");
		}
		System.out.println();
	}
	
}

	public static void main(String[] args) {
		
triangle(8);
triangle1(7);
System.out.println("========================");
triangle1(8);
System.out.println("1");
triangle(8);

	}

}
