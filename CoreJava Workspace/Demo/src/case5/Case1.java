package case5;

import java.util.Scanner;

class Area
{  
	int rectangle;
	public void setDimensions(int l,int b)
	{
		this.rectangle=l*b;
	}
	public int getArea()
	{
		return rectangle;
	}
	}                                            //area of rectangle.

public class Case1 {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.print("Enter length:  ");
	 int var1=s.nextInt();
	 System.out.print("Enter breadth:  ");
	 int var2=s.nextInt();
	 
	 Area obj=new Area();
	 obj.setDimensions(var1,var2);
	 System.out.println( "Area of rectangle: "+obj.getArea());
	 
	 
	 
	 

	}

}
