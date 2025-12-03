package DoWhile;

public class exampke4 {
 public static void getdata(int num1 , int num2)
 { String str="*";
	 do
	 {
		 if(str=="+") {
			 System.out.println("perform Addition: "+(num1+num2));
		 }
		 else if(str=="-") {
			 System.out.println("perform minus : "+(num1-num2));
		 }
		 else if(str=="*") {
			 System.out.println("perform multiplication : "+(num1*num2));
		 }
		 else if(str=="/") {
			 System.out.println("perform divided by : "+(num1/num2));
		 }
		 else if(str=="%") {
			 System.out.println("perform modulos : "+(num1%num2));
		 }
	 }
	 while(str=="+"||str=="-"||str=="*"||str=="/"||str=="%");
 }
	public static void main(String[] args) {
		getdata(2,3);
	}

}
