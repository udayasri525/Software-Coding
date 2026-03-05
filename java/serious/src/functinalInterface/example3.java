package functinalInterface;

interface NumberChecker{
	boolean checknumber(int num);
}
interface charChecker{
	void checkchar(char c);
}
class prime{
	public static boolean isprime(int number)
	{
		if(number<=1)
		{
			return false;
		}
		for(int i=2;i*i<=number;i++)
		{
			if(number%i==0)
			{
				return true;
			}
		}
		return false;
	}
}
public class example3 {

	public static void main(String[] args) {
		
		NumberChecker nu=new NumberChecker()
				{
			public boolean checknumber(int num)
			{
				if(prime.isprime(num))

				{
					System.out.println(num +" is a prime number");
				}
				else
				{
					System.out.println(num + "is not a prime number");
				}
				return prime.isprime(num);
			}
				};
				nu.checknumber(7);
				
				charChecker check=new charChecker()
						{
				public void checkchar(char c)
				{
					int ascii=(int) c;
					if(prime.isprime(ascii))

					{
						System.out.println(ascii +" is a prime number");
					}
					else
					{
						System.out.println(ascii + "is not a prime number");
					}
		
				}
						};
						  check.checkchar('A');
	}

}
