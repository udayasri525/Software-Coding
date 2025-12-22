package com.school.management;

public class principal {

	private String prinicipalName;
	private int experience;
	
	
	public void setPrinicipalName(String Name) {
		prinicipalName=Name;
	}
		public String getPrinicipalName() {
			return prinicipalName;
		}
		
	
	public void setExperience(int exp) {
		 experience=exp;
	}
	public int getExperience() {
		return experience;
	}
public void showPrincipalInfo() 
{
	System.out.println("prinicipal name:"+getPrinicipalName());
	System.out.println("principal experience:"+getExperience());
}
}
