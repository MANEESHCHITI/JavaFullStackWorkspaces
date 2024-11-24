package case5;

class Triangle
{
	float area;
	int perimeterr;
	int l=3;
	int b=4;
	int h=5;
	
	
	{
		area=b*h*1/2;
	}                                                    //    4)
	{
		perimeterr=l+b+h;
	}
	
/*	public float  areas(int b,int h)
	{
		return area=b*h*1/2;
	}
	public int  perimeter(int l,int b,int h)
	{
		return perimeterr=l+b+h;
		
	}*/
	
}

public class Case4 {

	public static void main(String[] args) {
		
		
		
	Triangle obj=new Triangle();
	System.out.println("area of triangle "+obj.area);
	System.out.println("perimeter of triangle "+obj.perimeterr);

	}

}
