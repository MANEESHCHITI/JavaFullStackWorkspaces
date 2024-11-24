package serializationdeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent1 implements Serializable
{
	
	int a=123;
	transient String b="maneesh";
	String c="KPHB";
	}

class SubClass extends Parent1
{                                             //serialization with subclass ansd transient keyword
	
int d=456;
String e="rao";


}

public class Se1 {

	public static void main(String[] args) {
//	Parent1 p=new Parent1();
	SubClass n=new SubClass();
	try {
		FileOutputStream fos=new FileOutputStream("SubClass.txt");
		ObjectOutputStream ops=new ObjectOutputStream(fos);
		ops.writeObject(n);
		System.out.println("it is serialized");
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}

	}

}
