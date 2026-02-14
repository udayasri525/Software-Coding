package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class example3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of the array ");
		int size=scan.nextInt();
		scan.nextLine();
		if(size>0 && size<=10)
		{
			String []arr=new String[size];
			for(int i=0;i<size;i++)
			{
				System.out.println("enter " + i+ "value");

				arr[i]=scan.nextLine();
				
			}
			System.out.println(Arrays.toString(arr));
		}
		else {
			System.out.println("invalid size ");
		}
		scan.close();
	}

}
