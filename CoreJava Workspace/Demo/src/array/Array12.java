package array;

import java.util.Scanner;

public class Array12 {

	public static void main(String[] args) {
		Sum obj=new Sum();
		obj.disp();

	}                                          //     print array elements, after print sum of array elements
												// casestudy (6) 4Q
}
class Sum
{
	int arr[]=new int[] {10,20,30,40,50};
	int sum;
	public void disp()
	{
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("sum"+sum);
		
	
	}
}
