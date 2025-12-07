package easy_level_problems;

public class spyNumber {
 public static boolean getsum(int num)
 {
	 int sum=0;
	 int product=1;
	 while(num!=0)
	 {
		  int rem=num%10;
		  sum=sum+rem;
		  product=product*rem;
		  num=num/10;
		 
	 }
	 return product==sum;
 }
	public static void main(String[] args) {
		if(getsum(1124))
		{
			System.out.println("Spynumber");
			}
		else
		{
			System.out.println("not a spy number");
		}

	}

}
