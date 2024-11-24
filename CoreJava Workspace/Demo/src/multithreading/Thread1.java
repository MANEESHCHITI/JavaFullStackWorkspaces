package multithreading;


class Thread2 extends Thread{
	
	
	public void run() {
		
		for(int j=6;j<=10;j++) {
			System.out.println(j);
		}
	}
	
}


class Thread3 extends Thread{
	
	
	public void run() {
		
		for(int j=11;j<=15;j++) {
			System.out.println(j);
		}
	}
}


public class Thread1 {

	public static void main(String[] args) {

	Thread2 obj1=new Thread2();
	Thread3 obj2=new Thread3();
	
	obj1.start();
	obj2.start();
	obj1.setName("thread2");
	for(int i=0;i<=5;i++) {
		System.out.println(i);
	}

	
	}

}
