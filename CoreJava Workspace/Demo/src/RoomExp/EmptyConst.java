package RoomExp;

public class EmptyConst {

	public static void main(String[] args) {
		Empty obj=new Empty();
		

	}

}
class Empty
{int s;
	public Empty()
	{                              //     write a code for calling a constructor from another constructor in another class.
		Emp obj1=new Emp(2,3);
		
	}
	class Emp
	{
	public Emp(int a,int b)        
	{
		System.out.println(s=a+b);
	}
	
	}
}
