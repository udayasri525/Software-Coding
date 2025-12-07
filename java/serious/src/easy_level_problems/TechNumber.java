package easy_level_problems;

public class TechNumber {
public static boolean getsum(int num)
{ int right=0;
int left=0;
int power=1;
int sum=0;

	int count=0;
	int temp=num;
	while(num!=0)
	{
		count++;
		num=num/10;
	}
	for(int i=1;i<=count/2;i++)
	{
		power=power*10;
	}
	if(count%2==0)
	{
		right=temp%power;
		left=temp/power;
		sum=left+right;
	}
	return (sum*sum)==temp;
}
	public static void main(String[] args) {
		if(getsum(3025)) {
System.out.println("tech number");
		}
		else
		{
			System.out.println("not a tech number");
		}
	}

}
