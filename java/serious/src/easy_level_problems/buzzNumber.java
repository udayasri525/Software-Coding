package easy_level_problems;

public class buzzNumber {
public static boolean isgetnum(int num)
{ 
	int last=num;
	while(last>9)
	{
		last=last/10;
	}
	if(last%7==0)
	{
		return true;
	}
	else if(num%7==0)
	{
		return true;
	}
	else
	return false;
}
	public static void main(String[] args) {
		if(isgetnum(14))
		{
			System.out.println("buzz number");
		}
		else
		{
			System.out.println("not a buzz number");
		}
	}

}
