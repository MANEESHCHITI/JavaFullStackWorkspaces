package caseStudys;

import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {

	public static void main(String args[])
	{
		Ana obj=new Ana();
		obj.disp();
	}
}
class Ana
{ 	Scanner s=new Scanner(System.in);

String a="silent";
String c;

char b[]=new char[6];

ArrayList<Character>d=new ArrayList<>();


                                       // anagram or not 

public void disp()
{

	System.out.print("enter:-");
	c=s.nextLine();

	int value=0;

	for(int i=0;i<b.length;i++)
	{
		b[i]=a.charAt(i);
	}
	try {
		for(int i=0;i==d.size();i++)
		{
			d.add(i,c.charAt(i));
		}
	}
	catch(Exception e)
	{

	}
	if(b.length==d.size())
	{
		for(int i=0;i<b.length;i++)
		{	int value1=0;
		for(int j=0;j<d.size();j++)
		{
			value1++;
			if(b[i]==d.get(j))
			{
				value1=0;
				value++;
				if(value==b.length)
				{
					System.out.println(" it is anagram");
				}
				break;
			}
			else if(value1==b.length){
				break;
			}
		}
		if(value1==b.length)
		{
			System.out.println("not anagram");
			break;
		}
		}
	}
	else
	{
		System.out.println("not anagram");
	}

}
}






