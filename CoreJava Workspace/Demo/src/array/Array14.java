package array;

import java.util.Scanner;

public class Array14 {
	public static void main(String args[])
	{
		Case1 obj=new Case1();
		obj.disp();
		}
}

class Case1
{Scanner s=new Scanner(System.in);
	public void disp()                                     // case6 1Q write a program to filll an array with  numbers
	{
		System.out.print("enter array lenngth: ");
		int limit=s.nextInt();
		int a[]=new int[limit];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=a.length-1;0<=i;i--)
		{
			System.out.println(a[i]);
		}
	}
	}
