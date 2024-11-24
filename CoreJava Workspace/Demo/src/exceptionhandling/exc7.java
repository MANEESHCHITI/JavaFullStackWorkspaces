package exceptionhandling;

public class exc7 {

	public static void main(String[] args) {

		Handling obj=new Handling();
		obj.disp();
	}

}                                 //exception propagation

class Handling
{
	public void disp()
	{

		try
		{

			
			try {
				int b[]	=new int[5]	;
				b[5]=3;
				
				}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			System.out.println("hlo");
		}
		
		catch(ArrayIndexOutOfBoundsException ee)
		{
			System.out.println(ee);
			//ee.printStackTrace();
		}
		
	}



}
