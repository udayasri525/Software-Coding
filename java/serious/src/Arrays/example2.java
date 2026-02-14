package Arrays;

import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
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
