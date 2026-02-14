package pratice;
class engine{
	public void start() {
		System.out.println("engine started");
	}
}
class car{
	
	public void start()
	{
		engine e=new engine();
		e.start();
		System.out.println("car started");
	}
}
public class HasArealtion {

	public static void main(String[] args) {
		car obj=new car();
		obj.start();

	}

}
