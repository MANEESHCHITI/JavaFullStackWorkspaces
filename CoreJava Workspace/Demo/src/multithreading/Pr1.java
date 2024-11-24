package multithreading;

class Thr extends Thread
{
	String a;
	public Thr(String a)
	{
		this.a=a;
		
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(a+":-"+i);
			
		}
	
	}
	
}



public class Pr1 {

	public static void main(String[] args) {
		for(int i=1;i<3;i++)
		{
		Thr obj1=new Thr("thread no :- "+i);
		
		obj1.start();
		
		
		
		
		}
		
	
	
	}

}