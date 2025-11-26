package conditional_statements;


//5. Check Eligibility to Vote
public class eligible {
public String vote_check(int age)
{
	if(age>=18)
	{
		return "u are eligible to vote";
	}
	else
	{
		return "u are not eligible to vote";
	}
}
	public static void main(String[] args) {
		
System.out.println(new eligible().vote_check(20));	}

}
