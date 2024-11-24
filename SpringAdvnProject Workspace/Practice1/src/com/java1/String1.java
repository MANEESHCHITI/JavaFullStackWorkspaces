package com.java1;

public class String1 {

	public static void main(String[] args) {

		String s="chi@gmail.com,mane@gamil.com,varsh@gmail.com";
		System.out.println(s);
		
		String s1[]=s.split(",");
		System.out.println(s1);
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
	}

}
