package Arrays;

import java.util.Scanner;

public class example7 {

	public static void main(String[] args) {

		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 5 numbers:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		int large = arr[0];
		int second=arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > large) {
				second=large;
				large = arr[i];
			}
		}
		

		System.out.println("Largest element: " + large);
		System.out.println("second Largest element: " + second);
		scan.close();
	}
}
