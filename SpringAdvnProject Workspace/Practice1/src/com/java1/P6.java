package com.java1;
//
//public class P6 {
//
//	public static void main(String args[])
//	{
//		B1 obj2=new B1();
//	
//			obj2.disp1();
//	}
//}
//
//class B1{
//	
//	B2 obj1=new B2();
//	public void disp1() {
//		try {
//			obj1.disp2();
//		}
//		catch(Exception e) {
//			System.out.println("exception catched in");
//		}
//	}
//}
//
//class B2{
//	
//	public void disp2() {
//		
//		int a=5/0;
//		System.out.println(a);
//		
//	}
//}


class P6 {
	public static void main(String args[]) {
		
		P7 obj=new P7();
		
		Thread obj1=new Thread(obj);
		
		obj1.start();
		
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	
	}

}

class P7 extends Thread{
	Thread obj1=new Thread();
	
	public void run() {
		obj1.start();
		System.out.println("hi");
		
	}
}



