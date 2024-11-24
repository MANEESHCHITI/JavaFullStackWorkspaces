package array;

import java.util.Scanner;

public class Array29 {

	public static void main(String[] args) {
		Case33 obj=new Case33();
		obj.disp();

	}

}
class Case33
{	
	Scanner s=new Scanner(System.in);
	String a[][]=new String[3][3];
	public void disp()
	{
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			a[i][j]=s.next();
		}                                 //3Q take inputs from user and store it as 2d String and display it
	}
	for(String ar[]:a)
	{
		for(String arr:ar)
		{
			System.out.print(arr+" ");
		}
		System.out.println();
	}
	}
	}
