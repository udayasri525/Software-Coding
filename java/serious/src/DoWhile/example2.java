package DoWhile;

public class example2 {
public static String getdata(int num)
{ int count=0;
	do
	{
		num=num/10;
		count++;
	}
	while(num!=0);
	return "no of digits in your number is : "+count;
}
	public static void main(String[] args) {
	System.out.println(getdata(75249));

	}

}
