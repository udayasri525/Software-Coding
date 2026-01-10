package com.packages;
import java.util.*;
class staff{
	private String StaffName;
	private int StaffID;
	private String BaseShift;
	public  staff(String StaffName,int StaffID,String BaseShift)
	{
		this.StaffName=StaffName;
		this.StaffID=StaffID;
		this.BaseShift=BaseShift;
	}
	public void getdata()
	{
		System.out.println("name:"+StaffName);
		System.out.println("id:"+StaffID);
		System.out.println("BaseShift:"+BaseShift);
	}
}
class  DepartmentStaff extends staff{
	private String DepartmentName="not entered";
	private String ResponsibilityLevel="not entered ";
	public  DepartmentStaff(String StaffName,int StaffID,String BaseShift)
	{
		super(StaffName,StaffID,BaseShift);
		System.out.println("profile created");
	}
	public void updatedResponsibilityLevel(String level)
	{
		if(level==null || level.equals(""))
		{
			System.out.println("please enter valid data");
		}
		else
		{
			ResponsibilityLevel=level;
		}
	}
	public void updateDepartmentName(String newDepartmentName)
	{
		if(newDepartmentName==null || newDepartmentName.equals(""))
		{
			System.out.println("please enter valid data");
		}
		else
		{
			DepartmentName=newDepartmentName;
		}
	}
	public void ProfileDetails()
	{
		System.out.println("Staff Details");
		getdata();
		System.out.println("DepartmentName:"+DepartmentName);
		System.out.println("Responsibility:"+ResponsibilityLevel);
		
	}
}
public class HotelStaff {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter staffname:");
		String StaffName=scan.next();
		System.out.println("please enter staffid:");
		int StaffID=scan.nextInt();
		System.out.println("please enter  BaseShift :");
		String  BaseShift=scan.next();
		DepartmentStaff obj=new DepartmentStaff(StaffName,StaffID,BaseShift);
		int select=0;
		do {
			System.out.println("--- Menu ---\r\n"
					+ "1. Update Responsibility\r\n"
					+ "2. Update Department\r\n"
					+ "3. View Profile\r\n"
					+ "4. Exit\r\n"
					+ "");
			System.out.println("please selected from above option only");
			select=scan.nextInt();
			switch(select)
			{
			case 1:
			{
				System.out.println("please enterd here updated responsibility level");
				String level=scan.next();
				obj.updatedResponsibilityLevel(level);
				break;
			}
			case 2:
			{
				System.out.println("please enterd here updated department name");
				String newDepartmentName =scan.next();
				obj.updatedResponsibilityLevel(newDepartmentName);
				break;
			}
			case 3:
			{
				obj.ProfileDetails();
				break;
			}
			case 4:
			{
				System.out.println("thank you");
				break;
			}
			default :
			{
				System.out.println("please enter only valid option");
				break;
			}
			}
		}while(select!=4);
			scan.close();

	}

}
