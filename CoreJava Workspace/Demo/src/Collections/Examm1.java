package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Examm1 {

	public static void main(String[] args) {
		
//			Collection<Integer> c=new ArrayList();
//			c.add(2);
//			Collection<Integer> s=new LinkedList();
//			s.addAll(c);
//			System.out.println(s);
		
//		
		ArrayList c=new ArrayList();
	
		ArrayList n=new ArrayList();
		ArrayList s=new ArrayList();
	
	c.add(1);
	c.add(2);
	
	s.add(1);
	s.add(2);
	
	
	n.add(3);
	n.add(4);
	n.add(1);
	                                // add has two one is add(element) other add(index,element)
								// addAll has two one is addAll(object/collection),addAll(index,object/collection)
					//remove  has remove(index) and remove(object)
		n.add(c)	;		//removeAll has one removeAll(Collection/object)
	System.out.println(n);
	n.removeAll(c)	;	
	//n.remove(c);
	//n.removeAll(c);
	
	
		
		System.out.println(n);
		
	
//		
		
			
	}

}
