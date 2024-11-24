package Collections;

import java.util.Stack;
import java.util.Vector;

public class Pr11 {

	public static void main(String[] args) {
//		Vector v=new Vector(20);
//		v.add(1);
//		v.add(2);
//		v.add(3);
//		Vector v1=new Vector();
//		v1.add(1);
//		v1.add(2);
//		v1.add(3);
//		//v1.add(4);
		
		Stack s=new Stack();
		
		s.add(1);
		s.add(2);
		s.add(3);

		s.add(4);
		System.out.println(s.indexOf(4));
		
		

	}

}