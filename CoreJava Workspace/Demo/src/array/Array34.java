package array;

import java.util.Scanner;

public class Array34 {

	public static void main(String[] args) {
		char a[]=new char[5];
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.next().charAt(3);                                    //string to cahr taking by only index number of input string
		}
		for(char b:a)
		{
			System.out.println(b);
		}
		
		
	}
}
		
			



