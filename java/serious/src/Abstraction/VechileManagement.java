package Abstraction;
abstract class Vechile{
	public String modelName;
	public String VehicleNumber;
	public String Company;
	
	public Vechile(String modelName, String vehicleNumber, String company) {
		super();
		this.modelName = modelName;
		VehicleNumber = vehicleNumber;
		Company = company;
	}
	abstract void startEngine();
	public void fuelType(){
		System.out.println("petrol");
	}
}
class car extends Vechile{
	public int  numberOfDoors;
	public boolean hasSunroof;
	public car(String modelName, String vehicleNumber, String company, int numberOfDoors, boolean hasSunroof) {
		super(modelName, vehicleNumber, company);
		this.numberOfDoors = numberOfDoors;
		this.hasSunroof = hasSunroof;
	}
	@Override
	void startEngine() {
	System.out.println("Starting engine with key ignition");
		
	}
	@Override
	public void fuelType(){
		System.out.println("petrol");
	}
	
}

class Bike extends Vechile{
	public boolean hasSidecar;

	public Bike(String modelName, String vehicleNumber, String company, boolean hasSidecar) {
		super(modelName, vehicleNumber, company);
		this.hasSidecar = hasSidecar;
	}

	@Override
	void startEngine() {
		System.out.println("Starting engine with kick-start.");
		
	}
	@Override
	public void fuelType(){
		System.out.println("Petrol");
	}
	
}

class Truck extends Vechile{
	public long cargoCapacity;

	public Truck(String modelName, String vehicleNumber, String company, long cargoCapacity) {
		super(modelName, vehicleNumber, company);
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	void startEngine() {
		System.out.println("Starting engine with heavy-load warm-up.");
		
	}
	@Override
	public void fuelType()
	{
		System.out.println("Diesel");
	}
	
}
public class VechileManagement {

	public static void main(String[] args) {
		Vechile ve;
		ve=new car("Toyota Camry", "ABC1234", "Toyota", 4, true);
ve.startEngine();
ve.fuelType();
ve= new Bike("Yamaha R1","xyz789", "Yamaha", false);
ve.startEngine();
ve.fuelType();
ve= new Truck("Volvo FH", "DEF456", "Volvo", 20000);
ve.startEngine();
ve.fuelType();
				
	}


}
