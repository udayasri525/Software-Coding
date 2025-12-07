package easy_level_problems;

public class strongNumber {
public int isfact(int num)
{
	int fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	return fact;
}
public boolean isstrong(int num)
{
	int sum=0;
	int temp=num;
	while(num!=0)
	{
		sum=sum+isfact(num%10);
		num=num/10;
	}
	return sum==temp;
}

	public static void main(String[] args) {
		strongNumber obj=new strongNumber ();
		for(int i=1;i<=1000;i++)
		{
		if(obj.isstrong(i))
		{
			System.out.println(i);
		}
		}
		
	}

}
