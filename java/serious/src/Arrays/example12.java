package Arrays;

public class example12 {

	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{0,5,6},{0,0,9}};
		int [][]arr1= {{1,0,0},{4,5,0},{7,8,9}};
		int [][]mul= new int[arr.length][arr[0].length];
		boolean status=true;
		boolean status1=true;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i>j)
				{
					if(arr[i][j]!=0)
					{
						status=false;
						break;
					}
				}
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				if(i<j)
				{
					if(arr1[i][j]!=0)
					{
						status1=false;
						break;
					}
				}
			}
		}
		System.out.println(status?" it is a upper triangle":"it is not a upper triangle");
		System.out.println(status1?" it is a lower triangle":"it is not a lower triangle");
		System.out.println("mutliplication ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				mul[i][j]=arr[i][j]*arr1[i][j];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(mul[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
