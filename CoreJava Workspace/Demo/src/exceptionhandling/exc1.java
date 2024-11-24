package exceptionhandling;

import java.util.Scanner;

public class exc1 {

	public static void main(String[] args) {
		A obj=new A();
		obj.disp();

	}

}
class A
{
	public void disp()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("hi");
		try {
		String a=sc.nextLine();       // try catch can also use in scanner 
									// catch is must after the try statements block
		System.out.println(a);
		String b=sc.nextLine();
		System.out.println(b);
		String c=a+b;
		System.out.println(c);
		
		}
	
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("hi");
	}
}
