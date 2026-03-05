package Exception;
class CarStopped extends Exception{

	public CarStopped (String message) {
		super(message);
	}
	
}
class CarPuncture extends Exception{
	public CarPuncture(String message) {
		super(message);
	}
}
class CarHeat extends Exception{
	public CarHeat(String message)
	{
		super(message);
	}
}

public class example3 {
	public static void Stop(String s)
	{
		try {
			if(s.equals("Stop"))
			{
				 throw new  CarStopped("Car not stoped");
			}
			else {
				System.out.println("Car not stalled");
			}
		}catch(CarStopped e){
			e.printStackTrace();
		}
	}
	public static void puncture(String s)
	{
		try {
			if(s.equals("puncture"))
			{
				 throw new  CarPuncture("Car is Punctured");
			}
			else {
				System.out.println("Car not punctured");
			}
		}catch(CarPuncture e){
			e.printStackTrace();
		}
	}
	public static void carHeat(int heat)
	{
		try {
			if(heat>=50)
			{
				 throw new  CarHeat("Car is heated more than 50 degrees");
			}
			else {
				System.out.println("Car not stalled");
			}
		}catch(CarHeat e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Stop("Stop");
		puncture("puncture");
		carHeat(50);
	}
}
