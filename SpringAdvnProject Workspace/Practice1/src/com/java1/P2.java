package com.java1;




class A2{
	private int a;
	private int b;
	public A2(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
}
public class P2 {

	public static void main(String[] args) {
		A2 obj=new A2(1,2);
	
		
		System.out.println(obj.getA());
		System.out.println(obj.getB());

	}

}