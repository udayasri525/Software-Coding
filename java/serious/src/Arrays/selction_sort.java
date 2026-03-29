package Arrays;

import java.util.Arrays;

public class selction_sort {

	public static void main(String[] args) {
		int []arr= {0,-2,2};
		for(int i=0;i<arr.length;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
		boolean status=false;
		for(int i=0;i<arr.length;i++)
		{
			int square=arr[i]*2;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==square && i!=j)
				{
					status=true;
					break;
				}
			}
		}
		System.out.println(status?"yesssssss":"noooop");
		

	}

}
