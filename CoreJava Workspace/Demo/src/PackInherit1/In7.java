package PackInherit1;

public class In7 {

	public static void main(String[] args) {
		
c11 obj=new c11();
obj.disp1();
	}

}

abstract class p11
{
	public static void disp1()
	{
		System.out.println("static method in abstract class");
	}
}
class c11 extends p11
{
	/*public void disp1()
	{                              // cannot overide final method
		
	}*/
	
	
}
