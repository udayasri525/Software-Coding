package com.packages;

import java.util.*;

class SubscriptionPlan{
	private String SubscriberName;
	private String PlanType;
	private double PlanCost=3000.0;
	private double PaidAmount=0.0;
	private String SubscriptionStatus="inactive";
	public SubscriptionPlan(String SubscriberName,String PlanType)
	{
		this.SubscriberName=SubscriberName;
		this.PlanType=PlanType;
	}
	public SubscriptionPlan(String SubscriberName,String PlanType,double  PlanCost,double PaidAmount, String SubscriptionStatus )
	{
		this.SubscriberName=SubscriberName;
		this.PlanType=PlanType;
		this.PlanCost=PlanCost;
		this.PaidAmount=PaidAmount;
		this.SubscriptionStatus=SubscriptionStatus;
	}
	public void updatepayment(double amount)
	{
		if(amount>0 && amount >=PlanCost)
		{
			PaidAmount=amount;
			System.out.println("payment updated");
		}
		else
		{
			System.out.println("please enter valid amount");
		}
	}
	public void updatedstatus(String newstatus)
	{
		if(newstatus==null || newstatus.equals(" "))
		{
			System.out.println("please enter valid status");
		}
		else
		{
			SubscriptionStatus=newstatus;
			System.out.println("status updated");
		}
	}
	public void ViewSummary()
	{
		System.out.println("Subscription Summary");
		System.out.println("Subscribe:"+SubscriberName);
		System.out.println("Plan Type:"+PlanType);
		System.out.println("Plan Cos:"+PlanCost);
		System.out.println("Paid Amount:"+PaidAmount);
		System.out.println("Subscription Status:"+SubscriptionStatus);
	}
	
}
public class SubscriptionPlanMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter here Subscriber Name");
		String SubscriberName=scan.next();
		System.out.println("please enter here plantype");
		String PlanType=scan.next();
		SubscriptionPlan obj=new SubscriptionPlan(SubscriberName,PlanType);
		int select=0;
		do {
			System.out.println("--- Menu ---\r\n"
					+ "1. Update Payment\r\n"
					+ "2. Change Status\r\n"
					+ "3. View Summary\r\n"
					+ "4. Exit\r\n"
					+ "\r\n"
					+ "");
			System.out.println("enter enter here above option only");
			select=scan.nextInt();
			switch(select)
			{
			case 1:
			{
				System.out.println("please enter your amount here");
				double amount=scan.nextDouble();
				obj.updatepayment(amount);
				scan.next();
				break;
			}
			case 2:
			{
				System.out.println("please enter your status here");
				String newstatus=scan.next();
				obj.updatedstatus(newstatus);
				break;
			}
			case 3:
			{
				obj.ViewSummary();
				break;
			}
			case 4:
			{
				System.out.println("thank you");
				break;
			}
			default :
			{
				System.out.println("enter enter only valid option");
				break;
			}
			}
			
		}while(select!=4);
		scan.close();

	}

}
