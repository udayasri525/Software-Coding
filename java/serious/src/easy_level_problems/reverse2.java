package easy_level_problems;

public class reverse2 {
 public int rev(int num)
 {
	 System.out.println("u entered number is: "+num);
	 int reversee=0;
	 while(num!=0)
	 {
		 reversee=reversee*10+num%10;
		 num=num/10;
	 }
	 return reversee;
 }
	public static void main(String[] args) {
		
System.out.println("reverse of u entered number is: "+new reverse2().rev(765));
	}

}
