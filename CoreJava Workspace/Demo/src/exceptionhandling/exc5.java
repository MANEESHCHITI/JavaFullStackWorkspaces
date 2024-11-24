package exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class exc5 {

	public static void main(String[] args) {
		
In obj=new In();
obj.disp();
	}

}                                          // Exception propagation
class NumericalExceptionCustom1 extends Exception
{
	public NumericalExceptionCustom1 (String a)
	{
		super(a);
	}
}
	class  RamInvalid extends Exception
	{
		public RamInvalid(String a)
		{
			super(a);
		}
	}
	
	



class In
{
	int b,c,d;
	String a;
public void disp()
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	try
	{
		
		System.out.println("enter age value");
		a=br.readLine();
		b=Integer.parseInt(a);
		if(b==0)
		{
			throw new ArithmeticException("b value  must be non-zero");
		}
		else if(b>=18 && b<=120)
		{
			throw new NumericalExceptionCustom1("eligible for voting");
		}
		else if(b<0 || b>120)
		{
			throw  new RamInvalid("Invalid");
		}
		else if(b>0 && b<18)
		{
			throw  new NumericalExceptionCustom1("not eligible for voting");
		}
			
	}
	catch( Exception e)
	{
	
	//	e.printStackTrace();
		
		System.out.println(e);
	}
	
	
	
}

}
