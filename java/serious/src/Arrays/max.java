package Arrays;

import java.util.Arrays;

public class max {

	public static void main(String[] args) {
		int maxm;
		int mini;
		int []arr=new int[] {3,9,2,5,6};
		int []arr1=new int[] {1,2,2,3,3,3};
		maxm=arr[0];
		mini=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>maxm)
			{
				maxm=arr[i];
			}
			if(arr[i]<mini)
			{
				mini=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("maximum:"+maxm);
		System.out.println("minimum:"+mini);
		for(int i=0;i<arr1.length;i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(arr1[i]==arr1[j])
				{
					count++;
				}
			}
			System.out.println(arr1[i]+" occurs "+count+" times");
		}
	}

}
