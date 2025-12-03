package easy_level_problems;

public class sumof {

	public static boolean sum(int num)
	{
		int lastdigit=num%10;
		int first=num;
		while(first>9)
		{
		first=first/10;	
		}

	 int sum=0;
		while(num!=0)
		{
		sum=sum+num%10;
		num=num/10;
		}
		int middle=sum-(first+lastdigit);
		return  (lastdigit+first) == middle;
	}
	
	public static void main(String[] args) {
	System.out.println((sum(75547)?"equal":"not equal"));
	
	}
	
}
