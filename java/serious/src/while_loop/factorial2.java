package while_loop;

public class factorial2 {
 public static long fact(int num)
 {
	 long fact=1;
	 for(int i=1;i<=num;i++)
	 {                                          // by using long  here we print up to factorial of 20 numbers 
		                                               // after we can't it goes to overflow and prints 0
		 fact= fact*i;
		
	 }
return fact;
 }
	public static void main(String[] args) {
	for(int i=1;i<=20;i++)
	{
	System.out.println("factorial of"+i+": "+fact(i));
	}

	}
}
