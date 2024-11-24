package Workouts;

import java.util.Scanner;

class Operations
{
	public void calc(int a,int b)
	{
		System.out.println(a+b);
	}
	public void calc(float a,float b)
	{
		System.out.println(a-b);
	}
}

public class Airthematic {

	public static void main(String args[])
	{
		
		Operations s=new Operations();
				s.calc(5,2);
	}
}
