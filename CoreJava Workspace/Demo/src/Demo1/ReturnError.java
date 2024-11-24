package Demo1;

class Process1
{
	public void show()
	{

		if(3>0)                           //stack overflow ,unreachable statement for hello
		{
			for(int i=1;i>-1;i++)
			System.out.println("hi");
			System.out.println("hello");
			
		}

	}
}
public class ReturnError {
int a=3;
	public static void main(String[] args) {
		Process1 obj=new Process1();
		obj.show();
	}

}
