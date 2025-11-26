package conditional_statements;

public class bonus_calculator {
	 public double calculateBonus(int experience, int rating, double salary)
	 {
		 double bonus_amount;
		 if(experience>5 && rating>9)
		 {
			 bonus_amount=salary/2;
			 return bonus_amount;
		 }
		 else if(experience<=5 && experience>3 && rating<=9 && rating>7)
		 {
			 bonus_amount=salary*30/100;
			 return bonus_amount;
		 }
		 else if(experience<=3 && experience>1 && rating<=7 && rating>=5)
		 {
			 bonus_amount=salary*30/100;
			 return bonus_amount;
		 }
		 else 
		 {
			 return bonus_amount=0;
		 }
	 }
	public static void main(String[] args) {
		System.out.println("your bonus amount is:"+ new bonus_calculator().calculateBonus(5,9,100000));
	}

}
