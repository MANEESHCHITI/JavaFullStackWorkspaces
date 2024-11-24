package multithreading;


class Student1
{
   private static  Student1 ss;
   private Student1()
   {
	   
   }

public static Student1 disp1()
{
	if(ss==null)
	{
		
		ss=new Student1();
	}
	return ss;
	                                   //late 
	}


}


public class Late {

	public static void main(String[] args) {
	
		 Student1 s11=Student1.disp1();

	}

}



