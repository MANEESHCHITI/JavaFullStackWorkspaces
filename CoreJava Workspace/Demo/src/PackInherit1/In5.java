package PackInherit1;

public class In5 {

	public static void main(String[] args) {

		Child133 obj=new Child133();
		obj.disp2();

	}

}
class Parent13                          //multilevel inheritance by implements.   

{    										

	public void disp()
	{
		System.out.println("Parent ");
	}
	public void disp1()
	{
		System.out.println("Parent own");	
	}
}
interface Parent14
{
	/*public void disp2()
	{                                    // we cannot create normal method in interface because interface has default abstract methods
		System.out.println("hi");
	}*/ 
	public void disp2();
}
interface Parent15 
{
	public void disp2();
}
class Child133 extends Parent13  implements Parent15,Parent14   // in this implements the first interface Succeding will get the declaration if both parents has same method declaration
{

	public void disp()
	{
		System.out.println("parent overridden");
	}

	public void disp2()
	{                                                      // if we dont keep implementations of both we can extends the one interface with other interface but be cautions 
		System.out.println("interface method");
	}

}
class Child44  implements Parent15
{
	public void disp2()
	{
		System.out.println();
	}
}



