package easy_level_problems;

public class compare {
    public static boolean  getdata(int num)
    {

    	int lastdigit=num%10;
    	num=num/10;
    	int first=num;
    	while(first>9)
    	{
    		first=first/10;
    	}
    	while(num >9)
    	{
    		int rem=num%10;
    		if((rem>=first)||(rem>=lastdigit))
    		{
    			 return false ;
    		}
    		num=num/10;
    	}
    	return true;
    }
	public static void main(String[] args) {
		System.out.println(new compare().getdata(84719));

	}

}
