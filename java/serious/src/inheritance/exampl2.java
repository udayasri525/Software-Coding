package inheritance;
class Railway
{
	public Railway(long  trainNo)
	{
		System.out.println("train no:"+trainNo);	
		}
}
class Ticket extends Railway
{
	double baseFare;
	int  distance;
	public Ticket(double  baseFare ,int  distance,long  trainNo)
	{
		super( trainNo);
		this.baseFare=baseFare;
		this.distance=distance;
		System.out.println("baseFare:"+baseFare);
		System.out.println(" distance:"+ distance);
	}
	public double cal(int rate)
	{
		 return baseFare+(distance*rate);
	}
}
class  SleeperTicket extends Ticket{
	double sleeperCharge;
	public SleeperTicket(double sleeperCharge,double  baseFare ,int  distance,long  trainNo)
	{
		super(baseFare,distance,trainNo);
		this.sleeperCharge=sleeperCharge;
		System.out.println("SleeperTicket:"+sleeperCharge);
	}
	public double inform()
			{
		return cal(2)+sleeperCharge;
			}
}

public class exampl2 {

	public static void main(String[] args) {
		System.out.println("total fare:"+new SleeperTicket(120.0,200.0,150,12785).inform());

	}

}
