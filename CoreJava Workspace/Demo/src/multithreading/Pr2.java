package multithreading;

public class Pr2 {

	public static void main(String[] args) {

		Methods obj1=new Methods();
		Methods obj2=new Methods();
		
		
		
		
			
	obj1.setPriority(6);
		
		obj1.start();
		
		
obj2.start();
		
		try {
			obj2.join();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	
		System.out.println("last");

		
		
    

}
}
class Methods extends Thread
{ 
	Thread t=new Thread(this);
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"-"+i);
			//System.out.println(i);
		}
	}
		
	}
