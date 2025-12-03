package DoWhile;

public class example3 {
public static boolean getdata(int num)
{ 
	int sum=0;
	int temp=num;
	do
	{
		sum=sum*10+num%10;
		num=num/10;
	}
	while(num!=0);
	return sum==temp;
}
	public static void main(String[] args) {
		System.out.println((getdata(125)?"palindrom":"not palindrom"));

	}

}
