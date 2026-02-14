package ploymorphism;

class Vechile{
	public void start()
	{
		System.out.println("Vehicle started ");
	}
}
class car extends  Vechile{
	@Override
	public void start()
	{
	System.out.println("Car started");
	}
}


public class Example3 {

	public static void main(String[] args) {
		 Vechile v = new Vechile();
	        v.start();   // Vehicle started

	        car c = new car();
	        c.start();
	}

}
