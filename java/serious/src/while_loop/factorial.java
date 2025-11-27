package while_loop;

public class factorial {
 public static int fact(int num)
 {
	 int fact=1;
	 for(int i=1;i<=num;i++)
	 {                                          // by using int here we print up to factorial of 12 numbers 
		                                               // after we can't it goes to overflow and prints 0
		 fact= fact*i;
		
	 }
return fact;
 }
	public static void main(String[] args) {
	for(int i=1;i<=12;i++)
	{
	System.out.println("factorial of"+i+": "+fact(i));
	}

	}
}
