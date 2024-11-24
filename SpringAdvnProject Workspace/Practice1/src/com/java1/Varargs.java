package com.java1;

public class Varargs {

	public static void main(String[] args) {
Var obj=new Var();
obj.disp();

obj.disp(1,2);
obj.disp(1,2,3);

	}

}
class Var{
	public void disp() {
		
	}
	public void disp(int b,int c,int...a) {
		System.out.println(b+c);
		
	}
}
