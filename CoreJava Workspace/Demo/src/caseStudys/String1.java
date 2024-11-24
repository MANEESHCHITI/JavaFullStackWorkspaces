package caseStudys;

public class String1 {

	public static void main(String[] args) {
	
Ba obj=new Ba();
obj.disp();
	}

}
class Ba
{
	String a="assppsss";
	char b[]=new char[8];
	public void disp()
	{
		for(int i=0;i<b.length;i++)
		{
			b[i]=a.charAt(i);
		}
		for(int j=0;j<b.length;j++)
		{
			int k=1;
			for(int z=0;z<k;z++)
			{
				if(j!=b.length-1)
				{
					if(b[j]==b[j+1])
					{
						k++;
						
						j++;
					}
					else
					{
						System.out.print(k+""+b[j]);
					}
				}
				else
				{
					System.out.println(k+""+b[j]);
				}
			}
		}
	}
}
