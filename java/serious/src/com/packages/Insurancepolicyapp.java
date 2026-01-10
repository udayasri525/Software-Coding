package com.packages;
import java.util.*;
 class Insurancepolicy
{
	private String CustomerName;
	private String PolicyType;
	private Double PolicyAmount;
	private Double ApprovedAmount;
	private String PolicyStatus;
//constructor-1
public Insurancepolicy(String CustomerName,String PolicyType,Double PolicyAmount)
{
	this.CustomerName=CustomerName;
	this.PolicyType=PolicyType;
	if(PolicyAmount>0)
	{
		this.PolicyAmount=PolicyAmount;
	}
	else {
		
		System.out.println("please enter valid amount");
		this.PolicyAmount=0.0;
	}
	this.ApprovedAmount=0.0;
	this.PolicyStatus="pending";
	System.out.println("Policy Profile Created");
}
//constructor-2
public Insurancepolicy(String CustomerName, String PolicyType,Double PolicyAmount, Double ApprovedAmount,String PolicyStatus)
{
	this.CustomerName=CustomerName;
	this.PolicyType=PolicyType;
	if(PolicyAmount>0)
	{
	this.PolicyAmount=PolicyAmount;
	}
	else
	{
		System.out.println("please enter valid amount here:");
		this.PolicyAmount=0.0;
	}
	if(ApprovedAmount>0 && ApprovedAmount<=PolicyAmount)
	{
		this.ApprovedAmount=ApprovedAmount;
	}
	else {
		System.out.println("please enter valid amount here:");
		this.ApprovedAmount=0.0;
	}
	this.PolicyStatus=PolicyStatus;
	System.out.println("Policy Profile Created");
}
	public void UpdateApprovedAmount(double amount)
	{
		if(amount>0 && amount<=PolicyAmount)
		{
			this.ApprovedAmount=amount;
			System.out.println("approved amount updated");
		}
		else
		{
			System.out.println("please enter valid amount");
		}
			
	}
	public void ChangePolicyStatus(String newstatus)
	{
		if(newstatus==null && newstatus.equals(""))
		{
			System.out.println("please enter valid data");
		}
		else {
			this.PolicyStatus=newstatus;
			System.out.println("policy status updated");
		}
	}
	public void ViewPolicySummary()
	{
		System.out.println("policy summer");
		System.out.println("customer:"+this.CustomerName);
		System.out.println("policy type:"+this.PolicyType);
		System.out.println("policy amount:"+this.PolicyAmount);
		System.out.println("approved amount:"+this.ApprovedAmount);
		System.out.println("policy status:"+this.PolicyStatus);
	}

}
 


public class Insurancepolicyapp 
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter customer name here");
		String CustomerName=scan.next();
		System.out.println("enter your policy type here");
		String PolicyType=scan.next();
		System.out.println("PolicyAmount here");
		double PolicyAmount=scan.nextDouble();
//		scan.next();
		Insurancepolicy obj=new Insurancepolicy(CustomerName,PolicyType,PolicyAmount);
		int select=0;
		do {
			System.out.println("1.Update Approved Amount\r\n"
					+ "2.Change Policy Status\r\n"
					+ "3.View Policy Summary\r\n"
					+ "4.Exit the program");
			System.out.println("please  select one of the above option");
		  select=scan.nextInt();
		  switch(select)
		  {
		  case 1:
		  {
			  System.out.println("please enter updated  approvement amount here ");
			  double amount=scan.nextDouble();
			  obj.UpdateApprovedAmount(amount);
			  break;
		  }
		  case 2:
		  {
			  System.out.println("please enter updated  policy status here ");
			  String newstatus=scan.next();
			  obj.ChangePolicyStatus(newstatus);
			  break;
		  }
		  case 3:
		  {
			  obj.ViewPolicySummary();
			  break;
		  }
		  case 4:
		  {
			  System.out.println("thank you!");
			  break;
		  }
		  default :
			  System.out.println("please enter only above option only");

		  }
		}while(select!=4);
		scan.close();
	}
}