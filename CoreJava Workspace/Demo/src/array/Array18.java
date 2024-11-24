package array;

public class Array18 {

	public static void main(String[] args) {
		
Prime obj=new Prime();
obj.disp();
	}

}
class Prime
{
	int a[]=new int[] {2,3,4,5,6,9,11};
	
	public void disp()
	{
	                                                             //    print prime numbers in array
		for(int i=0;i<a.length;i++) 
		{int count=0;
			
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(a[i]);
			}
		}
		
	}
}
