package ploymorphism;
class Animal{
	public void makesound()
	{
		System.out.println("Animal sound");
	}
}
class Dog extends Animal{
	public void makesound()
	{
		System.out.println("Bark");
	}
}
public class Example2 {

	public static void main(String[] args) {
	Animal a=new Animal();
	a.makesound();
   Dog  b= new Dog();
   b.makesound();
	}

}
