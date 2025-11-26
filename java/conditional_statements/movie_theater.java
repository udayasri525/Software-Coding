package conditional_statements;

public class movie_theater {
	public double getTicketPrice(int age)
	{
		double ticket_price;
		if(age<5)
		{
			return ticket_price=0.0;
		}
		else if(age<=12 && age>=5)
		{
			return ticket_price=5.0;
		}
		else if(age<60 && age>=13)
		{
			return ticket_price=10.0;
		}
		else if(age>=60)
		{
			return ticket_price=10/2;
		}
		else
		{
			return ticket_price=0.0;
		}
	}
	public static void main(String[] args) {
		
System.out.println("your ticket price is:"+new movie_theater().getTicketPrice(60));
	}

}
