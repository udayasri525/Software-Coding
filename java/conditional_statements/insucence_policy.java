package conditional_statements;

public class insucence_policy {
	 public String calculatePremium(int age, int experience)
	 {
		 if(age>50 && experience>10)
		 {
			 return "lowest premium";
		 }
		 else if(age<=50 && age>30 && experience>5)
		 {
			 return "moderate premium";
		 }
		 else if(age<=30 && age>18 && experience<=5)
		 {
			 return "highest premium";
		 }
		 else
		 {
			 return"not eligible for insurance";
		 }
	 }
	public static void main(String[] args) {
		
System.out.println(new insucence_policy().calculatePremium(50,6));
	}

}
