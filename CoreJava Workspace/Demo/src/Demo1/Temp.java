package Demo1;



class A
{
	public void show(int s)
	{
		for(int i=2;i<s;i++)
		{
			if(s%i==0)
			{
				System.out.println("prime");
				break;
			}
		}
	}
}














public class Temp {
		
	public static void main(String[] args) 
	{

		A obj=new A();
		obj.show(6);
	}

}
