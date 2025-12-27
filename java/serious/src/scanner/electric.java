package scanner;

public class electric {
private long units;
private double bill;
public electric(long units)
{
	this.units=units;
}
public double getbill()
{
	return bill;
}
public void calculate()
{
	if(units<=100)
	{
		bill=units*1;
	}
	else if(units>100 && units<200)
	{
		bill=(100*1)+(units-100)*2;
	}
	else {
		bill=100*1+100*2+(units-200)*3;
	}
}
}
