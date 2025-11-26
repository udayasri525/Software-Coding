package conditional_statements;

public class universityadmission {
	 public String evaluateAdmission(int marks, boolean sportsAchievement)
	 {
		 if(marks>95 ||sportsAchievement==true||sportsAchievement==false)
		 {
			 return "admitted with scholarship";
		 }
		 else if(marks<=85 && marks>=94 || sportsAchievement==true||sportsAchievement==false)
		 {
			 return "admitted without scholarship";
		 }
		 else if(marks<=84 && marks>=70 && sportsAchievement==true)
		 {
			 return "admitted under sports quota";
		 }
		 else if(marks<=69 && marks>=60 || sportsAchievement==true||sportsAchievement==false)
		 {
			 return "interview required";
		 }
		 else
		 {
			 return "admission rejected";
		 }
	 }
	public static void main(String[] args) {
		System.out.println(new  universityadmission().evaluateAdmission(95,false) );

	}

}
