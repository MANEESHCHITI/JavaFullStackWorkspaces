package multithreading;


class Boot1 extends Thread
{
	
	
	public Boot1()
	{
		Thread obj1=new Thread(this,"thread1");
		obj1.start();
		
	}
	public void run()
	{
	     int a;
	     int b;
	     System.out.println(a);
	     System.out.println(b);
		
	}

}
class Boot2 extends Boot1 implements Runnable
{
	
	public Boot2()
	{
		Thread obj1=new Thread(this,"thread2");
		obj1.start();
		obj1.a=1;
	}
	
	
}
class Boot3 extends Boot2 implements Runnable
{

	public Boot3()
	{
		Thread obj1=new Thread(this,"thread3");
		obj1.start();
	}
	


}
class Boot4 extends Boot3  
{
	
	public void run()
	{
		Thread obj1=new Thread(this,"thread4");
		obj1.start();
		
	}
	

}





public class Bootcamp {

	public static void main(String[] args) {
	


	}

}
