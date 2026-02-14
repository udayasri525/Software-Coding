package ploymorphism;

class person{
	protected void display() {
		System.out.println("I am a person");
	}
}
class student extends person{
	protected void display()
	{
		System.out.println("I am a student");
	}
	
}
public class Example4 {

	public static void main(String[] args) {
//		person p=new person();
//		p.display();
student s=new student();
s.display();
	}

}
