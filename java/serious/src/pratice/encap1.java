package pratice;

import java.util.Scanner;

class bank{
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String  deposit(double amount)
	{
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("your amount is successfully deposited");
		}
		else {
			System.out.println("failed to deposit");
		}
		return "total balance amount :"+balance;
	}
	public String  withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance=balance-amount;
			System.out.println("your amount is successfully withdraw");
		}
		else {
			System.out.println("failed to withdraw");
		}
		return "total balance amount :"+balance;
	}
	
}
public class encap1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		bank b=new bank();
		b.setBalance(100000.0);
		System.out.println("enter your amount to deposit:");
		System.out.println(b.deposit(scan.nextDouble()));
		System.out.println("enter your amount to withdraw:");
		System.out.println(b.withdraw(scan.nextDouble()));
		scan.close();
	}

}
