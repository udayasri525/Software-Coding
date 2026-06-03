package Arrays;

public class example15 {

	public static void main(String[] args) {
		String s="aaabbaac";
		boolean []visted=new boolean[s.length()];
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			if(visted[i]==true)
			{
				continue;
			}
			for(int j=0;j<s.length();j++)
			{
			if(s.charAt(i)==s.charAt(j))
			{
				count++;
				visted[j]=true;
			}
			}
			System.out.println(s.charAt(i) +"="+ count);
		}
	}

}
