package PackInherit1;

public class MultilevelInheritance {

	public static void main(String[] args) {
		Child14 obj=new Child14();
		obj.disp();

	}

}
                                        // general multilevelInheritance 
class Parent12
{
	public void disp()
	{
		System.out.println("parent");
	}
}
class Child12 extends Parent12
{
	public void disp()
	{
		System.out.println("child1");
	}
}
class Child13 extends Child12
{
	public void disp()
	{
		System.out.println("child2");
	}
}
class Child14 extends Child13
{
	public void disp()
	{
		System.out.println("child3");
	}
}