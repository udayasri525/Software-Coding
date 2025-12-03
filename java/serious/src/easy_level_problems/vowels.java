package easy_level_problems;

public class vowels {
	public static String getstring(String str)
	{
		String reverse="";
		String vowels="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels=vowels + ch;
			}
		}
		for (int i = vowels.length() - 1; i >= 0; i--) {
            reverse = reverse + vowels.charAt(i);
        }
		return reverse;
	}

	public static void main(String[] args) {
		
System.out.println(getstring("helloworld"));
	}

}
