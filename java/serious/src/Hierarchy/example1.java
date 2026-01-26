package Hierarchy;

class Vehicle{
	String make;
	String model;
	int  year;
	public Vehicle(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void displayInfo()
	{
//		System.out.println("make:" + this.make);
//		System.out.println("model:"+this.model);
//		System.out.println("model:" + this.year);
	}
}
class Car extends Vehicle{
	int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	public void displayCarInfo()
	{
		System.out.println(this.make +" "+ this.model +" "+ this.year);
		System.out.println("Number of doors:" +this.numberOfDoors);
	}
}
class Truck extends Vehicle{
	int cargoCapacity;

	public Truck(String make, String model, int year, int cargoCapacity) {
		super(make, model, year);
		this.cargoCapacity = cargoCapacity;
	}
	public void displaytruckInfo()
	{
		System.out.println(this.make +" "+ this.model +" "+ this.year);
		System.out.println("Number of doors:" +this.cargoCapacity);
	}
}
class Motorcycle extends Vehicle{
	boolean hasSidecar;

	public Motorcycle(String make, String model, int year, boolean hasSidecar) {
		super(make, model, year);
		this.hasSidecar = hasSidecar;
	}
	public void displaytmorcycleInfo()
	{
		System.out.println(this.make +" "+ this.model +" "+ this.year);
		System.out.println("Number of doors:" +this.hasSidecar);
	}
}
public class example1 {

	public static void main(String[] args) {
		Vehicle car = new Car("Toyota", "Corolla", 2022, 4);
		car.displayInfo(); // Calls the method from the base class
		((Car) car).displayCarInfo();
		System.out.println("----------------------------");
		Vehicle truck = new Truck("Ford", "F-150", 2021, 1000);
		truck.displayInfo(); // Calls the method from the base class
		((Truck) truck).displaytruckInfo();
		System.out.println("----------------------------");
		Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street Glide", 2023, true);
		motorcycle.displayInfo(); // Calls the method from the base class
		((Motorcycle) motorcycle).displaytmorcycleInfo(); //
	}

}
