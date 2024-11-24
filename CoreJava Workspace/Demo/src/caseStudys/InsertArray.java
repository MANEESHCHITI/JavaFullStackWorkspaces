package caseStudys;

import java.util.ArrayList;
import java.util.Iterator;

public class InsertArray {

	public static void main(String[] args) {
	
		ArrayList a=new ArrayList();
		ArrayList b=new ArrayList();
		
		a.add(1);
		a.add(2);
		b.add(3);
		b.add(4);
		
		b.add(a);                      //[3, 4, [1, 2]]

		
//		Iterator i=b.iterator();
//		while(i.hasNext())
//		{
//			a.add(i.next());                      [1,2,3,4]
//			
//		}
//		System.out.println(a);
	System.out.println(b);
		
		
		
		

	}

}
