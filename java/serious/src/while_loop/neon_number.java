package while_loop;

public class neon_number {
 public static void neon(int num)
 { 
	 int temp=num;
	int sqauare=num*num;
 int sum=0;
	 while(sqauare!=0)
	 {
		sum=sum+sqauare%10;
		 sqauare= sqauare/10;
	 }
	 
	 if(temp==sum)
	 {
		 System.out.println("your entered number is neon:"+ num);
	 }
	 else
	 {
		 System.out.println("your entered  not a  neon number :"+ num);
	 }
 }
	public static void main(String[] args) {
for(int i=1;i<=10;i++)
{
	neon(i);
}


	}

}
