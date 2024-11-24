package array;

public class Array28 {

	public static void main(String[] args) {
		
Case2 obj=new Case2();
obj.disp();
	}

}
class Case2
{
	int a[][]=new int [][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	int sum;
	public void disp()
	{                                              // 2Q   sum of the array elemnts
		for(int ar[]:a)
		{
			for(int arr:ar)
			{
				sum=sum+arr;
			}
		}
		System.out.println(sum);
	}

}
