package for_loop;

public class question4 {
public void printdata()
{
	int i=1;
	for(;i<=20;i++)
	{
		if(i%2!=0)
		System.out.print(" "+i);
	}
	
}
	public static void main(String[] args) {
		question4 obj=new question4();
		obj.printdata();
	}

}
