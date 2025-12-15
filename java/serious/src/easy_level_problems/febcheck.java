package easy_level_problems;

public class febcheck {
	 public static void feb()
	 {
		 int num1=0;
		 int num2=1;
		 int num3;
		 for(int i=1;i<=5;i++)
		 {
			 System.out.print(num1+" ");
			 num3=num1+num2;    //0+1 ,1+1 ,1+2 ,2+3
			 num1=num2;       // 1 ,1 ,2 ,3
			 num2=num3;      //1 ,2 ,3 ,5
		 }
	 }
	
	public static int feebcheck(int num)
	{
		for(int i=0;i*i<=num;i++) //0==0
		{
			if(i*i==num)  //0*0==0
				return 1;
		}
		return -1;
	}
	 public static void getfeb()
	 {
		 int num1=0;
		 int num2=1;
		 int num3=0;
		while(num1<=5)
		 { 
			 int root = feebcheck(num1);

	            if (root == 1)  // means perfect square
	                System.out.println(num1 + " is perfect square");
			 num3=num1+num2;   
			 num1=num2;      
			 num2=num3;     
		 }
	 }
	
		public static void main(String[] args) {
			
			feb();
	 getfeb();
	 
		}

	}
