package Exception;
class Test{
	public static void tiMethod(int num)
	{
		try {
			
			System.out.println("10000");
			Handling.tilmethod(num);
			System.out.println("coders");
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
}
class Handling{
	public static void tilmethod(int num)
	{
		try {
			int result=5/num;
			System.out.println("completed");
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Finally");
		}
	}
}
public class example2 {

	public static void main(String[] args) {
	new 	Test().tiMethod(0);
	System.out.println("________________");
	new Test().tiMethod(1);
	System.out.println("________________");
	new Test().tiMethod(10);
	System.out.println("________________");
	new Test().tiMethod(15);
	}

}
