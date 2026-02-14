package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public interface utilityIntArray {
  public static int[] Aarry(){
	  System.out.println("enter array size here:");
	 Scanner scan=new Scanner(System.in);
	  int size=scan.nextInt();
	  if(size>0)
	  {
		  
				int []arr=new int[size];
				for(int i=0;i<size;i++)
				{
					System.out.println("enter " + i+ "value");

					arr[i]=scan.nextInt();
					
				}
//				System.out.println(Arrays.toString(arr));
				scan.close();
		  return arr;
		  
	  }
			else {
				System.out.println("invalid size ");
				return null;
			}
			
			
			
	  
  }
}
