package PackInherit1;

interface B1
{
	public default  void disp2()
	{
		
	}

}
class B2 implements B1
{

public void disp2()
{
	}
public void disp1()
{
	System.out.println("hi");
	}                                   //  upcasting for interface to class 

}


public class In9
{
	public static void main(String args[])
	{
	B1 obj=new B2();
	obj.disp2();
	
	}

}


