package Workouts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;


public class BIn {

	public static void main(String[] args) {

		
HashMap <Integer,String>s=new HashMap<Integer,String>();

s.put(1, "a");			
s.put(2, "b");			
s.put(2, "c");			
s.put(3, "b");			
s.put(4, "c");			
s.put(5, "d");			
s.put(6, "e");	



Set a=s.entrySet();
Iterator i=a.iterator();
	while(i.hasNext())
	{
		Map.Entry e =(Entry)i.next();
		System.out.println(e.getKey()+"   "+e.getValue());
	}

System.out.println(s);
			

		
		
	
	
		
		
	

		
		
	
		

	}
}

