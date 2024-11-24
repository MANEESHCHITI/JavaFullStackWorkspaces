package caseStudys;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		
Sorti s=new Sorti();
s.disp();
	}

}

class Sorti
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[6];
	int j=0;
	int v=1;
	int m=0;
	
	public void disp()
	{
	for(int i=0;i<a.length;i++)
	{
		System.out.print("enter element:-");
		a[i]=sc.nextInt();
	}
	
	for(;j<a.length;j++)
	{
		int b=j+1;
		for(int k=b;k<a.length;k++)
		{
			if(a[j]<a[k])
			{
				v++;
				if(v==15)
				{
					System.out.println("array is sorted");
				}
				
			}
			else
			{
			
				System.out.println("array is not sorted");
				m=20;
				break;
			}
		}
		if(m==20)
		{
			break;
			}
	}
		
		
	}


}
