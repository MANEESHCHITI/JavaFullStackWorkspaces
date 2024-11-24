package Demo1;




class Adddd
{int c;
	public void primeNumbersUptoN(int a,int b)
	{
		for(int i=a;i<=b;i++)                                   // write a program to display nth prime number in a range 5)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
					if(count>2)
					{
						break;
						}
					else if(i==j)
					{
						c=i;
					}
					}
			}
			
		}
		System.out.println(c);
	}
}

public class NthPrimeRange {

	public static void main(String[] args) {
		Adddd obj=new Adddd();
		obj.primeNumbersUptoN(101,200);

	}

}
