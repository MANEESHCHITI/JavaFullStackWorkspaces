package caseStudys;

import java.util.Scanner;

class A2
{
	public void disp(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;                     //write a program to generate perfect numbers between given ranges 6)
				}
				
			}
			if(sum==i)
			{
				System.out.println("perfect number: "+i);
			}
		}
		
		
	}
	}














public class PerfectNumberRange {

	public static void main(String[] args) {
		A2 obj=new A2();
		Scanner s=new Scanner(System.in);
		int val1=s.nextInt();
		int val2=s.nextInt();
		obj.disp(val1,val2);

				

	}

}
