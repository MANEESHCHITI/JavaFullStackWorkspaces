package com.java1;

public class P3 {

	static int a=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);

	}

}
class A4{
	static int  a=10;
	public static void disp1() {
		A4 obj=new A4();
		obj.disp2();
		System.out.println(obj.a);
	}
	public void disp2() {
		System.out.println(a);
	}
	

}
