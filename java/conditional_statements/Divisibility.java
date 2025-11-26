package conditional_statements;

public class Divisibility {
public String check_data(int num)
{
	if(num%5==0 && num%3==0)
	{
		return "divisible by both 5 and 3";
	}
	else if(num%5==0)
	{
		return "divisible by 5";
	}
	else if(num%3==0)
	{
		return "divisible by 3";
	}
	else
	{
		return "not divisible by either 3 and 5";
	}
}
	public static void main(String[] args) {
	System.out.println(new Divisibility().check_data(47));

	}

}
