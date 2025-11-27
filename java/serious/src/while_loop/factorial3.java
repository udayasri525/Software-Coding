package while_loop;
import java.math.BigInteger;

public class factorial3 {
	

	    public static BigInteger fact(int num) {
	        BigInteger fact = BigInteger.ONE;                      //we can print of factorial n numbers  by using 

	        for (int i = 1; i <= num; i++) {
	            fact = fact.multiply(BigInteger.valueOf(i));
	        }

	        return fact;
	    }

	    public static void main(String[] args) {

	        for (int i = 1; i <= 30; i++) {
	            System.out.println("Factorial of " + i + " : " + fact(i));
	        }
	    }
	}
