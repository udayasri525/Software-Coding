package BLC_ELC;

public class p1 {
	public String name;
	public int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public  static p1 showdata(String name1, int id1)
	{
		p1 obj=new p1();
		obj.name=name1;
		obj.id=id1;
		return obj;
	}
	

}
