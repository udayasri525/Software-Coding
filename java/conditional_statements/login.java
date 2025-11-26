package conditional_statements;

public class login {
	public String login_access(String a)
	{
		if(a=="admin")
		{
			return "access granted";
		}
		else
		{
			return "not access granted";
		}
	}

	public static void main(String[] args) {
		
System.out.println(new login().login_access("admin"));
	}

}
