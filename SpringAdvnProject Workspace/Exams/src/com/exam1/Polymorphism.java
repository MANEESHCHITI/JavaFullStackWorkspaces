package com.exam1;



public class Polymorphism extends Exception{

	public static void main(String[] args) {

		String a="Vcraft";
		String reverse;
		char e[]=new char[6];
		
		int j=0;
		
		for(int i=5;i>=0;i--) {
			char f=a.charAt(i);
			e[j]=f;
			j++;
		
			
		}
		for(char z:e) {
			System.out.print(z);
		}
		
		
		
		
	}

}
