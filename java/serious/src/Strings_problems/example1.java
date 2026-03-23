package Strings_problems;

public class example1 {
public static boolean ps(String st)
{
	String st2=st.substring((st.length())/2,st.length());
	String st1=st.substring(0,(st.length()/2));
	int count1=0;
	int count2=0;
	for(int i=0;i<st1.length();i++)
	{
		if(st1.charAt(i)=='a'||st1.charAt(i)=='e'||st1.charAt(i)=='i'||st1.charAt(i)=='o'||st1.charAt(i)=='u')
		{
			count1++;
		}
	}
	for(int i=0;i<st2.length();i++)
	{
		if(st2.charAt(i)=='a'||st2.charAt(i)=='e'||st2.charAt(i)=='i'||st2.charAt(i)=='o'||st2.charAt(i)=='u')
		{
			count2++;
		}
	}
	return count1==count2;
	
}
	public static void main(String[] args) {
		
System.out.println(ps("mars")?"true":"flase");
	}

}
