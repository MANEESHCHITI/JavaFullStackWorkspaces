package caseStudys;

import java.util.Scanner;

class A9
{int reverse=0,lastDigit,s;
	public void disp(int n )
	{s=n;
		
		while(n>0)
		{
		lastDigit=n%10;
		reverse=reverse*10+lastDigit;
		n=n/10;
				
	}                                      //write a code which display palindrone or not
	if(s==reverse)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
	
	}
	}













public class Palindrome {
	public static void main(String args[])
	{
		A9 obj=new A9();
		Scanner s=new Scanner(System.in);
		int val1=s.nextInt();
		obj.disp(val1);
	}

}
