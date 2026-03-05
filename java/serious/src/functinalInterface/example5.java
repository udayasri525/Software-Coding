package functinalInterface;
import java.util.function.Predicate;
import java.util.function.Consumer;
public class example5 {
	static boolean isprime(int num){
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i*i<=num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
	Predicate<Integer> check= num-> isprime(num);
System.out.println(check.test(3)?"prime":"!prime");
Consumer<Character> c=ch->System.out.println(isprime(ch)?"prime":"!prime");
c.accept('u');
}
}
