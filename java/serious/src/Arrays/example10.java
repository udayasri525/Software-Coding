package Arrays;

import java.util.Arrays;

class CarItem{
	int itemId;
	String itemName;
	double []pricesFromSellers =new double[3];
	public CarItem(int itemId, String itemName, double[] pricesFromSellers) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.pricesFromSellers = pricesFromSellers;
	}
	public String display() {
		return "CarItem [itemId=" + itemId + ", itemName=" + itemName + ", pricesFromSellers="
				+ Arrays.toString(pricesFromSellers) + "]";
	}
public double  lowest()
{
	double low=pricesFromSellers[0];
	for(int i=0;i<pricesFromSellers.length;i++)
	{
		if(pricesFromSellers[i]<low)
		{
			low=pricesFromSellers[i];
		}
	}
	 return low;
}
	
}
class ShoppingCart
{
	CarItem obj1=new CarItem(1,"ball",new double[]{250,300,200});
	CarItem obj2=new CarItem(2,"sandels",new double[]{240,300,250});
	CarItem obj3=new CarItem(3,"dress",new double[]{270,800,900});
	
	CarItem []arr= {obj1,obj2,obj3};
	public void displayCart() {
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i].display());
			System.out.println("lowest price"+arr[i].lowest());
			
		}
	}
	public double calculateTotalCost()
	{
		double sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i].lowest();
		}
		return sum;
	}
}
	

public class example10 {

	public static void main(String[] args) {
		ShoppingCart obj=new ShoppingCart();
		obj.displayCart();
		System.out.println("total cost:"+obj.calculateTotalCost());
				

	}

}
