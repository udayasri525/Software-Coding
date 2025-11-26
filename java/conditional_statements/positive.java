package conditional_statements;


//2. Positive, Negative,:
public class positive {
	public String ispositive(int num)
	{
		if(num>0)
		{
			return num+" is positive number ";
		}
		else
		{
			if(num<0)
			{
				return num+" is negative number";
			}
			else
			{
				return num+" is zero";
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(new positive().ispositive(2));

	}

}
