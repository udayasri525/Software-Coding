package pratice;
class grandfather{
	public String grandfathername;
	public grandfather(String grandfathername)
	{
		this.grandfathername=grandfathername;
	}
}
class father extends grandfather{
	public String fathername;
	public father(String fathername,String grandfathername)
	{
		super(grandfathername);
		this.fathername=fathername;
	}
}
class child extends father{
	public String childname;
	public child(String childname,String fathername,String grandfathername)
	{
		super(fathername,grandfathername);
		this.childname=childname;
		System.out.println("data successfully created");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//child obj=new child("gowtham","vasu","samba muthy");
//System.out.println(obj.grandfathername);
//System.out.println(obj.fathername);
//System.out.println(obj.childname);
		grandfather obj=new child("gowtham","vasu","samba muthy");
		father f=(father) obj;
		child c=(child) f;
		System.out.println(f.grandfathername);
		System.out.println(f.fathername);
		System.out.println(c.childname);
	}

}
