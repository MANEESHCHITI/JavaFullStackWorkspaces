package java8features;


class TestQueue{
	int num;
	boolean status=false;
	
	public  synchronized void set(int i) throws InterruptedException {
		while(status) {
			wait();
		}
		this.num=i;
		System.out.println("put :"+num);
		status=true;
		notify();
	}

	public  synchronized void get() throws InterruptedException {
		while(!status) {
			wait();
		}
		
		System.out.println("get  :"+num);
		status=false;
		notify();
		
	}
}
class Producer1 implements Runnable{

	TestQueue q1;
	public Producer1(TestQueue t1) {
		this.q1=t1;
		Thread t=new Thread(this,"Producer1");
		t.start();
	}
	@Override
	public void run() {

		int i=0;
		while(true) {
			try {
				q1.set(i++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

	}
}

	class Consumer1 implements Runnable {

		TestQueue q2;

		public Consumer1(TestQueue t1) {
			this.q2=t1;
			Thread t=new Thread(this,"Consumer1");
			t.start();
		}

		@Override
		public void run() {
			while(true) {
				try {
					q2.get();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
		}

	}	
	public class Synchronizationwithojoin {

		public static void main(String[] args) {

			TestQueue t1=new TestQueue();
			Producer1 p1=new Producer1(t1);
			Consumer1 c1=new Consumer1(t1);


		}
	}



