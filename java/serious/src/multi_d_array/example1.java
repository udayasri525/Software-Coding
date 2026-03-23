package multi_d_array;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter how many rows here");
		int rows=scan.nextInt();
		System.out.println("enter how many cols here");
		int cols=scan.nextInt();
		int add=0;
		
		int [][]arr=new int[rows][cols];
         for(int i=0;i<arr.length;i++)
         {
        	 for(int j=0;j<arr[i].length;j++)
        	 {
        		 System.out.println("arr["+i+"]["+j+"]");
        		 arr[i][j]=scan.nextInt();
        		 add=add+arr[i][j];
        	 }
        		
         }
         System.out.println(add);
         int [][]tarns=new int[cols][rows];
         for(int i=0;i<arr.length;i++)
         {
        	 for(int j=0;j<arr[i].length;j++)
        	 {
        		 tarns[j][i]=arr[i][j];
        	 }
         }
         for(int i=0;i<tarns.length;i++)
         {
        	 for(int j=0;j<tarns.length;j++)
        	 {
        		 System.out.print(tarns[i][j] +" ");
        	 }
        	 System.out.println(" ");
         }
         int large=arr[0][0];
         for(int i=0;i<arr.length;i++)
         {
        	 for(int j=0;j<arr[i].length;j++)
        	 {
        		if(large<arr[i][j])
        		{
        			large=arr[i][j];
        		}
        	 }
        		
         }
         System.out.println("largest:"+large);
	}
	

}
