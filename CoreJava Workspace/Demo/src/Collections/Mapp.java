package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		Map<Character, Integer> maap = new HashMap<>();

		char c[]=s.toCharArray();
		
		for(char a:c)
		{
			System.out.println(a);
		}
	}

}
