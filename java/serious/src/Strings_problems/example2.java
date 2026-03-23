package Strings_problems;

public class example2 {
public static void ps1(String st)
{
	
	for(int i=0;i<st.length();i++)
	{
		for(int j=i+1;j<=st.length();j++)
		{
			System.out.println(st.substring(i, j));
		}
		System.out.println("---------------");
	}
	

}
	public static void main(String[] args) {
	ps1("ABCD");

	}

}
