package array;

public class ArrayA1 {

	public static void main(String[] args) {
		primeInDigit obj=new primeInDigit();
		obj.disp1();
		obj.disp();

	}

}

class primeInDigit
{
                                            // store prime numbers of a digit in an array and print 
											// we will get in reverse order so swap it .
	
	int incr;								//	4541;
											//[1,5]
											//[5,1};
											
	
										//	1 is not a prime number because a prime number must be divisible two factors .
											//4541
											//[5]
											//5
														
	
                         
public void disp1()
{

	
	int n=45477;
	int b=0;
	
		while(n>0)
		{
			int count=0;
			b=n%10;
			for(int i=1;i<=b;i++)
			{
				if(b%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				incr++;
			    
			}
		/*	else if(b==1)
			{
				incr++;
			}*/
			n=n/10;
				
		
		}
	
}	


	public void disp()
	{
		int a[]= new int[incr];
		//System.out.println(a.length);
		int n=45477;
		int b=0;
		
		int d=0;
		
		while(n>0)
		{
			int count=0;
			b=n%10;
			for(int i=1;i<=b;i++)
			{
				if(b%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				
				a[d]=b;
				//System.out.println(a[d]);
				d++;
			}
		/*	else if(b==1)
			{
				
				a[d]=b;
				d++;
			}*/
			n=n/10;
				
		
		}
	
			for(int j=a.length-1;j>=0;j--)
			{
			System.out.println(a[j]);
			}
		
	
	}

}	
