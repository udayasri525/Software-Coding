package easy_level_problems;

public class factorial {
public int facti(int num)
{ int fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	return fact;
}
	public static void main(String[] args) {
		System.out.println(new factorial().facti(3));

	}

}
