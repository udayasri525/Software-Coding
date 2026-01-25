package com.bank.console;
import java.util.Scanner;
import com.bank.customers.CustomerAccount;
public class consloe {
	   public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("enter your name here:");
		String customerName=scan.next();
		System.out.println("enter phone number here");
		long phoneNumber=scan.nextLong();
		System.out.println("enter your account type here");
		String accountType=scan.next();
		CustomerAccount obj=new CustomerAccount(customerName,phoneNumber,accountType);
		boolean allow=true;
		   while (allow) {
	            System.out.println("\n1.Update Address 2.Update Phone 3.KYC 4.Deposit 5.Withdraw 6.View 7.Exit");
	            int ch = scan.nextInt();
	            scan.nextLine();

	            switch (ch) {
	            case 1:
	            {
	            	 System.out.print("Address: ");
	                    obj. setAddress(scan.nextLine());
	                    break;
	            }
	            case 2:
	            {
	            	  System.out.print("Phone: ");
	                    obj.setPhoneNumber(scan.nextLong());
	                    break;

	            }
	            case 3:
	            {
	            	 obj.activateKYC("AADHAR");
	                    break;
	            }
	            case 4:
	            {
	            	   System.out.print("Amount: ");
	                    obj.deposit(scan.nextDouble());
	                    break;
	            }
	            case 5:
	            {
	            	  System.out.print("Amount: ");
	                    obj.withdraw(scan.nextDouble());
	                    break;
	            }
	            case 6:
	            {
	            	  obj.viewAccountSummary();
	                    break;
	            }
	            case 7:
	            {
	            	allow=false;
	            	System.out.println("thnak you!");
	            }
	   }
		   }
	   }
}
