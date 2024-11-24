package serializationdeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable
{
	
int a;
 transient int b;
String c;

}
public class Serialization {

	public static void main(String[] args) {
		A s=new A();
		s.a=5;
		s.b=10;
		s.c="maneesh";
		
		try {
			FileOutputStream fos=new FileOutputStream("A.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s);
			System.out.println("it is serialized");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}
