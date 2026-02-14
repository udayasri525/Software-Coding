package ProblemSloving;

public class Armstrong {
	public int power(int num,int count)
	{
		int pow=1;
		for(int i=1;i<=count;i++)
		{
			pow=pow*num;
		}
		return pow;
	}
public int count(int num)
{
	int cont=0;
	while(num!=0)
	{
		num=num/10;
		cont++;
	}
	return cont;
}
public Boolean Arm(int num)
{
	int sum=0;
	int temp=num;
	int count=count(num);
	while(num!=0)
	{
	sum=sum+power(num%10,count);
	num=num/10;
	}
	return temp==sum;
}
	public static void main(String[] args) {
		
		Armstrong n=new Armstrong();
		System.out.println(n. Arm(153)==true?"armstrong number":" not a armstrong number");
	}

}
