package patterns;

public class example2 {
public static void exam(int n)
{ 
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1||j==n||i==1||i==n)
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
	System.out.println();
}
	public static void main(String[] args) {
	exam(3);	
	}

}
