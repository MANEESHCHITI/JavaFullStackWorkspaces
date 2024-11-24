package array;

public class Array36 {

	public static void main(String[] args) {
	
Abc obj=new Abc();
obj.disp();
	}

}

class Abc
{
	int a[]= {1,1,2,2,3};
	int b[]= {1,1,1,2,3};
	
	
	public void disp()
	{
		
		
		
	for(int i=0;i<a.length;i++)
	{
	
		
		int count1=0;
		int count2=0;
		
		for(int j=0;j<a.length;j++)
		{
			
			if(a[i]==b[j])
			{
				for(int k=0;k<a.length;k++)
				{
					if(a[i]==a[k])
						count1++;
					if(b[j]==b[k])
						count2++;
				}
				if(count1>=count2)
				{
					System.out.println(a[i]+" "+count2);
				}
				else
				{
					System.out.println(a[i]+" "+count1);
				}
				break;
			}
			
		}
	}
		
		
		
	}
}

