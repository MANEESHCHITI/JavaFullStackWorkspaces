package Workouts;

import java.util.Scanner;

public class Alpha {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter last value value: ");
		try {
		int a=s.nextInt();
		char alpha='a';
                                       // incrementing characters 0-26
	
			if(a>=0 && a<=26)
			{

				for(int i=0;i<a;i++)
				{
					System.out.println(alpha);
					alpha++;
				}
			}
			else
			{
				System.out.println("enter values between 0-26");
			}
		

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}
}
