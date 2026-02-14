package ploymorphism;

class A{
	public void ADD(int a,int b)
	{
		System.out.println("parent class");
	}
}
class B extends A{
	public void ADD(int a,int b)
	{
		System.out.println("child class");
	}
}
public class example1 {

	public static void main(String[] args) {
		A a=new B();
		B b=(B)a;
		a.ADD(2, 4);

	}

}
