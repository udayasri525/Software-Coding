package conditional_statements;

public class approvelloan {
	 public String checkLoanApproval(double salary, int creditScore)
	 {
		 if(salary>80000 && creditScore>=750)
		 {
			 return "loan Approved imdediately";
		 }
		 else if(salary<=80000 && salary>50000 && creditScore<=750 && creditScore>650)
		 {
			 return "loan approved with higher interest rate";
		}
		 else if (salary<=50000 && salary>=30000 && creditScore<=650 && creditScore>=500)
		 {
			 return "co-signer required";
		 }
		 else
		 {
			 return "co-signer requird";
		 }
	 }
	public static void main(String[] args) {
		System.out.println(new approvelloan().checkLoanApproval(80000,750));

	}

}
