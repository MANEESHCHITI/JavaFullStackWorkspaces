package serializationdeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class De1 {

	public static void main(String[] args) {
		SubClass s;
		try {
		FileInputStream fis=new FileInputStream("SubClass.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
	s=(SubClass)ois.readObject();
	System.out.println("it is deserialized");
	                                                                                  // deserializarion of subclass and parent class data.
	System.out.println(s.a);
	System.out.println(s.b);
	System.out.println(s.c);
	System.out.println(s.d);
	System.out.println(s.e);
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
