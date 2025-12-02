package easy_level_problems;

public class middle {

	    public static void main(String[] args) {
	
	        int num =1234;
	        int temp = num;

	        // Step 1: Count digits
	        int count = 0;
	        while(temp > 0){
	            count++;
	            temp /= 10;
	        }

	        int mid = count / 2;

	        // Step 2: Find middle digit(s)
	        if(count % 2 == 0){  
	            // even → 2 middle digits
	            int removeFront = count - mid - 1; 

	            int x = num;
	            for(int i = 0; i < removeFront; i++){
	                x /= 10;
	            }

	            int d1 = x % 10;   // first middle
	            x /= 10;
	            int d2 = x % 10;   // second middle

	            System.out.println("Middle digits: " + d2 + d1);
	        } 
	        else {  
	            // odd → 1 middle digit
	            int removeFront = count - mid - 1;
	            int x = num;

	            for(int i = 0; i < removeFront; i++){
	                x /= 10;
	            }

	            int middle = x % 10;
	            System.out.println("Middle digit: " + middle);
	        }
	    }
	}

