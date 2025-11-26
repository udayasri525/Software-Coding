package conditional_statements;


//4. Largest of Three Numbers:
public class largest {

	public String lar_small(int a, int b,int c)
	{
		if(a>b&&a>c)
		{
			return a+"is big ";
		}
		else
		{
			if (b>c&&b>a)
			{
				return b+" is big";
			}
			else
			{
				return c+" is big";
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(new largest().lar_small(20,30,11));
	}

}
