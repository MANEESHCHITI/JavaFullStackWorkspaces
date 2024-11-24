package array;

public class Array3 {

	public static void main(String[] args) {
		A1 obj=new A1();
		obj.disp();
		
	}

}
class A1
{  	int a[]=new int[] {10,20,30};
	int b[]=new int[] {30,40,50,10};               // same values in arrray ,count by inner for loop
	int count;
	public void disp()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					//count++;
				}
			}
		}
		//System.out.println("count"+count);
	}
	}
