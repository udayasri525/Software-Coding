package conditional_statements;
  

//1. Check Even or Odd:
public class even {

	public String iseven(int a)//instance method
	{
		if (a%2==0)
		{
			return a+" is even number";
		}
		else 
		{
			return a+" is odd number";
		}
	}
	
	public static void main(String[] args) {
		
even obj=new even();
System.out.println(obj.iseven(10));
	}

}
