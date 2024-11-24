package caseStudys;

import java.util.Scanner;

class A4
{int count=0;
	public void disp(int a,int b,int x)
	{
		for(int i=a;i<=b;i++)
		{int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
				sum=sum+j	;                    //write a program to generate  perfect numbers upto given user number between given ranges 7)
				}
			}
			if(sum==i)
			{
				count++;
				System.out.println(i);
			
				if(count==x)
				{
					break;
				}
			}
			
		}
	
	}

}








public class ExecuteUpToNPerfect {

	public static void main(String[] args) {
		
A4 obj=new A4();
Scanner s=new Scanner(System.in);
System.out.print("starting Range: ");
int var1=s.nextInt();
System.out.println();
System.out.print("end range: ");
int var2=s.nextInt();
System.out.println();
System.out.print("how many do you want: ");
int var3=s.nextInt();

obj.disp(var1,var2,var3);
	}

}
