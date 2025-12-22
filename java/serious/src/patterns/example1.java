package patterns;

public class example1 {
public static void sqaure(int n)
{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)    //rows
		{
			if(i==1||j==1||i==n||j==n) //column
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		sqaure(5);

	}

}
