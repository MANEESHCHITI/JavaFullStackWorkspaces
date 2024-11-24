package PackInherit1;
                                   //upcasting downcasting.
public class Upcasting {

	public static void main(String[] args) {
		
/*Child1 c=new Child1();
c.disp();
c.show();
c.disp1();*/

/*Parent1 c1=new Child1();						 //upcasting
c1.disp();                     
c1.show();
//c1.disp1();   eroor*/

//Child c2=new Parent();         //error directly downcasting but alternative  is                  
																				

/*	Child1 c2=(Child1)c1;
		c2.disp();                    //    here memory is not allocaating.
		c2.show();//              //downcasting
		c2.disp1();*/
		
	}

}


class Parent1
{
	public Parent1()
	{
		System.out.println("Parent constructor");
	}
	
	public void disp()
	{
		System.out.println("iam disp of parent ");
	}
	public void show()
	{
	System.out.println("iam show of parent");	
	}

}
class Child1 extends Parent1
{
	
	public Child1()
	{
		System.out.println("Child constructor");
	}
	
	public void disp()
	{
		System.out.println("iam disp of child ");
	}
	public  void disp1()
	{
		System.out.println("iam disp1 of child ");
	}
}
