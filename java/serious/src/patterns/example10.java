package patterns;

public class example10 {
public static void triangle(int n)
{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print((i-j+1));
		}
		System.out.println();
	}
}
public static void triangle1(int n)
{
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print((i-j+1));
		}
		System.out.println();
	}
}


	public static void main(String[] args) {
		triangle(8);
		triangle1(8);

	}

}
