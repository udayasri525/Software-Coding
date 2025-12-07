package easy_level_problems;

public class DISARIUMNUMBER {
public int ispower(int count, int num)
{ int power=1;
	for(int i=1;i<=count;i++)
	{
	  power=power*num;
	}
	return power;
}
public boolean isgetnum(int num)
{
	int sum=0;
	int temp=num;
	int length=0;
	int num1=num;
	while(num1!=0)
	{
		length++;
		num1=num1/10;
	}
	while(num!=0)
	{
		sum=sum+ispower(length,num%10);
		length--;
		num=num/10;
		
	}
	return temp==sum;
}
	public static void main(String[] args) {
		
		DISARIUMNUMBER obj=new DISARIUMNUMBER();
		if(obj.isgetnum(135))
		{
			System.out.println("DISARIUM NUMBER");
		}
		else
		{
			System.out.println("not a DISARIUM NUMBER");
		}
	}

}
