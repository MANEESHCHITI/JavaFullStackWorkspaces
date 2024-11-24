package Demo1;

public class Primee {   // prime number or not

	public static void main(String[] args) {
		int s=11;
		for(int i=2;i<s;i++)
		{
			if(s%i==0)
			{
				System.out.println("not prime");
				break;
			}
			else if(s-1==i)
			{
				System.out.println("prime");
			}
			
		}

	}

}

//package Demo1;

//public class Bin {
                                                          //prime or not with counting more than twice
	//public static void main(String[] args) {
		//int s=11;
		//int count=0;
		//for(int i=1;i<=s;i++)
		//{
			//if(s%i==0)
			//{
				//count=count+1;
			//}
		//}
		//if(count>2)
		//{
			//System.out.println("not prime");
		
		//}
		//else
		//{
		//	System.out.println("prime");
		//}
		
		
	//}

