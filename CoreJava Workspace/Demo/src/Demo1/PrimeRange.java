package Demo1;




class Addd
{
	public void primeNumbersUptoN(int a,int b)
	{
		for(int i=a;i<=b;i++)                                   // write a program to display all prime numbers between given ranges 2)
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
						System.out.println(i);
					}
					}
			}
			
		}
	}
}















public class PrimeRange {

	public static void main(String[] args) {
		Addd obj=new Addd();
		obj.primeNumbersUptoN(101,200);

	}

}
