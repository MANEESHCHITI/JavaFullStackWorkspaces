package array;

public class Array6 {

	public static void main(String[] args) {
		C2 obj=new C2();
		obj.disp();
	}

}
class C2
{int a[]=new int[] {313,213,456,233,535,155,312};
int count;
	public void disp()
	{
		for(int i=0;i<a.length;i++)
		{	
			int b=a[i];
			while (b>0)
			{
				int c=b%10;                  // find the count of a number present or not
				b=b/10;
				if(c==1)
				{
					count++;
					System.out.println("present");
					break;
				}
			}
			if(count==1)
				break;
			else if (i==a.length-1)
				System.out.println("not present");
		}
		
	}
}