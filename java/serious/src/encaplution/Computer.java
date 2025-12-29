package encaplution;

public class Computer {
public void showbrand()
{
	System.out.println("Brand:Dell");
}
	public static void main(String[] args) {
		Laptop lap=new Laptop();
		lap.showbrand();
		lap.showmodel();

	}

}
class Laptop extends Computer{
	public void showmodel()
	{
		System.out.println("model: Xps 15");
	}
}