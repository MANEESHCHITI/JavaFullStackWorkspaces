package array;

public class Array2 {

	public static void main(String[] args) {
		Ar obj=new Ar();
		obj.disp();
		
	}

}
class Ar
{
	int a[]=new int[] {10,20,30};
	int b[]=new int[] {30,40,50,10};
	
	int count;                                        //same values print in both arrays, count ,by different for loop
	int high;
	int low;
	int low1;
	public void disp()
	{
		for(int ab:a)
		{
				for(int ac:b)
				{
					if(ab==ac)
					{
						System.out.println(ac);
						count++;
					}
				}
		}
		System.out.println("count:"+count);
	}
	
					
				
			
		
	
	}
	
	