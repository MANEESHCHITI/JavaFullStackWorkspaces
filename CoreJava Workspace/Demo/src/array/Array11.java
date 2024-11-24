package array;

import java.util.Scanner;

public class Array11 {

	public static void main(String[] args) {
		Reverse obj=new Reverse();
		obj.reverse();
	}
	

}
class Reverse
{	Scanner s=new Scanner(System.in);
	
	int temp;
	public void reverse()
	{
		int limit=s.nextInt();
		int a[]=new int[limit] ;
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<a.length/2;i++)                               //casestudy 2Q    //reverese of an array.
		{
			
			temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		
			
			
		}
		for(int a1:a)
		{
			System.out.println(a1);
		}
	}
	}
