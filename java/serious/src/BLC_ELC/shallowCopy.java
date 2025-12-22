package BLC_ELC;

public class shallowCopy {
	public int a;
	public int b;
	public int c;
	public void data(int a, int b, int c)
	{ this.a=a;
	this.b=b;
	this.c=c;
		System.out.println(""+a+" "+b+" "+c);
	}
	public static void main(String[] args) {
	shallowCopy obj1=new shallowCopy();
	obj1.data(2, 3, 4);
shallowCopy obj2=obj1;   //shallow copy 
obj2.data(6, 7, 4);
System.out.println(obj1);  //same location prints
System.out.println(obj2);  //same locations prints
System.out.println("                      ");
System.out.println("calling through obj1:"+obj1.a);
System.out.println("calling through obj2:"+obj2.a);

	}


}
