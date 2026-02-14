package ProblemSloving;

public class palindrome {
public boolean palin(String Str)
{
//	if(num>=9)
//	{
//		return true;
//	}
//	if(num<100&&num%11==0)
//	{
//		return true;
//	}
//	int temp=num;
//	int sum=0;
//	while(num!=0)
//	{
//		sum=sum*10+num%10;
//		num=num/10;
//	}
//	return sum==temp;
	
	String rev="";
	for(int i=Str.length()-1;i>=0;i--)
	{
		rev=rev+Str.charAt(i);
	}
	System.out.println(rev);
	return Str.equals(rev);
}
	public static void main(String[] args) {
		palindrome p=new palindrome();
		System.out.println(p.palin("mom")==true?"palindrome":"not a palindrome");
		

	}

}
