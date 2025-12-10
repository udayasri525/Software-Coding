package easy_level_problems;

public class happynumber {
public static int getpower(int base)
{ int power=1;
	for(int i=1;i<=2;i++)
	{                           
		power=power*base;
	}
	return power;
}
public static void gethappy(int num)
{ int sum=0;
	while(num!=0)
	{
		sum=sum+getpower(num%10);
		num=num/10;
	}
	if(sum==1)
	{
		System.out.println("happy number");
	}
	  else if(sum == 4) {
          System.out.println("Not a Happy Number");
      }
      else {
          gethappy(sum);
      }
	
}
	public static void main(String[] args) {
		gethappy(20);

	}

}
