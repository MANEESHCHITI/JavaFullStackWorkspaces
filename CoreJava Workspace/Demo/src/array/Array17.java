package array;

import java.util.Scanner;

public class Array17 {

	public static void main(String[] args) {
		Case5 obj=new Case5();
		obj.disp();
		
	}

}

class Case5
{	Scanner s=new Scanner(System.in);
	
	
	char alph='a';
	int i=0;
	int count;
	public void disp()
	{System.out.print("enter length of array:");
	int limit=s.nextInt();
	
	char a[]=new char[limit];
	
		while(true)
		{
			if(alph!='a'&&alph!='e'&&alph!='i'&&alph!='o'&&alph!='u')
			{
				a[i]=alph;
				i++;                                 //case6 5Q write a program to store and display consonants of alphabets
				count++;
				if(count==a.length)    //      here instead of count take i which is decreasing variable
					break;
				
			}
			alph++;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	}