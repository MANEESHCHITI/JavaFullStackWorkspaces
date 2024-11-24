package com.java1;

public class Mul1 {

	public static void main(String[] args) {


		Thread1 obj2=new Thread1();
		Thread t=new Thread(obj2);
		t.start();
		for(int i=6;i<=10;i++) {
			System.out.println(i);
		}
		t.setName("maneesh");
		System.out.println(t.getName());
//		t.setName("maneesha");
//		System.out.println(t.getName());
		
		
		
	}

}
class Thread1 implements Runnable{


	
	@Override
	public void run() {
		
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println();

	Thread	t1=Thread.currentThread();
	t1.prio
	}
	
}
