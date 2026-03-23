package Strings_problems;

public class example5 {
public  static boolean  ps(String st)
{
	char []arr=st.toCharArray();
	char ch=' ';
	int count;
	boolean uniq=false;
	for(int i=0;i<arr.length;i++)
	{
	count=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
			}
		}
		if(count>1)
		{
			uniq=true;
			break;
		}
	}
		
	return uniq;	
	

}
	public static void main(String[] args) {
		System.out.println(ps("uday")?"no  unique characters":" unique characters");
	}

}
