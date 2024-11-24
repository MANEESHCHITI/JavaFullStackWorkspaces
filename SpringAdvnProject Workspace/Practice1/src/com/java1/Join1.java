package com.java1;

public class Join1 extends Thread {

	public static void main(String[] args) {
		JoinChild jc=new JoinChild();
		Thread t=new Thread(jc);
		
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}

	}

}

class JoinChild extends Thread{
	
	Join1 j=new Join1();
	Thread t=new Thread(j);
	
	@Override
	public void run() {
		

		for(int i=11;i<=20;i++) {
			System.out.println(i);
		}
	}
}
