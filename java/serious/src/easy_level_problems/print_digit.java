package easy_level_problems;

public class print_digit {
  
	public int sumdigit(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("sum of u entered number is: "+new print_digit().sumdigit(101));

	}

}
