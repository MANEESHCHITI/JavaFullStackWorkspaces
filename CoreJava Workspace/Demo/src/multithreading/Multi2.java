package multithreading;


class A
{
	
	
	}

class ExamMulti2   extends A implements Runnable
{
	Thread x;
	public ExamMulti2()
	{
	x=new Thread(this,"rao");//      constructor with two 
	x.start();
		
	}
	public void run()
	{                                // it is overiden everytime
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}

// using implements  and o





public class Multi2 {

	public static void main(String[] args) {
		ExamMulti2 s=new ExamMulti2();

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
