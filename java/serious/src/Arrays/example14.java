package Arrays;

public class example14 {

	public static void main(String[] args) {
		int []array= {1,2,3,2,1,1};
		int maxcount=0;
		int ele=0;
		for(int i=0;i<array.length;i++)
		{
			int count=0;
			for(int j=0;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					count++;
				}
			}
			if(count>maxcount)
			{
				maxcount=count;
				ele=array[i];
			}
		}
		System.out.println(ele +" " +maxcount);
	}

}
