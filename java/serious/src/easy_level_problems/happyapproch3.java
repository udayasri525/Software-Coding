package easy_level_problems;

public class happyapproch3 {

	public static void main(String[] args) {
		
		        int num = 19;
		        int sum;

		        while (num != 1 && num != 4) {
		            sum = 0;

		            while (num > 0) {
		                sum += (num % 10) * (num % 10);
		                num /= 10;
		            }

		            num = sum;
		        }

		        System.out.println((num == 1) ? "Happy Number" : "Not a Happy Number");
		    }

	}

