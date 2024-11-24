package multithreading;


class SyncClass
{
	private static  SyncClass sc;             // private because accesed in same class
	
	private  SyncClass()
	{
		                                // private constructor doesnt allow multiple object creation
	}
	
	public static SyncClass disp1()              
	{
		if(sc==null)                      // here we this is  asynchronous so all method calling comes but due to synchronous block it allow inly one and after second object time sc doesnt null so doesnot create object once
		{
			synchronized(SyncClass.class)
			{                                     //synchronized Block
				if(sc==null)
				{
					sc=new SyncClass();
				}
			}
		}
		return sc;
	}
	
}

public class SynchronizedSingleton {

	public static void main(String[] args) {
	
		SyncClass s1=SyncClass.disp1();
		SyncClass s2=SyncClass.disp1();
		SyncClass s3=SyncClass.disp1();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);                // by three we get same object address and we are creating only one object

	}

}
