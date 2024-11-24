package multithreading;

class ExamMulti extends Thread
{
	Thread t;
	public ExamMulti()
	{
		t=new Thread(this,"rao");//      constructor with two 
		t.start();

	}
	public void run()
	{                                // it is overiden everytime.
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				t.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}

// multithreading ,run();start(),Thread,Interrepted Exception, extends throwable.extends Thread





public class Multi1 {

	public static void main(String[] args) {
		ExamMulti s=new ExamMulti();

		for(int i=10;i<=15;i++)
		{
			System.out.println(i);	

		}
		try {
			Thread.sleep(500);
		} 
		catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
