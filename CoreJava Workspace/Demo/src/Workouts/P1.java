package Workouts;

public class P1 {

	public static void main(String[] args) {
	At obj=new At();
	obj.disp();

	}

}

class At
{
public void disp()
{ 
	int b=5;
	int a[]=new int[] {1,2,3,4,5};
	int k=0;
	
for(int i=0;i<a.length;i++)
{
	 k++;
	for(int j=k;j<a.length;j++)
	{
		if(a[i]+a[j]==b)
		{
			System.out.print(i+",");
			System.out.print(j);
		}
		System.out.println();
	}
}
}
}
