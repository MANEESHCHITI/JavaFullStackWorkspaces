package case5;

import java.util.Scanner;

class Areas
{
	int areaOfRect;
	public Areas(int l,int b)
	{
		areaOfRect=l*b;
	}
	public int retArea()
	{
		return this.areaOfRect;                       // 5)
	}
	
}

public class Case5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter length: ");
		int var1=s.nextInt();
		System.out.print("enter breadth: ");
		int var2=s.nextInt();
		Areas obj=new Areas(var1,var2);
		System.out.println("area of rect: "+obj.retArea());

	}

}
