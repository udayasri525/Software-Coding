package com.packages;
import java.util.*;
class SalesEmployee{
private String EmployeeName;
private  int EmployeeID;
public SalesEmployee(String EmployeeName,int EmployeeID)
{
	this.EmployeeName=EmployeeName;
	this.EmployeeID=EmployeeID;
}
public void getdata()
{
	System.out.println("employee name:"+EmployeeName);
	System.out.println("employee id:"+EmployeeID);
}

}
class PerformanceEmployee extends SalesEmployee {
private int ListofSales=0;
private double TotalSales=0;
private double AverageSales=0.0;
private String PerformanceGrade=null;
public PerformanceEmployee(String EmployeeName,int EmployeeID)
{
	super(EmployeeName,EmployeeID);
	System.out.println("profile created successfully");
}
public void addsales(double amount)
{
	if(amount>0)
	{
		TotalSales=TotalSales+amount;
		ListofSales++;
	}
	else {
		System.out.println("please enter valid amount");
	}
}
public void getPerformanceGrade()
{
	if(ListofSales==0)
	{
		System.out.println("No sales entries found!");
	}
	AverageSales=TotalSales/ListofSales;
	if(AverageSales>=50000)
	{
		PerformanceGrade="good";
		System.out.println("Performance Grade:"+PerformanceGrade);
	}
	else if(AverageSales<=50000 && AverageSales>=30000)
	{
		PerformanceGrade="average";
		System.out.println("Performance Grade:"+PerformanceGrade);
	}
	else
	{
		PerformanceGrade="not good ";
		System.out.println("Performance Grade:"+PerformanceGrade);
	}
	
}
public void PerformanceSummary()
{
	System.out.println("PerformanceSummary");
	getdata();
	System.out.println("ListofSales:"+ListofSales);
	System.out.println("Total sales :"+TotalSales);
	System.out.println("performance grade:"+PerformanceGrade);
}



}

 class SalesEmployeemain {
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Employee name:");
		String EmployeeName=scan.next();
		System.out.println("enter employee id");
		int EmployeeID=scan.nextInt();
		PerformanceEmployee obj=new PerformanceEmployee(EmployeeName,EmployeeID);
		int select=0;
		do {
			System.out.println("1.Add Sales Entry\r\n"
					+ "2.Recalculate Performance Result\r\n"
					+ "3.View Performance Summary\r\n"
					+ "4.Exit the program");
			System.out.println("please select one option from above menu");
			select=scan.nextInt();
			switch(select)
			{
			case 1:
			{
				System.out.println("please enter your sales amount");
				double amount=scan.nextDouble();
				obj.addsales(amount);
				System.out.println(" ");
				break;
			}
			case 2:
			{
				obj.getPerformanceGrade();
				System.out.println(" ");
				break;
			}
			case 3:
			{
				obj.PerformanceSummary();
				System.out.println(" ");
				break;
			}
			case 4:
			{
				System.out.println("thank you ");
				break;
			}
			default:
				System.out.println("please enter only valid option ");
				break;
			}
		}while(select!=4);
		scan.close();
	}
	
}
