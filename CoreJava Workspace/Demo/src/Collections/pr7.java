package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class pr7 {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		
		al.add(1);
		
		al.add(2);
		al.add(3);
		al.add(1);
		System.out.println(al.indexOf(3));
		
		
		
		
		
		LinkedList ll=new LinkedList();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(1);
//		ll.addFirst(4);
//		ll.addLast(5);
		
//		Iterator i=ll.descendingIterator();
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		//System.out.println(ll.element());
		
		//ArrayList a=(ArrayList)al.clone();
		
		//System.out.println(	ll.getFirst());
		
		
//		ll.offer(4);
//		ll.offerLast(6);
//		ll.add(5);
//		System.out.println(ll.pop());
	
		//ll.re
		System.out.println(ll.removeFirst());
		
		
		
		
		System.out.println(ll);
		
	}

}
