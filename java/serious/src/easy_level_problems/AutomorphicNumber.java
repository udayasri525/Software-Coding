package easy_level_problems;

public class AutomorphicNumber {
public boolean isgetnum(int num)
{
	int temp=num*num;
	
	return (temp%10)==num;   //for single digit 
}
	public static void main(String[] args) {
		AutomorphicNumber obj=new AutomorphicNumber();
		if(obj.isgetnum(5)) {
			System.out.println("Automorphic Number");
		}
		else
		{
			System.out.println("is not a Automorphic Number");
		}

	}

}
