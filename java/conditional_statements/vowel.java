package conditional_statements;


// 3. Vowel or Consonant:
public class vowel {
 public String check_ch(char ch)
 {
	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		 return ch+" is vowel ";
	 }
	 else 
	 {
		 return ch+" is consonant";
	 }
 }
	public static void main(String[] args) {
		System.out.println(new vowel().check_ch('e'));
	}

}
