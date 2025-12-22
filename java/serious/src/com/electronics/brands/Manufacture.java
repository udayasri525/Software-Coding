package com.electronics.brands;

public class Manufacture {
private String brandName;
private String country;
public void brandset(String brand)
{
	brandName=brand;
}
public void countryset(String coun)
{
	country=coun;
}
public String brandget()
{
	return brandName;
}
public String countryget()
{
	return country;
}
public void showManufacturerDetails()
{
	System.out.println("--manufacturerDetails--");
	System.out.println("brandName:"+brandget());
	System.out.println("country:"+countryget());
}
	

	

}
