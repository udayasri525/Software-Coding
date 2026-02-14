package Arrays;

import java.util.Arrays;


public class example4 {
	public boolean isprime(int arr)
	{
		if(arr<=1)
		{
			return false;
		}
		else
		{
			for(int i=2;i*i<=arr;i++)
			{
				if(arr%i==0)
				{
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
		example4 obj=new example4();
		int arr[]=utilityIntArray.Aarry();
//		System.out.println(Arrays.toString(arr));
		for(int ele:arr)
		{
			if(obj.isprime(ele))
			{
				System.out.println(ele);
			}
				
		}

	}

}
