package Workouts;

public class Pattern1 {

	public static void main(String[] args) {
		
	B1 obj=new B1();
	obj.disp();
	}

}
class B1
{	int k=1;
	public void disp()
	{
		for(int i=1;i<=5;i++)
		{                                                 //pattern of 1 to 25 
			
			for(int j=1;j<=5;j++)
			{
				System.out.print(k+" ");
				k=k+5;
			}
			k=i;
			k++;
			System.out.println();
		}
	}
	}
