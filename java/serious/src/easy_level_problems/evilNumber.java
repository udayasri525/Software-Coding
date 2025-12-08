package easy_level_problems;

public class evilNumber {
public static boolean getbinary(int num)
{ int temp=0;
String binary="";
int count=0;
	while(num>0)
	{
		int rem=num%2;
		binary=rem+binary;
		 num=num/2;
	
	}
	for(int i=0;i<binary.length();i++)
	{
		char ch=binary.charAt(i);
		if(ch=='1')
		{
			count++;
		}
	}
	return (count%2==0);
}
	public static void main(String[] args) {
		
  if(getbinary(15))
{
	  System.out.println("evil number");
		  }
  else
  {
	  System.out.println("Odious number");
  }
	}

}
