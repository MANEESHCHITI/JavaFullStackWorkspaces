package exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class exc6 {

	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.disp();

	}

}

class Demo
{String a;
int b,c;
	
	public void disp()
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			b=5;
		
			c=0;
			c=b/c;
		}
		finally
		{
			System.out.println("hi");
		}
		System.out.println("hlo");

	}
	
}