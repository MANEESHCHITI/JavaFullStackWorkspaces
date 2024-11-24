package array;

public class Array4 {

	public static void main(String[] args) {
		A2 obj=new A2();
		obj.max();
		obj.min();

	}

}
class A2
{	
	int a[]=new int[] {3,2,1,9,6,12,7};
	
	

	public void max()
	{
		for(int i=0;i<a.length;i++)          //max and min value  of the given array.
		{int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>=a[j])
				{
					count++;
					if(count==a.length)                          
					{
						System.out.println(a[i]);
					}
				}
				else
				{
					break;
				}
			}
			
			
			
			
		}
	
	}
	public void min()
	{
		for(int i=0;i<a.length;i++)
		{int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<=a[j])
				{
					count++;
					if(count==a.length)                          
					{
						System.out.println(a[i]);
					}
				}
				else
				{
					break;
				}
			}
			
			
			
			
		}
	
	}
}
