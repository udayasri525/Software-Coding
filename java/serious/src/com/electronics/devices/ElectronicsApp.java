package com.electronics.devices;
import com.electronics.app.*;
import com.electronics.brands.*;
public class ElectronicsApp {

	public static void main(String[] args) {
	
  Laptop obj1=new Laptop();
  Manufacture obj2=new  Manufacture(); 
  obj1.modelset("dell 11gen i7");
	obj1.priceset(20000.0);
  obj1.showLaptopDetails();
  System.out.println("-------------------------");
  obj2.brandset("dell");
  obj2.countryset("india");
  obj2.showManufacturerDetails();
	}

}
