package RunningClass;

class OverLoading
{int rno;
String name;
	public OverLoading(int rno,String name)
	{
	this.rno=rno;
	this.name=name;
	}
	//public OverLoading(int rno,String name) 
	//{
		//System.out.println("2parameter"+rno);             //method overloading & constructor overloading
		//System.out.println("2parameters"+name);
		
	//}
	public OverLoading(int rno)
	{
		System.out.println("2parameter"+rno);
		System.out.println("2parameters"+name);
	}
	public OverLoading(String name)
	{
		System.out.println("1parameter"+rno);
		System.out.println("1parameters"+name);
	}
	public void disp(int rno,String name)
	{
		System.out.println("2parameter"+rno);
		System.out.println("2parameters"+name);
	}
	public void disp(String name,int rno)
	{
		System.out.println("2parameter"+rno);
		System.out.println("2parameters"+name);
	}
	public void disp(int rno)
	{
		System.out.println("1Mparameter"+rno);
		System.out.println("1Mparameters"+name); 
	}
	public void disp(String name)
	{
		System.out.println("1M1parameter"+rno);
		System.out.println("1Mparameters"+name);
	}
	public void disp()
	{
		System.out.println("empty parameters");
	}
	
	
}

public class MethodOverloading {
	public static void main(String args[])
	
	{
		OverLoading s1=new OverLoading(123,"maneesh");
		OverLoading s2=new OverLoading(123);                     //    diff objects giving different instance so cchanging in the objects changes instance values
		OverLoading s3=new OverLoading("maneesh");
		//OverLoading s4=new OverLoading();
		s1.disp(123,"maneesh");
		s1.disp("maneesh",123);
		s1.disp(123);
		s1.disp("maneesh");
		s2.disp("manees");
		s3.disp(123);
		
	}
	

}
