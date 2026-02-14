package pratice;
class parents{
	public void start()
	{
		System.out.println("parent");
	}
}
class childs extends parents{
	@Override
	public void start()
	{
		System.out.println("child");
	}
}
public class RunTimePoly {

	public static void main(String[] args) {
		

	}

}
