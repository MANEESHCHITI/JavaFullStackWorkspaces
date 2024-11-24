package caseStudys;

public class ReverseOfANumber
{ 
	public static void main(String args[])
	{int num=123,reverse=0,lastDigit;
		while(num>0)
		{                                                 //print reverse of a number 4)
			lastDigit=num%10;
			reverse=reverse*10+lastDigit;
			num=num/10;
		}
		System.out.println(reverse);
	}
	





}