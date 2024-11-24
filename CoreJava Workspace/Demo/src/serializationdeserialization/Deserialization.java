package serializationdeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization  {


	public static void main(String[] args) {
		A s=null;
		try {
			                                             
			FileInputStream fis=new FileInputStream("A.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			s=(A)ois.readObject();
			System.out.println(s.a);
			System.out.println(s.b);
			System.out.println(s.c);
			System.out.println(" it is deserialized");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	} // if we compile serialization it generates student,txt class files.
	//if we del txt class  the compilation of serialization  done but we get classnotfound exception in runtime
	// if we del student class file it shows compile error of Student not fouund
	// if we del serializariion alone file and compile deserialization it shows fileNotfound exception

}
