package PackInherit1;
interface D4
{
	public default void disp5()
	{
		System.out.println("pinkman");
	}

}
interface D1 extends D4
{
	public default  void disp1()
	{
		
		System.out.println("hi");
		D4.super.disp5();
	}
	public default  void disp3()
	{
		System.out.println("iam fine");
	}
}
interface D2 extends D1
{
	public default void disp1()
	{
		System.out.println("hello");
		D1.super.disp1();
	}
	public default void disp2()
	{
		System.out.println("h r u ");
	}
}                                                              //if we want overide parent method we call by interface super  method name. 


                                                // if we create obj for upcasting we see child parent relation  means we get parent own ,child overriden,not child own and if we create 
														//	obj for child we get all .........if there many extends diff done by am
	
class D3 implements D2
{
	public void disp1()
	{
		System.out.println("vanakam");
	//D2.super.disp1();
	}
	
	public void start() {
		//System.out.println("start");
		disp1();
	}
	
	public void disp4()
	{
		System.out.println("everything fine ");
	}
	
	
}
class D5 extends D3
{
	public void disp1()
	{
		System.out.println("vanakam D5");
	//D2.super.disp1();
	}
	
	
	public void disp4()
	{
		System.out.println("everything fine ");
	}
	
	
}

public class In11 {
public static void main(String args[])
{
//	D2 obj1=new D3();
//	obj1.disp1();
//	obj1.disp2();
//	obj1.disp3();
//	obj1.disp5();
	D3 df1=new D3();
	df1.start();
	
}
	
}
