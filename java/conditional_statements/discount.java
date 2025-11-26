package conditional_statements;

public class discount {
public String bill_amount(double bill)
{
	if(bill>=500)
	{
		return (100/10)*bill+" is your discount";
	}
	else
	{
		return "no discount";
	}
}
	public static void main(String[] args) {
		System.out.println(new discount().bill_amount(600));
	}

}
