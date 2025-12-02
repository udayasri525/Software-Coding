package easy_level_problems;

public class string {
	    public static void main(String[] args) {
	      

	        String str = "udayasri" ;  // only reading, not string processing
	        int len = str.length();
	        int mid = len / 2;

	        if(len % 2 == 0) {
	            // even → two middle characters
	            char c1 = str.charAt(mid - 1);
	            char c2 = str.charAt(mid);
	            System.out.println("Middle characters: " + c1 + c2);
	        } else {
	            // odd → one middle character
	            char c = str.charAt(mid);
	            System.out.println("Middle character: " + c);
	        }
	    }
	}
