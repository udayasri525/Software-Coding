package easy_level_problems;

public class fabnocci {
 public static void getfeb()
 {
	 int num1=0;
	 int num2=1;
	 int num3=0;
	 for(int i=1;i<=10;i++)
	 {
		 System.out.print(num1+" ");
		 num3=num1+num2;    //0+1 ,1+1 ,1+2 ,2+3
		 num1=num2;       // 1 ,1 ,2 ,3
		 num2=num3;      //1 ,2 ,3 ,5
	 }
 }
	public static void main(String[] args) {
		 //0 1 1 2 3 5 8
		//num1=0     print
		//num2=1;
		//num3=num1+num2; 0+1
		//num1=num2  1
		//num2=num3 
		//
 getfeb();
	}

}
