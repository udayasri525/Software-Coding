package conditional_statements;

public class temperature {
public String check_temp(int t)
{
	if(t>30)
	{
		return "hot";
	}
	else
	{
		return "cold";
	}
}
	public static void main(String[] args) {
	System.out.println(new temperature().check_temp(23));	

	}

}
