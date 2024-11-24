package caseStudys;



import java.util.Scanner;

class c1
{int total;int i=2;
	public void primeNumbersUptoN(int b)
	{
		while(i>=0)  
		{
																// write a program to display first n given by user  prime numbers  4)
		
			int count=0;
			for(int j=1;j<=i;j++)
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
			i++;
		}
		
	}
}















public class WhilePrimeNtill{

	public static void main(String[] args) {
		c1 obj=new c1();
		Scanner s=new Scanner(System.in);
		int var1=s.nextInt();
		obj.primeNumbersUptoN(var1);

	}

}






























