package Demo1;




class Add
{
	public void primeNumbersUptoN()
	{
		for(int i=2;i<=23;i++)                                   // write a program to display all prime numbers up to n 1)
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















public class Case1a {

	public static void main(String[] args) {
		Add obj=new Add();
		obj.primeNumbersUptoN();

	}

}
