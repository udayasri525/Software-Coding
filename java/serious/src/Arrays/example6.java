package Arrays;

import java.util.Scanner;

public class example6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter here size of the array");
		int size =scan.nextInt();
		if(size>=0)
		{
		 int arr[]=new int[size];
		 System.out.println("enter "+ size +" elements");
		 int sum=0;
		 int evencount=0;
		 int oddcount=0;
		 for(int i=0;i<size;i++)
		 {
		
			 arr[i]=scan.nextInt();
			 sum=sum+arr[i];
			 if(arr[i]%2==0)
			 {
				 evencount++;
			 }
			 else
			 {
				 oddcount++;
			 }
			 
		 }
		 System.out.println("sum of array elements="+sum);
		 System.out.println("even count="+ evencount);
		 System.out.println("odd count="+ oddcount);
		 
		 System.out.println("Array in reverse order");
		 for(int i=size-1;i>=0;i--)
			{
				System.out.println(arr[i]);
			}
		 System.out.println("enter element to search:");
		 int search=scan.nextInt();
		 int index=0;
		 for(int i=0;i<size;i++)
		 {
			 if(arr[i]==search)
			 {
				index=i;
			 }
		 }
		 if(index!=0)
		 {
		 System.out.println("Element found at position:" + (index+1));
		 }
		 else
		{
			System.out.println("element not found ");
		}
		 
		 int []arr1=new int[size];
		 System.out.println("Elements copied to new array");
		 for(int i=0;i<size;i++)
		 {
			 arr1[i]=arr[i];
			 System.out.println(arr1[i]);
		 }
		}
		
		else 
		{
			System.out.println("invalid size ");
		}
		
		
		scan.close();

	}

}
