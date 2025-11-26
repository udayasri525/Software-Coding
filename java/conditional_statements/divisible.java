package conditional_statements;

//6. Number Divisibility Check:
public class divisible {
public String divi(int num)
{
	if((num%5==0)&&(num%11==0))
	{
		return num+" is divisible by both 5 and 11";
	}
	else
	{
		return num+" is not divisible by both 5 and 11";
	}
}
	public static void main(String[] args) {
		System.out.println(new divisible().divi(12));
	}

}
