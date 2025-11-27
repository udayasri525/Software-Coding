package while_loop;

public class Armstrong_number2 {
	//first take a number 
	// count how many digits in it;
	//take digit separatly and find count*digit and sum of all digits
	//compare original number sum 
	public static int countt(int n)
	{ int count=0;
		while(n!=0)
		{
			count++; 
			n=n/10;  
		}
		return count;
	}
	public static int power(int exp,int base)
	{
		int power=1;
		for(int i=1;i<=exp;i++)
		{
			power=power*base;
		}
		return power;
	}
	public static void armstrong(int num)
	{
		int count=countt(num);
		int temp=num;
		int sum=0;
	  while(num!=0)
	  {
		int  rem=num%10;
		  sum=sum+power(count,rem);
		  num=num/10;
	  }
	  if(temp==sum) {
		  System.out.println(sum);
	  }
	}
	   public static void main(String [] args)
	   {
		   for(int i=1;i<=1000;i++)
		   {
		   armstrong(i);
		   }
	   }
}