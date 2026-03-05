package Exception;
class invalidAgeofBattery extends Exception{

	public invalidAgeofBattery(String message) {
		super(message);
	}
	
}
class inavlidAgeofEngine extends Exception{

	public inavlidAgeofEngine(String message) {
		super(message);
	}
	
}
class invalidAgeofTier extends Exception{
	public invalidAgeofTier(String message) {
		super(message);
	}
}
class Vechile{
	public void checkage(int battery,int tyre,int engine) throws invalidAgeofBattery, invalidAgeofTier, inavlidAgeofEngine
	{
		if(battery<2)
		{
		throw new invalidAgeofBattery("inavlid battery age");
		}
		 if(tyre<5)
		{
			throw new invalidAgeofTier("invalid tier age");
		}
		 if(engine <10)
		{
			throw new inavlidAgeofEngine("invalid engine age");
		}
		else {
			System.out.println(battery+" " + tyre +" "+ engine);
		}
		
	}
}
public class example1 {

	public static void main(String[] args) {
		
try {
	new Vechile().checkage(1,3,5);
}
catch(invalidAgeofBattery e)
{
	e.printStackTrace();
}
catch(inavlidAgeofEngine e)
{
	e.printStackTrace();
}
catch(invalidAgeofTier e)
{
	e.printStackTrace();
}


	}

}
