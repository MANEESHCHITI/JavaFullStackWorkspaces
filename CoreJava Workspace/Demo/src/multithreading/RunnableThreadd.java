package multithreading;

public class RunnableThreadd implements Runnable{

	public static void main(String[] args) {
		
		
		RunnableThreadd obj=new RunnableThreadd();
		
		Thread t=new Thread(obj);
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("main!!");
		}
	}
		
@Override
		public void run() {
			for(int i=6;i<=10;i++)
			{
				System.out.println("run");
			}
		}
		
	

	

}



