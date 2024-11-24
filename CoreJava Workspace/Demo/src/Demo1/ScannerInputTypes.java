package Demo1;

import java.util.Scanner;

public class ScannerInputTypes {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the Float Values");

		float a = s.nextFloat();
		s.nextLine();
//		System.out.println("Enter the string:");
//		String b = s.next();
		System.out.println("Enter hjbdjfhsd:");
		int c = s.nextInt();

		System.out.println(a);
//		System.out.println(b);
		System.out.println(c);
		// System.out.println(d);

		s.close();

	}
}
