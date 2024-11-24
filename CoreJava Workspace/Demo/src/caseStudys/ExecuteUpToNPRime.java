package caseStudys;

import java.util.Scanner;

class A3
{int total;
	public void primeNumbersUptoN(int b)
	{
		for(int i=2;i<=100;i++)                                   // write a program to display first n given by user  prime numbers  4)
		{
			int count=0;
			for(int j=1;j<=i;j++)                                  ///refer other better WhilePrimeNTill.
			{
				if(i%j==0)
				{
					count++;
					if(count>2)
					{
						break;
						}
					else if(i==j)
					{
						total++;
						System.out.println(i);
						if(total==b)
						{
							break;
						}
						
					}
					}
			}
			if(total==b)
			{
				break;
			}
			
		}
		
	}
}















public class ExecuteUpToNPRime{

	public static void main(String[] args) {
		A3 obj=new A3();
		Scanner s=new Scanner(System.in);
		int var1=s.nextInt();
		obj.primeNumbersUptoN(var1);

	}

}

