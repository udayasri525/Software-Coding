package while_loop;

public class Armstrong_number {
	   public static int countt(int num) {
	        int count = 0;
	        while (num != 0) {
	            count++;
	            num = num / 10;
	        }
	        return count;
	    }

	    public static int powerr(int num,int base) {
	        int power = 1;

	        for (int i = 1; i <=num; i++) {
	            power = power * base; 
	        }
	        return power;
	    }

	    public static boolean armstrong(int num) {
	        int sum = 0;
	        int temp = num;
    int count=countt( num);
	        while (num != 0) {
	            sum = sum + powerr(count,num%10);
	            num = num / 10;
	        }

	        return sum == temp;
	    }

	    public static void main(String[] args) {

	        // 1 to 1000 Armstrong numbers
	        for (int i = 1; i <= 200; i++) {
	            if (armstrong(i)) {
	                System.out.println(i + " is Armstrong number");
	            }
	        }
	    }
	}

