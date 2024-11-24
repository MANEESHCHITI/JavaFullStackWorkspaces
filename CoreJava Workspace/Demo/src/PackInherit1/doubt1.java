package PackInherit1;

public class doubt1 {

	public static void main(String[] args) {
		one obj=new Two();
																obj.//accessing methods checkingh
															

	}

}

interface one
{

	public  abstract void disp1();
	
	public default void disp()
	{
		System.out.println("parent disp");
	}

	}

class Two implements  one
{
	public void disp()
	{
		System.out.println("disp overidden child");
	}
	public void disp1()
	{
		System.out.println("disp1 implemented child");
	}
	public void disp3()
	{
		System.out.println("disp3 child");
	}
}
