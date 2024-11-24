package caseStudys;

import java.util.Scanner;

public class Sqaureroot {
	public static void main(String args[])
	{
		Root obj=new Root();
		obj.disp();
	}

}
class Root
{
	public void disp()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter number:- ");
		int a=s.nextInt();    
			if(a==1)
			{
				System.out.println("perfectsquare");
				System.exit(0);
			}											//given number is perfect sqare or not.
		for(int i=1;i<=a/2;i++)
		{
			if(i*i==a)
			{
				
				System.out.println("perfect square");
				break;
			}
			else if(i==a/2)
			{
				System.out.println("not perfect square");
			}
		}
	}
}
