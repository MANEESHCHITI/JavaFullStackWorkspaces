package case5;

class Developers
{	String name;
	int empId;
	long phoneNumber;
	String address;
	public Developers(String name,int empId,long  phoneNumber,String address)
	{
		this.name=name;
		this.empId=empId;
		this.phoneNumber=phoneNumber;
		this.address=address;
		disp();
	}
public void disp()                              // case 3)
{
	System.out.println(this.name);
	System.out.println(this.empId);
	System.out.println(this.phoneNumber);
	System.out.println(this.address);
	}
	
}




public class Develop {

	public static void main(String[] args) {
		Developers obj1=new Developers("Dennnis M.Ritchie",123,7386168112l,"1-1-603/3");
		Developers obj2=new Developers("Bjarne Stroustrup",1234,7386168113l,"1-4654");
		

	}

}
