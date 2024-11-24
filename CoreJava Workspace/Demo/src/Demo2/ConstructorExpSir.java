package Demo2;


class B2
{int rno;
String name;

	public  B2(int a,String b)
	{
		rno=a;
		name=b;
	
	}
	public B2(int c)
	{
		rno=c;
	                                                 //   two constructors with diff parameter
	}
	public void show()
	{
		System.out.println(rno);
		System.out.println(name);
	}
	}


public class ConstructorExpSir {

	public static void main(String[] args) {
		
B2 obj=new B2(10,"maneesh");
obj.show();
	}

}
