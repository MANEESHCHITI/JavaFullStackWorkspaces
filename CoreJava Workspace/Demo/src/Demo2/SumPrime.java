package Demo2;
class A
{int sum=0;
	public void show(int a,int b)
	{
	for(int i=a;i<=b;i++)
	{int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)                       //write the code for the sum of prime numbers in a given range
			{
				count++;
				if(count>2)
				{
					break;
				}
				else if(i==j)
				{
					sum=sum+i;
				}
			}
			
		}
	}
	System.out.println(sum);
	}

	
}

public class SumPrime {
	public static void main(String[] args) {
		A obj=new A();
		obj.show(2,100);
		
	}

}
