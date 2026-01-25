package inheritance;

class Hotel{
	long Hotelid;
	public Hotel(long Hotelid)
	{
		this.Hotelid=Hotelid;
		System.out.println("Hotelid:"+Hotelid);
	}
}
class Room extends Hotel{
	int  days;
	double roomRentPerDay;
	public Room(int days,double roomRentPerDay,long Hotelid)
	{
		super(Hotelid);
		this.days=days;
		this.roomRentPerDay=roomRentPerDay;
		System.out.println("days:"+days);
		System.out.println("roomRentPerDay:"+roomRentPerDay);
	}
	public double cal()
	{
		return days*roomRentPerDay;
	}
}
class  LuxuryRoom extends Room
{
	double serviceCharge;
	double foodCharge;
	public LuxuryRoom(int days,double roomRentPerDay,long Hotelid,double serviceCharge,double foodCharge) 
	{
		super(days,roomRentPerDay,Hotelid);
	}
	public double total()
	{
		return serviceCharge+foodCharge+cal();
	}
}
public class Example3 {

	public static void main(String[] args) {
	System.out.println("bill:"+new LuxuryRoom(5,500.0,2345,200.0,500.0).total());

	}

}
