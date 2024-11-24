package caseStudys;

import java.util.Scanner;
import java.lang.Math;


public class FourRandom {

	public static void main(String[] args) {
		An obj=new An();
		obj.disp();

	}

}
class InvalidOtpException extends Exception
{
	public InvalidOtpException(String s)
	{
		super(s);
	}
}
class An
{
	int a;
	
	Scanner s=new Scanner(System.in);
	public void disp() 
	{
		
		
		int a=(int)(Math.random()*10000);
		
		System.out.println("otp:- "+a);
		System.out.print("enter otp:-");
		try {
		int b=s.nextInt();
		
			if(b==a)
			{
				System.out.println("logged in successfully");
			}
			else
			{
				throw  new InvalidOtpException("LoginFailed!!!");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}



	}
}
