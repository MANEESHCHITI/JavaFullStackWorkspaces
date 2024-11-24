package array;

import java.util.Scanner;

public class Array26 {                            //two dimension array starts from here 

	public static void main(String[] args) {
	
		Matrix obj=new Matrix();
		obj.disp();
		

	}

}
class Matrix
{
	public void disp()
	{
		int r=4;                                       // by scanner and by given range and also nested for loop anf for each loop.
		int c=3;
int arr[][]=new int[r][c];
	System.out.println("length:- "+arr.length);
	
	Scanner s=new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			
		arr[i][j]=s.nextInt();
			
		}
		System.out.println();
	}
/*for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr.length;j++)
	{
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
	}*/
	
	/*for(int a[]:arr)
	{
		for(int b:a)
		{
			System.out.print(b+" ");
		}
		System.out.println();
	}*/
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}

	
	
	
	}
	}
