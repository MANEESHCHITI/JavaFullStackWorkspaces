package Demo1;

public class Prime2 {

	public static void main(String[] args) {
		int a=11;
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			
				if(count>2)
				{
					System.out.println("not prime");
					break;
				}
				else if(i==a)
				{
					System.out.println("prime");
					
				}
			}
			
		}
		
		

	}

}
