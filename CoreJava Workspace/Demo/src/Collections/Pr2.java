package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Pr2 {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		ArrayList a1=new ArrayList();
		
		al.add(1);
		al.add("maneesh");
		al.add(3);
		al.add(4);
		al.add(1, "rao");   
		
		
		a1.add(1);
		a1.add("maneesh");
		a1.add(3);
		a1.add(4);
		a1.add(1, "rao");  							//insert(index,element)
		System.out.println(al);
	
	//	System.out.println(al.addAll(al));//bollean.
	
	
	//System.out.println(al.clone());
		System.out.println(al.contains(al)); //doubt          contains();
		
		System.out.println(al.equals(a1));     //true    equals();
		System.out.println("index element:-"+al.get(1));    //returns index element  //get() ;  
		al.ensureCapacity(0);
		System.out.println(al.indexOf("rao")); // returns index no
		System.out.println(al.isEmpty());  //returns boolean         isEmpty();
		
		System.out.println(al.lastIndexOf("rao")); //returns index no
	
	

		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.removeAll(a1));  //  returns boolean
		System.out.println(al);
		
		
	

		//al.add(al);
		//System.out.println(al);
//		Iterator i=al.iterator();
//		
//		while(i.hasNext())
//		{
//			
//			System.out.println(i.next());
//	
//		}
//		

	}

}


