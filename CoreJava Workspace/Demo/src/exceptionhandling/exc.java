package exceptionhandling;

public class exc {

	public static void main(String[] args) {
		

	}

}

class ErrorInCatch
{
	public void disp()
	{
		try
		{
			int a=5/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("hlo");
			try{int b=6/0;}
			catch(ArithmeticException ee)
			{
				System.out.println("hi");
			}
			
		}
		
	}
}
