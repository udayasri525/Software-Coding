package Strings_problems;

public class example6 {
public static void ps(String st)
{
	char []arr=st.toCharArray();
	String s=" ";
	for(int i=0;i<arr.length;i++)
	{
		int count=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
			}
		}
		s = s + arr[i] + count;
	}
	System.out.println(s);
}
	public static void main(String[] args) {
		ps("udayaaa");
	}

}
