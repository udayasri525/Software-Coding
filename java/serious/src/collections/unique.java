package collections;

import java.util.Scanner;

public class unique {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = scan.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean isUnique = true;

		
			for (int j = 0; j < i; j++) {
				if (ch == str.charAt(j)) {
					isUnique = false;
					break;
				}
			}

			if (isUnique) {
				System.out.print(ch + " ");
			}
		}
	}
}