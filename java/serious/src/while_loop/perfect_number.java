package while_loop;

public class perfect_number {
	public static boolean getdata(int num)
	{ int sum=0;
		int i=1;
		while(i<num)
		{
		if(num%i==0)
		{
			sum=sum+i;
		}
		i++;
		}
		return num==sum;
	}

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
	if(getdata(i))
	{
		System.out.println(i);
	}
	}
	}

}
