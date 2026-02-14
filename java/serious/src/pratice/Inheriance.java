package pratice;

import java.util.Scanner;

class Bank{
	private long  AccountNumber;
	private double Balance;
	public Bank(long AccountNumber,double Balance)
	{
		this.AccountNumber=AccountNumber;
		this.Balance=Balance;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public String  deposit(double amount)
	{
		if(amount>0)
		{
			Balance=Balance+amount;
			System.out.println("your amount is successfully deposited");
		}
		else {
			System.out.println("failed to deposit");
		}
		return "total balance amount :"+Balance;
	}
	
}
class SavingsAccount extends Bank{
	private double interestRate;

	public SavingsAccount(long AccountNumber, double Balance, int interestRate) {
		super(AccountNumber, Balance);
		this.interestRate = interestRate;
		System.out.println("account created successfullly");
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double calculateInterest(int time)
	{
		return (getBalance()*interestRate*time)/100;
	}
	
	
}
public class Inheriance {

	public static void main(String[] args) {
		Bank b=new SavingsAccount(778045687 ,100000.0 ,2);
		SavingsAccount s=(SavingsAccount) b;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your deposit amount ");
		System.out.println(s.deposit(scan.nextDouble()));
		System.out.println("enter how many  years here");
	System.out.println(s.calculateInterest(scan.nextInt()));
		scan.close();

	}

}
