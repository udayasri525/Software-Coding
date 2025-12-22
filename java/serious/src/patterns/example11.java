package patterns;

public class example11 {
public static void triangle(int n)
{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int j=n-i;j>=1;j--)
		{
			System.out.print(n-j);
		}
		System.out.println();
	}
}
public static void triangle1(int n)
{
	for(int i=1;i<=n;i++)
	{
		for(int j=n-i;j>=1;j--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(n-j);
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		triangle(7);
		triangle1(7);
	}

}
