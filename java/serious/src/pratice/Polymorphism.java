package pratice;
class example1{
	public void print(int a,int b)
	{
		System.out.println(a+" "+b);
		System.out.println("first");
	}
	public void print(double a,double b)
	{
		System.out.println(a+" "+b);
		System.out.println("second");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		example1 obj=new example1();
		obj.print(1,2.1);

	}

}
