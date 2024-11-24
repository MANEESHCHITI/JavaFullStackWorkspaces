package Demo1;

import java.util.Scanner;

class Fun
{
	 void show(int a)
	{
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)                             //    factors of given numbers
			{
				System.out.println(i);
				
			}
			
		}
	}
	}



public class PrimeByHalf {
	public static void main(String [] abc) {
Scanner s=new Scanner(System.in);
Fun obj=new Fun();

int value=s.nextInt();

obj.show(value);
}
}

