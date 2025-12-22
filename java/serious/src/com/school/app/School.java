package com.school.app;

public class School {
private String name;
private String loaction;
public void nameset(String n)
{
	name=n;
	
}
public void loactionset(String loc)
{
	loaction=loc;
}
public String nameget()
{
	return name;
}
public String locationget()
{
	return loaction;
}
public void showSchoolInfo()
{
	System.out.println("school name:"+nameget());
	System.out.println("school location:"+ locationget());
}
}
