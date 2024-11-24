package caseStudys;

import java.util.Scanner;

class B1
{int incrr;
	public void disp(int a,int b,int z  )
	{
	for(int i=a;i<=b;i++)
	{int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)                                
			{                                       
				count++;                               //      writE A PROGRAM TO DISPLAY NTH PRIME NUMBER BETWEEN GIVEN RANGES 5)        
				if(count>2)
				{
					
					break;
				 }
			 
				else if(i==j)
				{
					incrr++;
					
					if(incrr==z)
					{
						System.out.println(i);
						break;
					}
					
					
				}
			}
				
		}
		if(incrr==z)
		{
			break;
		}
	}
	}
}






public class AnyPrimeBtwn {

	public static void main(String[] args) {
	
B1 obj=new B1();
Scanner s=new Scanner(System.in);
System.out.print("enter starting range:");
int val1=s.nextInt();
System.out.println();
System.out.print("entter end range:");
int val2=s.nextInt();
System.out.println();
System.out.print("enter nth value you want:");
int z=s.nextInt();

obj.disp(val1,val2,z);
	}

}
