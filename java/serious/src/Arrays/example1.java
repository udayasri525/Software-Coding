package Arrays;

import java.util.Scanner;

public class example1 {
 
	public static void main(String[] args) {
//		int [] arr=new int[3];
//		int value=10;
//		for(int i=0;i<=2;i++)
//		{
//			arr[i]=value ;
//			value=value+10;
//			System.out.println(arr[i]);
//		}
 
//	2)	Create a String array of size 4. Add the names "John", "Alice", "Bob", and
//		"Emma". Print all the elements using a 
//		foreach loop.	
		
//		Scanner scan=new Scanner(System.in);
//		String [] arr1=new String[4];
//		System.out.println("Enter 3 values ");
//		for(int i=0;i<arr1.length;i++)
//		{
//			arr1[i]=scan.nextLine();
//		}
//		 System.out.println("Array values are:");
//	        for(int i = 0; i < arr1.length; i++) {
//	            System.out.println(arr1[i]);
//	        }
//	        scan.close();
	
		
//		3) Create a double array of size 3. Add the values 10.5, 20.75, and 30.25. Print
//all the elements using a 
//for loop.
		Scanner scan=new Scanner(System.in);
	double sum=0;
	double []arr2=new double[3];
	
	for(int i=0;i<arr2.length;i++)
	{
		arr2[i]=scan.nextDouble();
		System.out.println(arr2[i]);
		sum=sum+arr2[i];
	}
	System.out.println("sum of array:" + sum );
	scan.close();
	}


}
