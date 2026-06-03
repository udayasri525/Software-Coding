package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Aarraylist {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your string here");
		String str=scan.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (!list.contains(ch)) {
				list.add(ch);
			}
		}
		System.out.println("Unique characters:");
		for (char c : list) {
			System.out.print(c + " ");
		}
	}

}
