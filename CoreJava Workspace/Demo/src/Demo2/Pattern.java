package Demo2;

class D1
{int m=3,a=3,c=3;
	public void disp()
	{
		for(int i=1;i<=4;i++)
		{int n=i;
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{                                      //case 2 alphabet  pettern
				System.out.print(n);
				n--;
			}
			if(i>1)
			{
				for(int l=2;l<m;l++)
				{
					System.out.print(l);
				}
				m++;
			}
			System.out.println();
			
		}
		for(int p=1;p<=3;p++)
		{
			for(int q=1;q<=p;q++)
			{
				System.out.print(" ");
			}
			int r=a;
			for(int s=3;s>=p;s--)
			{
				System.out.print(r);
				r--;
			}
			a--;
			for(int b=2;b<=c;b++)
			{
				System.out.print(b);
			}
			c--;
			System.out.println();
		}
		
	}

}
public class Pattern {

	public static void main(String[] args) {
		
D1 obj=new D1();
obj.disp();
}
}
