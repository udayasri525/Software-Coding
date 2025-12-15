package easy_level_problems;

public class EMIRPnum {

	public static boolean getprime(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static int getrev(int num)
	{
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}
	public static boolean getemirp(int num)
	{
		if(getprime(num)!=true)
		{
			return false; 
		}
		int rev=getrev(num);
		if(rev==num)
			return false;
		return getprime(rev);
	}
	public static void main(String[] args) {
		System.out.println(getemirp(16)?"emirp number":"not a emirp number");
	}

}
