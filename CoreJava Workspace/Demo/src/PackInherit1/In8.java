package PackInherit1;


interface A1
{
public void disp1();
public default void disp2()
{
	System.out.println("interface A1");
	}
public static void disp3()
{
	}

}
interface A2
{
	public void disp1();
	public default void disp2()
	{
		System.out.println("interface A2");
		}
}
interface A3 extends A2,A1
{                                                    // the same rules for interfaces extends to class implements interfaces.
	public default void disp2() 
	{                             			
		System.out.println("interface A3");
	}
	public default void disp3()
	{                                                // stati cmethod can override by same method without any error but we get error in parent child relation
		
	}
	
}

class A4 implements A1
{
	public void disp3()
	{
		
	}

	public void disp1()
	
	{
		
		System.out.println("class disp1");
		
	}
	public void disp2()
	{
		
	}
}