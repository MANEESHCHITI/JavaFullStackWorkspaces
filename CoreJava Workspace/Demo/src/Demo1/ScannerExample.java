package Demo1;

import java.util.Scanner;

class Scann
{
	public void show(int a)
	{
		for(int i=1;i<=a;i++)
		{                                         //sending value by scanner to formal parameter
			System.out.println(i);
		}
	}
}



public class ScannerExample {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);

Scann obj=new Scann();	
int value=s.nextInt();

obj.show(value);

	}

}