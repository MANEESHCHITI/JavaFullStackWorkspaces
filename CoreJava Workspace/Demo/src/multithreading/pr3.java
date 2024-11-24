package multithreading;

public class pr3 extends Thread {

	public static void main(String[] args) {
		Finall obj=new Finall();
		obj.disp();
	}

}
class Finall 
{
	public void disp()
	{
		
		try
		{
			int a=1/0;
			System.out.println("excecuted try");
		}
		catch(Exception e)
		{
			
			System.out.println("hi");
			System.exit(0);
		}
		finally
		{
			System.out.println("finally block");
		}
	}
	
}
