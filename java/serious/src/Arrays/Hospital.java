package Arrays;

import java.util.Arrays;

class hosiptalmanage{
	private int patienId;
	private String Name;
	double []testResutls=new double[5];
	public hosiptalmanage(int patienId, String name, double[] testResutls) {
		super();
		this.patienId = patienId;
		Name = name;
		this.testResutls = testResutls;
	}
	public double getAverageResults()
	{
		double sum=0;
		for(int i=0;i<testResutls.length;i++)
		{
			sum=sum+testResutls[i];
		}
		return sum/testResutls.length;
	}
	public boolean hasCriticalValues()
	{
		for(int i=0;i<testResutls.length;i++)
		{
			if(testResutls[i]<50.0)
			{
				return true;
			}
		}
		return false;
	}

	public String displayPatientReport() {
		return "test [patienId=" + patienId + ", Name=" + Name + ", testResutls=" + Arrays.toString(testResutls) + "]";
	}
	
}
public class Hospital {

	public static void main(String[] args) {
		hosiptalmanage obj1=new hosiptalmanage(1,"srilakshmi",new double [] {60.0,70.0,80.0,20.0,50.0});
		
		hosiptalmanage obj2=new hosiptalmanage(1,"sri",new double [] {64.0,74.0,88.0,23.0,56.0});
		
		hosiptalmanage obj3=new hosiptalmanage(1,"lakshmi",new double [] {70.0,75.0,82.0,30.0,80.0});
		
		hosiptalmanage obj4=new hosiptalmanage(1,"sai",new double [] {60.0,70.0,55.0,33.0,55.0});
		
		hosiptalmanage obj5=new hosiptalmanage(1,"srilakshmi",new double [] {99.0,44.0,55.0,66.0,50.0});
		
		
		hosiptalmanage []arr= {obj1,obj2,obj3,obj4,obj5};
		
		for(hosiptalmanage ele:arr)
		{
			System.out.println(ele.displayPatientReport());
		}
	}

}
