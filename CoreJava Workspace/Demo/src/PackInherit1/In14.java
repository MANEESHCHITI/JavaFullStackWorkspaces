package PackInherit1;

public class In14 {

	public static void main(String[] args) {
	Az obj=new Az();
	obj.disp();
	}

}
abstract class An
{
	An()
	{
		
	}
	int a=5;
	

}
interface Ae
{
	
 int a=6;
 public default void disp1()
 {
	 System.out.println("123");
 }
}
class Az  implements Ae
{
	public void disp()
	{
		System.out.println(a);
		Ae.super.disp1();
	}

}
