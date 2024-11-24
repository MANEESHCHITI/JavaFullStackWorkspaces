package Demo1;

import java.util.Scanner;

class Ex11
{                                             //sending directing to instance from the user
	int a;
	int b;
	int c;
}



public class ScannerForInstance {

	public static void main(String[] args) {
		

	
Scanner s=new Scanner(System.in);
Ex11 obj=new Ex11();
obj.a=s.nextInt();
obj.b=s.nextInt();
obj.c=s.nextInt();
System.out.println(obj.a);
System.out.println(obj.b);
System.out.println(obj.c);

}
}