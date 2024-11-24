package Demo2;

import java.util.Scanner;

class Man
{
	
	public Man(int a,float b)
	{
		System.out.println(a+b);
	}
	public Man(int c,String d)
	{
		System.out.println(c+d);
	}
	public Man(float e,int f)
	{                                         //by scanner function we send only same data type as parameters but i think any explicit conversion
		System.out.println(e/f);
	}
	public Man(String g,int h)
	{
		System.out.println(g+h);
	}
	public Man(String i,String j,String k)
	{
		System.out.println(i+j+k);
	}
}


public class MultiConstructors {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//int l=s.nextInt();
		//int o=s.nextInt();
		//int p=s.nextInt();
		//long m=s.nextLong();
		String n=s.next();
		String r=s.next();
		String t=s.next();
		Man obj=new Man(n,r,t);
		
		

	}

}
