package Workouts;

import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {

Numb obj=new Numb();
obj.disp();
	}

}                                //123456
class Numb
{ 
	int sum1=0;
	int sum2=0;
	//int odd=0;
	int n=0;
	int count=1;
	Scanner s=new Scanner(System.in);
	

	public void disp()
	{                                                  // sum of the odd, even digit numbers
		System.out.println("enter a value:");
		int a=s.nextInt();
		while(a>0)
		{
			n=a%10;
			if(count%2==0)
			{
				sum1=sum1+n;                //4,2
			}
			else
			{
				sum2=sum2+n;
			}                                 //5,3,1
			count++;
			a=a/10;
			

		}
	
		if((count-1)%2==0)
		{
			System.out.println("even sum is:"+sum2);
			System.out.println("odd sum is:"+sum1);
		}
		else
		{
			System.out.println("even sum is:"+sum1);
			System.out.println("odd sum is:"+sum2);
			
		}
	}
}
