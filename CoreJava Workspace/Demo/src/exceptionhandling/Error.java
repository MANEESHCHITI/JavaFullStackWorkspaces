package exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Error {

	public static void main(String args[])
	{
		Error1 obj=new Error1();
		obj.disp();
	}
	
}                                                //buffered reader introduction.
class Error1
{
	public void disp()
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
	
		
		
		try {	
	String x=br.readLine();
		int a=Integer.parseInt(x);
		
		 x=br.readLine();
		float b=Float.parseFloat(x);
		
		
		System.out.println(x);
		System.out.println(x);
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();     // this line consists up statement
		}
		
		System.out.println("hi");
	
	}
		

		
		
	}


