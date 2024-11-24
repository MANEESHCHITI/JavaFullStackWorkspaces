package caseStudys;

import java.util.Scanner;

class A1
{int inc=0;
	int sum=0;
	public void disp(int i)

	{
		for(int a=2;a<=i;a++)
		{                                   //write a program to test sum of prime numbers is also a prime or not.3)
			int count=0;
			for(int b=1;b<=a;b++)
			{
				if(a%b==0)
				{
					count++;
					if(count>2)
					{
						break;
					}
					else if(a==b)
					{
						sum=sum+a;
					}
					
				}
				
			}
		}
		
		for(int c=1;c<=sum;c++)
		{
			if(sum%c==0)                              
			{
				inc++;
				if(inc>2)
				{
					System.out.println("not prime");
					break;
				}
				else if(c==sum)
				{
					System.out.println("prime");
				}
			}
		}
		
	}
	
}

public class SumOfPrimeAlsoPrime {

	public static void main(String[] args) {
		A1 obj=new A1();
		Scanner s=new Scanner(System.in);
		int val1=s.nextInt();
		obj.disp(val1);
		

	}

}
