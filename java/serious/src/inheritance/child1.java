package inheritance;

public class child1 extends Example1 {
	public void method1()
	{
		System.out.println("access for one rupee ");
	}
	public static void main(String[] args) {
		Example1 obj;
		obj=new child1();
		obj.method1();
		
	}

}
//package inheritance;
//
//public class child1 extends Example1 {
//	public void method2()
//	{
//		System.out.println("method from child");
//	}
//	public static void main(String[] args) {
//		child1 obj=new child1();
//		obj.method1();
//		obj.method2();
//
//	}
//
//}
