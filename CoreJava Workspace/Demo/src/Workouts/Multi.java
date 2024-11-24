package Workouts;






class Threading  implements Runnable
{
	Thread t=new Thread(this);
	public Threading()
	{
		
		t.start();
		t.setName("rao");
	}
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
			t.sleep(500);
			}
			catch(Exception e)
			{
				//System.out.println(e);
			}
		}
	}


}



public class Multi {

	public static void main(String[] args) {

		new Threading();

		for(int j=6;j<=10;j++)
		{
			System.out.println(j);
		try {
			Thread.sleep(500)	;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
