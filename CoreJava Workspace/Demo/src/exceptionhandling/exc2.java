package exceptionhandling;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exc2 {

	public static void main(String args[])   
	{
		Error2 obj1=new Error2();
		obj1.disp1();
	}
											//throws,throw,finally, nested trycatch
}
class Error2
{
	int a,b,c;
	public void disp1() 
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		


		try {
			System.out.println("enter a value");
			String x=br.readLine();
			a=Integer.parseInt(x);

			System.out.println("enter b value");
			x=br.readLine();
			b=Integer.parseInt(x);



			if(b==0)
			{                  //	1/0
				throw new ArithmeticException("b value must be non zero");
			}
			else
			{
				c=a/b;
				System.out.println(c);
			}


		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		try {
			System.out.println("enter d value");
			String xl=br.readLine();
			int d=Integer.parseInt(xl);
			if(d==0)
			{
				throw new ArithmeticException("d value must be non zero value ");
			}
			else
			{
				int e=c/d;
				System.out.println(e);
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		finally
		{
			System.out.println("close");
		}
		System.out.println("hi");
	}









}








