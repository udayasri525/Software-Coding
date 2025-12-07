package easy_level_problems;

public class sunnyNumber {
	public boolean isgetnumber(int num)
	{
		
		 int temp=num+1;
		 int perfect=0;
		 for(int i=1;i*i<=temp;i++)
		 {
			 if(i*i==temp)
			 {
				 perfect=i;
				 break;
			 }
		 }
			 
	return temp==(perfect*perfect);	 
	}

	public static void main(String[] args) {
		sunnyNumber obj=new sunnyNumber();
		for(int i=1;i<=100;i++)
		{
		if(obj.isgetnumber(i))
		{
			System.out.println(i);
		}
	}
	}

}
