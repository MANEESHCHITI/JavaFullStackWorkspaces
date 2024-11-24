package Demo1;
import Demo2.Test3;
class Example1
{                                                //this,private,public 
	private void Test1()
	{
	//Test3 obj4=new Test3();
	//obj4.show(3);
	//System.out.println(obj4.a);
		System.out.println("hi");
		
	}
	public void Test2()
	{
		this.Test1();
	}
	
}
	public class Testing
	{
		public static void main(String args[])
		{
			Example1 obj1=new Example1();
			Example1 obj2=new Example1();
			obj1.Test2();
			
		}
	
	}





































