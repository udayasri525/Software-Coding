package functinalInterface;

interface Add{
	int sum(int a,int b);
}
public class Test {

	public static void main(String[] args) {
		Add obj=(a,b)-> a+b;
		System.out.println(obj.sum(10,20));

	};

}
