package PackInherit1;

public class In6 {

	public static void main(String[] args) {
		
c1 obj=new c1();
c1.disp1();
p2.disp1();
obj.disp2();
obj.disp3();
obj.disp();

	}
                                    // default and static method..
}

class p1
{
	public void disp()
	{
		System.out.println("parent");
	}
	public void disp5()
	{
		System.out.println("static in parent");
	}
}
interface p2
{
	int a=5;   // default variable is final.   ..
	public static  void disp1()
	{
		System.out.println("static method");
	}
	
	public default void disp()
	{
		System.out.println("override");
	}
	
	
	
}
interface p3
{
	public default void disp2()
	{
		System.out.println("default method");
	}
	public  void disp3();
}
class c1 extends p1 implements p2,p3
{
	/*public void disp1()
	{                                                                 done
		System.out.println("static method overides nonstatic");
	}*/
	public static void disp1()
	{
		System.out.println("static method of c1 own so it wont overides static");
	}
	public void disp2()
	{
		System.out.println("default method can override by non default method ");
	}
	public void disp3()
	{
		
		System.out.println("implements of interface p3");
	}
	/*public static void disp5()
	{
		                                     error,   in this case parent class history was not knowing 
	}*/
	/*public void disp()
	{
		                         error,      if parent class method is static and here we are stopping parent scope
	}*/
	
	
	
	

}