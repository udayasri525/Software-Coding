package easy_level_problems;

public class happyapproch2 {

public static void main(String[] args) {
		int sum;
		int num=19;
for(;(num!=1 && num!=4);num=sum)
{ 
	sum=0;
	for(;num>0;num=num/10)
	{
		sum=sum+((num%10)*(num%10));
	}
	num=sum;
}
System.out.println((num==1)?"happy number":"not a happy number");

	}

}
