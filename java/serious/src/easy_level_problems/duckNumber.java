package easy_level_problems;

public class duckNumber {
public boolean isgetnum(int num)
{
	int temp=num;
	while(temp>=10)
	{
		temp=temp/10;
	}
	if(temp==0)
		return false;
	while(num!=0)
	{
		if(num%10==0)
		{
			return true;
		}
		num=num/10;
	}
	return false;
}
	public static void main(String[] args) {
		 duckNumber obj=new  duckNumber();
				 if(obj.isgetnum(023))
				 {
					 System.out.println("duck number");
				 }
				 else
				 {
					 System.out.println("not a duck number");
				 }

	}

}
