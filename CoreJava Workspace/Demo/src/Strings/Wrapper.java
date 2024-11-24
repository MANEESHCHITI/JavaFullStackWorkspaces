package Strings;

public class Wrapper {

	public static void main(String[] args) {

		Autoboxing obj=new Autoboxing(2);
		//obj.disp();
		System.out.println();
	}

}

class Autoboxing
{
	
Autoboxing(int a)
{
	
	}

	//autoboxing and unboxing
	public void disp()
	{
		int a=5;
		//Integer b=Integer.valueOf(a);
		Integer b=a;
		System.out.println();


		//int e=b.intValue();
		int e=b;
		System.out.println(e);


	}



}


