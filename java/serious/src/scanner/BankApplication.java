package scanner;

public class BankApplication {
private String customerName;
private String customerAddress;
private long phonenumber;
private double balance;
public BankApplication(String customerName,String customerAddress, long phonenumber,double balance)
{
	this.customerName=customerName;
	this.customerAddress=customerAddress;
	this.phonenumber=phonenumber;
	this.balance=balance;
}
public void deposit(double amount)
{
	if(amount<=0)
	{
		System.out.println("unabile to deposit");
	}
   else if(amount>0)
	{
		balance=balance+amount;
		System.out.println("deposit success, available balance:"+balance);
	}
}
public void withdraw(double amount)
{
	if(amount>balance)
	{
		System.out.println("unvailble to withdraw");
	}
	else if(amount<=balance)
	{
		balance=balance-amount;
		System.out.println("withdraw success,avilable balance:"+balance);
	}
}
public void showbalance()
{
	System.out.println("available balance:"+ balance);
}

}
