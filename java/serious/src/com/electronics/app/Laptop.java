package com.electronics.app;

public class Laptop {
private String model;
private double price;
public void modelset(String mod)
{
	model=mod;
}
public void priceset(double pri)
{
	price=pri;
}
public String modelget()
{
	return model;
}
public double priceget()
{
	return price;
}
public  void showLaptopDetails()
{
	System.out.println("--laptop deatils---");
	System.out.println("model:"+modelget());
	System.out.println("price:"+priceget());
}

}