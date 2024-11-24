package PackInherit1;

public class in1 {

	public static void main(String[] args) {
//dynamic obj1=new dynamic();
dynamic1 obj2=new dynamic1(); 
//dynamic obj3=new dynamic1();                                      //  dynamic method dispatch or runtime polymorphism

dynamic obj4;                                                   //same as upcasting but dynamically alocation memory for all childs 
//obj4=obj2;                                                 // we can access parent all methods ,child overridden methods,but not child own methods.
//obj4.disp();
//obj4.disp1();
//obj1.show();
/*obj1=obj2;
obj1.disp();
obj1.disp1();
//obj1.show();*/

   

	}

}
class dynamic
{
	public dynamic()
	{
		
		System.out.println("parent constructor");
	}
	public void disp()
	{
		System.out.println("parent disp");
	}
	public void disp1()
	{
		System.out.println("parent disp1");
	}
}
class dynamic1 extends dynamic
{
	public dynamic1()
	{
		
		System.out.println("child constructor");
	}
	public void disp()
	{
		System.out.println("child disp");
	}
	public void show()
	{
		System.out.println("child show");
	}
	
	
	}
