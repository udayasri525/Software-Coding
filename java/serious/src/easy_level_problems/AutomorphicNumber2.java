package easy_level_problems;

public class AutomorphicNumber2 {
public boolean isgetnum(int num)
{
	int count=0;
	int power=1;
	int num1=num;
	int temp=num*num;
	while(num1!=0)
	{
		count++;
		num1=num1/10;
	}
	for(int i=1;i<=count;i++)
	{
		power=power*10;
	}
	
	return num==temp%power;
}
	public static void main(String[] args) {
		AutomorphicNumber2 obj=new AutomorphicNumber2();
		for(int i=1;i<=100;i++)
		{
		if(obj.isgetnum(i)) {
			System.out.println(i);
		}
		}
		
	}

}
