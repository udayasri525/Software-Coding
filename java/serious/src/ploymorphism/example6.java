package ploymorphism;

class payment{
	Double amount;
	Integer transactionLimit;
public void	processPayment(Double paymentAmount)
	{
		System.out.println("payment not done ");
	}
}
class  CreditCardPayment extends payment
{
	@Override
	public void	processPayment(Double paymentAmount)
	{
		System.out.println(amount +" "+transactionLimit);
		if(paymentAmount >  transactionLimit )
		{
			System.out.println("invalid  CreditCardPayment ");
		}
		else {
			super.amount=super.amount-paymentAmount;
			System.out.println("creditcardpayment success");
		}
	}
}
class  DebitCardPayment extends payment
{
	@Override
	public void	processPayment(Double paymentAmount)
	{
		if( paymentAmount > amount )
		{
			System.out.println("invalid  DebitCardPayment ");
		}
		else {
			super.amount=super.amount-paymentAmount;
			System.out.println("DebitCardpayment success");
		}
	}
}
class UPIPayment extends payment 
{
	@Override
	public void	processPayment(Double paymentAmount)
	{
		if( paymentAmount > transactionLimit )
		{
			System.out.println("invalid  DebitCardPayment ");
		}
		else {
			super.amount=super.amount-paymentAmount;
			System.out.println("upipayment success");
		}
	}
}
public class example6 {

	public static void main(String[] args) {
 payment p=new CreditCardPayment();
 p.amount=100000.0;
 p.transactionLimit=10000;
 p.processPayment(1000.0);
 payment p1=new DebitCardPayment();
 p1.amount=100000.0;
 p1.transactionLimit=10000;
 p1.processPayment(1000.0);
 payment p2=new UPIPayment();
 p2.amount=100000.0;
 p2.transactionLimit=10000;
 p2.processPayment(1000.0);
	}

}
