package array;

import java.util.Scanner;

public class Array27 {

	public static void main(String[] args) {
		Chara obj=new Chara();
		obj.disp();

	}

}
class Chara
{Scanner s=new Scanner(System.in);
	public void disp()
	{
		String a[][]=new String[3][3];
			
		  for(int i=0;i<a.length;i++) 
		  {
			  for(int j=0;j<a.length;j++)
			  {
				  a[i][j]=s.next();
			  }
			  
		  }																											//case7 1Q     print array of characters
		for(String ar[]:a)
		{
		for(String arr:ar)
			{
				System.out.print(arr+" ");
			}
			System.out.println();
		
		}
	}
	
	}
