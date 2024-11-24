package array;

public class Array21 {
	

	public static void main(String[] args) {
		
		
		 int  a[]= {};
		for(int i=1;i<=5;i++)
		{
			a=new int[i];
			for(int  j=0;j<i;j++)                         
			{
				a[j]=j;                       //dynamically increasing the memory
			}
			System.out.println(a[i-1]);
			
			
				
		}
		//System.out.println(j);
		
		{
			
		}
		
		

	}

}

