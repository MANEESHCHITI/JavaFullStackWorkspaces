package array;

import java.util.Scanner;

public class Array13 {

	public static void main(String[] args) {
		
		Sca obj=new Sca();
		obj.disp();
	}

}
class Sca
{	int a[]=new int[] {};
Scanner s=new Scanner(System.in);
	public void disp()
	{
		int  value=s.nextInt();
		String   a[]=new String[value];                              //basic scanner function in array.
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.next();
			
		}
		for(String a1:a)
		{
			System.out.println(a1);
		}
		
		
	}
}
