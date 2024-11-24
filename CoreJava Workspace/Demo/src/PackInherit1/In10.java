package PackInherit1;



class P1
{
	int b=5;
}
interface C1
{
	public void disp(P1 a);
	public default void disp1()
	{
		System.out.println("hlo");
	}
}
interface C2
{
	public void disp4();
	public default void disp9()
	{
		System.out.println("allu");
	}
	
}
class C3  implements C2
{
	
	public void show() {                
		C1 obj1=(P1 a)->       // passing object as a parameter .it doesnot return a value 
		{
			System.out.println("hi");
			System.out.println(a.b);
		};                                 // lamba function which means a interface only contain one declare method and other defination if needed .
		
		P1 obj2=new P1();
		obj1.disp(obj2);
		
	}
	public void disp4()
	{
		System.out.println("aar");
	}
	public void disp6()
	{
		C2.super.disp9();
	}
	
	

}
public class In10 {
public static void main(String args[])
{
	C3 obj2=new C3();
	obj2.show();
	
	
}
}
