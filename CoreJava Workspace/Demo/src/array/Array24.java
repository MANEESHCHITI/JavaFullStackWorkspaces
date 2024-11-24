package array;

public class Array24 {

	public static void main(String[] args) {
	
Avg obj=new Avg();
//obj.calc();
//obj.ascDsc();
//obj.maxMin();
obj.duplicate();
}

}

class Avg
{
	
	int a[]=new int[] {1,2,3,3,4,5};
	public void calc()
	{
		int sum=0;
		int product=1;
		float avg=0;
		for(int i=0;i<a.length;i++)
		{                                              //  sum,product,avg
			sum=sum+a[i];
			product=product*a[i];
			
		}
		avg=sum/2f;
	}
	
	public void ascDsc()
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(i<a.length-1)
			{
				if(a[i]<a[i+1])//Ascending
			//	if(a[i]<a[i+1])    //decending
				{
					count++;                                     //   array is ascending or decending  checking
					if(count==a.length-1)
					{
						System.out.println("serial order");
					}
				}
				else
				{
					System.out.println("not serial");
				break;
				}
			}
		}
	}
	public void maxMin()
	{
		int max=a[0];      // if we take max value zero and do the procss we get , but if we do  the min process by default zero it prints min as 0 not in the array min
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)                          // max ,min value in array
			{
				min=a[i];
			}
		}
		System.out.println("max:"+ max);
		System.out.println("min:"+ min);
	}
	
	public void duplicate()
	{
		int incr=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					if(count==2)                           //     duplicate values checking
					{
						incr++;
						System.out.println("duplicate "+a[i]);
						break;
					}
			
				}
				
				
			}	
		}
		if(incr==0)
		{
			System.out.println("no duplicate values");
		}
		
			
		
	}

	
	



}