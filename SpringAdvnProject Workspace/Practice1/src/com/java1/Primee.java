package com.java1;

public class Primee {

	public static void main(String[] args) {

		int num=11;
		boolean isPrime=true;
		for(int i=2;i<=Math.sqrt(num);i++) {
//			if(num%i==0) {
//				isPrime=false;
//				break;
//		}
			System.out.println(i);
	}
		if(isPrime) {
			System.out.println(num+"is a prime nuber");
		}
		else {
			System.out.println(num+"is not a prime number");
		}

}
}