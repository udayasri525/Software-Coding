package while_loop;

public class febnoci {
public static void getdata(int num)
{ int n1=0;
int n2=1;
	for(int i=0;i<=num;i++)
	{
		System.out.print(n1+" "+n2+" ");
		n1=n1+n2;
		n2=n1;
		
	}
}
	public static void main(String[] args) {
		getdata(5);

	}

}
