package Demo2;

class c2
{
	public void disp()
	{int m=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				m=m%2;
				System.out.print(m);	
				m++;
				}
			System.out.println();
		}
	}
	}


public class OneZeroPattern {

	public static void main(String[] args) {
		
c2 obj=new c2();
obj.disp();
	}

}
