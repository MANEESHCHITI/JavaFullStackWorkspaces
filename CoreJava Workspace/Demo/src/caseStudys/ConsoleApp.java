package caseStudys;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleApp {

	public static void main(String[] args) {
		
Applica obj=new Applica();
obj.disp();
	}

}
class Applica
{
	
	//Scanner s=new Scanner(System.in);
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	public void disp()
	{
	 
		
		try {
		
		
			System.out.print("Enter interger value:-");
			String s=bf.readLine();
			int a=Integer.parseInt(s);
			System.out.println();
		
		System.out.println("Entered value: "+a);
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			//e.printStackTrace();
			//System.out.println("hi");
			disp();
			
		}
		

		
		
	}

}
