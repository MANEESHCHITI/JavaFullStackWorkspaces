package array;

public class Array30 {

	public static void main(String[] args) {
	Case4 obj=new Case4();
	obj.disp();

	}

}
class Case4
{
	int a[][]=new int[][] {{1,2,3},{4,5,6}};
	public void disp()
	{                                                 //rough
		for(int i=0;i<a.length;i++)
		{                                                                  
			for(int j=0;j<a.length+1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
				
		}
	}

}
